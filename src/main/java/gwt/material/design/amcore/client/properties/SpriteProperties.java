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

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class SpriteProperties {

    /**
     * @see gwt.material.design.amcore.client.constants.Align
     */
    @JsProperty
    public String align;

    @JsProperty
    public boolean clickable;

    @JsProperty
    public boolean disabled;

    @JsProperty
    public boolean draggable;

    @JsProperty
    public Number dx;

    @JsProperty
    public Number dy;

    @JsProperty
    public Object fill;

    @JsProperty
    public Object fillModifier;

    @JsProperty
    public Number fillOpacity;

    @JsProperty
    public boolean focusable;

    @JsProperty
    public String height;

    @JsProperty
    public boolean hidden;

    /**
     * @see {@link gwt.material.design.amcore.client.constants.HorizontalCenter}
     */
    @JsProperty
    public String horizontalCenter;

    @JsProperty
    public boolean hoverOnFocus;

    @JsProperty
    public boolean hoverable;

    @JsProperty
    public boolean inert;

    @JsProperty
    public boolean interactionsEnabled;

    @JsProperty
    public boolean longClickable;

    @JsProperty
    public Number marginBottom;

    @JsProperty
    public Number marginLeft;

    @JsProperty
    public Number marginRight;

    @JsProperty
    public Number marginTop;

    @JsProperty
    public Number maxHeight;

    @JsProperty
    public Number maxWidth;

    @JsProperty
    public Number maxX;

    @JsProperty
    public Number maxY;

    @JsProperty
    public Number minHeight;

    @JsProperty
    public Number minWidth;

    @JsProperty
    public Number minX;

    @JsProperty
    public Number minY;

    @JsProperty
    public boolean nonScaling;

    @JsProperty
    public boolean nonScalingStroke;

    @JsProperty
    public double opacity;

    @JsProperty
    public double paddingBottom;

    @JsProperty
    public double paddingLeft;

    @JsProperty
    public double paddingRight;

    @JsProperty
    public double paddingTop;

    @JsProperty
    public String path;

    @JsProperty
    public boolean pixelPerfect;

    @JsProperty
    public boolean readerChecked;

    @JsProperty
    public String readerControls;

    @JsProperty
    public String readerDescribedBy;

    @JsProperty
    public String readerDescription;

    @JsProperty
    public boolean readerHidden;

    @JsProperty
    public String readerLabelledBy;

    /**
     * @see gwt.material.design.amcore.client.constants.AriaLive
     */
    @JsProperty
    public String readerLive;

    @JsProperty
    public String readerTitle;

    @JsProperty
    public boolean resizable;

    @JsProperty
    public boolean rightClickable;

    @JsProperty
    public String role;

    @JsProperty
    public double rotation;

    @JsProperty
    public double scale;

    /**
     * @see gwt.material.design.amcore.client.constants.ShapeRendering
     */
    @JsProperty
    public String shapeRendering;

    @JsProperty
    public boolean showOnInit;

    @JsProperty
    public Object stroke;

    @JsProperty
    public double[] strokeDasharray;

    @JsProperty
    public Object strokeModifier;

    @JsProperty
    public double strokeOpacity;

    @JsProperty
    public double strokeWidth;

    @JsProperty
    public boolean swipeable;

    @JsProperty
    public int tabindex;

    @JsProperty
    public boolean togglable;

    @JsProperty
    public String tooltipHTML;

    /**
     * @see gwt.material.design.amcore.client.constants.TooltipPosition
     */
    @JsProperty
    public String tooltipPosition;

    @JsProperty
    public String tooltipText;

    @JsProperty
    public double tooltipX;

    @JsProperty
    public double tooltipY;

    @JsProperty
    public boolean trackable;

    @JsProperty
    public String url;

    @JsProperty
    public String urlTarget;

    /**
     * @see gwt.material.design.amcore.client.constants.VerticalAlign
     */
    @JsProperty
    public String valign;

    /**
     * @see gwt.material.design.amcore.client.constants.VerticalCenter
     */
    @JsProperty
    public String verticalCenter;

    @JsProperty
    public boolean visible;

    @JsProperty
    public boolean wheelable;

    @JsProperty
    public String width;

    /**
     * Accepts {@link Number} or {@link gwt.material.design.amcore.client.base.Percent}
     */
    @JsProperty
    public Object x;

    /**
     * Accepts {@link Number} or {@link gwt.material.design.amcore.client.base.Percent}
     */
    @JsProperty
    public Object y;

    @JsProperty
    public int zIndex;
}
