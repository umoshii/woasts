package io.github.umoshii.woasts.utils

import io.github.umoshii.woasts.Woasts
import net.minecraft.network.chat.Component
import net.minecraft.network.chat.FontDescription
import net.minecraft.network.chat.MutableComponent
import net.minecraft.network.chat.Style

object FontUtils {
    val iconFont =    Style.EMPTY.withFont(FontDescription.Resource(Woasts.id("icons")))
    val defaultFont = Style.EMPTY.withFont(FontDescription.DEFAULT)

    enum class Icons(val component: MutableComponent) {
        PING("\uE000"),
        LOCATION("\uE001"),
        FPS("\uE002"),
        BIOME("\uE003"),
        CLOCK("\uE004"),
        SUN("\uE005"),
        MOON("\uE006"),
        ;

        constructor(c: String) : this(Component.literal(c).withStyle(iconFont))
    }
}
