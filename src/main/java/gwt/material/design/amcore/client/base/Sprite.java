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
package gwt.material.design.amcore.client.base;

import gwt.material.design.amcore.client.adapter.Adapter;
import gwt.material.design.amcore.client.adapter.SpriteAdapter;
import gwt.material.design.amcore.client.animation.Animation;
import gwt.material.design.amcore.client.animation.InertiaOptions;
import gwt.material.design.amcore.client.animation.InertialTypes;
import gwt.material.design.amcore.client.color.Filter;
import gwt.material.design.amcore.client.constants.Align;
import gwt.material.design.amcore.client.constants.Valign;
import gwt.material.design.amcore.client.dataitem.DataItem;
import gwt.material.design.amcore.client.events.SpriteEventDispatcher;
import gwt.material.design.amcore.client.export.Export;
import gwt.material.design.amcore.client.formatter.DateFormatter;
import gwt.material.design.amcore.client.formatter.DurationFormatter;
import gwt.material.design.amcore.client.formatter.NumberFormatter;
import gwt.material.design.amcore.client.list.Dictionary;
import gwt.material.design.amcore.client.list.DictionaryTemplate;
import gwt.material.design.amcore.client.list.ListTemplate;
import gwt.material.design.amcore.client.properties.*;
import gwt.material.design.amcore.client.state.SpriteState;
import gwt.material.design.jscore.client.api.core.Element;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import java.util.List;


@JsType(isNative = true, namespace = "am4core")
public class Sprite extends BaseObjectsEvents {

    @JsProperty
    public Adapter<Sprite, SpriteAdapter> adapter;

    /**
     * @see Align
     */
    @JsProperty
    public String align;

    @JsProperty
    public Animation[] animations;

    @JsProperty
    public boolean appeared;

    @JsProperty
    public boolean applyOnClones;

    @JsProperty
    public String baseId;

    @JsProperty
    public Object configField;

    @JsProperty
    public StyleProperty[] cursorDownStyle;

    @JsProperty
    public CursorOptions cursorOptions;

    @JsProperty
    public StyleProperty[] cursorOverStyle;

    @JsProperty
    public DataItem dataItem;

    @JsProperty
    public DateFormatter dateFormatter;

    @JsProperty
    public SpriteState<SpriteProperties> defaultState;

    @JsProperty
    public boolean disabled;

    @JsProperty
    public Object dom;

    @JsProperty
    public boolean draggable;

    @JsProperty
    public Object dummyData;

    @JsProperty
    public DurationFormatter durationFormatter;

    @JsProperty
    public Number dx;

    @JsProperty
    public Number dy;

    @JsProperty
    public AMElement element;

    @JsProperty
    public SpriteEventDispatcher events;

    @JsProperty
    public Number ex;

    @JsProperty
    public boolean exportable;

    @JsProperty
    public Export exporting;

    @JsProperty
    public Number ey;

    @JsProperty
    public Object fill;

    @JsProperty
    public Object fillModifier;

    @JsProperty
    public double fillOpacity;

    @JsProperty
    public List<Filter> filters;

    @JsProperty
    public boolean focusable;

    @JsProperty
    public double globalScale;

    @JsProperty
    public Group group;

    @JsProperty
    public Object height;

    @JsProperty
    public boolean hidden;

    @JsProperty
    public SpriteState<SpriteProperties> hiddenState;

    @JsProperty
    public HitOptions hitOptions;

    /**
     * @see gwt.material.design.amcore.client.constants.HorizontalCenter
     */
    @JsProperty
    public String horizontalCenter;

    @JsProperty
    public boolean hoverOnFocus;

    @JsProperty
    public HoverOptions hoverOptions;

    @JsProperty
    public boolean hoverable;

    @JsProperty
    public Element htmlContainer;

    @JsProperty
    public String id;

    @JsProperty
    public boolean inert;

    @JsProperty
    public Dictionary<InertialTypes, InertiaOptions> inertiaOptions;

    @JsProperty
    public boolean inited;

    @JsProperty
    public double innerHeight;

    @JsProperty
    public double innerWidth;

