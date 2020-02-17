package gwt.material.design.amplugin.timeline.client.chart;

import gwt.material.design.amcharts.client.XYChart;
import gwt.material.design.amcore.client.base.Container;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4plugins_timeline")
public class CurveChart extends XYChart {

    @JsProperty
    public Container curveContainer;
}
