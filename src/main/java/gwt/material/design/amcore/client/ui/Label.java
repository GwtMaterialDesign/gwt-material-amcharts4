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
package gwt.material.design.amcore.client.ui;

import gwt.material.design.amcore.client.adapter.Adapter;
import gwt.material.design.amcore.client.adapter.LabelAdapter;
import gwt.material.design.amcore.client.base.AMElement;
import gwt.material.design.amcore.client.base.Container;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4core")
public class Label extends Container {

    @JsProperty
    public Adapter<Label, LabelAdapter> adapter;

    @JsProperty
    public Number availableHeight;

    @JsProperty
    public String currentText;

    @JsProperty
    public String ellipsis;

    @JsProperty
    public boolean fullWords;

    @JsProperty
    public boolean hideOversized;

    @JsProperty
    public String html;

    @JsProperty
    public boolean ignoreFormatting;

    @JsProperty
    public boolean isOversized;

    @JsProperty
    public boolean selectable;

    @JsProperty
    public String text;

    /**
     * @see gwt.material.design.amcore.client.constants.TextAlign
     */
    @JsProperty
    public String textAlign;

    @JsProperty
    public boolean truncate;

    @JsProperty
    public boolean wrap;

    @JsProperty
    public boolean isMeasured;

    @JsMethod
    public native AMElement getSvgElement(String text);

    @JsMethod
    public native AMElement getSvgElement(String text, String style);

    @JsMethod
    public native void hardInvalidate();

    @JsMethod
    public native void measureElement();

    @JsMethod
    public native void setDataItem(Object dataItem);
}
