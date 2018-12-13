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
package gwt.material.design.amcharts.client.axis;

import gwt.material.design.amcharts.client.datafield.axis.DurationAxisDataFields;
import gwt.material.design.amcharts.client.dataitem.DurationAxisDataItem;
import gwt.material.design.amcharts.client.series.XYSeries;
import gwt.material.design.amcore.client.list.ListTemplate;
import gwt.material.design.amcore.client.list.OrderedListTemplate;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class DurationAxis extends ValueAxis {

    @JsProperty
    public String axisDurationFormat;

    /**
     * @see gwt.material.design.amcore.client.constants.TimeUnit
     */
    @JsProperty
    public String baseUnit;

    @JsProperty
    public String tooltipDurationFormat;

    @JsProperty
    public ListTemplate<DurationAxisDataItem> axisRanges;

    @JsProperty
    public DurationAxisDataFields dataFields;

    @JsProperty
    public DurationAxisDataItem dataItem;

    @JsProperty
    public OrderedListTemplate<DurationAxisDataItem> dataItems;

    @JsMethod
    public native void copyFrom(DurationAxis source);

    @JsMethod
    public native String formatLabel(Number value);

    @JsMethod
    public native String formatLabel(Number value, String format);

    @JsMethod
    public native void appendDataItem(DurationAxisDataItem dataItem);

    @JsMethod
    public native DurationAxisDataItem createSeriesRange(XYSeries series);
}
