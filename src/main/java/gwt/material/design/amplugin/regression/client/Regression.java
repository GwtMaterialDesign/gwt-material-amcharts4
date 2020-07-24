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
package gwt.material.design.amplugin.regression.client;

import gwt.material.design.amcharts.client.series.XYSeries;
import gwt.material.design.amcore.client.base.Plugin;
import gwt.material.design.amcore.client.color.Color;
import gwt.material.design.jscore.client.api.html.HTMLElement;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4plugins_regression")
public class Regression extends Plugin {

    @JsProperty
    public String method;

    @JsProperty
    public Object options;

    @JsProperty
    public boolean reorder;

    @JsProperty
    public Object result;

    @JsProperty
    public boolean simplify;

    @JsProperty
    public XYSeries target;

    @JsMethod
    public native Regression constructor();

    @JsMethod
    public native void init();
}
