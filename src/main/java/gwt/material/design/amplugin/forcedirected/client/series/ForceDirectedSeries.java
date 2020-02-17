package gwt.material.design.amplugin.forcedirected.client.series;

import gwt.material.design.amcharts.client.series.Series;
import gwt.material.design.amcore.client.color.ColorSet;
import gwt.material.design.amcore.client.list.ListTemplate;
import gwt.material.design.amcore.client.list.OrderedListTemplate;
import gwt.material.design.amplugin.forcedirected.client.base.ForceDirectedLink;
import gwt.material.design.amplugin.forcedirected.client.base.ForceDirectedNode;
import gwt.material.design.amplugin.forcedirected.client.datafield.ForceDirectedSeriesDataFields;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4plugins_forceDirected")
public class ForceDirectedSeries extends Series {

    @JsProperty
    public int centerStrength;

    @JsProperty
    public ColorSet colors;

    @JsProperty
    public Object d3forceSimulation;

    @JsProperty
    public ForceDirectedSeriesDataFields dataFields;

    @JsProperty
    public int linkWithStrength;

    @JsProperty
    public ListTemplate<ForceDirectedLink> links;

    @JsProperty
    public int manyBodyStrength;

    @JsProperty
    public int maxLevels;

    @JsProperty
    public int maxRadius;

    @JsProperty
    public int minRadius;

    @JsProperty
    public ListTemplate<ForceDirectedNode> nodes;

    @JsProperty
    public ForceDirectedTreeDataItem parentDataItem;

    @JsMethod
    public native ForceDirectedSeries constructor();

    @JsMethod
    public native ForceDirectedSeriesDataItem getDataItemById(OrderedListTemplate<ForceDirectedSeriesDataItem> dataItems, String id);
}
