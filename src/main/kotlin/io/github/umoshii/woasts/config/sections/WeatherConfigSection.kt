package io.github.umoshii.woasts.config.sections

class WeatherConfigSection : WidgetConfigSection {
    override var isEnabled: Boolean = true

    override var showBackground: Boolean = true

    var hideWhenClear: Boolean = true
}
