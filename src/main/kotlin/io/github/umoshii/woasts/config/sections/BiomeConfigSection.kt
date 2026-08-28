package io.github.umoshii.woasts.config.sections

import me.shedaniel.autoconfig.annotation.ConfigEntry

class BiomeConfigSection : WidgetConfigSection {
    override var isEnabled: Boolean = true

    override var showBackground: Boolean = true

    @ConfigEntry.Gui.Tooltip
    var grassTextColor: Boolean = true

    @ConfigEntry.Gui.Tooltip
    var prettifiedIdentifier: Boolean = false
}
