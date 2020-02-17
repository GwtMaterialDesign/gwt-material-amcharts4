package gwt.material.design.amplugin.sunburst.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface SunburstResources extends ClientBundle {

    SunburstResources INSTANCE = GWT.create(SunburstResources.class);

    @Source("js/sunburst.js")
    TextResource sunburst();
}
