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
package gwt.material.design.amplugin.timeline.client.renderer;

import gwt.material.design.amcharts.client.renderer.AxisRendererY;
import gwt.material.design.amcore.client.properties.Point;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4plugins_timeline")
public class AxisRendererCurveY extends AxisRendererY {

    @JsProperty
    public int axisLength;

    @JsProperty
    public int axisLocation;

    @JsProperty
    public int innerRadius;

    @JsProperty
    public int radius;

    @JsMethod
    public native int coordinate(int coordinate);

    @JsMethod
    public native int coordinate(int coordinate, int coordinate2);

    @JsMethod
    public native int positionToAngle(double position);

    @JsMethod
    public native Point positionToPoint(double position);
}
