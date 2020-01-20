package gwt.material.design.amplugin.annotation.client;

import gwt.material.design.amcore.client.base.Plugin;
import gwt.material.design.amcore.client.color.Color;
import gwt.material.design.jscore.client.api.html.HTMLElement;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4plugins_annotation")
public class Annotation extends Plugin {

    @JsProperty
    public boolean active;

    @JsProperty
    public boolean autoSize;

    @JsProperty
    public Color[] colors;

    @JsProperty
    public Color currentColor;

    @JsProperty
    public int currentFontSize;

    @JsProperty
    public int currentFontWeight;

    @JsProperty
    public double currentOpacity;

    @JsProperty
    public String currentTool;

    @JsProperty
    public int currentWidth;

    @JsProperty
    public Object data;

    @JsProperty
    public Object fabric;

    @JsProperty
    public int[] fontSizes;

    @JsProperty
    public int[] fontWeights;

    @JsProperty
    public Object group;

    @JsProperty
    public String[] icons;

    @JsProperty
    public HTMLElement indicator;

    @JsProperty
    public double[] opacities;

    @JsProperty
    public boolean useMenu;

    @JsProperty
    public int[] widths;

    @JsMethod
    public native void activate();

    @JsMethod
    public native void addIcon(String icon);

    @JsMethod
    public native void addText();

    @JsMethod
    public native void arrow();

    @JsMethod
    public native void clear();

    @JsMethod
    public native Annotation constructor();

    @JsMethod
    public native void deactivate();

    @JsMethod
    public native void delete();

    @JsMethod
    public native void deleteSelected();

    @JsMethod
    public native void discard();

    @JsMethod
    public native void draw();

    @JsMethod
    public native void init();

    @JsMethod
    public native void line();

    @JsMethod
    public native void select();

    @JsMethod
    public native void setColor(Color color);

    @JsMethod
    public native void setFontSize(int value);

    @JsMethod
    public native void setFontWeight(int value);

    @JsMethod
    public native void setIconFill(Object img);

    @JsMethod
    public native void setOpacity(double value);

    @JsMethod
    public native void setWidth(int value);

    @JsMethod
    public native void underConstruction();
}
