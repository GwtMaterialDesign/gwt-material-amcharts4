package gwt.material.design.amplugin.timeline.client;

import com.google.gwt.core.client.EntryPoint;
import gwt.material.design.amcore.client.GwtMaterialAmCore;
import gwt.material.design.amplugin.timeline.client.resources.TimeLineResources;

public class TimeLinePlugin implements EntryPoint {

    @Override
    public void onModuleLoad() {
        GwtMaterialAmCore.injectJs(TimeLineResources.INSTANCE.timeline());
    }
}
