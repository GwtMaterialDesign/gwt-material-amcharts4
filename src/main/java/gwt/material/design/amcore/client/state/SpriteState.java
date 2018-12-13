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
package gwt.material.design.amcore.client.state;

import gwt.material.design.amcore.client.base.Sprite;
import gwt.material.design.amcore.client.color.Filter;
import gwt.material.design.amcore.client.list.ListTemplate;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4core")
public class SpriteState<T> {

    @JsProperty
    public ListTemplate<Filter> filters;

    @JsProperty
    public boolean isTemplate;

    @JsProperty
    public String name;

    @JsProperty
    public T properties;

    @JsProperty
    public Object propertyFields;

    @JsProperty
    public Sprite sprite;

    @JsProperty
    public int transitionDuration;

    @JsProperty
    public Object transitionEasing;

    @JsMethod
    public native void copyFrom(SpriteState source);

    @JsMethod
    public native T getPropertyValue(String key);

    @JsMethod
    public native void reset();
}