    @JsProperty
    public InteractionObject interactions;

    @JsProperty
    public boolean interactionsEnabled;

    @JsProperty
    public boolean isActive;

    @JsProperty
    public boolean isDown;

    @JsProperty
    public boolean isDragged;

    @JsProperty
    public boolean isFocused;

    @JsProperty
    public boolean isHidden;

    @JsProperty
    public boolean isHiding;

    @JsProperty
    public boolean isHover;

    @JsProperty
    public boolean isShowing;

    @JsProperty
    public KeyboardOptions keyboardOptions;

    @JsProperty
    public Language language;

    @JsProperty
    public Object marginBottom;

    @JsProperty
    public Object marginLeft;

    @JsProperty
    public Object marginRight;

    @JsProperty
    public Object marginTop;

    @JsProperty
    public double maxHeight;

    @JsProperty
    public double maxWidth;

    @JsProperty
    public double measuredHeight;

    @JsProperty
    public double measuredWidth;

    @JsProperty
    public double minHeight;

    @JsProperty
    public double minWidth;

    @JsProperty
    public Modal modal;

    @JsProperty
    public boolean nonScaling;

    @JsProperty
    public boolean nonScalingStroke;

    @JsProperty
    public NumberFormatter numberFormatter;

    @JsProperty
    public double opacity;

    @JsProperty
    public double outerHeight;

    @JsProperty
    public double outerWidth;

    @JsProperty
    public Object paddingBottom;

    @JsProperty
    public Object paddingLeft;

    @JsProperty
    public Object paddingRight;

    @JsProperty
    public Object paddingTop;

    @JsProperty
    public Container parent;

    @JsProperty
    public String path;

    @JsProperty
    public double pixelHeight;

    @JsProperty
    public double pixelMarginBottom;

    @JsProperty
    public double pixelMarginLeft;

    @JsProperty
    public double pixelMarginRight;

    @JsProperty
    public double pixelMarginTop;

    @JsProperty
    public double pixelPaddingBottom;

    @JsProperty
    public double pixelPaddingLeft;

    @JsProperty
    public double pixelPaddingRight;

    @JsProperty
    public double pixelPaddingTop;

    @JsProperty
    public boolean pixelPerfect;

    @JsProperty
    public double pixelWidth;

    @JsProperty
    public double pixelX;

    @JsProperty
    public double pixelY;

    @JsProperty
    public ListTemplate<Popup> popups;

    @JsProperty
    public SpriteProperties properties;

    @JsProperty
    public Object propertyFields;

    @JsProperty
    public String readerDescription;

    @JsProperty
    public boolean readerHidden;

    @JsProperty
    public String readerTitle;

    @JsProperty
    public Object realFill;

    @JsProperty
    public Object realStroke;

    @JsProperty
    public double relativeMarginBottom;

    @JsProperty
    public double relativeMarginLeft;

    @JsProperty
    public double relativeMarginRight;

    @JsProperty
    public double relativeMarginTop;

    @JsProperty
    public double relativePaddingBottom;

    @JsProperty
    public double relativePaddingLeft;

    @JsProperty
    public double relativePaddingRight;

    @JsProperty
    public double relativePaddingTop;

    @JsProperty
    public double relativeX;

    @JsProperty
    public double relativeY;

    @JsProperty
    public boolean resizable;

    @JsProperty
    public String role;

    @JsProperty
    public int rollOutDelay;

    @JsProperty
    public double rotation;

    @JsProperty
    public boolean rtl;

    @JsProperty
    public double scale;

    @JsProperty
    public Object shapeRendering;

    @JsProperty
    public boolean shouldClone;

    @JsProperty
    public boolean showOnInit;

    @JsProperty
    public boolean showSystemTooltip;

    @JsProperty
    public DictionaryTemplate<String, SpriteState<SpriteProperties>> states;

    @JsProperty
    public Object stroke;

    @JsProperty
    public String strokeDasharray;

    @JsProperty
    public Object strokeModifier;

    @JsProperty
    public double strokeOpacity;

    @JsProperty
    public double strokeWidth;

