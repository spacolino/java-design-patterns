package com.patterns.builder;

public class Computer {
    // Required parameters
    private final String HDD;
    private final String RAM;

    // Optional parameters
    private final boolean isGraphicsCardEnabled;
    private final boolean isBluetoothEnabled;

    private Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public static class ComputerBuilder {
        // Required parameters
        private final String HDD;
        private final String RAM;

        // Optional parameters - initialized to default values
        private boolean isGraphicsCardEnabled = false;
        private boolean isBluetoothEnabled = false;

        public ComputerBuilder(String HDD, String RAM) {
            if (HDD == null || RAM == null) {
                throw new IllegalArgumentException("HDD and RAM cannot be null");
            }
            this.HDD = HDD;
            this.RAM = RAM;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
