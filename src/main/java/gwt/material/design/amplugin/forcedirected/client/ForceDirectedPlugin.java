package gwt.material.design.amplugin.forcedirected.client;

import com.google.gwt.core.client.EntryPoint;
import gwt.material.design.amcore.client.GwtMaterialAmCore;
import gwt.material.design.amplugin.forcedirected.client.resources.ForceDirectedResources;

public class ForceDirectedPlugin implements EntryPoint {

    @Override
    public void onModuleLoad() {
        GwtMaterialAmCore.injectJs(ForceDirectedResources.INSTANCE.forceDirected());
    }
}
