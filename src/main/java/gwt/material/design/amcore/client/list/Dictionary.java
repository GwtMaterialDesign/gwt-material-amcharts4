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
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4core")
public class Dictionary<T, V> {

    @JsMethod
    public native void clear();

    @JsMethod
    public native void copyFrom(Dictionary<T, V> source);

    @JsMethod
    public native void each(Functions.Func2<T, V> values);

   @JsMethod
   public native  V getKey(T key);

   @JsMethod
   public native boolean hasKey(V key);

   @JsMethod
   public native void insertKey(T key, V value);

   @JsMethod
   public native void removeKey(V key);

   @JsMethod
   public native void setKey(T key, V value);
}
