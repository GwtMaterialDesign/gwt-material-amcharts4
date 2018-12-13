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

import com.google.gwt.dom.client.Element;
import gwt.material.design.amcore.client.list.ListTemplate;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4core")
public class SVGContainer extends Sprite {

    @JsProperty
    public Element SVGContainer;

    @JsProperty
    public boolean autoResize;

    @JsProperty
    public Container container;

    @JsProperty
    public Number height;

    @JsProperty
    public boolean hideOverflow;

    @JsProperty
    public Element htmlElement;

    @JsProperty
    public Modal modal;

    @JsProperty
    public ListTemplate<Popup> popups;

    @JsProperty
    public Number width;

    @JsMethod
    public native void closeAllPopups();

    @JsMethod
    public native void closeModal();

    @JsMethod
    public native void dispose();

    @JsMethod
    public native boolean isDisposed();

    @JsMethod
    public native Modal openModal(String text, String title);


    @JsMethod
    public native Modal openModal(String text);

    @JsMethod
    public native Popup openPopup(String text, String title);

    @JsMethod
    public native Popup openPopup(String text);
}
