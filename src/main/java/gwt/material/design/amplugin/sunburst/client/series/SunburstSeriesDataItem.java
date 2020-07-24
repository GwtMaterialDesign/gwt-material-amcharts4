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
package gwt.material.design.amplugin.sunburst.client.series;

import gwt.material.design.amcharts.client.dataitem.PieSeriesDataItem;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4plugins_sunburst")
public class SunburstSeriesDataItem extends PieSeriesDataItem {

    @JsProperty
    public SunburstSeries component;

    @JsProperty
    public SunburstDataItem sunburstDataItem;

    @JsProperty
    public int value;

    @JsMethod
    public native void hide(int duration, int delay, int toValue, String[] fields);

    @JsMethod
    public native void show(int duration, int delay, String[] fields);
}
