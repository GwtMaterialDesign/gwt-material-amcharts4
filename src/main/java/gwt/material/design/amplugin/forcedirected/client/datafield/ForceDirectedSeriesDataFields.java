package gwt.material.design.amplugin.forcedirected.client.datafield;

import gwt.material.design.amcharts.client.datafield.series.SeriesDataFields;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4plugins_forceDirected")
public class ForceDirectedSeriesDataFields extends SeriesDataFields {

    @JsProperty
    public String category;

    @JsProperty
    public String children;

    @JsProperty
    public String collapsed;

    @JsProperty
    public String color;

    @JsProperty
    public String fixed;

    @JsProperty
    public String hiddenInLegend;

    @JsProperty
    public String linkWith;

    @JsProperty
    public String name;
}
