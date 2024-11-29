package com.patterns.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComputerTest {

    @Test
    void shouldBuildComputerWithAllFeatures() {
        Computer computer = new Computer.ComputerBuilder("1 TB", "32 GB")
            .setGraphicsCardEnabled(true)
            .setBluetoothEnabled(true)
            .build();

        assertNotNull(computer);
        assertEquals("1 TB", computer.getHDD());
        assertEquals("32 GB", computer.getRAM());
        assertTrue(computer.isGraphicsCardEnabled());
        assertTrue(computer.isBluetoothEnabled());
    }

    @Test
    void shouldBuildComputerWithOnlyRequiredFeatures() {
        Computer computer = new Computer.ComputerBuilder("500 GB", "8 GB").build();

        assertNotNull(computer);
        assertEquals("500 GB", computer.getHDD());
        assertEquals("8 GB", computer.getRAM());
        assertFalse(computer.isGraphicsCardEnabled());
        assertFalse(computer.isBluetoothEnabled());
    }

    @Test
    void shouldThrowExceptionWhenRequiredParametersAreMissing() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Computer.ComputerBuilder(null, "16 GB").build();
        });

        assertEquals("HDD and RAM cannot be null", exception.getMessage());
    }
}
