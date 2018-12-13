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
package gwt.material.design.amcore.client.formatter;

import gwt.material.design.amcore.client.base.BaseObject;
import gwt.material.design.amcore.client.base.Language;
import gwt.material.design.amcore.client.base.Sprite;
import gwt.material.design.amcore.client.constants.TimeUnit;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4core")
public class DurationFormatter extends BaseObject {

    /**
     * @param baseUnit See {@link TimeUnit}
     */
   @JsProperty
   public Object baseUnit;

   @JsProperty
   public String durationFormat;

   @JsProperty
   public Object durationFormats;

   @JsProperty
   public Language language;

   @JsProperty
   public Sprite sprite;

   @JsMethod
   public native String format(Number value);

    /**
     * @param baseUnit See {@link TimeUnit}
     */
    @JsMethod
    public native String format(Number value, String format, Object baseUnit);

    @JsMethod
    public native String getFormat(Number value);

    /**
     * @param baseUnit See {@link TimeUnit}
     */
    @JsMethod
    public native String getFormat(Number value, Number maxValue, Object baseUnit);

    @JsMethod
    public native Number getMilliseconds(Number value);

    /**
     * @param baseUnit See {@link TimeUnit}
     */
    @JsMethod
    public native Number getMilliseconds(Number value, Object baseUnit);

    @JsMethod
    public native String getValueUnit(Number value);

    /**
     * @param baseUnit See {@link TimeUnit}
     */
    @JsMethod
    public native Object getValueUnit(Number value, Object baseUnit);

    /**
     * @param baseUnit See {@link TimeUnit}
     */
    @JsMethod
    public native Object toTimeStamp(Number value, Object baseUnit);
}
