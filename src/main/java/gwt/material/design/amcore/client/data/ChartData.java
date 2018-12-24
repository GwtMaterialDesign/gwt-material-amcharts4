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
package gwt.material.design.amcore.client.data;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

import java.util.ArrayList;
import java.util.List;

public class ChartData<T> {

    private List<DataProvider<T>> providers = new ArrayList<>();
    private List<T> data = new ArrayList<>();

    public ChartData() {
    }

    public ChartData(List<T> data) {
        this.data = data;
    }

    public ChartData add(DataProvider<T> providers) {
        this.providers.add(providers);
        return this;
    }

    public JavaScriptObject get() {
        JSONArray array = new JSONArray();
        data.forEach(t -> {
            if (t != null) {
                JSONObject object = new JSONObject();
                providers.forEach(provider -> {
                    String property = provider.getProperty();
                    JSONValue value = provider.getValue(t);

                    if (property != null && value != null) {
                        object.put(property, value);
                    }
                });
                array.set(data.indexOf(t), object);
            }
        });
        return array.getJavaScriptObject();
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
