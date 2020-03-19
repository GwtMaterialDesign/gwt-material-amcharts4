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
package gwt.material.design.amcore.client.export;

import com.google.gwt.core.client.JavaScriptObject;
import gwt.material.design.amcore.client.adapter.Adapter;
import gwt.material.design.amcore.client.base.Language;
import gwt.material.design.amcore.client.base.Sprite;
import gwt.material.design.amcore.client.color.Color;
import gwt.material.design.amcore.client.formatter.DateFormatter;
import gwt.material.design.amcore.client.formatter.NumberFormatter;
import gwt.material.design.amcore.client.list.List;
import gwt.material.design.amcore.client.ui.Preloader;
import gwt.material.design.jscore.client.api.core.Element;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class Export {

    /**
     * An instance of ExportMenu.
     * To add an export menu to a chart, set this to a new instance of ExportMenu.
     */
    @JsProperty
    public ExportMenu menu;

    /**
     * Type Adapter < Export, IExportAdapters > Default new Adapter<Export,
     * IExportAdapters>(this)
     * Adapter.
     */
    @JsProperty
    public Adapter adapter;

    /**
     *A background color to be used for exported images. If set, this will override the automatically acquired background color.
     */
    @JsProperty
    public Color backgroundColor;

    /**
     *
     * @JsPropert
     * /**
     * Holds an array of data field names. If set, exported data fields will try to maintain this order.Holds an array of data field names. If set, exported data fields will try to maintain this order.Holds an array of data field names. If set, exported data fields will try to maintain this order.y
     * public String[
 dataFieldsOrder;     * reference to a container to be used to place ExportMenu in.
     */
    @JsProperty
    public Element container;

    /**
     * Data to export.
     */
    @JsProperty
    public Object data;

    /**
     * Holds an array of data field names. If set, exported data fields will try to maintain this order.
     *
     * If not set (default), the export will try to maintain the same order as in source data, or as in dataFields (if set).
     */
    @JsProperty
    public String[] dataFieldsOrder;

    /**
     * Data fields in { field: fieldName } format. Those are used for exporting in data formats to name the columns.
     * see  https://www.amcharts.com/docs/v4/concepts/exporting/#Changing_order_and_names_of_columns for examples and details.
     */
    @JsProperty
    public JavaScriptObject dataFields;

    /**
     * A list of fields that hold date values.
     */
    @JsProperty
    public List<String> dateFields;

    /**
     * A date format to use for exporting dates. Will use DateFormatter format if not set.
     */
    @JsProperty
    public String dateFormat;

    /**
     * A DateFormatter to use when formatting dates when exporting data.
     */
    @JsProperty
    public DateFormatter dateFormatter;

    /**
     * A file prefix to be used for all exported formats.
     * Export will apply format-related extension to it. E.g. if this is set to "myExport", the file name of the PNG exported image will be "myExport.png".
     */
    @JsProperty
    public String filePrefix;

    /**
     * A Language instance to be used for translations.
     */
    @JsProperty
    public Language language;

    /**
     * A number format to use for exporting dates. Will use NumberFormatter format if not set.
     */
    @JsProperty
    public String numberFormat;

    /**
     * A NumberFormatter to use when formatting dates when exporting data.
     */
    @JsProperty
    public NumberFormatter numberFormatter;

    /**
     * Returns a an instance of Preloader associated with the Sprite being exported.
     */
    @JsProperty
    public Preloader preloader;

    /**
     * A reference to Sprite to export. Can be any Sprite, including some internal elements.
     */
    @JsProperty
    public Sprite sprite;

    /**
     * Default 2000
     * If export operation takes longer than milliseconds in this second, we will show a modal saying export operation took longer than expected.
     */
    @JsProperty
    public int timeoutDelay;

    /**
     * A title to be used when printing.
     */
    @JsProperty
    public String title;

    /**
     * Default true
     * Many modern displays have use more actual pixels per displayed pixel. This results in sharper images on screen. Unfortunately, when exported to a bitmap image of the sam width/height size it will lose those extra pixels, resulting in somewhat blurry image.
     * This is why we are going to export images larger than they are, so that we don't lose any details.
     * If you'd rather export images without change in size, set this to false.
     */
    @JsProperty
    public boolean useRetina;

    /**
     * Default true
     * By default Export will try to use built-in method for transforming chart into an image for download, then fallback to external library (canvg) for conversion if failed.
     *
     * Setting this to false will force use of external library for all export operations.
     *
     * It might be useful to turn off simplified export if you are using strict content security policies, that disallow images with blobs as their source.
     */
    @JsProperty
    public boolean useSimplifiedExport;

    /**
     * Default true
     * If you are using web fonts (such as Google Fonts), your chart might be using them as well.
     *
     * Normally, exporting to image will require to download these fonts so the are carried over to exported image.
     *
     * This setting can be used to disable or enable this functionality.
     */
    @JsProperty
    public boolean useWebFonts;


}
