/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2020 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
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
