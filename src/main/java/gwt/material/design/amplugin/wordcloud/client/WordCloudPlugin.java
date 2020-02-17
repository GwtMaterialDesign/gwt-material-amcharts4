package gwt.material.design.amplugin.wordcloud.client;

import com.google.gwt.core.client.EntryPoint;
import gwt.material.design.amcore.client.GwtMaterialAmCore;
import gwt.material.design.amplugin.wordcloud.client.resources.WordCloudResources;

public class WordCloudPlugin implements EntryPoint {

    @Override
    public void onModuleLoad() {
        GwtMaterialAmCore.injectJs(WordCloudResources.INSTANCE.wordCloud());
    }
}
