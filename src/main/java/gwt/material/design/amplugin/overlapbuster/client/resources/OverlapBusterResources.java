package gwt.material.design.amplugin.overlapbuster.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface OverlapBusterResources extends ClientBundle {

    OverlapBusterResources INSTANCE = GWT.create(OverlapBusterResources.class);

    @Source("js/overlapBuster.js")
    TextResource overlapBuster();
}
