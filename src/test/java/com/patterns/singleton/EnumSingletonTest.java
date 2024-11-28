package com.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnumSingletonTest {

    @Test
    void shouldMaintainProperties() {
        EnumSingleton.INSTANCE.setProperty("key1", "value1");
        assertEquals("value1", EnumSingleton.INSTANCE.getProperty("key1"));
    }

    @Test
    void shouldSharePropertiesBetweenReferences() {
        EnumSingleton singleton1 = EnumSingleton.INSTANCE;
        EnumSingleton singleton2 = EnumSingleton.INSTANCE;

        singleton1.setProperty("key2", "value2");
        assertEquals("value2", singleton2.getProperty("key2"));
    }
}
