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

import gwt.material.design.amcharts.client.bullet.CircleBullet;
import gwt.material.design.amcharts.client.legend.HeatLegend;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "am4charts", namespace = JsPackage.GLOBAL)
public class Am4Charts {

    @JsProperty(name = "PieChart")
    public static PieChart PieChart;

    @JsProperty(name = "SerialChart")
    public static SerialChart SerialChart;


    @JsProperty(name = "XYChart")
    public static XYChart XYChart;

    @JsProperty(name = "RadarChart")
    public static RadarChart RadarChart;

    @JsProperty(name = "TreeMap")
    public static TreeMap TreeMap;

    @JsProperty(name = "SankeyDiagram")
    public static SankeyDiagram SankeyDiagram;

    @JsProperty(name = "GaugeChart")
    public static GaugeChart GaugeChart;

    @JsProperty(name = "ChordDiagram")
    public static ChordDiagram ChordDiagram;

    @JsProperty(name = "SlicedChart")
    public static SlicedChart SlicedChart;

    @JsProperty(name = "HeatLegend")
    public static HeatLegend HeatLegend;

    @JsProperty(name = "CircleBullet")
    public static CircleBullet CircleBullet;

}
