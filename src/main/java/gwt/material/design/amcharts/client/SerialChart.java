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

import gwt.material.design.amcharts.client.datafield.chart.SerialChartDataFields;
import gwt.material.design.amcharts.client.series.Series;
import gwt.material.design.amcore.client.base.Container;
import gwt.material.design.amcore.client.color.ColorSet;
import gwt.material.design.amcore.client.events.SpriteEventDispatcher;
import gwt.material.design.amcore.client.list.ListTemplate;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class SerialChart extends Chart {

    @JsProperty
    public Container bulletsContainer;

    @JsProperty
    public ColorSet colors;

    @JsProperty
    public ListTemplate<Series> series;

    @JsProperty
    public Container seriesContainer;

    @JsProperty
    public SerialChartDataFields dataFields;

    @JsProperty
    public SpriteEventDispatcher<SerialChart> events;

    @JsMethod
    public native void copyFrom(SerialChart copyFrom);

    @JsMethod
    public native void dispose();
}
