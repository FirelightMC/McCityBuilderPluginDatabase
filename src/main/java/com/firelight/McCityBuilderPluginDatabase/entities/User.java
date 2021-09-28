package com.firelight.McCityBuilderPluginDatabase.entities;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "users")
public class User {

    public static final String USERNAME_FIELD_NAME = "userName";

    @DatabaseField(generatedId = true)
    private long id;

    @DatabaseField(columnName = USERNAME_FIELD_NAME, canBeNull = false)
    private String userName;

    User() {

    }

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
