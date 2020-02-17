package gwt.material.design.amplugin.slicegrouper.client;

import com.google.gwt.core.client.EntryPoint;
import gwt.material.design.amcore.client.GwtMaterialAmCore;
import gwt.material.design.amplugin.slicegrouper.client.resources.SliceGrouperResources;

public class SliceGrouperPlugin implements EntryPoint {

    @Override
    public void onModuleLoad() {
        GwtMaterialAmCore.injectJs(SliceGrouperResources.INSTANCE.sliceGrouper());
    }
}
