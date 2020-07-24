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
package gwt.material.design.amcore.client.language;

import com.google.gwt.resources.client.TextResource;
import gwt.material.design.amcore.client.resources.LanguageClientBundle;

import static gwt.material.design.jquery.client.api.JQuery.window;

public enum Locale implements LocaleResource {

    ar(new LocaleResource() {
        @Override
        public gwt.material.design.amcore.client.properties.Locale getValue() {
            return (gwt.material.design.amcore.client.properties.Locale) window().getPropertyObject("am4lang_ar");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.ar();
        }
    }),

    bs_BA(new LocaleResource() {
        @Override
        public gwt.material.design.amcore.client.properties.Locale getValue() {
            return (gwt.material.design.amcore.client.properties.Locale) window().getPropertyObject("am4lang_bs_BA");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.bsBA();
        }
    }),

    ca_ES(new LocaleResource() {
        @Override
        public gwt.material.design.amcore.client.properties.Locale getValue() {
            return (gwt.material.design.amcore.client.properties.Locale) window().getPropertyObject("am4lang_ca_ES");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.caES();
        }
    }),

    cs_CZ(new LocaleResource() {
        @Override
        public gwt.material.design.amcore.client.properties.Locale getValue() {
            return (gwt.material.design.amcore.client.properties.Locale) window().getPropertyObject("am4lang_cs_CZ");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.csCZ();
        }
    }),

    da_DK(new LocaleResource() {
        @Override
        public gwt.material.design.amcore.client.properties.Locale getValue() {
            return (gwt.material.design.amcore.client.properties.Locale) window().getPropertyObject("am4lang_da_DK");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.daDK();
        }
    }),

    de_CH(new LocaleResource() {
        @Override
        public gwt.material.design.amcore.client.properties.Locale getValue() {
            return (gwt.material.design.amcore.client.properties.Locale) window().getPropertyObject("am4lang_de_CH");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.deCH();
        }
    }),

    de_DE(new LocaleResource() {
        @Override
        public gwt.material.design.amcore.client.properties.Locale getValue() {
            return (gwt.material.design.amcore.client.properties.Locale) window().getPropertyObject("am4lang_de_DE");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.deDE();
        }
    }),

    en(new LocaleResource() {
        @Override
        public gwt.material.design.amcore.client.properties.Locale getValue() {
            return (gwt.material.design.amcore.client.properties.Locale) window().getPropertyObject("am4lang_en");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.en();
        }
    }),

    en_CA(new LocaleResource() {
        @Override
        public gwt.material.design.amcore.client.properties.Locale getValue() {
            return (gwt.material.design.amcore.client.properties.Locale) window().getPropertyObject("am4lang_en_CA");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.enCA();
        }
    }),

    en_US(new LocaleResource() {
        @Override
        public gwt.material.design.amcore.client.properties.Locale getValue() {
            return (gwt.material.design.amcore.client.properties.Locale) window().getPropertyObject("am4lang_en_US");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.enUS();
        }
    }),

    es_ES(new LocaleResource() {
        @Override
        public gwt.material.design.amcore.client.properties.Locale getValue() {
            return (gwt.material.design.amcore.client.properties.Locale) window().getPropertyObject("am4lang_es_ES");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.esES();
        }
    }),

    et_EE(new LocaleResource() {
        @Override
        public gwt.material.design.amcore.client.properties.Locale getValue() {
            return (gwt.material.design.amcore.client.properties.Locale) window().getPropertyObject("am4lang_et_EE");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.etEE();
        }
    }),

    fi_FI(new LocaleResource() {
        @Override
        public gwt.material.design.amcore.client.properties.Locale getValue() {
            return (gwt.material.design.amcore.client.properties.Locale) window().getPropertyObject("am4lang_fi_FI");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.fiFI();
        }
    }),

