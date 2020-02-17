package gwt.material.design.amplugin.sunburst.client;

import com.google.gwt.core.client.EntryPoint;
import gwt.material.design.amcore.client.GwtMaterialAmCore;
import gwt.material.design.amplugin.sunburst.client.resources.SunburstResources;

public class SunburstPlugin implements EntryPoint {

    @Override
    public void onModuleLoad() {
        GwtMaterialAmCore.injectJs(SunburstResources.INSTANCE.sunburst());
    }
}
