package com.model;

import java.sql.Time;

public class notice {
    private String title;
    private String content;
    private String user;
    private Time updateTime;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Time getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Time updateTime) {
        this.updateTime = updateTime;
    }
}
