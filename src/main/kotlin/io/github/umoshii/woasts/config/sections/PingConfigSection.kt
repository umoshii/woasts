package io.github.umoshii.woasts.config.sections

import io.github.umoshii.woasts.utils.ColorUtils
import me.shedaniel.autoconfig.annotation.ConfigEntry

class PingConfigSection : WidgetConfigSection {
    override var isEnabled: Boolean = true

    override var showBackground: Boolean = true

    @ConfigEntry.Gui.Tooltip
    var updateTime: Int = 2

    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.BoundedDiscrete(min = 1, max = 200)
    var greenPingRange: Long = 60L

    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.BoundedDiscrete(min = 1, max = 200)
    var yellowPingRange: Long = 100L

    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.BoundedDiscrete(min = 1, max = 200)
    var orangePingRange: Long = 100L

    @ConfigEntry.ColorPicker(allowAlpha = true)
    var grayPingColor: Int = ColorUtils.CatppuccinColors.OVERLAY.hex

    @ConfigEntry.ColorPicker(allowAlpha = true)
    var greenPingColor: Int = ColorUtils.CatppuccinColors.GREEN.hex

    @ConfigEntry.ColorPicker(allowAlpha = true)
    var yellowPingColor: Int = ColorUtils.CatppuccinColors.YELLOW.hex

    @ConfigEntry.ColorPicker(allowAlpha = true)
    var orangePingColor: Int = ColorUtils.CatppuccinColors.PEACH.hex

    @ConfigEntry.ColorPicker(allowAlpha = true)
    var redPingColor: Int = ColorUtils.CatppuccinColors.RED.hex
}
