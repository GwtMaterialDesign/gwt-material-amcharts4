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

import gwt.material.design.amcore.client.properties.Point;
import gwt.material.design.amcore.client.ui.Label;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


@JsType(isNative = true, namespace = "am4core")
public class Tooltip extends Container {

    @JsProperty
    public int animationDuration;

    @JsProperty
    public Object animationEasing;

    @JsProperty
    public boolean autoTextColor;

    @JsProperty
    public boolean fitPointerToBounds;

    @JsProperty
    public boolean getFillFromObject;

    @JsProperty
    public boolean getStrokeFromObject;

    @JsProperty
    public String html;

    @JsProperty
    public Label label;

    /**
     * @see gwt.material.design.amcore.client.constants.PointOrientation
     */
    @JsProperty
    public String pointerOrientation;

    @JsProperty
    public String text;

    @JsMethod
    public native void copyFrom(Tooltip source);

    @JsMethod
    public native void pointTo(Point point);

    @JsMethod
    public native void pointTo(Point point, boolean instantly);
}
