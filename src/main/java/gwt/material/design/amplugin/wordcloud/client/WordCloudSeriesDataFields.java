package gwt.material.design.amplugin.wordcloud.client;

import gwt.material.design.amcharts.client.datafield.series.SeriesDataFields;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class WordCloudSeriesDataFields extends SeriesDataFields {

    @JsProperty
    public String word;
}