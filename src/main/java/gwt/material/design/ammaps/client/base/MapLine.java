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

import gwt.material.design.amcore.client.list.ListTemplate;
import gwt.material.design.amcore.client.ui.PolyLine;
import gwt.material.design.amcore.client.properties.OrientationPoint;
import gwt.material.design.ammaps.client.properties.GeoPoint;
import gwt.material.design.ammaps.client.series.MapLineSeries;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4maps")
public class MapLine extends MapObject {

    @JsProperty
    public MapLineObject arrow;

    @JsProperty
    public MapImage[] imagesToConnect;

    @JsProperty
    public double latitude;

    @JsProperty
    public PolyLine line;

    @JsProperty
    public ListTemplate<MapLineObject> lineObjects;

    @JsProperty
    public double longitude;

    @JsProperty
    public GeoPoint multiGeoLine;

    @JsProperty
    public MapLineSeries series;

    @JsProperty
    public boolean shortestDistance;

    @JsMethod
    public native void copyFrom(MapLine source);

    @JsMethod
    public native OrientationPoint positionToPoint(double position);
}
