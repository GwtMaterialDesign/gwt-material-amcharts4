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
package gwt.material.design.amcharts.client.legend;

import gwt.material.design.amcore.client.base.Component;
import gwt.material.design.amcore.client.base.Container;
import gwt.material.design.amcore.client.ui.Label;
import gwt.material.design.amcore.client.list.ListTemplate;
import gwt.material.design.amcore.client.constants.LegendPosition;
import gwt.material.design.amcharts.client.datafield.LegendDataFields;
import gwt.material.design.amcharts.client.dataitem.LegendDataItem;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class Legend extends Component {

    @JsProperty
    public LegendDataItem focusedItem;

    @JsProperty
    public ListTemplate<Container> itemContainers;

    @JsProperty
    public ListTemplate<Label> labels;

    @JsProperty
    public ListTemplate<Container> markers;

    /**
     * @see LegendPosition
     */
    @JsProperty
    public String position;

    @JsProperty
    public boolean useDefaultMarker;

    @JsProperty
    public ListTemplate<Label> valueLabels;

    @JsProperty
    public LegendDataFields dataFields;
}
