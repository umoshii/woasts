package io.github.umoshii.woasts.widgets.implementation

import io.github.umoshii.woasts.WoastsClient
import io.github.umoshii.woasts.config.sections.IngameTimeConfigSection
import io.github.umoshii.woasts.helpers.McClient
import io.github.umoshii.woasts.utils.ColorUtils
import io.github.umoshii.woasts.utils.FontUtils
import io.github.umoshii.woasts.widgets.Widget
import net.minecraft.network.chat.MutableComponent

object IngameTimeWidget : Widget<IngameTimeConfigSection>() {
    private val dayColor = ColorUtils.hexToArgb("#F1C40FFF")
    private val nightColor = ColorUtils.hexToArgb("#3498DBFF")

    override val config: IngameTimeConfigSection
        get() = WoastsClient.config.ingameTimeConfig

    val time: Long
        get() = McClient.level?.overworldClockTime ?: 0

    val isDay: Boolean
        get() {
            // 24000 ticks a day. 0 is 6AM, 13000 is 7PM
            val timeOfDay = time % 24000L
            return timeOfDay in 0L..12999L
        }

    override fun getRenderColor(): Int {
        return if (isDay) dayColor else nightColor
    }

    override fun getRenderIcon(): MutableComponent {
        return if (isDay) FontUtils.Icons.SUN.component else FontUtils.Icons.MOON.component
    }

    override fun getRenderValue(): String {
        // Shift time by 6000t because 0 ticks = 6:00 AM
        val adjustedTicks = (time + 6000L) % 24000L

        val hours24 = (adjustedTicks / 1000L).toInt()
        val minutes = ((adjustedTicks % 1000L) * 60L / 1000L).toInt()

        return if (config.time24hFormat) {
            String.format("%02d:%02d ING", hours24, minutes)
        } else {
            val ampm = if (hours24 < 12) "am" else "pm"
            val hours12 = if (hours24 % 12 == 0) 12 else hours24 % 12
            String.format("%02d:%02d%s ING", hours12, minutes, ampm)
        }
    }
}
