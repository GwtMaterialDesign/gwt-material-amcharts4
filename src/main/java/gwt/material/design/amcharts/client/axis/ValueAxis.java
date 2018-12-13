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

import gwt.material.design.amcharts.client.SerialChart;
import gwt.material.design.amcharts.client.dataitem.ValueAxisDataItem;
import gwt.material.design.amcore.client.list.List;
import gwt.material.design.amcharts.client.datafield.axis.ValueAxisDataFields;
import gwt.material.design.amcore.client.list.ListTemplate;
import gwt.material.design.amcore.client.list.OrderedListTemplate;
import gwt.material.design.amcore.client.list.SortedListTemplate;
import gwt.material.design.amcore.client.properties.OrientationPoint;
import gwt.material.design.amcore.client.properties.Point;
import gwt.material.design.amcharts.client.series.XYSeries;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class ValueAxis extends Axis {

    @JsProperty
    public Number baseValue;

    @JsProperty
    public boolean calculateTotals;

    @JsProperty
    public SerialChart chart;

    @JsProperty
    public double extraMax;

    @JsProperty
    public double extraMin;

    @JsProperty
    public boolean logarithmic;

    @JsProperty
    public double max;

    @JsProperty
    public Number maxPrecision;

    @JsProperty
    public Number maxZoomed;

    @JsProperty
    public double min;

    @JsProperty
    public Number minZoomed;

    @JsProperty
    public List<XYSeries> series;

    @JsProperty
    public int step;

    @JsProperty
    public boolean strictMinMax;

    @JsProperty
    public SortedListTemplate<ValueAxisBreak> axisBreaks;

    @JsProperty
    public ListTemplate<ValueAxisDataItem> axisRanges;

    @JsProperty
    public ValueAxisDataFields dataFields;

    @JsProperty
    public ValueAxisDataItem dataItem;

    @JsProperty
    public OrderedListTemplate<ValueAxisDataItem> dataItems;

    @JsMethod
    public native OrientationPoint anyToPoint(Number value);

    @JsMethod
    public native double anyToPosition(Number value);

    @JsMethod
    public native void copyFrom(ValueAxis source);

    @JsMethod
    public native String formatLabel(Number value);

    @JsMethod
    public native String getPositionLabel(double position);

    @JsMethod
    public native double pointToPosition(Point point);

    @JsMethod
    public native Number positionToValue(double position);

    @JsMethod
    public native void showTooltipAt(Number value);

    @JsMethod
    public native OrientationPoint valueToPoint(Number value);

    @JsMethod
    public native double valueToPosition(Number value);

    @JsMethod
    public native Number xToValue(Number x);

    @JsMethod
    public native Number yToValue(Number y);

    @JsMethod
    public native void zoomToValues(Number start, Number end);

    @JsMethod
    public native void zoomToValues(Number start, Number end, boolean skipRangeEvent, boolean instantly);

    @JsMethod
    public native void appendDataItem(ValueAxisDataItem dataItem);

    @JsMethod
    public native ValueAxisDataItem createSeriesRange(XYSeries series);

    @JsMethod
    public native void fillRule(ValueAxisDataItem dataItem);
}
