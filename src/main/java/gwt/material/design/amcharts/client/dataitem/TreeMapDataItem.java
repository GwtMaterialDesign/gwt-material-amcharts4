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
package gwt.material.design.amcharts.client.dataitem;

import gwt.material.design.amcharts.client.series.TreeMapSeries;
import gwt.material.design.amcore.client.color.Color;
import gwt.material.design.amcore.client.list.OrderedListTemplate;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class TreeMapDataItem extends XYChartDataItem {

    @JsProperty
    public OrderedListTemplate<TreeMapDataItem> children;

    @JsProperty
    public Color color;

    @JsProperty
    public Number level;

    @JsProperty
    public String name;

    @JsProperty
    public Number percent;

    @JsProperty
    public TreeMapSeries series;

    @JsProperty
    public TreeMapSeriesDataItem seriesDataItem;

    @JsProperty
    public Number value;
}
