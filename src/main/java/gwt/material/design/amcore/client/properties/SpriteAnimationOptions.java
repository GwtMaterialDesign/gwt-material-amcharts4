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

import gwt.material.design.amcore.client.animation.Morpher;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class SpriteAnimationOptions<T> {

    public SpriteAnimationOptions() {
    }

    @JsOverlay
    public final SpriteAnimationOptions create(T from, String property) {
        SpriteAnimationOptions object = new SpriteAnimationOptions();
        object.from = from;
        object.property = property;
        return object;
    }

    @JsOverlay
    public final SpriteAnimationOptions create(T from, T to, String property) {
        SpriteAnimationOptions object = new SpriteAnimationOptions();
        object.from = from;
        object.to = to;
        object.property = property;
        return object;
    }

    /**
     * Accepts {@link gwt.material.design.amcore.client.base.Percent}, {@link gwt.material.design.amcore.client.color.Color},
     * {@link Number} or {@link String}
     */
    @JsProperty
    public T from;

    @JsProperty
    public String property;

    /**
     * Accepts {@link gwt.material.design.amcore.client.base.Percent}, {@link gwt.material.design.amcore.client.color.Color},
     * {@link Number} or {@link String}
     */
    @JsProperty
    public T to;
}
