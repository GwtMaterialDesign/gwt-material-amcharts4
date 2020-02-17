package gwt.material.design.amplugin.wordcloud.client;

import gwt.material.design.amcharts.client.SerialChart;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4plugins_wordCloud")
public class WordCloud extends SerialChart {

    @JsMethod
    public native WordCloud constructor();
}
