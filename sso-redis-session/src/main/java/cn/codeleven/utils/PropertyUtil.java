package cn.codeleven.utils;

import java.util.Map;
import java.util.Properties;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class PropertyUtil {
    public static String getPropertyByKey(String file, String key){
        ResourceBundle resourceBundle = ResourceBundle.getBundle(file);
        return resourceBundle.getString(key);
    }
}
