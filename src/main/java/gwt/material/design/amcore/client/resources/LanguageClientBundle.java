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

    @Source("js/lang/ar.js")
    TextResource ar();

    @Source("js/lang/bs_BA.js")
    TextResource bsBA();

    @Source("js/lang/ca_ES.js")
    TextResource caES();

    @Source("js/lang/cs_CZ.js")
    TextResource csCZ();

    @Source("js/lang/da_DK.js")
    TextResource daDK();

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
    TextResource esES();

    @Source("js/lang/et_EE.js")
    TextResource etEE();

    @Source("js/lang/fi_FI.js")
    TextResource fiFI();

    @Source("js/lang/fr_FR.js")
    TextResource frFR();

    @Source("js/lang/he_IL.js")
    TextResource heIL();

    @Source("js/lang/hi_IN.js")
    TextResource hiIN();

    @Source("js/lang/hu_HU.js")
    TextResource huHU();

    @Source("js/lang/hr_HR.js")
    TextResource hrHR();

    @Source("js/lang/id_ID.js")
    TextResource idID();

    @Source("js/lang/it_IT.js")
    TextResource itIT();

    @Source("js/lang/ja_JP.js")
    TextResource jaJP();

    @Source("js/lang/ko_KR.js")
    TextResource koKR();

    @Source("js/lang/lt_LT.js")
    TextResource ltLT();

    @Source("js/lang/lv_LV.js")
    TextResource lvLV();

    @Source("js/lang/nb_NO.js")
    TextResource nbNO();

    @Source("js/lang/nl_NL.js")
    TextResource nlNL();

    @Source("js/lang/pl_PL.js")
    TextResource plPL();

    @Source("js/lang/pt_BR.js")
    TextResource ptBR();

    @Source("js/lang/pt_PT.js")
    TextResource ptPT();

    @Source("js/lang/ro_RO.js")
    TextResource roRO();

    @Source("js/lang/ru_RU.js")
    TextResource ruRU();

    @Source("js/lang/sl_SL.js")
    TextResource slSL();

    @Source("js/lang/sr_RS.js")
    TextResource srRS();

    @Source("js/lang/sv_SE.js")
    TextResource svSE();

    @Source("js/lang/sv_SV.js")
    TextResource svSV();

    @Source("js/lang/th_TH.js")
    TextResource thTH();

    @Source("js/lang/tr_TR.js")
    TextResource trTR();

    @Source("js/lang/uk_UA.js")
    TextResource ukUA();

    @Source("js/lang/vi_VN.js")
    TextResource viVN();

    @Source("js/lang/zh_Hans.js")
    TextResource zhHans();

    @Source("js/lang/zh_Hant.js")
    TextResource zhHant();
}
