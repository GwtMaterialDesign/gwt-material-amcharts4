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
package gwt.material.design.amcore.client.animation;

import gwt.material.design.amcore.client.base.BaseObject;
import gwt.material.design.amcore.client.properties.Morphable;
import gwt.material.design.amcore.client.properties.Point;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4core")
public class Morpher extends BaseObject {

    @JsProperty
    public Animation[] animations;

    @JsProperty
    public int morphDuration;

    @JsProperty
    public Object morphEasing;

    @JsProperty
    public double morphProgress;

    @JsProperty
    public boolean morphToSingle;

    @JsProperty
    public Morphable morphable;

    @JsProperty
    public double scaleRatio;

    @JsMethod
    public native Animation morphBack(int duration, Object easing);

    @JsMethod
    public native Animation morphToCircle(double radius, int duration, Object easing);

    @JsMethod
    public native Animation morphToPolygon(Point[] points, int duration, Object easing);

    @JsMethod
    public native Animation morphToRectangle(double width, double height, int duration, Object easing);
}
