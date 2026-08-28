package io.github.umoshii.woasts.config.sections

import io.github.umoshii.woasts.utils.ColorUtils
import me.shedaniel.autoconfig.annotation.ConfigEntry

class FPSConfigSection : WidgetConfigSection {
    override var isEnabled: Boolean = true

    override var showBackground: Boolean = true

    @ConfigEntry.Gui.Tooltip
    var optimalFps: Int = 60

    @ConfigEntry.ColorPicker(allowAlpha = true)
    var greenFpsColor: Int = ColorUtils.Catppuccin.GREEN.hex

    @ConfigEntry.ColorPicker(allowAlpha = true)
    var yellowFpsColor: Int = ColorUtils.Catppuccin.YELLOW.hex
}
