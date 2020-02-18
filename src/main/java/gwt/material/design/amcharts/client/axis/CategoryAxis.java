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
import gwt.material.design.amcharts.client.datafield.axis.CategoryAxisDataFields;
import gwt.material.design.amcharts.client.dataitem.CategoryAxisDataItem;
import gwt.material.design.amcharts.client.dataitem.XYSeriesDataItem;
import gwt.material.design.amcharts.client.series.XYSeries;
import gwt.material.design.amcore.client.list.Dictionary;
import gwt.material.design.amcore.client.list.OrderedListTemplate;
import gwt.material.design.amcore.client.properties.OrientationPoint;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class CategoryAxis extends Axis {

    @JsProperty
    public SerialChart chart;

    @JsProperty
    public CategoryAxisDataFields dataFields;

    @JsProperty
    public CategoryAxisDataItem dataItem;

    @JsProperty
    public OrderedListTemplate<CategoryAxisDataItem> dataItems;

    @JsProperty
    public Dictionary<String, CategoryAxisDataItem> dataItemsByCategory;

    @JsMethod
    public native OrientationPoint anyToPoint(String category);

    @JsMethod
    public native OrientationPoint anyToPoint(String category, double location);

    @JsMethod
    public native double anyToPosition(String category);

    @JsMethod
    public native double anyToPosition(String category, double location);

    @JsMethod
    public native int categoryToIndex(String category);

    @JsMethod
    public native OrientationPoint categoryToPoint(String category);

    @JsMethod
    public native OrientationPoint categoryToPoint(String category, double location);

    @JsMethod
    public native String getPositionLabel(double position);

    @JsMethod
    public native XYSeriesDataItem getSeriesDataItem(XYSeries series, double position);

    @JsMethod
    public native double indexToPosition(int index);

    @JsMethod
    public native double indexToPosition(int index, double location);

    @JsMethod
    public native int positionToIndex(double position);

    @JsMethod
    public native double roundPosition(double position);

    @JsMethod
    public native double roundPosition(double position, double location);

    @JsMethod
    public native void zoomToCategories(String startCategory, String endCategory);

    @JsMethod
    public native void appendDataItem(CategoryAxisDataItem dataItem);

    @JsMethod
    public native CategoryAxisDataItem createSeriesRange(XYSeries series);
}
