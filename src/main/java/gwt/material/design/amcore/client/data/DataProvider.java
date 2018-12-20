package gwt.material.design.amcore.client.data;

import com.google.gwt.json.client.JSONValue;

public interface DataProvider<T> {

    String getProperty();

    JSONValue getValue(T object);
}
