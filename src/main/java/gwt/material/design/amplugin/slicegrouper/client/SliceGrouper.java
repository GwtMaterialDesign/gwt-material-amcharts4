/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2020 GwtMaterialDesign
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
package gwt.material.design.amplugin.slicegrouper.client;

import gwt.material.design.amcharts.client.properties.FunnelSliceProperties;
import gwt.material.design.amcharts.client.series.PercentSeries;
import gwt.material.design.amcore.client.base.Plugin;
import gwt.material.design.amcore.client.color.Color;
import gwt.material.design.amcore.client.list.List;
import gwt.material.design.amcore.client.ui.Button;
import gwt.material.design.jscore.client.api.html.HTMLElement;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4plugins_sliceGrouper")
public class SliceGrouper extends Plugin {

    @JsProperty
    public List<Object> bigSlices;

    @JsProperty
    public String clickBehavior;

    @JsProperty
    public String groupName;

    @JsProperty
    public FunnelSliceProperties groupProperties;

    @JsProperty
    public Object groupSlice;

    @JsProperty
    public List<Object> smallSlices;

    @JsProperty
    public boolean syncLegend;

    @JsProperty
    public PercentSeries target;

    @JsProperty
    public int threshold;

    @JsProperty
    public Button zoomOutButton;

    @JsMethod
    public native SliceGrouper constructor();

    @JsMethod
    public native void dispose();

    @JsMethod
    public native void init();
}
