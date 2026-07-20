package ru.tianji.database;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import ru.tianji.logging.Logger;
public class DatabaseManager {

    private static final String DB_DIRECTORY = "database";
    private static final String DB_FILE = "tianji.db";
    private static final String DB_URL = "jdbc:sqlite:" + DB_DIRECTORY + "/" + DB_FILE;

    public static void initialize() {

        createDatabaseDirectory();

        try (Connection connection = DriverManager.getConnection(DB_URL)) {

            createTables(connection);

            Logger.info("SQLite initialized.");

        } catch (SQLException e) {

            Logger.error("Database initialization failed.");
	    e.printStackTrace();

        }

    }

    private static void createDatabaseDirectory() {

        File directory = new File(DB_DIRECTORY);

        if (!directory.exists()) {

            if (directory.mkdirs()) {

                System.out.println("Database directory created.");

            }

        }

    }

    private static void createTables(Connection connection) throws SQLException {

        Statement statement = connection.createStatement();

        statement.execute("""
            CREATE TABLE IF NOT EXISTS modules(
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                name TEXT,
                version TEXT,
                enabled INTEGER
            );
        """);

        statement.execute("""
            CREATE TABLE IF NOT EXISTS settings(
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                key TEXT UNIQUE,
                value TEXT
            );
        """);

        statement.execute("""
            CREATE TABLE IF NOT EXISTS logs(
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                level TEXT,
                message TEXT,
                created TIMESTAMP DEFAULT CURRENT_TIMESTAMP
            );
        """);

        statement.execute("""
            CREATE TABLE IF NOT EXISTS sources(
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                name TEXT,
                type TEXT,
                enabled INTEGER
            );
        """);

        statement.close();

    }

}
