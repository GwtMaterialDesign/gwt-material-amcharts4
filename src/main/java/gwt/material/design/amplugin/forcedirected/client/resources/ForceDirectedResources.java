package gwt.material.design.amplugin.forcedirected.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface ForceDirectedResources extends ClientBundle {

    ForceDirectedResources INSTANCE = GWT.create(ForceDirectedResources.class);

    @Source("js/forceDirected.js")
    TextResource forceDirected();
}
