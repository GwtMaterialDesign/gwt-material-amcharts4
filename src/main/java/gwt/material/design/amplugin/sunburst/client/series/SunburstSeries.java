package gwt.material.design.amplugin.sunburst.client.series;

import gwt.material.design.amcharts.client.series.PieSeries;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4plugins_sunburst")
public class SunburstSeries extends PieSeries {

    @JsProperty
    public int level;

    @JsProperty
    public SunburstDataItem parentDataItem;

    @JsMethod
    public native SunburstSeries constructor();
}
