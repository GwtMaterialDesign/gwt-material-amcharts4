package gwt.material.design.amplugin.timeline.client.chart;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4plugins_timeline")
public class SpiralChart extends CurveChart {

    @JsProperty
    public int endAngle;

    @JsProperty
    public int innerRadius;

    @JsProperty
    public boolean inversed;

    @JsProperty
    public int levelCount;

    @JsProperty
    public int precisionStep;

    @JsProperty
    public int radiusStep;

    @JsProperty
    public int startAngle;

    @JsProperty
    public int yAxisInnerRadius;

    @JsProperty
    public int yAxisRadius;
}
