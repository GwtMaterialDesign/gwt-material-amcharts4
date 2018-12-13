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
package gwt.material.design.amcharts.client.dataitem;

import gwt.material.design.amcharts.client.tick.Tick;
import gwt.material.design.amcore.client.animation.Animation;
import gwt.material.design.amcore.client.base.Sprite;
import gwt.material.design.amcore.client.ui.Label;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class PercentSeriesDataItem extends SeriesDataItem {

    @JsProperty
    public String category;

    @JsProperty
    public boolean hiddenInLegend;

    @JsProperty
    public Label label;

    @JsProperty
    public LegendDataItem legendDataItem;

    @JsProperty
    public Sprite slice;

    @JsProperty
    public Tick tick;

    @JsMethod
    public native Animation hide();

    @JsMethod
    public native Animation hide(int duration, int delay, Number toValue, String fields[]);

    @JsMethod
    public native void setVisibility(boolean value);

    @JsMethod
    public native void setVisibility(boolean value, boolean noChangeValue);

    @JsMethod
    public native void show();
}