    @JsProperty
    public SVGContainer svgContainer;

    @JsProperty
    public SwipeOptions swipeOptions;

    @JsProperty
    public boolean swipeable;

    @JsProperty
    public int tabindex;

    @JsProperty
    public boolean togglable;

    @JsProperty
    public Tooltip tooltip;

    @JsProperty
    public Sprite tooltipColorSource;

    @JsProperty
    public DataItem tooltipDataItem;

    /**
     * @see gwt.material.design.amcore.client.constants.TooltipPosition
     */
    @JsProperty
    public String tooltipPosition;

    @JsProperty
    public String tooltipText;

    @JsProperty
    public String tooltipHTML;

    @JsProperty
    public boolean trackable;

    @JsProperty
    public String url;

    @JsProperty
    public String urlTarget;

    /**
     * @see Valign
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
    public Object width;

    @JsProperty
    public Object x;

    @JsProperty
    public Object y;

    @JsProperty
    public int zIndex;

    @JsProperty
    public boolean clickable;

    @JsMethod
    public native Animation animate(SpriteAnimationOptions[] animationOptions, int duration);

    @JsMethod
    public native Animation animate(SpriteAnimationOptions[] animationOptions, int duration, Object easing);

    @JsMethod
    public native void appear();

    @JsMethod
    public native Animation applyCurrentState();

    @JsMethod
    public native Animation applyCurrentState(int duration);

    @JsMethod
    public native void closeAllPopups();

    @JsMethod
    public native void closeModal();

    @JsMethod
    public native void copyFrom(Sprite source);

    @JsMethod
    public native void dispose();

    @JsMethod
    public native Object[] getCurrentThemes();

    @JsMethod
    public native Number getPixelX(Number value);

    @JsMethod
    public native Number getPixelY(Number value);

    @JsMethod
    public native Object getPropertyValue(String propertyName);

    @JsMethod
    public native Number getRelativeX(Number value);

    @JsMethod
    public native Number getRelativeY(Number value);

    @JsMethod
    public native Point getSvgPoint(Point point);

    @JsMethod
    public native void hide();

    @JsMethod
    public native void hide(int duration);

    @JsMethod
    public native void hideTooltip();

    @JsMethod
    public native void hideTooltip(int duration);

    @JsMethod
    public native boolean hitTest(Sprite sprite);

    @JsMethod
    public native Sprite insertAfter(Sprite sprite);

    @JsMethod
    public native Sprite insertBefore(Sprite sprite);

    @JsMethod
    public native void invalidate();

    @JsMethod
    public native boolean isInTransition();

    @JsMethod
    public native boolean isInteractive();

    @JsMethod
    public native boolean isReady();

    @JsMethod
    public native Sprite margin(Number top, Number right, Number bottom, Number left);

    @JsMethod
    public native void moveTo(Point point);

    @JsMethod
    public native void moveTo(Point point, Number rotation, Number scale, boolean isDragged);

    @JsMethod
    public native Modal openModal(String text);

    @JsMethod
    public native Modal openModal(String text, String title);

    @JsMethod
    public native Popup openPopup(String text);

    @JsMethod
    public native Popup openPopup(String text, String title);

    @JsMethod
    public native Sprite padding(double top, double right, double bottom, double left);

    @JsMethod
    public native void setElement(AMElement element);

    @JsMethod
    public native boolean setPropertyValue(String property, Object value);

    @JsMethod
    public native boolean setPropertyValue(String property, Object value, boolean invalidate, boolean transform);

    @JsMethod
    public native Animation setState(Object value);

    @JsMethod
    public native Animation setState(Object value, int transitionDuration, Object easing);

    @JsMethod
    public native void setVisibility(boolean value);

    @JsMethod
    public native void show();

    @JsMethod
    public native void show(int duration);

    @JsMethod
    public native void showTooltip();


    @JsMethod
    public native void showTooltip(Point point);

    @JsMethod
    public native void toBack();

    @JsMethod
    public native void toFront();

    @JsMethod
    public native void removeChildren();

    @JsMethod
    public native void cornerRadius(int a, int b, int c, int d);
}
