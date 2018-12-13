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
package gwt.material.design.amcore.client.export;

import gwt.material.design.amcore.client.base.InteractionObject;
import gwt.material.design.amcore.client.list.List;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class ExportMenuItem {

    @JsProperty
    public List<ExportMenuItem> ascendants;

    @JsProperty
    public String format;

    @JsProperty
    public InteractionObject interactions;

    @JsProperty
    public String label;

    @JsProperty
    public ExportMenuItem[] menu;

    //TODO: Options

    @JsProperty
    public Object type;

    @JsProperty
    public boolean unsupported;
}