    fr_FR(new LocaleResource() {
        @Override
        public gwt.material.design.amcore.client.properties.Locale getValue() {
            return (gwt.material.design.amcore.client.properties.Locale) window().getPropertyObject("am4lang_fr_FR");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.frFR();
        }
    }),

    he_IL(new LocaleResource() {
        @Override
        public gwt.material.design.amcore.client.properties.Locale getValue() {
            return (gwt.material.design.amcore.client.properties.Locale) window().getPropertyObject("am4lang_he_IL");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.heIL();
        }
    }),

    hi_IN(new LocaleResource() {
        @Override
        public gwt.material.design.amcore.client.properties.Locale getValue() {
            return (gwt.material.design.amcore.client.properties.Locale) window().getPropertyObject("am4lang_hi_IN");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.hiIN();
        }
    }),

    hr_HR(new LocaleResource() {
        @Override
        public gwt.material.design.amcore.client.properties.Locale getValue() {
            return (gwt.material.design.amcore.client.properties.Locale) window().getPropertyObject("am4lang_hr_HR");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.hrHR();
        }
    }),

    hu_Hu(new LocaleResource() {
        @Override
        public gwt.material.design.amcore.client.properties.Locale getValue() {
            return (gwt.material.design.amcore.client.properties.Locale) window().getPropertyObject("am4lang_hu_HU");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.huHU();
        }
    }),

    id_ID(new LocaleResource() {
        @Override
        public gwt.material.design.amcore.client.properties.Locale getValue() {
            return (gwt.material.design.amcore.client.properties.Locale) window().getPropertyObject("am4lang_id_ID");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.idID();
        }
    }),

    it_IT(new LocaleResource() {
        @Override
        public gwt.material.design.amcore.client.properties.Locale getValue() {
            return (gwt.material.design.amcore.client.properties.Locale) window().getPropertyObject("am4lang_it_IT");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.itIT();
        }
    }),

    ja_JP(new LocaleResource() {
        @Override
        public gwt.material.design.amcore.client.properties.Locale getValue() {
            return (gwt.material.design.amcore.client.properties.Locale) window().getPropertyObject("am4lang_ja_JP");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.jaJP();
        }
    }),

    ko_KR(new LocaleResource() {
        @Override
        public gwt.material.design.amcore.client.properties.Locale getValue() {
            return (gwt.material.design.amcore.client.properties.Locale) window().getPropertyObject("am4lang_ko_KR");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.koKR();
        }
    }),

    lt_LT(new LocaleResource() {
        @Override
        public gwt.material.design.amcore.client.properties.Locale getValue() {
            return (gwt.material.design.amcore.client.properties.Locale) window().getPropertyObject("am4lang_lt_LT");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.ltLT();
        }
    }),

    lv_LV(new LocaleResource() {
        @Override
        public gwt.material.design.amcore.client.properties.Locale getValue() {
            return (gwt.material.design.amcore.client.properties.Locale) window().getPropertyObject("am4lang_lv_LV");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.lvLV();
        }
    }),

    nb_NO(new LocaleResource() {
        @Override
        public gwt.material.design.amcore.client.properties.Locale getValue() {
            return (gwt.material.design.amcore.client.properties.Locale) window().getPropertyObject("am4lang_nb_NO");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.nbNO();
        }
    }),

    nl_NL(new LocaleResource() {
        @Override
        public gwt.material.design.amcore.client.properties.Locale getValue() {
            return (gwt.material.design.amcore.client.properties.Locale) window().getPropertyObject("am4lang_nl_NL");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.nlNL();
        }
    }),

    pt_BR(new LocaleResource() {
        @Override
        public gwt.material.design.amcore.client.properties.Locale getValue() {
            return (gwt.material.design.amcore.client.properties.Locale) window().getPropertyObject("am4lang_pt_BR");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.ptBR();
        }
    }),

    pl_PL(new LocaleResource() {
        @Override
        public gwt.material.design.amcore.client.properties.Locale getValue() {
            return (gwt.material.design.amcore.client.properties.Locale) window().getPropertyObject("am4lang_pl_PL");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.plPL();
        }
    }),

