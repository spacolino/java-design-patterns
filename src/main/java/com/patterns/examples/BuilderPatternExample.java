package com.patterns.examples;

import com.patterns.builder.Computer;

public class BuilderPatternExample {
    public static void main(String[] args) {
        // Creating a computer with all features enabled
        Computer computer1 = new Computer.ComputerBuilder("1 TB", "16 GB")
            .setGraphicsCardEnabled(true)
            .setBluetoothEnabled(true)
            .build();

        System.out.println("Computer 1: HDD=" + computer1.getHDD() + ", RAM=" + computer1.getRAM() +
            ", Graphics Card Enabled=" + computer1.isGraphicsCardEnabled() +
            ", Bluetooth Enabled=" + computer1.isBluetoothEnabled());

        // Creating a computer with only required features
        Computer computer2 = new Computer.ComputerBuilder("500 GB", "8 GB").build();

        System.out.println("Computer 2: HDD=" + computer2.getHDD() + ", RAM=" + computer2.getRAM() +
            ", Graphics Card Enabled=" + computer2.isGraphicsCardEnabled() +
            ", Bluetooth Enabled=" + computer2.isBluetoothEnabled());
    }
}
