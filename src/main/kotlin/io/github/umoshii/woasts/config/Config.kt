package io.github.umoshii.woasts.config

import io.github.umoshii.woasts.Woasts
import io.github.umoshii.woasts.config.sections.BiomeConfigSection
import io.github.umoshii.woasts.config.sections.FPSConfigSection
import io.github.umoshii.woasts.config.sections.IngameTimeConfigSection
import io.github.umoshii.woasts.config.sections.IrlTimeConfigSection
import io.github.umoshii.woasts.config.sections.PingConfigSection
import io.github.umoshii.woasts.config.sections.PositionConfigSection
import me.shedaniel.autoconfig.ConfigData
import me.shedaniel.autoconfig.annotation.Config
import me.shedaniel.autoconfig.annotation.ConfigEntry
import me.shedaniel.clothconfig2.gui.entries.SelectionListEntry

@Config(name = Woasts.MOD_ID)
class Config : ConfigData {
    enum class RenderCorner(private val key: String) : SelectionListEntry.Translatable {
        UP_LEFT("upLeft"),
        UP_RIGHT("upRight"),
        DOWN_LEFT("downLeft"),
        DOWN_RIGHT("downRight");

        override fun getKey(): String = "text.autoconfig.woasts.option.renderCorner.$key"
    }

    @ConfigEntry.Gui.Tooltip
    var mainSwitch: Boolean = true

    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.Gui.EnumHandler(option = ConfigEntry.Gui.EnumHandler.EnumDisplayOption.BUTTON)
    var renderCorner: RenderCorner = RenderCorner.UP_LEFT

    @ConfigEntry.Gui.Tooltip
    var margin: Int = 5

    @ConfigEntry.Gui.Tooltip
    var spacing: Int = 3

    @ConfigEntry.Gui.Tooltip
    var wrap: Int = 3

    @ConfigEntry.Gui.Tooltip
    var wrapSpacing: Int = 3

    @ConfigEntry.Gui.Tooltip
    var hideBackgroundOverride: Boolean = false

    @ConfigEntry.Gui.CollapsibleObject
    var pingConfig: PingConfigSection = PingConfigSection()

    @ConfigEntry.Gui.CollapsibleObject
    var positionConfig: PositionConfigSection = PositionConfigSection()

    @ConfigEntry.Gui.CollapsibleObject
    var fpsConfig: FPSConfigSection = FPSConfigSection()

    @ConfigEntry.Gui.CollapsibleObject
    var biomeConfig: BiomeConfigSection = BiomeConfigSection()

    @ConfigEntry.Gui.CollapsibleObject
    var irlTimeConfig: IrlTimeConfigSection = IrlTimeConfigSection()

    @ConfigEntry.Gui.CollapsibleObject
    var ingameTimeConfig: IngameTimeConfigSection = IngameTimeConfigSection()
}
