package com.firelight.McCityBuilderPluginDatabase.entities;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "towns")
public class Town {

    private static final String TOWN_NAME_FIELD_NAME = "townName";
    private static final String USER_ID_FIELD_NAME = "userId";

    @DatabaseField(generatedId = true)
    private long id;

    @DatabaseField(columnName = TOWN_NAME_FIELD_NAME, canBeNull = false)
    private String townName;

    @DatabaseField(columnName = "userId", foreign = true, foreignAutoRefresh = true, canBeNull = false)
    private User user;

    public Town() {};

    public Town(String townName, User user) {
        this.townName = townName;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
