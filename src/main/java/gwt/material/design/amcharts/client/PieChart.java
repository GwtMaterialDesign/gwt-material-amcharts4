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

import gwt.material.design.amcore.client.events.SpriteEventDispatcher;
import gwt.material.design.amcore.client.list.ListTemplate;
import gwt.material.design.amcore.client.base.Percent;
import gwt.material.design.amcharts.client.datafield.chart.PieChartDataFields;
import gwt.material.design.amcharts.client.series.PieSeries;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class PieChart extends PercentChart {

    @JsProperty
    public double endAngle;

    /**
     * Accepts {@link Number} or {@link Percent}
     */
    @JsProperty
    public Object innerRadius;

    /**
     * Accepts {@link Number} or {@link Percent}
     */
    @JsProperty
    public Object radius;

    @JsProperty
    public double startAngle;

    @JsProperty
    public PieChartDataFields dataFields;

    @JsProperty
    public ListTemplate<PieSeries> series;

    @JsProperty
    public SpriteEventDispatcher<PieChart> events;
}
