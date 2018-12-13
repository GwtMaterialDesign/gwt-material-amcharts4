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
package gwt.material.design.ammaps.client;

import com.google.gwt.core.client.JavaScriptObject;
import gwt.material.design.amcharts.client.SerialChart;
import gwt.material.design.amcore.client.animation.Animation;
import gwt.material.design.amcore.client.data.DataSource;
import gwt.material.design.amcore.client.events.SpriteEventDispatcher;
import gwt.material.design.amcore.client.list.ListTemplate;
import gwt.material.design.amcore.client.properties.Point;
import gwt.material.design.ammaps.client.base.MapObject;
import gwt.material.design.ammaps.client.base.SmallMap;
import gwt.material.design.ammaps.client.base.ZoomControl;
import gwt.material.design.ammaps.client.datafields.MapChartDataFields;
import gwt.material.design.ammaps.client.projections.Projection;
import gwt.material.design.ammaps.client.properties.GeoPoint;
import gwt.material.design.ammaps.client.series.MapSeries;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4maps")
public class MapChart extends SerialChart {

    private MapChart() {
    }

    @JsProperty
    public GeoPoint centerGeoPoint;

    @JsProperty
    public Point centerPoint;

    @JsProperty
    public double deltaLongitude;

    @JsProperty
    public double east;

    @JsProperty
    public Point eastPoint;

    @JsProperty
    public Object geodata;

    @JsProperty
    public DataSource geodataSource;

    @JsProperty
    public GeoPoint homeGeoPoint;

    @JsProperty
    public double homeZoomLevel;

    @JsProperty
    public double maxPanOut;

    @JsProperty
    public double maxZoomLevel;

    @JsProperty
    public double minZoomLevel;

    /**
     * @see gwt.material.design.amcore.client.constants.MouseWheelBehavior
     */
    @JsProperty
    public String mouseWheelBehavior;

    @JsProperty
    public double north;

    @JsProperty
    public Point northPoint;

    @JsProperty
    public Projection projection;

    @JsProperty
    public double scaleRatio;

    @JsProperty
    public double seriesHeight;

    @JsProperty
    public double seriesWidth;

    @JsProperty
    public SmallMap smallMap;

    @JsProperty
    public double south;

    @JsProperty
    public Point southPoint;

    @JsProperty
    public double west;

    @JsProperty
    public Point westPoint;

    @JsProperty
    public ZoomControl zoomControl;

    @JsProperty
    public int zoomDuration;

    @JsProperty
    public Object zoomEasing;

    @JsProperty
    public GeoPoint zoomGeoPoint;

    @JsProperty
    public double zoomLevel;

    @JsProperty
    public MapChartDataFields dataFields;

    @JsProperty
    public SpriteEventDispatcher<MapChart> events;

    @JsMethod
    public native Point geoPointToSVG(GeoPoint point);

    @JsMethod
    public native Point geoPointToSeries(GeoPoint point);

    @JsMethod
    public native void goHome();

    @JsMethod
    public native void goHome(int duration);

    @JsMethod
    public native void pan(Point shift);

    @JsMethod
    public native void pan(Point shift, int duration);

    @JsMethod
    public native GeoPoint seriesPointToGeo(Point point);

    @JsMethod
    public native GeoPoint svgPointToGeo(Point point);

    @JsMethod
    public native Animation zoomIn();

    @JsMethod
    public native Animation zoomIn(GeoPoint point);

    @JsMethod
    public native Animation zoomIn(GeoPoint point, int duration);

    @JsMethod
    public native Animation zoomOut();

    @JsMethod
    public native Animation zoomOut(GeoPoint point);

    @JsMethod
    public native Animation zoomOut(GeoPoint point, int duration);

    @JsMethod
    public native Animation zoomToGeoPoint(GeoPoint point, double zoomLevel);

    @JsMethod
    public native Animation zoomToGeoPoint(GeoPoint point, double zoomLevel, boolean center, int duration);

    @JsMethod
    public native Animation zoomToMapObject(MapObject mapObject);

    @JsMethod
    public native Animation zoomToMapObject(MapObject mapObject, double zoomLevel, boolean center, int duration);

    @JsMethod
    public native Animation zoomToRectangle(double north, double east, double south, double west);

    @JsMethod
    public native Animation zoomToRectangle(double north, double east, double south, double west, double level, boolean center, int duration);
}
