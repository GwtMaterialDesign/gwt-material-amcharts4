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

import gwt.material.design.amcharts.client.column.Column;
import gwt.material.design.amcharts.client.properties.ColumnSeriesProperties;
import gwt.material.design.amcore.client.list.DictionaryTemplate;
import gwt.material.design.amcore.client.list.ListTemplate;
import gwt.material.design.amcharts.client.datafield.series.ColumnSeriesDataFields;
import gwt.material.design.amcharts.client.dataitem.ColumnSeriesDataItem;
import gwt.material.design.amcore.client.state.SpriteState;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class ColumnSeries extends XYSeries {

    @JsProperty
    public boolean clustered;

    @JsProperty
    public ListTemplate<Column> columns;

    @JsProperty
    public SpriteState<ColumnSeriesProperties> dropFromOpenState;

    @JsProperty
    public SpriteState<ColumnSeriesProperties> dropFromPreviousState;

    @JsProperty
    public SpriteState<ColumnSeriesProperties> riseFromOpenState;

    @JsProperty
    public SpriteState<ColumnSeriesProperties> riseFromPreviousState;

    @JsProperty
    public SpriteState<ColumnSeriesProperties> defaultState;

    @JsProperty
    public DictionaryTemplate<String, SpriteState<ColumnSeriesProperties>> states;

    @JsProperty
    public boolean simplifiedProcessing;

    @JsProperty
    public ColumnSeriesDataFields dataFields;

    @JsMethod
    public native void copyFrom(ColumnSeries source);

    @JsMethod
    public native void disableUnusedColumns(ColumnSeriesDataItem dataItem);

}
