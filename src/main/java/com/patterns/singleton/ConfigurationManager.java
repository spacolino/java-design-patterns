package com.patterns.singleton;

import java.io.Serializable;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConfigurationManager implements Serializable {
    private static volatile ConfigurationManager instance;
    private static final Object LOCK = new Object();
    private final ConcurrentMap<String, String> configurations;

    private ConfigurationManager() {
        if (instance != null) {
            throw new IllegalStateException("Already initialized");
        }
        configurations = new ConcurrentHashMap<>();
    }

    public static ConfigurationManager getInstance() {
        ConfigurationManager result = instance;
        if (result == null) {
            synchronized (LOCK) {
                result = instance;
                if (result == null) {
                    instance = result = new ConfigurationManager();
                }
            }
        }
        return result;
    }

    public void setConfig(String key, String value) {
        configurations.put(key, value);
    }

    public String getConfig(String key) {
        return configurations.get(key);
    }

    // Prevent serialization from creating a new instance
    protected Object readResolve() {
        return getInstance();
    }
}
