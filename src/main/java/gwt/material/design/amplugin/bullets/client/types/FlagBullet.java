package gwt.material.design.amplugin.bullets.client.types;

import gwt.material.design.amcharts.client.bullet.Bullet;
import gwt.material.design.amcore.client.ui.Label;
import gwt.material.design.amcore.client.ui.Line;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4plugins_bullets")
public class FlagBullet extends Bullet {

    @JsProperty
    public Label label;

    @JsProperty
    public Line pole;

    @JsProperty
    public int poleHeight;

    @JsMethod
    public native void copyFrom(FlagBullet bullet);
}
