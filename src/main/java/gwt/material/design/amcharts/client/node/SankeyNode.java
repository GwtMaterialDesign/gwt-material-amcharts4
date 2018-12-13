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
package gwt.material.design.amcharts.client.node;

import gwt.material.design.amcharts.client.ChordDiagram;
import gwt.material.design.amcharts.client.SankeyDiagram;
import gwt.material.design.amcharts.client.axis.AxisLabelCircular;
import gwt.material.design.amcharts.client.bullet.LabelBullet;
import gwt.material.design.amcore.client.base.Slice;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


@JsType(isNative = true, namespace = "am4charts")
public class SankeyNode extends FlowDiagramNode {

   @JsProperty
   public SankeyDiagram chart;

   @JsProperty
   public Number level;

   @JsProperty
   public LabelBullet nameLabel;

   @JsProperty
   public LabelBullet valueLabel;

   @JsMethod
   public native void copyFrom(SankeyNode source);
}
