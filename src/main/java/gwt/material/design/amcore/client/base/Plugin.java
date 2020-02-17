package gwt.material.design.amcore.client.base;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4core")
public class Plugin {

    @JsProperty
    public Sprite target;

    @JsMethod
    public native void dispose();

    @JsMethod
    public native void init();

    @JsMethod
    public native boolean isDisposed();
}
