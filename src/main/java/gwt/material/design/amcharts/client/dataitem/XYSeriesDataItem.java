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
package gwt.material.design.amcharts.client.dataitem;

import com.google.gwt.core.client.JsDate;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class XYSeriesDataItem extends SeriesDataItem {

    @JsProperty
    public String categoryX;

    @JsProperty
    public String categoryY;

    @JsProperty
    public JsDate dateX;

    @JsProperty
    public JsDate dateY;

    @JsProperty
    public String openCategoryX;

    @JsProperty
    public String openCategoryY;

    @JsProperty
    public JsDate openDateX;

    @JsProperty
    public JsDate openDateY;

    @JsProperty
    public Number openValueX;

    @JsProperty
    public Number openValueY;

    @JsProperty
    public Number valueX;

    @JsProperty
    public Number valueY;
}
