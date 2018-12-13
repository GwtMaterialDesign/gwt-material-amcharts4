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
package gwt.material.design.amcore.client.animation;

import gwt.material.design.amcore.client.base.BaseObjectsEvents;
import gwt.material.design.amcore.client.events.EventDispatcher;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4core")
public class Animation extends BaseObjectsEvents {

    public Animation() {}

    @JsConstructor
    public Animation(Object animatable, AnimationOptions[] options, int duration) {}

    @JsConstructor
    public Animation(Object animatable, AnimationOptions[] options, int duration, Object easing) {}

    @JsProperty
    public AnimationOptions animationOptions;

    @JsProperty
    public boolean delayed;

    @JsProperty
    public int duration;

    @JsProperty
    public Object easing;

    @JsProperty
    public EventDispatcher<Animation> events;

    @JsProperty
    public int progress;

    @JsMethod
    public native Animation delay();

    @JsMethod
    public native void dispose();

    @JsMethod
    public native Animation end();

    @JsMethod
    public native boolean isFinished();

    @JsMethod
    public native void kill();

    @JsMethod
    public native Animation loop();

    @JsMethod
    public native Animation loop(int cound);

    @JsMethod
    public native Animation pause();

    @JsMethod
    public native Animation resume();

    @JsMethod
    public native void setProgress(int progress);

    @JsMethod
    public native Animation start();

    @JsMethod
    public native Animation stop();

    @JsMethod
    public native Animation stop(boolean skipEvent);
}
