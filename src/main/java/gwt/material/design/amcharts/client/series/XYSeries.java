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
package gwt.material.design.amcharts.client.series;

import gwt.material.design.amcharts.client.axis.Axis;
import gwt.material.design.amcharts.client.datafield.series.XYSeriesDataFields;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class XYSeries extends Series {

    @JsProperty
    public Axis baseAxis;

    @JsProperty
    public boolean stacked;

    @JsProperty
    public Axis xAxis;

    @JsProperty
    public Axis yAxis;

    @JsMethod
    public native String getAxisField(Axis axis);

    @JsMethod
    public native void hide();

    @JsMethod
    public native void hide(int duration);

    @JsMethod
    public native void hideTooltip();

    @JsMethod
    public native void show();

    @JsMethod
    public native void show(int duration);

    @JsProperty
    public XYSeriesDataFields dataFields;
}
