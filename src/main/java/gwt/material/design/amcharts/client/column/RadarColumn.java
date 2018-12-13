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
package gwt.material.design.amcharts.client.column;

import gwt.material.design.amcharts.client.adapter.RadarColumnAdapter;
import gwt.material.design.amcore.client.adapter.Adapter;
import gwt.material.design.amcore.client.base.Slice;
import gwt.material.design.amcore.client.list.DictionaryTemplate;
import gwt.material.design.amcharts.client.properties.RadarColumnProperties;
import gwt.material.design.amcore.client.state.SpriteState;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class RadarColumn extends Column {

   @JsProperty
   public Adapter<RadarColumn, RadarColumnAdapter> adapter;

   @JsProperty
   public Slice radarColumn;

   @JsProperty
   public DictionaryTemplate<String, SpriteState<RadarColumnProperties>> states;
}
