package gwt.material.design.amplugin.forcedirected.client.chart;

import gwt.material.design.amcharts.client.SerialChart;
import gwt.material.design.amcore.client.list.ListTemplate;
import gwt.material.design.amplugin.forcedirected.client.series.ForceDirectedSeries;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4plugins_forceDirected")
public class ForceDirectedTree extends SerialChart {

    @JsProperty
    public ListTemplate<ForceDirectedSeries> series;

    @JsMethod
    public native ForceDirectedTree constructor();
}
