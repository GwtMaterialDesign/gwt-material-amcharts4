package gwt.material.design.amplugin.bullets.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface BulletsResources extends ClientBundle {

    BulletsResources INSTANCE = GWT.create(BulletsResources.class);

    @Source("js/bullets.js")
    TextResource bullets();
}
