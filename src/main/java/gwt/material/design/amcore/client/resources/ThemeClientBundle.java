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
package gwt.material.design.amcore.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface ThemeClientBundle extends ClientBundle {

    ThemeClientBundle INSTANCE = GWT.create(ThemeClientBundle.class);

    @Source("js/themes/animated.js")
    TextResource animatedJs();

    @Source("js/themes/material.js")
    TextResource materialJs();

    @Source("js/themes/kelly.js")
    TextResource kellyJs();

    @Source("js/themes/dark.js")
    TextResource darkJs();

    @Source("js/themes/dataviz.js")
    TextResource dataVizJs();

    @Source("js/themes/frozen.js")
    TextResource frozenJs();

    @Source("js/themes/moonrisekingdom.js")
    TextResource moonriseKingdomJs();

    @Source("js/themes/spiritedaway.js")
    TextResource spiritedAway();
}
