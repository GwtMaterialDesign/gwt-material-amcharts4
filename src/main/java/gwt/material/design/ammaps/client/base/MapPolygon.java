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
package gwt.material.design.ammaps.client.base;

import gwt.material.design.amcore.client.events.SpriteEventDispatcher;
import gwt.material.design.amcore.client.list.DictionaryTemplate;
import gwt.material.design.amcore.client.state.SpriteState;
import gwt.material.design.amcore.client.ui.Polygon;
import gwt.material.design.ammaps.client.properties.GeoPoint;
import gwt.material.design.ammaps.client.properties.MapPolygonProperties;
import gwt.material.design.ammaps.client.series.MapPolygonSeries;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4maps")
public class MapPolygon extends MapObject {

    @JsProperty
    public double latitude;

    @JsProperty
    public double longitude;

    @JsProperty
    public GeoPoint[] multiGeoPolygon;

    @JsProperty
    public double pixelHeight;

    @JsProperty
    public double pixelWidth;

    @JsProperty
    public Polygon polygon;

    @JsProperty
    public MapPolygonSeries series;

    @JsProperty
    public DictionaryTemplate<String, SpriteState<MapPolygonProperties>> states;

    @JsProperty
    public SpriteEventDispatcher<MapPolygon> events;


}
