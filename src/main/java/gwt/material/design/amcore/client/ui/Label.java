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
package gwt.material.design.amcore.client.ui;

import gwt.material.design.amcore.client.base.AMElement;
import gwt.material.design.amcore.client.base.Container;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4core")
public class Label extends Container {

    /**
     * Returns available vertical space.
     */
    @JsProperty
    public double availableHeight;

    /**
     * A ratio to calculate text baseline. Ralative distance from the bottom of the label.
     * @default -0.27
     */
    @JsProperty
    public double baseLineRatio;

    /**
     * Currently formatted text, read only.
     */
    @JsProperty
    public String currentText;

    /**
     * Ellipsis character to use if truncate is enabled.
     *
     * @default "..."
     */
    @JsProperty
    public String ellipsis;

    /**
     * If truncate is enabled, should Label try to break only on full words (true), or whenever needed, including middle of the word. (false)
     *
     * @default true
     */
    @JsProperty
    public boolean fullWords;

    /**
     * Indicates whether the whole text should be hidden if it does not fit into its allotted space.
     */
    @JsProperty
    public boolean hideOversized;

    /**
     * Raw HTML to be used as text.
     *
     * NOTE: HTML text is subject to browser support. It relies on browsers supporting SVG foreignObject nodes. Some browsers (read IEs) do not support it. On those browsers, the text will fall back to basic SVG text, striping out all HTML markup and styling that goes with it.
     *
     * For more information about foreignObject and its browser compatibility refer to https://developer.mozilla.org/en/docs/Web/SVG/Element/foreignObject#Browser_compatibility.
     */
    @JsProperty
    public String html;

    /**
     * If set to true square-bracket formatting blocks will be treated as regular text.
     *
     * @default false
     */
    @JsProperty
    public boolean ignoreFormatting;

    /**
     * Indicates if the whole text does not fit into max dimenstions set for it.
     */
    @JsProperty
    public boolean isOversized;

    /**
     * Relative label location on path. Value range is from 0 (beginning) to 1 (end).
     *
     * Works only if you set path setting to an SVG path.
     */
    @JsProperty
    public boolean locationOnPath;

    /**
     * An SVG path string to position text along. If set, the text will follow the curvature of the path.
     *
     * Location along the path can be set using locationOnPath.
     *
     * IMPORTANT: Only SVG text can be put on path. If you are using HTML text this setting will be ignored.
     */
    @JsProperty
    public boolean path;

    /**
     * Screen reader title of the element.
     */
    @JsProperty
    public boolean readerTitle;

    /**
     *Forces the text to be selectable. This setting will be ignored if the object has some kind of interaction attached to it, such as it is draggable, swipeable, resizable.
     *
     * @default false
     */
    @JsProperty
    public boolean selectable;

    /**
     * An SVG text.
     *
     * Please note that setting html will override this setting if browser supports foreignObject in SGV, such as most modern browsers excluding IEs.
     */
    @JsProperty
    public String text;

    /**
     * @see gwt.material.design.amcore.client.constants.TextAlign
     * Horizontal text alignment.
     *
     * Available choices:
     *
     * "start"
     * "middle"
     * "end"
     * @default "start"
     */
    @JsProperty
    public String textAlign;

    /**
     * @see gwt.material.design.amcore.client.constants.TextAlign
     * Vertical text alignment.
     *
     * Available choices:
     *
     * "start"
     * "middle"
     * "end"
     * @default "top"
     */
    @JsProperty
    public String textValign;

    /**
     * Indicates if text lines need to be truncated if they do not fit, using configurable ellipsis string.
     *
     * truncate overrides wrap if both are set to true.
     *
     * NOTE: For HTML text, this setting won't trigger a parser and actual line truncation with ellipsis. It will just hide everything that goes outside the label.
     */
    @JsProperty
    public boolean truncate;

    /**
     * Enables or disables autowrapping of text.
     */
    @JsProperty
    public boolean wrap;

    @JsProperty
    public boolean isMeasured;

    @JsMethod
    public native AMElement getSvgElement(String text);

    @JsMethod
    public native AMElement getSvgElement(String text, String style);

    @JsMethod
    public native void hardInvalidate();

    @JsMethod
    public native void measureElement();

    @JsMethod
    public native void setDataItem(Object dataItem);
}
