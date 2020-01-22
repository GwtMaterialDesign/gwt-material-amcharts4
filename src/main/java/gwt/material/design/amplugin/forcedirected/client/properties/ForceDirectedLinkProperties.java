package gwt.material.design.amplugin.forcedirected.client.properties;

import gwt.material.design.amcore.client.properties.SpriteProperties;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4plugins_forceDirected")
public class ForceDirectedLinkProperties extends SpriteProperties {

    @JsProperty
    public double distance;

    @JsProperty
    public int strength;
}
