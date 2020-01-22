package gwt.material.design.amplugin.regression.client;

import com.google.gwt.core.client.EntryPoint;
import gwt.material.design.amcore.client.GwtMaterialAmCore;
import gwt.material.design.amplugin.regression.client.resources.RegressionResources;

public class RegressionPlugin implements EntryPoint {

    @Override
    public void onModuleLoad() {
        GwtMaterialAmCore.injectJs(RegressionResources.INSTANCE.regression());
    }
}
