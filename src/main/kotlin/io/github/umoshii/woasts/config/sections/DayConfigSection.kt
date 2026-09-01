package io.github.umoshii.woasts.config.sections

import me.shedaniel.autoconfig.annotation.ConfigEntry

class DayConfigSection : WidgetConfigSection {
    override var isEnabled: Boolean = true

    override var showBackground: Boolean = true

    @ConfigEntry.Gui.Tooltip
    var onlyShowInOverworld: Boolean = true
}
