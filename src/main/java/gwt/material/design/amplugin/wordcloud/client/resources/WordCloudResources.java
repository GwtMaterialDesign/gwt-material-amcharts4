package gwt.material.design.amplugin.wordcloud.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface WordCloudResources extends ClientBundle {

    WordCloudResources INSTANCE = GWT.create(WordCloudResources.class);

    @Source("js/wordCloud.js")
    TextResource wordCloud();
}
