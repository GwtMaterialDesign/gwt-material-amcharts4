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
package gwt.material.design.amcharts.client.node;

import gwt.material.design.amcharts.client.FlowDiagram;
import gwt.material.design.amcore.client.color.Color;
import gwt.material.design.amcore.client.base.Container;
import gwt.material.design.amcharts.client.legend.LegendSettings;
import gwt.material.design.amcore.client.list.List;
import gwt.material.design.amcharts.client.dataitem.FlowDiagramDataItem;
import gwt.material.design.amcharts.client.dataitem.LegendDataItem;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


@JsType(isNative = true, namespace = "am4charts")
public class FlowDiagramNode extends Container {

    @JsProperty
    public Number adjustedTotal;

    @JsProperty
    public FlowDiagram chart;

    @JsProperty
    public Color color;

    @JsProperty
    public List<FlowDiagramDataItem> incomingDataItems;

    @JsProperty
    public LegendDataItem legendDataItem;

    @JsProperty
    public LegendSettings legendSettings;

    @JsProperty
    public String name;

    @JsProperty
    public List<FlowDiagramDataItem> outgoingDataItems;

    @JsProperty
    public Number total;

    @JsProperty
    public Number totalIncoming;

    @JsProperty
    public Number totalOutgoing;
}
