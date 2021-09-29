package com.firelight.McCityBuilderPluginDatabase.entities;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

@DatabaseTable(tableName = "users")
public class User {

    public static final String USERNAME_FIELD_NAME = "userName";
    public static final String JOINED_AT_FIELD_NAME = "joinedAt";

    @DatabaseField(generatedId = true)
    private long id;

    @DatabaseField(columnName = USERNAME_FIELD_NAME, canBeNull = false)
    private String userName;

    @DatabaseField(columnName = JOINED_AT_FIELD_NAME, canBeNull = false)
    private Date joinedAt;

    User() {

    }

    public User(String userName, Date joinedAt) {
        this.userName = userName;
        this.joinedAt = joinedAt;
    }

    public Date getJoinedAt() {
        return joinedAt;
    }

    public void setJoinedAt(Date joinedAt) {
        this.joinedAt = joinedAt;
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
