package gwt.material.design.amplugin.timeline.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface TimeLineResources extends ClientBundle {

    TimeLineResources INSTANCE = GWT.create(TimeLineResources.class);

    @Source("js/timeline.js")
    TextResource timeline();
}
