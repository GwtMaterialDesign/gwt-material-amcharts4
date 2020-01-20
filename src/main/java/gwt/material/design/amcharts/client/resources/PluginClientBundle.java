/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2018 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package gwt.material.design.amcharts.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface PluginClientBundle extends ClientBundle {

    PluginClientBundle INSTANCE = GWT.create(PluginClientBundle.class);

    @Source("../../../../../../../resources/gwt/material/design/plugin/resources/js/annotation.js")
    TextResource annotation();

    @Source("../../../../../../../resources/gwt/material/design/amplugin/bullets/client/resources/js/bullets.js")
    TextResource bullets();

    @Source("../../../../../../../resources/gwt/material/design/plugin/resources/js/forceDirected.js")
    TextResource forceDirected();

    @Source("../../../../../../../resources/gwt/material/design/plugin/resources/js/overlapBuster.js")
    TextResource overlapBuster();

    @Source("../../../../../../../resources/gwt/material/design/plugin/resources/js/regression.js")
    TextResource regression();

    @Source("../../../../../../../resources/gwt/material/design/plugin/resources/js/sliceGrouper.js")
    TextResource sliceGrouper();

    @Source("../../../../../../../resources/gwt/material/design/plugin/resources/js/sunburst.js")
    TextResource sunburst();

    @Source("../../../../../../../resources/gwt/material/design/amplugin/timeline/client/resources/js/timeline.js")
    TextResource timeline();

    @Source("../../../../../../../resources/gwt/material/design/plugin/resources/js/wordCloud.js")
    TextResource wordCloud();
}
