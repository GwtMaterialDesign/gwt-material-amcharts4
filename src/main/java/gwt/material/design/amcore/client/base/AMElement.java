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
import gwt.material.design.amcore.client.properties.RectangleProperties;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4core")
public class AMElement {

    @JsProperty
    public String content;

    @JsProperty
    public Object node;

    @JsProperty
    public double rotation;

    @JsProperty
    public double scale;

    @JsProperty
    public String textContent;

    @JsProperty
    public double x;

    @JsProperty
    public double y;

    @JsMethod
    public native void addClass(String name);

    @JsMethod
    public native AMElement addStyle(Object attributes);

    @JsMethod
    public native AMElement attrNS(String namespace, String attribute, String value);

    @JsMethod
    public native void dispose();

    @JsMethod
    public native String getAttr(String attribute);

    @JsMethod
    public native String getAttrNS(String namespace, String attribute);

    @JsMethod
    public native RectangleProperties getBBox();

    @JsMethod
    public native String getStyle(String attribute);

    @JsMethod
    public native boolean isDisposed();

    @JsMethod
    public native void moveTo(Point point);

    @JsMethod
    public native void removeAttr(String attribute);

    @JsMethod
    public native void removeChildNodes();

    @JsMethod
    public native void removeClass(String name);

    @JsMethod
    public native void removeNode();

    @JsMethod
    public native void removeStyle(String attribute);

    @JsMethod
    public native void setClass(String name);
}
