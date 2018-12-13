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

import com.google.gwt.core.client.JsDate;
import gwt.material.design.amcharts.client.base.TimeInterval;
import gwt.material.design.amcharts.client.datafield.axis.DateAxisDataFields;
import gwt.material.design.amcharts.client.dataitem.DateAxisDataItem;
import gwt.material.design.amcharts.client.dataitem.XYSeriesDataItem;
import gwt.material.design.amcharts.client.series.XYSeries;
import gwt.material.design.amcore.client.list.*;
import gwt.material.design.amcore.client.properties.OrientationPoint;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class DateAxis extends ValueAxis {

    @JsProperty
    public int baseDuration;

    @JsProperty
    public TimeInterval baseInterval;

    @JsProperty
    public Dictionary<String, String> dateFormats;

    @JsProperty
    public List<String> gridIntervals;

    @JsProperty
    public boolean markUnitChange;

    @JsProperty
    public Dictionary<String, String> periodChangeDateFormats;

    @JsProperty
    public boolean skipEmptyPeriods;

    @JsProperty
    public String tooltipDateFormat ;

    @JsProperty
    public DateAxisDataFields dataFields;

    @JsProperty
    public SortedListTemplate<DateAxisBreak> axisBreaks;

    @JsProperty
    public ListTemplate<DateAxisDataItem> axisRanges;

    @JsProperty
    public DateAxisDataItem dataItem;

    @JsProperty
    public OrderedListTemplate<DateAxisDataItem> dataItems;

    @JsMethod
    public native OrientationPoint anyToPoint(Object object);

    @JsMethod
    public native double anyToPosition(Object object);

    @JsMethod
    public native void copyFrom(DateAxis source);

    @JsMethod
    public native OrientationPoint dateToPoint(JsDate date);

    @JsMethod
    public native double dateToPosition(JsDate date);

    @JsMethod
    public native void fillRule(DateAxisDataItem dataItem);

    @JsMethod
    public native String formatLabel(double value);

    @JsMethod
    public native String getPositionLabel(double position);

    @JsMethod
    public native XYSeriesDataItem getSeriesDataItem(XYSeries series, double position);

    @JsMethod
    public native JsDate positionToDate(double position);

    @JsMethod
    public native void appendDataItem(DateAxisDataItem dataItem);

    @JsMethod
    public native DateAxisDataItem createSeriesRange(XYSeries series);

    @JsMethod
    public native void zoomToDates(JsDate startDate, JsDate endDate);

    @JsMethod
    public native void zoomToDates(JsDate startDate, JsDate endDate, boolean skipRangeEvent, boolean instantly);
}
