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
package gwt.material.design.amcore.client.properties;

import gwt.material.design.amcore.client.base.Breadcrumb;
import gwt.material.design.amcore.client.base.InteractionObject;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Pointer {

    @JsProperty
    public Number button;

    @JsProperty
    public Object[] dragStartEvents;

    @JsProperty
    public InteractionObject dragTarget;

    @JsProperty
    public Number hitTimeout;

    @JsProperty
    public String id;

    @JsProperty
    public Object lastDownEvent;

    @JsProperty
    public Object lastEvent;

    @JsProperty
    public Object lastUpEvent;

    @JsProperty
    public Point point;

    @JsProperty
    public Point startPoint;

    @JsProperty
    public Number startTime;

    @JsProperty
    public boolean swipeCanceled;

    @JsProperty
    public Number swipeTimeout;

    @JsProperty
    public boolean touch;

    @JsProperty
    public Breadcrumb track;
}
