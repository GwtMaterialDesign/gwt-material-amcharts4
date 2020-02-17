package gwt.material.design.amplugin.bullets.client.types;

import gwt.material.design.amcharts.client.bullet.Bullet;
import gwt.material.design.amcore.client.ui.Circle;
import gwt.material.design.amcore.client.ui.Image;
import gwt.material.design.amcore.client.ui.Label;
import gwt.material.design.amcore.client.ui.Line;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4plugins_bullets")
public class PinBullet extends Bullet {

    @JsProperty
    public Circle circle;

    @JsProperty
    public Image image;

    @JsProperty
    public Label label;

    @JsMethod
    public native void copyFrom(PinBullet bullet);
}
