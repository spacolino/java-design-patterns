package com.patterns.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConfigurationManagerTest {

    @Test
    void shouldReturnSameInstance() {
        ConfigurationManager instance1 = ConfigurationManager.getInstance();
        ConfigurationManager instance2 = ConfigurationManager.getInstance();

        assertSame(instance1, instance2);
    }

    @Test
    void shouldMaintainConfiguration() {
        ConfigurationManager manager = ConfigurationManager.getInstance();
        manager.setConfig("test-key", "test-value");

        assertEquals("test-value", manager.getConfig("test-key"));
    }

    @Test
    void shouldShareConfigurationBetweenInstances() {
        ConfigurationManager manager1 = ConfigurationManager.getInstance();
        ConfigurationManager manager2 = ConfigurationManager.getInstance();

        manager1.setConfig("key1", "value1");
        assertEquals("value1", manager2.getConfig("key1"));
    }
}
