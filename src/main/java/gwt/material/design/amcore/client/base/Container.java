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

import gwt.material.design.amcore.client.constants.Align;
import gwt.material.design.amcore.client.constants.TextDecoration;
import gwt.material.design.amcore.client.properties.Point;
import gwt.material.design.amcore.client.constants.ContainerLayout;
import gwt.material.design.amcore.client.constants.VerticalAlign;
import gwt.material.design.amcore.client.list.List;
import gwt.material.design.amcore.client.ui.Preloader;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4core")
public class Container extends Sprite {

    @JsProperty
    public Sprite background;

    @JsProperty
    public List<Sprite> children;

    /**
     * @see Align
     */
    @JsProperty
    public String contentAlign;

    @JsProperty
    public Number contentHeight;

    /**
     * @see VerticalAlign
     */
    @JsProperty
    public String contentValign;

    @JsProperty
    public Number contentWidth;

    @JsProperty
    public boolean fixedWidthGrid;

    @JsProperty
    public String fontFamily;

    @JsProperty
    public double fontSize;

    @JsProperty
    public String fontWeight;

    @JsProperty
    public boolean hasFocused;

    /**
     * @see ContainerLayout
     */
    @JsProperty
    public String layout;

    @JsProperty
    public boolean layoutInvalid;

    @JsProperty
    public Number maxColumns;

    @JsProperty
    public Number minHeight;

    @JsProperty
    public Number minWidth;

    @JsProperty
    public Preloader preloader;

    @JsProperty
    public boolean setStateOnChildren;

    @JsProperty
    public Sprite[] setStateOnSprites;

    @JsProperty
    public TextDecoration textDecoration;

    @JsMethod
    public native void copyFrom(Container container);

    @JsMethod
    public native Object createChild(Object object);

    @JsMethod
    public native void dispatchReady();

    @JsMethod
    public native void dispose();

    @JsMethod
    public native void disposeChildren();

    @JsMethod
    public native boolean fitsToBounds(Point point);

    @JsMethod
    public native void invalidate();

    @JsMethod
    public native void invalidateLabels();

    @JsMethod
    public native void removeChildren();

    @JsMethod
    public native void setState(String value, int transitionDuration, Object easing);
}
