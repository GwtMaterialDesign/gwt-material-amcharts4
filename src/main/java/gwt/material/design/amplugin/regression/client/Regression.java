package gwt.material.design.amplugin.regression.client;

import gwt.material.design.amcharts.client.series.XYSeries;
import gwt.material.design.amcore.client.base.Plugin;
import gwt.material.design.amcore.client.color.Color;
import gwt.material.design.jscore.client.api.html.HTMLElement;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4plugins_regression")
public class Regression extends Plugin {

    @JsProperty
    public String method;

    @JsProperty
    public Object options;

    @JsProperty
    public boolean reorder;

    @JsProperty
    public Object result;

    @JsProperty
    public boolean simplify;

    @JsProperty
    public XYSeries target;

    @JsMethod
    public native Regression constructor();

    @JsMethod
    public native void init();
}
