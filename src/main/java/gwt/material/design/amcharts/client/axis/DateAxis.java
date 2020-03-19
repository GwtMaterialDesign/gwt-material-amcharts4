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
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import java.util.Date;

@JsType(isNative = true, namespace = "am4charts")
public class DateAxis extends ValueAxis {

    @JsProperty
    public int baseDuration;

    /**
     * A base interval (granularity) of data.
     * Used to indicate what are the base units of your data.
     * For example, if you have a data set that has a data point every 5 minutes, you may want to set this to { timeUnit: "minute", count: 5 }.
     * If not set, the Axis will try to determine the setting by its own, looking at actual data.
     * For best results, try to follow these values for count:
     * When unit is "month", use 12 / count = round number When unit is "hour", use 24 / count = round number When unit is "second" and "minute", use 60 / count = round number
     */
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
    public JsDate tooltipDate;

    @JsProperty
    public String tooltipDateFormat;

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

    @JsOverlay
    public final OrientationPoint dateToPoint(Date date) {
        return dateToPoint(JsDate.create(date.getTime()));
    }

    @JsMethod
    public native double dateToPosition(JsDate date);

    @JsOverlay
    public final double dateToPosition(Date date) {
        return dateToPosition(JsDate.create(date.getTime()));
    }

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

    @JsOverlay
    public final Date _positionToDate(double position) {
        return new Date((long) positionToDate(position).getTime());
    }

    @JsMethod
    public native void appendDataItem(DateAxisDataItem dataItem);

    @JsMethod
    public native DateAxisDataItem createSeriesRange(XYSeries series);

    @JsMethod
    public native void zoomToDates(JsDate startDate, JsDate endDate);

    @JsOverlay
    public final void zoomToDates(Date startDate, Date endDate) {
        zoomToDates(JsDate.create(startDate.getTime()), JsDate.create(endDate.getTime()));
    }

    @JsMethod
    public native void zoomToDates(JsDate startDate, JsDate endDate, boolean skipRangeEvent, boolean instantly);

    @JsOverlay
    public final void zoomToDates(Date startDate, Date endDate, boolean skipRangeEvent, boolean instantly) {
        zoomToDates(JsDate.create(startDate.getTime()), JsDate.create(endDate.getTime()), skipRangeEvent, instantly);
    }

    /**
     * Type number
     * Indicates threshold of data items in selected range at which to start aggregating data items if groupData = true.
     */
    @JsProperty
    public int groupCount;

    /**
     * Type boolean
     * Indicates if data should be aggregated to composide data items if there are more data items in selected range than groupCount.
     * Grouping will occur automatically, based on current selection range, and will change dynamically when user zooms in/out the chart.
     * NOTE: This works only if DateAxis is base axis of an XYSeries.
     * The related XYSeries also needs to be set up to take advantage of, by setting its groupFields.
     * The group intervals to aggregate data to is defined by groupIntervals property.
     */
    @JsProperty
    public boolean groupData;

    /**
     * If data aggregation is enabled by setting Axis' groupData = true, the chart will try to aggregate data items into grouped data items.
     * If there are more data items in selected period than groupCount, it will group data items into bigger period.
     * For example seconds might be grouped into 10-second aggregate data items.
     * This setting indicates what group intervals can the chart group to.
     *
     * Default intervals:
     *
     * [
     *   { timeUnit: "millisecond", count: 1},
     *   { timeUnit: "millisecond", count: 10 },
     *   { timeUnit: "millisecond", count: 100 },
     *   { timeUnit: "second", count: 1 },
     *   { timeUnit: "second", count: 10 },
     *   { timeUnit: "minute", count: 1 },
     *   { timeUnit: "minute", count: 10 },
     *   { timeUnit: "hour", count: 1 },
     *   { timeUnit: "day", count: 1 },
     *   { timeUnit: "week", count: 1 },
     *   { timeUnit: "month", count: 1 },
     *   { timeUnit: "year", count: 1 }
     * ]
     */
    @JsProperty
    public List<TimeInterval> groupIntervals;

    /**
     *A collection of start timestamps to use as axis' max timestamp for particular data item item periods.
     @readonly
     */
    @JsProperty
    public boolean groupMax;

    /**
     *A collection of start timestamps to use as axis' min timestamp for particular data item item periods.
     @readonly
     */
    @JsProperty
    public boolean groupMin;
}
