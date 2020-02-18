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
package gwt.material.design.amcore.client.ui;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4core")
public class PointedCircle extends PointedShape{

    /**
     * Angle of a pointer, in degrees.
     *
     * @default 90
     */
    @JsProperty
    public int pointerAngle;

    /**
     * Radius of a circle in pixels.
     *
     * @default 18
     */
    @JsProperty
    public int radius;

    /***
     * Constructor
     */
    @JsMethod
    public native PointedCircle constructor();

    @JsMethod
    public native int getTooltipX();

    @JsMethod
    public native int getTooltipY();

}
