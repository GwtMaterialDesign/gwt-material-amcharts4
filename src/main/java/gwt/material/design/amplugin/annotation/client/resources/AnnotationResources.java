package gwt.material.design.amplugin.annotation.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface AnnotationResources extends ClientBundle {

    AnnotationResources INSTANCE = GWT.create(AnnotationResources.class);

    @Source("js/annotation.js")
    TextResource annotation();
}
