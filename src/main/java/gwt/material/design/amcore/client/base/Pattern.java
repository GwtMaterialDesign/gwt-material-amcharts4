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
package gwt.material.design.amcore.client.base;

import gwt.material.design.amcore.client.animation.AnimationOptions;
import gwt.material.design.amcore.client.color.Color;
import gwt.material.design.amcore.client.constants.ShapeRendering;
import gwt.material.design.amcore.client.list.List;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


@JsType(isNative = true, namespace = "am4core")
public class Pattern extends BaseObject {

    @JsProperty
    public Color backgroundFill;

    @JsProperty
    public double backgroundOpacity;

    @JsProperty
    public Group element;

    @JsProperty
    public List<AMElement> elements;

    @JsProperty
    public Color fill;

    @JsProperty
    public double fillOpacity;

    @JsProperty
    public int height;

    /**
     * @see PatternUnit
     */
    @JsProperty
    public String patternUnits;

    @JsProperty
    public int rotation;

    @JsProperty
    public String shapeRendering;

    @JsProperty
    public Color stroke;

    @JsProperty
    public String strokeDasharray;

    @JsProperty
    public double strokeOpacity;

    @JsProperty
    public int strokeWidth;

    @JsProperty
    public int width;

    @JsProperty
    public double x;

    @JsProperty
    public double y;

    @JsMethod
    public native void addElement(AMElement element);

    @JsMethod
    public native void animate(AnimationOptions[] animationOptions, int duration, int easing);

    @JsMethod
    public native Pattern constructor();

    @JsMethod
    public native void copyFrom(Pattern pattern);

    @JsMethod
    public native void removeElement(AMElement element);
}
