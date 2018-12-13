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
package gwt.material.design.amcore.client.export;

import gwt.material.design.amcore.client.base.BaseObject;
import gwt.material.design.amcore.client.base.Language;
import gwt.material.design.jscore.client.api.core.Element;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4core")
public class ExportMenu extends BaseObject {

    /**
     * @see gwt.material.design.amcore.client.constants.Align
     */
    @JsProperty
    public String align;

    @JsProperty
    public String classPrefix;

    @JsProperty
    public int closeDelay;

    @JsProperty
    public Element container;

    @JsProperty
    public boolean defaultStyles;

    @JsProperty
    public ExportMenuItem[] items;

    @JsProperty
    public Language language;

    @JsProperty
    public int tabindex;

    @JsProperty
    public String tag;

    /**
     * @see gwt.material.design.amcore.client.constants.VerticalAlign
     */
    @JsProperty
    public String verticalAlign;

    @JsMethod
    public native void dispose();

    @JsMethod
    public native void draw();
}
