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

import gwt.material.design.amcharts.client.axis.*;
import gwt.material.design.amcharts.client.tick.AxisTick;
import gwt.material.design.amcore.client.base.Container;
import gwt.material.design.amcore.client.dataitem.DataItem;
import gwt.material.design.amcore.client.properties.Point;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class AxisDataItem extends DataItem {

    @JsProperty
    public AxisBreak axisBreak;

    @JsProperty
    public AxisFill axisFill;

    @JsProperty
    public Container contents;

    @JsProperty
    public Grid grid;

    @JsProperty
    public AxisLabel label;

    @JsProperty
    public AxisFill mask;

    @JsProperty
    public Point point;

    @JsProperty
    public double position;

    @JsProperty
    public Number value;

    @JsProperty
    public Number startValue;

    @JsProperty
    public Number endValue;

    @JsProperty
    public String text;

    @JsProperty
    public AxisTick tick;
}
