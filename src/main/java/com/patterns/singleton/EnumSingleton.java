package com.patterns.singleton;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public enum EnumSingleton {
    INSTANCE;

    private final ConcurrentMap<String, String> properties = new ConcurrentHashMap<>();

    public void setProperty(String key, String value) {
        properties.put(key, value);
    }

    public String getProperty(String key) {
        return properties.get(key);
    }
}
