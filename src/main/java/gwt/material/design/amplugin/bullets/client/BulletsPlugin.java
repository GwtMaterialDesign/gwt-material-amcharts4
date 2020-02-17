package gwt.material.design.amplugin.bullets.client;

import com.google.gwt.core.client.EntryPoint;
import gwt.material.design.amcore.client.GwtMaterialAmCore;
import gwt.material.design.amplugin.bullets.client.resources.BulletsResources;

public class BulletsPlugin implements EntryPoint {

    @Override
    public void onModuleLoad() {
        GwtMaterialAmCore.injectJs(BulletsResources.INSTANCE.bullets());
    }
}
