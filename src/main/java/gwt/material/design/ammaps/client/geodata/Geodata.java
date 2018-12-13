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
package gwt.material.design.ammaps.client.geodata;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.resources.client.TextResource;
import gwt.material.design.client.MaterialDesign;

import static gwt.material.design.jquery.client.api.JQuery.window;

public abstract class Geodata {

    public JavaScriptObject get() {
        injectJs();
        return window().getPropertyJSO(getName());
    }

    protected void injectJs() {
        if (!GeoDataRegistry.contains(getName())) {
            MaterialDesign.injectJs(getJsResource());
        }

        GeoDataRegistry.register(getName(), getJsResource());
    }

    protected abstract TextResource getJsResource();

    protected abstract String getName();
}
