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
package gwt.material.design.amplugin.forcedirected.client.series;

import gwt.material.design.amcharts.client.series.Series;
import gwt.material.design.amcore.client.color.ColorSet;
import gwt.material.design.amcore.client.list.ListTemplate;
import gwt.material.design.amcore.client.list.OrderedListTemplate;
import gwt.material.design.amplugin.forcedirected.client.base.ForceDirectedLink;
import gwt.material.design.amplugin.forcedirected.client.base.ForceDirectedNode;
import gwt.material.design.amplugin.forcedirected.client.datafield.ForceDirectedSeriesDataFields;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4plugins_forceDirected")
public class ForceDirectedSeries extends Series {

    @JsProperty
    public int centerStrength;

    @JsProperty
    public ColorSet colors;

    @JsProperty
    public Object d3forceSimulation;

    @JsProperty
    public ForceDirectedSeriesDataFields dataFields;

    @JsProperty
    public int linkWithStrength;

    @JsProperty
    public ListTemplate<ForceDirectedLink> links;

    @JsProperty
    public int manyBodyStrength;

    @JsProperty
    public int maxLevels;

    @JsProperty
    public int maxRadius;

    @JsProperty
    public int minRadius;

    @JsProperty
    public ListTemplate<ForceDirectedNode> nodes;

    @JsProperty
    public ForceDirectedTreeDataItem parentDataItem;

    @JsMethod
    public native ForceDirectedSeries constructor();

    @JsMethod
    public native ForceDirectedSeriesDataItem getDataItemById(OrderedListTemplate<ForceDirectedSeriesDataItem> dataItems, String id);
}
