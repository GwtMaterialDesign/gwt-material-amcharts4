package gwt.material.design.amplugin.sunburst.client.series;

import gwt.material.design.amcharts.client.dataitem.PieChartDataItem;
import gwt.material.design.amcore.client.color.Color;
import gwt.material.design.amcore.client.list.OrderedListTemplate;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4plugins_sunburst")
public class SunburstDataItem extends PieChartDataItem {

    @JsProperty
    public OrderedListTemplate<SunburstDataItem> children;

    @JsProperty
    public Color color;

    @JsProperty
    public int level;

    @JsProperty
    public String name;

    @JsProperty
    public int percent;

    @JsProperty
    public SunburstSeriesDataItem series;

    @JsProperty
    public int value;

    @JsMethod
    public native SunburstDataItem constructor();
}
