package com.firelight.McCityBuilderPluginDatabase.utils;

import com.firelight.McCityBuilderPluginDatabase.entities.User;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

public class DatabaseSetup {
    private final static String DATABASE_URL = "jdbc:postgresql://localhost:5432/postgres";
    private final static String USERNAME = "postgres";
    private final static String PASSWORD = "onjuist11";

    private static Dao<User, Integer> userDao;

    public static void setup() throws Exception {
        ConnectionSource connectionSource = null;
        try {
            connectionSource = new JdbcConnectionSource(DATABASE_URL, USERNAME, PASSWORD);

            setupDatabase(connectionSource);

            createSampleData();
        } finally {
            if (connectionSource != null) {
                connectionSource.close();
            }
        }
    }

    private static void setupDatabase(ConnectionSource connectionSource) throws Exception {
        userDao = DaoManager.createDao(connectionSource, User.class);

        TableUtils.createTable(connectionSource, User.class);
    }

    private static void createSampleData() throws Exception {
        String userName = "testName";
        User user = new User(userName);
        userDao.create(user);
    }
}
