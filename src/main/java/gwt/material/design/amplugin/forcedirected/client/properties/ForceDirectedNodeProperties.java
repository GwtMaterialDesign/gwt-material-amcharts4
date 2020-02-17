package gwt.material.design.amplugin.forcedirected.client.properties;

import gwt.material.design.amcore.client.properties.ContainerProperties;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4plugins_forceDirected")
public class ForceDirectedNodeProperties extends ContainerProperties {

    @JsProperty
    public boolean expandAll;

    @JsProperty
    public int paddingRadius;
}
