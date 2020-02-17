package gwt.material.design.amplugin.overlapbuster.client;

import com.google.gwt.core.client.EntryPoint;
import gwt.material.design.amcore.client.GwtMaterialAmCore;
import gwt.material.design.amplugin.overlapbuster.client.resources.OverlapBusterResources;

public class OverlapBusterPlugin implements EntryPoint {

    @Override
    public void onModuleLoad() {
        GwtMaterialAmCore.injectJs(OverlapBusterResources.INSTANCE.overlapBuster());
    }
}
