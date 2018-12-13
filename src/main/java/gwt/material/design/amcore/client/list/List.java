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
package gwt.material.design.amcore.client.list;

import gwt.material.design.jquery.client.api.Functions;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4core")
public class List<T> {

    @JsProperty
    public int length;

    @JsProperty
    public T[] values;

    @JsMethod
    public native void clear();

    @JsMethod
    public native boolean contains(T value);

    @JsMethod
    public native void copyFrom(List source);

    @JsMethod
    public native void each(Functions.Func1<T> f);

    @JsMethod
    public native T getIndex(int index);

    @JsMethod
    public native boolean hasIndex(int index);

    @JsMethod
    public native int indexOf(T value);

    @JsMethod
    public native void insertIndex(int index, T value);

    @JsMethod
    public native void moveValue(T value);

    @JsMethod
    public native void moveValue(T value, int toIndex);

    @JsMethod
    public native void pop();

    @JsMethod
    public native T push(T value);

    @JsMethod
    public native void pushAll(T[] values);

    @JsMethod
    public native T removeIndex(int index);

    @JsMethod
    public native void removeValue(T value);

    @JsMethod
    public native void setAll(T[] newArray);

    @JsMethod
    public native T setIndex(int number, T value);

    @JsMethod
    public native T shift();

    @JsMethod
    public native void sort(Functions.FuncRet2<T, T> order);

    @JsMethod
    public native void swap(int a, int b);

    @JsMethod
    public native void unshift(T value);

    @JsMethod
    public native T create();
}
