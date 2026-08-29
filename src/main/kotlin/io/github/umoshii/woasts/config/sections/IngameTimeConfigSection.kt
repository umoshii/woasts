package io.github.umoshii.woasts.config.sections

class IngameTimeConfigSection : WidgetConfigSection {
    override var isEnabled: Boolean = true

    override var showBackground: Boolean = true

    var time24hFormat: Boolean = true
}
