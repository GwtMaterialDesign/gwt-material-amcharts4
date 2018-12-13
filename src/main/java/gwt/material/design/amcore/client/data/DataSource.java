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
package gwt.material.design.amcore.client.data;

import com.google.gwt.core.client.JsDate;
import gwt.material.design.amcore.client.base.BaseObjectsEvents;
import gwt.material.design.amcore.client.base.Component;
import gwt.material.design.amcore.client.base.Language;
import gwt.material.design.amcore.client.data.parser.DataParser;
import gwt.material.design.amcore.client.formatter.DateFormatter;
import gwt.material.design.amcore.client.properties.NetRequestOptions;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class    DataSource extends BaseObjectsEvents {

    @JsProperty
    public Component component;

    @JsProperty
    public Object data;

    @JsProperty
    public DateFormatter dateFormatter;

    @JsProperty
    public boolean disableCache;

    @JsProperty
    public boolean incremental;

    @JsProperty
    public Object incrementalParams;

    @JsProperty
    public boolean keepCount;

    @JsProperty
    public Language language;

    @JsProperty
    public JsDate lastLoad;

    @JsProperty
    public DataParser parser;

    @JsProperty
    public Number reloadFrequency;

    @JsProperty
    public NetRequestOptions requestOptions;

    @JsProperty
    public boolean showPreloader;

    @JsProperty
    public String url;

    @JsMethod
    public native String addUrlParams(String url, Object params);

    @JsMethod
    public native void dispose();

    @JsMethod
    public native void load();

    @JsMethod
    public native String timestampUrl(String url);
}
