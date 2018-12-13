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
package gwt.material.design.amcharts.client.base;

import gwt.material.design.amcharts.client.FlowDiagram;
import gwt.material.design.amcharts.client.bullet.Bullet;
import gwt.material.design.amcore.client.base.Container;
import gwt.material.design.amcore.client.base.Sprite;
import gwt.material.design.amcore.client.color.LinearGradient;
import gwt.material.design.amcore.client.constants.ColorMode;
import gwt.material.design.amcore.client.events.SpriteEventDispatcher;
import gwt.material.design.amcore.client.list.ListTemplate;
import gwt.material.design.amcore.client.ui.Line;
import gwt.material.design.amcore.client.ui.PolyLine;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class FlowDiagramLink extends Container {

    @JsProperty
    public ListTemplate<Bullet> bullets;

    @JsProperty
    public Container bulletsContainer;

    @JsProperty
    public Sprite bulletsMask;

    /**
     * @see ColorMode
     */
    @JsProperty
    public String colorMode;

    @JsProperty
    public double endAngle;

    @JsProperty
    public LinearGradient gradient;

    @JsProperty
    public Sprite link;

    @JsProperty
    public boolean maskBullets;

    /**
     * Accepts {@link Line} or {@link PolyLine}
     */
    @JsProperty
    public Object middleLine;

    @JsProperty
    public double startAngle;

    @JsProperty
    public double tooltipLocation;

    @JsProperty
    public SpriteEventDispatcher<FlowDiagramLink> events;

    @JsMethod
    public native void copyFrom(FlowDiagramLink source);
}
