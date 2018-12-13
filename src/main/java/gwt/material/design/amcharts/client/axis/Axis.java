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

import gwt.material.design.amcharts.client.Chart;
import gwt.material.design.amcharts.client.datafield.axis.AxisDataFields;
import gwt.material.design.amcharts.client.dataitem.AxisDataItem;
import gwt.material.design.amcharts.client.renderer.AxisRenderer;
import gwt.material.design.amcharts.client.series.XYSeries;
import gwt.material.design.amcore.client.base.Sprite;
import gwt.material.design.amcore.client.events.SpriteEventDispatcher;
import gwt.material.design.amcore.client.list.*;
import gwt.material.design.amcore.client.properties.OrientationPoint;
import gwt.material.design.amcore.client.properties.Point;
import gwt.material.design.amcore.client.state.SpriteState;
import gwt.material.design.amcore.client.ui.Label;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class Axis extends Sprite {

    @JsProperty
    public boolean autoDispose;

    @JsProperty
    public SortedListTemplate<AxisBreak> axisBreaks;

    @JsProperty
    public int axisFullLength;

    @JsProperty
    public int axisLength;

    @JsProperty
    public ListTemplate<AxisDataItem> axisRanges;

    @JsProperty
    public Chart chart;

    @JsProperty
    public boolean cursorTooltipEnabled;

    @JsProperty
    public double endLocation;

    @JsProperty
    public AxisLabel ghostLabel;

    @JsProperty
    public AxisRenderer renderer;

    @JsProperty
    public List<XYSeries> series;

    @JsProperty
    public double startLocation;

    @JsProperty
    public Label title;

    @JsProperty
    public boolean mouseEnabled;

    @JsProperty
    public AxisDataFields dataFields;

    @JsProperty
    public AxisDataItem dataItem;

    @JsProperty
    public List<AxisDataItem> dataItems;

    @JsProperty
    public SpriteEventDispatcher<Axis> events;

    @JsProperty
    public SpriteState<Axis> defaultState;

    @JsProperty
    public SpriteState<Axis> hiddenState;

    @JsProperty
    public DictionaryTemplate<String, SpriteState<Axis>> states;

    @JsMethod
    public native OrientationPoint anyToPoint(Number value);

    @JsMethod
    public native double anyToPosition(Number value);

    @JsMethod
    public native void appendDataItem(AxisDataItem dataItem);

    @JsMethod
    public native void copyFrom(Axis axis);

    @JsMethod
    public native AxisDataItem createSeriesRange(XYSeries series);

    @JsMethod
    public native void fillRule(AxisDataItem dataItem);

    @JsMethod
    public native void fillRule(AxisDataItem dataItem, int index);

    @JsMethod
    public native String getPositionLabel(double position);

    @JsMethod
    public native void invalidateSeries();

    @JsMethod
    public native double pointToPosition(Point point);

    @JsMethod
    public native double positionToAngle(double position);

    @JsMethod
    public native void showTooltipAtPosition(double position);

    @JsMethod
    public native void toAxisPosition(double position);
}
