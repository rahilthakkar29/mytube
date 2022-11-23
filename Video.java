package com.mytube;

public class Video {

    private String fileName;
    private String title;
    private User user;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String s) {
        fileName = s;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String s) {
        title = s;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Object getUser() {
        return user;
    }
}
