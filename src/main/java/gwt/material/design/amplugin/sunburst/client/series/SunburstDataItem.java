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

import gwt.material.design.amcharts.client.dataitem.PieChartDataItem;
import gwt.material.design.amcore.client.color.Color;
import gwt.material.design.amcore.client.list.OrderedListTemplate;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4plugins_sunburst")
public class SunburstDataItem extends PieChartDataItem {

    @JsProperty
    public OrderedListTemplate<SunburstDataItem> children;

    @JsProperty
    public Color color;

    @JsProperty
    public int level;

    @JsProperty
    public String name;

    @JsProperty
    public int percent;

    @JsProperty
    public SunburstSeriesDataItem series;

    @JsProperty
    public int value;

    @JsMethod
    public native SunburstDataItem constructor();
}
