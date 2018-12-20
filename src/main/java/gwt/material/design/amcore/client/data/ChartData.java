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
