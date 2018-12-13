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
package gwt.material.design.amcharts.client;

import gwt.material.design.amcharts.client.axis.ValueAxis;
import gwt.material.design.amcharts.client.dataitem.TreeMapSeriesDataItem;
import gwt.material.design.amcore.client.color.ColorSet;
import gwt.material.design.amcore.client.constants.Sorting;
import gwt.material.design.amcore.client.events.AmEvent;
import gwt.material.design.amcore.client.events.SpriteEventDispatcher;
import gwt.material.design.amcore.client.list.ListTemplate;
import gwt.material.design.amcharts.client.base.NavigationBar;
import gwt.material.design.amcharts.client.datafield.chart.TreeMapDataFields;
import gwt.material.design.amcore.client.list.DictionaryTemplate;
import gwt.material.design.amcharts.client.series.TreeMapSeries;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class TreeMap extends XYChart {

    @JsProperty
    public ColorSet colors;

    @JsProperty
    public Number currentLevel;

    @JsProperty
    public TreeMapDataFields currentlyZoomed;

    @JsProperty
    public String homeText;

    @JsProperty
    public Object layoutAlgorithm;

    @JsProperty
    public Number maxLevels;

    @JsProperty
    public NavigationBar navigationBar;

    @JsProperty
    public DictionaryTemplate<String, TreeMapSeries> seriesTemplates;

    /**
     * @see Sorting
     */
    @JsProperty
    public String sorting;

    @JsProperty
    public ValueAxis xAxis;

    @JsProperty
    public ValueAxis yAxis;

    @JsProperty
    public boolean zoomable;

    @JsProperty
    public TreeMapDataFields dataFields;

    @JsProperty
    public ListTemplate<TreeMapSeries> series;

    @JsProperty
    public SpriteEventDispatcher<TreeMap> events;

    @JsMethod
    public native void zoomToSeriesDataItem(TreeMapSeriesDataItem dataItem);
}
