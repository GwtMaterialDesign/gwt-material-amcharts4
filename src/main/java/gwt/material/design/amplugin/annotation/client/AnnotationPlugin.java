package gwt.material.design.amplugin.annotation.client;

import com.google.gwt.core.client.EntryPoint;
import gwt.material.design.amcore.client.GwtMaterialAmCore;
import gwt.material.design.amplugin.annotation.client.resources.AnnotationResources;

public class AnnotationPlugin implements EntryPoint {

    @Override
    public void onModuleLoad() {
        GwtMaterialAmCore.injectJs(AnnotationResources.INSTANCE.annotation());
    }
}
