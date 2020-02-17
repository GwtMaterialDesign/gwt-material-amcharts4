package gwt.material.design.amplugin.overlapbuster.client;

import gwt.material.design.amcore.client.base.Plugin;
import gwt.material.design.amcore.client.base.Sprite;
import gwt.material.design.amcore.client.list.List;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4plugins_overlapBuster")
public class OverlapBuster extends Plugin {

    @JsProperty
    public int collapseDelay;

    @JsProperty
    public Object d3forceSimulation;

    @JsProperty
    public double revealRatio;

    @JsProperty
    public List<Sprite> targets;

    @JsProperty
    public int tolerance;

    @JsMethod
    public native OverlapBuster constructor();

    @JsMethod
    public native boolean hitTest(Sprite target, Sprite source);

    @JsMethod
    public native void init();
}