    pt_PT(new LocaleResource() {
        @Override
        public gwt.material.design.amcore.client.properties.Locale getValue() {
            return (gwt.material.design.amcore.client.properties.Locale) window().getPropertyObject("am4lang_pt_PT");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.ptPT();
        }
    }),

    ro_RO(new LocaleResource() {
        @Override
        public gwt.material.design.amcore.client.properties.Locale getValue() {
            return (gwt.material.design.amcore.client.properties.Locale) window().getPropertyObject("am4lang_ro_RO");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.roRO();
        }
    }),

    ru_RU(new LocaleResource() {
        @Override
        public gwt.material.design.amcore.client.properties.Locale getValue() {
            return (gwt.material.design.amcore.client.properties.Locale) window().getPropertyObject("am4lang_ru_RU");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.ruRU();
        }
    }),

    sl_SL(new LocaleResource() {
        @Override
        public gwt.material.design.amcore.client.properties.Locale getValue() {
            return (gwt.material.design.amcore.client.properties.Locale) window().getPropertyObject("am4lang_sl_SL");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.slSL();
        }
    }),

    sr_RS(new LocaleResource() {
        @Override
        public gwt.material.design.amcore.client.properties.Locale getValue() {
            return (gwt.material.design.amcore.client.properties.Locale) window().getPropertyObject("am4lang_sl_RS");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.srRS();
        }
    }),

    sv_SE(new LocaleResource() {
        @Override
        public gwt.material.design.amcore.client.properties.Locale getValue() {
            return (gwt.material.design.amcore.client.properties.Locale) window().getPropertyObject("am4lang_sv_SE");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.svSE();
        }
    }),

    sv_SV(new LocaleResource() {
        @Override
        public gwt.material.design.amcore.client.properties.Locale getValue() {
            return (gwt.material.design.amcore.client.properties.Locale) window().getPropertyObject("am4lang_sv_SV");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.svSV();
        }
    }),

    th_TH(new LocaleResource() {
        @Override
        public gwt.material.design.amcore.client.properties.Locale getValue() {
            return (gwt.material.design.amcore.client.properties.Locale) window().getPropertyObject("am4lang_th_TH");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.thTH();
        }
    }),

    tr_TR(new LocaleResource() {
        @Override
        public gwt.material.design.amcore.client.properties.Locale getValue() {
            return (gwt.material.design.amcore.client.properties.Locale) window().getPropertyObject("am4lang_tr_TR");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.trTR();
        }
    }),

    uk_UA(new LocaleResource() {
        @Override
        public gwt.material.design.amcore.client.properties.Locale getValue() {
            return (gwt.material.design.amcore.client.properties.Locale) window().getPropertyObject("am4lang_uk_UA");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.ukUA();
        }
    }),

    vi_VN(new LocaleResource() {
        @Override
        public gwt.material.design.amcore.client.properties.Locale getValue() {
            return (gwt.material.design.amcore.client.properties.Locale) window().getPropertyObject("am4lang_vi_VN");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.viVN();
        }
    }),

    zh_Hans(new LocaleResource() {
        @Override
        public gwt.material.design.amcore.client.properties.Locale getValue() {
            return (gwt.material.design.amcore.client.properties.Locale) window().getPropertyObject("am4lang_zh_Hans");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.zhHans();
        }
    }),

    zh_Hant(new LocaleResource() {
        @Override
        public gwt.material.design.amcore.client.properties.Locale getValue() {
            return (gwt.material.design.amcore.client.properties.Locale) window().getPropertyObject("am4lang_zh_Hant");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.zhHant();
        }
    });

    LocaleResource resource;

    Locale(LocaleResource resource) {
        this.resource = resource;
    }

    @Override
    public gwt.material.design.amcore.client.properties.Locale getValue() {
        return resource.getValue();
    }

    @Override
    public TextResource getResource() {
        return resource.getResource();
    }
}
