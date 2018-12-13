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

public interface LanguageClientBundle extends ClientBundle {

    LanguageClientBundle INSTANCE = GWT.create(LanguageClientBundle.class);

    @Source("js/lang/de_CH.js")
    TextResource deCH();

    @Source("js/lang/de_DE.js")
    TextResource deDE();

    @Source("js/lang/en.js")
    TextResource en();

    @Source("js/lang/en_CA.js")
    TextResource enCA();

    @Source("js/lang/en_US.js")
    TextResource enUS();

    @Source("js/lang/es_ES.js")
    TextResource enES();

    @Source("js/lang/fr_FR.js")
    TextResource frFR();

    @Source("js/lang/lt_LT.js")
    TextResource ltLT();

    @Source("js/lang/nl_NL.js")
    TextResource nlNL();

    @Source("js/lang/pt_BR.js")
    TextResource ptBR();

    @Source("js/lang/pt_PT.js")
    TextResource ptPT();

    @Source("js/lang/ru_RU.js")
    TextResource ruRU();

    @Source("js/lang/sv_SV.js")
    TextResource svSV();
}
