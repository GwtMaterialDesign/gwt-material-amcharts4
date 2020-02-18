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

import gwt.material.design.amcore.client.base.Sprite;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4core")
public class PointedShape extends Sprite {

    /**
     * A width of the pinter's (stem's) thick end (base) in pixels.
     *
     * @default 15
     */
    @JsProperty
    public int pointerBaseWidth;

    /**
     * A length of the pinter (stem) in pixels.
     *
     * @default 10
     */
    @JsProperty
    public int pointerLength;

    /**
     * X coordinate the shape is pointing to.
     */
    @JsProperty
    public int pointerX;

    /**
     * Y coordinate the shape is pointing to.
     */
    @JsProperty
    public int pointerY;

    /***
     * Constructor
     */
    @JsMethod
    public native PointedShape constructor();

}
