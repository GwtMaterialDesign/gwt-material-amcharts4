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
package gwt.material.design.amcharts.client.renderer;

import gwt.material.design.amcharts.client.axis.*;
import gwt.material.design.amcharts.client.tick.AxisTick;
import gwt.material.design.amcore.client.base.Container;
import gwt.material.design.amcore.client.base.Sprite;
import gwt.material.design.amcore.client.list.ListTemplate;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class AxisRenderer extends Container {

    @JsProperty
    public Axis axis;

    @JsProperty
    public ListTemplate<AxisFill> axisFills;

    @JsProperty
    public int axisLength;

    @JsProperty
    public Container breakContainer;

    @JsProperty
    public double cellEndLocation;

    @JsProperty
    public double cellStartLocation;

    @JsProperty
    public boolean fullWidthTooltip;

    @JsProperty
    public ListTemplate<Grid> grid;

    @JsProperty
    public Container gridContainer;

    @JsProperty
    public boolean inside;

    @JsProperty
    public boolean inversed;

    @JsProperty
    public ListTemplate<AxisLabel> labels;

    @JsProperty
    public AxisLine line;

    @JsProperty
    public double maxLabelPosition;

    @JsProperty
    public Number minGridDistance;

    @JsProperty
    public double minLabelPosition;

    @JsProperty
    public boolean opposite;

    @JsProperty
    public ListTemplate<AxisTick> ticks;

    @JsProperty
    public Number tooltipLocation;

    @JsProperty
    public Sprite baseGrid;

    @JsMethod
    public native double coordinateToPosition(Number coordinate);

    @JsMethod
    public native void copyFrom(AxisRenderer source);

    @JsMethod
    public native AxisFill createFill(Axis axis);

    @JsMethod
    public native Grid createGrid();

    @JsMethod
    public native AxisLabel createLabel();

    @JsMethod
    public native AxisTick createTick();

    @JsMethod
    public native Number positionToCoordinate(double position);
}
