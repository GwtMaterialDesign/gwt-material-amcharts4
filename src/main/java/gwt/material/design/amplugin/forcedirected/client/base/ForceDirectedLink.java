package gwt.material.design.amplugin.forcedirected.client.base;

import gwt.material.design.amcore.client.base.Sprite;
import gwt.material.design.amcore.client.list.DictionaryTemplate;
import gwt.material.design.amcore.client.state.SpriteState;
import gwt.material.design.amplugin.forcedirected.client.properties.ForceDirectedLinkProperties;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4plugins_forceDirected")
public class ForceDirectedLink extends Sprite {

    @JsProperty
    public double distance;

    @JsProperty
    public ForceDirectedNode source;

    @JsProperty
    public int strength;

    @JsProperty
    public ForceDirectedNode target;

    @JsProperty
    public DictionaryTemplate<String, SpriteState<ForceDirectedLinkProperties>> states;

    @JsMethod
    public native ForceDirectedLink constructor();
}
