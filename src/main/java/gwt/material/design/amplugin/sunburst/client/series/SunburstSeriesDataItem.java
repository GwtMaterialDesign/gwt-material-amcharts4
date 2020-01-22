package gwt.material.design.amplugin.sunburst.client.series;

import gwt.material.design.amcharts.client.dataitem.PieSeriesDataItem;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4plugins_sunburst")
public class SunburstSeriesDataItem extends PieSeriesDataItem {

    @JsProperty
    public SunburstSeries component;

    @JsProperty
    public SunburstDataItem sunburstDataItem;

    @JsProperty
    public int value;

    @JsMethod
    public native void hide(int duration, int delay, int toValue, String[] fields);

    @JsMethod
    public native void show(int duration, int delay, String[] fields);
}
