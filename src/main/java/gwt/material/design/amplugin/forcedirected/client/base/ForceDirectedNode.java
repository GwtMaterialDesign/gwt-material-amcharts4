package gwt.material.design.amplugin.forcedirected.client.base;

import gwt.material.design.amcore.client.base.Sprite;
import gwt.material.design.amcore.client.list.Dictionary;
import gwt.material.design.amcore.client.list.DictionaryTemplate;
import gwt.material.design.amcore.client.state.SpriteState;
import gwt.material.design.amcore.client.ui.Circle;
import gwt.material.design.amcore.client.ui.Label;
import gwt.material.design.amplugin.forcedirected.client.properties.ForceDirectedNodeProperties;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4plugins_forceDirected")
public class ForceDirectedNode extends Sprite {

    @JsProperty
    public Circle circle;

    @JsProperty
    public boolean expandAll;

    @JsProperty
    public Label label;

    @JsProperty
    public Dictionary<String, ForceDirectedLink> linksWith;

    @JsProperty
    public Circle outerCircle;

    @JsProperty
    public int paddingRadius;

    @JsProperty
    public DictionaryTemplate<String, SpriteState<ForceDirectedNodeProperties>> states;

    @JsMethod
    public native ForceDirectedNode constructor();

    @JsMethod
    public native void copyFrom(ForceDirectedNode source);

    @JsMethod
    public native ForceDirectedLink linkWith(ForceDirectedNode node, int strength);

    @JsMethod
    public native ForceDirectedLink linkWith(ForceDirectedNode node);

    @JsMethod
    public native void unlinkWith(ForceDirectedNode node);
}
