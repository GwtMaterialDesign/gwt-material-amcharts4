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
package gwt.material.design.amplugin.annotation.client;

import gwt.material.design.amcore.client.base.Plugin;
import gwt.material.design.amcore.client.color.Color;
import gwt.material.design.jscore.client.api.html.HTMLElement;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4plugins_annotation")
public class Annotation extends Plugin {

    @JsProperty
    public boolean active;

    @JsProperty
    public boolean autoSize;

    @JsProperty
    public Color[] colors;

    @JsProperty
    public Color currentColor;

    @JsProperty
    public int currentFontSize;

    @JsProperty
    public int currentFontWeight;

    @JsProperty
    public double currentOpacity;

    @JsProperty
    public String currentTool;

    @JsProperty
    public int currentWidth;

    @JsProperty
    public Object data;

    @JsProperty
    public Object fabric;

    @JsProperty
    public int[] fontSizes;

    @JsProperty
    public int[] fontWeights;

    @JsProperty
    public Object group;

    @JsProperty
    public String[] icons;

    @JsProperty
    public HTMLElement indicator;

    @JsProperty
    public double[] opacities;

    @JsProperty
    public boolean useMenu;

    @JsProperty
    public int[] widths;

    @JsMethod
    public native void activate();

    @JsMethod
    public native void addIcon(String icon);

    @JsMethod
    public native void addText();

    @JsMethod
    public native void arrow();

    @JsMethod
    public native void clear();

    @JsMethod
    public native Annotation constructor();

    @JsMethod
    public native void deactivate();

    @JsMethod
    public native void delete();

    @JsMethod
    public native void deleteSelected();

    @JsMethod
    public native void discard();

    @JsMethod
    public native void draw();

    @JsMethod
    public native void init();

    @JsMethod
    public native void line();

    @JsMethod
    public native void select();

    @JsMethod
    public native void setColor(Color color);

    @JsMethod
    public native void setFontSize(int value);

    @JsMethod
    public native void setFontWeight(int value);

    @JsMethod
    public native void setIconFill(Object img);

    @JsMethod
    public native void setOpacity(double value);

    @JsMethod
    public native void setWidth(int value);

    @JsMethod
    public native void underConstruction();
}
