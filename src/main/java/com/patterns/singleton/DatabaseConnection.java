package com.patterns.singleton;

public class DatabaseConnection {
    private static volatile DatabaseConnection instance;
    private static final Object LOCK = new Object();
    private boolean connected;

    private DatabaseConnection() {
        if (instance != null) {
            throw new IllegalStateException("Already initialized");
        }
    }

    public static DatabaseConnection getInstance() {
        DatabaseConnection result = instance;
        if (result == null) {
            synchronized (LOCK) {
                result = instance;
                if (result == null) {
                    instance = result = new DatabaseConnection();
                }
            }
        }
        return result;
    }

    public void connect() {
        if (!connected) {
            // Simulate database connection
            connected = true;
            System.out.println("Database connected");
        }
    }

    public void disconnect() {
        if (connected) {
            // Simulate database disconnection
            connected = false;
            System.out.println("Database disconnected");
        }
    }

    public boolean isConnected() {
        return connected;
    }
}
