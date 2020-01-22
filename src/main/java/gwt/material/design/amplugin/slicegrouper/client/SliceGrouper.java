package gwt.material.design.amplugin.slicegrouper.client;

import gwt.material.design.amcharts.client.properties.FunnelSliceProperties;
import gwt.material.design.amcharts.client.series.PercentSeries;
import gwt.material.design.amcore.client.base.Plugin;
import gwt.material.design.amcore.client.color.Color;
import gwt.material.design.amcore.client.list.List;
import gwt.material.design.amcore.client.ui.Button;
import gwt.material.design.jscore.client.api.html.HTMLElement;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4plugins_sliceGrouper")
public class SliceGrouper extends Plugin {

    @JsProperty
    public List<Object> bigSlices;

    @JsProperty
    public String clickBehavior;

    @JsProperty
    public String groupName;

    @JsProperty
    public FunnelSliceProperties groupProperties;

    @JsProperty
    public Object groupSlice;

    @JsProperty
    public List<Object> smallSlices;

    @JsProperty
    public boolean syncLegend;

    @JsProperty
    public PercentSeries target;

    @JsProperty
    public int threshold;

    @JsProperty
    public Button zoomOutButton;

    @JsMethod
    public native SliceGrouper constructor();

    @JsMethod
    public native void dispose();

    @JsMethod
    public native void init();
}
