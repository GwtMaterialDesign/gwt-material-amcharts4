/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2020 GwtMaterialDesign
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
package gwt.material.design.amplugin.forcedirected.client.datafield;

import gwt.material.design.amcharts.client.datafield.series.SeriesDataFields;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4plugins_forceDirected")
public class ForceDirectedSeriesDataFields extends SeriesDataFields {

    @JsProperty
    public String category;

    @JsProperty
    public String children;

    @JsProperty
    public String collapsed;

    @JsProperty
    public String color;

    @JsProperty
    public String fixed;

    @JsProperty
    public String hiddenInLegend;

    @JsProperty
    public String linkWith;

    @JsProperty
    public String name;
}
