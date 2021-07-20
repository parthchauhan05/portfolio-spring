package com.example.Freelancer.Model;

public class Item {
    private int uid;
    private String url;
    private String name;
    private String description;

    public Item(int uid, String url, String name, String description) {
        this.uid = uid;
        this.url = url;
        this.name = name;
        this.description = description;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
}
