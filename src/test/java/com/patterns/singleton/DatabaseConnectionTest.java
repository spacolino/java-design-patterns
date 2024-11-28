package com.patterns.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DatabaseConnectionTest {

    @Test
    void shouldReturnSameInstance() {
        DatabaseConnection conn1 = DatabaseConnection.getInstance();
        DatabaseConnection conn2 = DatabaseConnection.getInstance();

        assertSame(conn1, conn2);
    }

    @Test
    void shouldManageConnectionState() {
        DatabaseConnection connection = DatabaseConnection.getInstance();

        assertFalse(connection.isConnected());

        connection.connect();
        assertTrue(connection.isConnected());

        connection.disconnect();
        assertFalse(connection.isConnected());
    }
}
