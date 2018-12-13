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
package gwt.material.design.ammaps.client.series;

import gwt.material.design.amcore.client.data.DataSource;
import gwt.material.design.amcharts.client.series.Series;
import gwt.material.design.ammaps.client.datafields.MapSeriesDataFields;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


@JsType(isNative = true, namespace = "am4maps")
public class MapSeries extends Series {

    @JsProperty
    public Number east;

    @JsProperty
    public String[] exclude;

    @JsProperty
    public Object geodata;

    @JsProperty
    public DataSource geodataSource;

    @JsProperty
    public String[] include;

    @JsProperty
    public Number north;

    @JsProperty
    public Number south;

    @JsProperty
    public boolean useGeodata;

    @JsProperty
    public Number west;

    @JsProperty
    public MapSeriesDataFields dataFields;
}
