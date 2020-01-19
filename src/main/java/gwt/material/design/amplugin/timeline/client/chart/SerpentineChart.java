package gwt.material.design.amplugin.timeline.client.chart;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4plugins_timeline")
public class SerpentineChart extends CurveChart {

    @JsProperty
    public int levelCount;

    @JsProperty
    public String orientation;

    @JsProperty
    public int yAxisInnerRadius;

    @JsProperty
    public int yAxisRadius;
}
