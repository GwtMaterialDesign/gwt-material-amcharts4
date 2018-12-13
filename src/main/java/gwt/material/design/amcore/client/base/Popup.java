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

import gwt.material.design.jscore.client.api.core.Element;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4core")
public class Popup extends BaseObjectsEvents {

    /**
     * @see gwt.material.design.amcore.client.constants.Align
     */
    @JsProperty
    public String align;

    /**
     * Accepts {@link Number} or {@link Percent}
     */
    @JsProperty
    public Object bottom;

    @JsProperty
    public String classPrefix;

    @JsProperty
    public boolean closable;

    @JsProperty
    public Element container;

    @JsProperty
    public String content;

    @JsProperty
    public boolean defaultStyles;

    @JsProperty
    public boolean draggable;

    @JsProperty
    public Object elements;

    /**
     * Accepts {@link Number} or {@link Percent}
     */
    @JsProperty
    public Object left;

    @JsProperty
    public String readerTitle;

    @JsProperty
    public boolean showCurtain;

    @JsProperty
    public Sprite sprite;

    @JsProperty
    public String title;

    /**
     * Accepts {@link Number} or {@link Percent}
     */
    @JsProperty
    public Object top;

    /**
     * @see gwt.material.design.amcore.client.constants.VerticalAlign
     */
    @JsProperty
    public String verticalAlign;

    @JsMethod
    public native void close();

    @JsMethod
    public native void copyFrom(Popup source);

    @JsMethod
    public native void dispose();

    @JsMethod
    public native void open();
}
