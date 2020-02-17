package gwt.material.design.amplugin.regression.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface RegressionResources extends ClientBundle {

    RegressionResources INSTANCE = GWT.create(RegressionResources.class);

    @Source("js/regression.js")
    TextResource regression();
}
