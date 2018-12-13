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
package gwt.material.design.amcharts.client.datafield.series;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class XYSeriesDataFields extends SeriesDataFields {

    @JsProperty
    public String categoryX;

    @JsProperty
    public String categoryY;

    @JsProperty
    public String dateX;

    @JsProperty
    public String dateY;

    @JsProperty
    public String openCategoryX;

    @JsProperty
    public String openCategoryY;

    @JsProperty
    public String openDateX;

    @JsProperty
    public String openDateY;

    @JsProperty
    public String openValueX;

    /**
     * @see gwt.material.design.amcore.client.constants.CalculatedValue
     */
    @JsProperty
    public String openValueXShow;

    @JsProperty
    public String openValueY;

    /**
     * @see gwt.material.design.amcore.client.constants.CalculatedValue
     */
    @JsProperty
    public String openValueYShow;

    @JsProperty
    public String valueX;

    /**
     * @see gwt.material.design.amcore.client.constants.CalculatedValue
     */
    @JsProperty
    public String valueXShow;

    @JsProperty
    public String valueY;

    /**
     * @see gwt.material.design.amcore.client.constants.CalculatedValue
     */
    @JsProperty
    public String valueYShow;

}
