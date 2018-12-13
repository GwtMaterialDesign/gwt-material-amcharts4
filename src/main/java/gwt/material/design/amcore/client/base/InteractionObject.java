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
package gwt.material.design.amcore.client.base;

import gwt.material.design.amcore.client.animation.InertiaOptions;
import gwt.material.design.amcore.client.animation.InertialTypes;
import gwt.material.design.amcore.client.events.InteractionObjectEventDispatcher;
import gwt.material.design.amcore.client.list.Dictionary;
import gwt.material.design.amcore.client.list.List;
import gwt.material.design.amcore.client.properties.*;
import gwt.material.design.jscore.client.api.core.Element;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4core")
public class InteractionObject extends BaseObject {

    @JsProperty
    public boolean clickable;

    @JsProperty
    public Pointer downPointers;

    @JsProperty
    public boolean draggable;

    @JsProperty
    public Element element;

    @JsProperty
    public InteractionObjectEventDispatcher<InteractionObject> events;

    @JsProperty
    public boolean focusable;

    @JsProperty
    public HitOptions hitOptions;

    @JsProperty
    public HoverOptions hoverOptions;

    @JsProperty
    public boolean inert;

    @JsProperty
    public Dictionary<InertialTypes, InertiaOptions> inertiaOptions;

    @JsProperty
    public boolean isDown;

    @JsProperty
    public boolean isFocused;

    @JsProperty
    public boolean isHover;

    @JsProperty
    public boolean isHoverByTouch;

    @JsProperty
    public KeyboardOptions keyboardOptions;

    @JsProperty
    public List<Pointer> overPointers;

    @JsProperty
    public boolean resizable;

    @JsProperty
    public SwipeOptions swipeOptions;

    @JsProperty
    public boolean swipeable;

    @JsProperty
    public int tabindex;

    @JsProperty
    public boolean trackable;

    @JsProperty
    public boolean wheelable;

    @JsMethod
    public native void copyFrom(InteractionObject source);

    @JsMethod
    public native void dispose();
}
