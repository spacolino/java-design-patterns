package com.patterns.examples;

import com.patterns.singleton.ConfigurationManager;
import com.patterns.singleton.DatabaseConnection;
import com.patterns.singleton.EnumSingleton;

public class SingletonPatternExample {
    public static void main(String[] args) {
        // Configuration Manager example
        ConfigurationManager config = ConfigurationManager.getInstance();
        config.setConfig("database.url", "jdbc:mysql://localhost:3306/mydb");
        config.setConfig("api.key", "your-api-key");

        // Database connection example
        DatabaseConnection db = DatabaseConnection.getInstance();
        db.connect();
        System.out.println("Is connected: " + db.isConnected());
        db.disconnect();

        // Enum singleton example
        EnumSingleton.INSTANCE.setProperty("app.name", "MyApp");
        System.out.println(EnumSingleton.INSTANCE.getProperty("app.name"));
    }
}
