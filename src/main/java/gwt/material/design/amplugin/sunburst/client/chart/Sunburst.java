package gwt.material.design.amplugin.sunburst.client.chart;

import gwt.material.design.amcharts.client.PieChart;
import gwt.material.design.amcore.client.color.ColorSet;
import gwt.material.design.amcore.client.list.DictionaryTemplate;
import gwt.material.design.amplugin.sunburst.client.datafield.SunburstDataFields;
import gwt.material.design.amplugin.sunburst.client.series.SunburstSeries;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4plugins_sunburst")
public class Sunburst extends PieChart {

    @JsProperty
    public ColorSet colors;

    @JsProperty
    public SunburstDataFields dataFields;

    @JsProperty
    public DictionaryTemplate<String, SunburstSeries> seriesTemplates;

    @JsMethod
    public native Sunburst constructor();
}
