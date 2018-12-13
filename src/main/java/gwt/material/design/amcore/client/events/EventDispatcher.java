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
package gwt.material.design.amcore.client.events;

import gwt.material.design.jquery.client.api.Functions;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4core")
public class EventDispatcher<T> {

    @JsMethod
    public native void copyFrom(EventDispatcher source);

    @JsMethod
    public native void disable();

    @JsMethod
    public native void disableType(String key, int amount);

    @JsMethod
    public native void dispatchImmediately(String key, Object event);

    @JsMethod
    public native void dispose();

    @JsMethod
    public native void enable();

    @JsMethod
    public native void enableType(String type);

    @JsMethod
    public native boolean has(String key, Functions.Func1<EventTarget<T>> callback, Object context);

    @JsMethod
    public native boolean hasListeners();

    @JsMethod
    public native boolean isDisposed();

    @JsMethod
    public native boolean isEnabled(String key);

    @JsMethod
    public native void off(String key, Functions.Func1<EventTarget<T>> callback, Object context);

    @JsMethod
    public native void on(String event, Functions.Func1<EventTarget<T>> callback, Object source);

    @JsMethod
    public native void on(String event, Functions.Func1<EventTarget<T>> callback);

    @JsMethod
    public native void onAll(Functions.Func1<EventTarget<T>> callback, Object source);

    @JsMethod
    public native void once(String event, Functions.Func1<EventTarget<T>> callback, Object source);

}
