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
package gwt.material.design.amcharts.client.legend;

import gwt.material.design.amcharts.client.axis.ValueAxis;
import gwt.material.design.amcharts.client.series.Series;
import gwt.material.design.amcore.client.base.Container;
import gwt.material.design.amcore.client.color.Color;
import gwt.material.design.amcore.client.constants.Orientation;
import gwt.material.design.amcore.client.list.ListTemplate;
import gwt.material.design.amcore.client.ui.RoundedRectangle;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class HeatLegend extends Container {

    @JsProperty
    public Container markerContainer;

    @JsProperty
    public int markerCount;

    @JsProperty
    public ListTemplate<RoundedRectangle> markers;

    @JsProperty
    public Color maxColor;

    @JsProperty
    public Number maxValue;

    @JsProperty
    public Color minColor;

    @JsProperty
    public Number minValue;

    /**
     * @see Orientation
     */
    @JsProperty
    public String orientation;

    @JsProperty
    public Series series;

    @JsProperty
    public ValueAxis valueAxis;
}
