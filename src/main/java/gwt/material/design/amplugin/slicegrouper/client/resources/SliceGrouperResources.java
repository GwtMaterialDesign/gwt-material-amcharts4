package gwt.material.design.amplugin.slicegrouper.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface SliceGrouperResources extends ClientBundle {

    SliceGrouperResources INSTANCE = GWT.create(SliceGrouperResources.class);

    @Source("js/sliceGrouper.js")
    TextResource sliceGrouper();
}
