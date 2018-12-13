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
package gwt.material.design.amcharts.client.axis;

import gwt.material.design.amcharts.client.datafield.axis.AxisDataFields;
import gwt.material.design.amcharts.client.dataitem.AxisDataItem;
import gwt.material.design.amcore.client.base.Container;
import gwt.material.design.amcore.client.events.SpriteEventDispatcher;
import gwt.material.design.amcore.client.list.DictionaryTemplate;
import gwt.material.design.amcore.client.list.List;
import gwt.material.design.amcore.client.dataitem.DataItem;
import gwt.material.design.amcore.client.list.OrderedListTemplate;
import gwt.material.design.amcore.client.properties.Point;
import gwt.material.design.amcore.client.properties.WavedShape;
import gwt.material.design.amcore.client.state.SpriteState;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class AxisBreak extends Container {

    @JsProperty
    public Number adjustedEndValue;

    @JsProperty
    public Number adjustedStartValue;

    @JsProperty
    public Axis axis;

    @JsProperty
    public Number breakSize;

    @JsProperty
    public WavedShape endLine;

    @JsProperty
    public Point endPoint;

    @JsProperty
    public double endPosition;

    @JsProperty
    public Number endValue;

    @JsProperty
    public WavedShape fillShape;

    @JsProperty
    public WavedShape startLine;

    @JsProperty
    public Point startPoint;

    @JsProperty
    public double startPosition;

    @JsProperty
    public Number startValue;

    @JsProperty
    public AxisDataItem dataItem;

    @JsProperty
    public List<AxisDataItem> dataItems;

    @JsProperty
    public SpriteEventDispatcher<AxisBreak> events;

    @JsProperty
    public SpriteState<AxisBreak> defaultState;

    @JsProperty
    public SpriteState<AxisBreak> hiddenState;

    @JsProperty
    public DictionaryTemplate<String, SpriteState<AxisBreak>> states;

    @JsMethod
    public native void dispose();
}
