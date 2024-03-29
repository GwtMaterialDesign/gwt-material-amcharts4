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
package gwt.material.design.amcore.client.adapter;

import gwt.material.design.amcore.client.events.EventDispatcher;
import gwt.material.design.jquery.client.api.Functions;
import jsinterop.annotations.*;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Adapter<T, V> {

    @JsProperty
    public EventDispatcher<Object> eventDispatcher;

    @JsProperty
    public Object object;

    @JsMethod
    public native void add(String key, Functions.FuncRet2<T, V> callback);

    @JsMethod
    public native void add(String key, Functions.FuncRet2<T, V> callback, int priority, Object scope);

    @JsMethod
    public native void apply(String key, Object value);

    @JsMethod
    public native void clear();

    @JsMethod
    public native void copyFrom(Adapter adapter);

    @JsMethod
    public native boolean has(String key, Functions.FuncRet1<Object> callback);

    @JsMethod
    public native boolean isEnabled(String key);

    @JsMethod
    public native String[] keys();

    @JsMethod
    public native void remove(String key);


    @JsMethod
    public native void remove(String key, int priority);
}
