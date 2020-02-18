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
