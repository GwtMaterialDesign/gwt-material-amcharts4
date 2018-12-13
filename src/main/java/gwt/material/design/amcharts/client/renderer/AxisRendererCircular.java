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
import gwt.material.design.amcore.client.list.ListTemplate;
import gwt.material.design.amcore.client.properties.Point;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class AxisRendererCircular extends AxisRenderer {

    @JsProperty
    public int axisLength;

    @JsProperty
    public double endAngle;

    /**
     * Accepts {@link Number} or {@link gwt.material.design.amcore.client.base.Percent}
     */
    @JsProperty
    public Object innerRadius;

    @JsProperty
    public double pixelInnerRadius;

    @JsProperty
    public double pixelRadius;

    /**
     * Accepts {@link Number} or {@link gwt.material.design.amcore.client.base.Percent}
     */
    @JsProperty
    public Object radius;

    @JsProperty
    public double startAngle;

    @JsProperty
    public boolean useChartAngles;

    @JsProperty
    public ListTemplate<AxisLabelCircular> labels;

    @JsMethod
    public native AxisFillCircular createFill(Axis axis);

    @JsMethod
    public native GridCircular createGrid();

    @JsMethod
    public native AxisLabelCircular createLabel();

    @JsMethod
    public native Number positionToAngle(double position);

    @JsMethod
    public native Point positionToPoint(double position);
}
