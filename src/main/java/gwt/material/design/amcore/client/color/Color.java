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
package gwt.material.design.amcore.client.color;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4core", name = "color")
public class Color {

    public Color() {}

    @JsConstructor
    public Color(String color) {}

    @JsProperty
    public Number alpha;

    @JsProperty
    public Color alternative;

    @JsProperty
    public Color darkColor;

    @JsProperty
    public String hex;

    @JsProperty
    public Color lightColor;

    @JsProperty
    public String rgba;

    @JsMethod
    public native Color brighten(double percent);

    @JsMethod
    public native Color lighten(double percent);

    @JsMethod
    public native Color saturate(double saturation);
}
