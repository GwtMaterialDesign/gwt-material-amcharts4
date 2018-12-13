/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2018 GwtMaterialDesign
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
package gwt.material.design.amcharts.client.bullet;

import gwt.material.design.amcore.client.adapter.Adapter;
import gwt.material.design.amcharts.client.adapter.CircleBulletAdapter;
import gwt.material.design.amcharts.client.properties.CircleBulletProperties;
import gwt.material.design.amcore.client.list.DictionaryTemplate;
import gwt.material.design.amcore.client.state.SpriteState;
import gwt.material.design.amcore.client.ui.Circle;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class CircleBullet extends Bullet {

    @JsProperty
    public Adapter<CircleBullet, CircleBulletAdapter> adapter;

    @JsProperty
    public Circle circle;

    @JsProperty
    public DictionaryTemplate<String, SpriteState<CircleBulletProperties>> states;

    @JsMethod
    public native void copyFrom(CircleBullet source);
}
