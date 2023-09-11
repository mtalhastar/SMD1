package com.example.myapplication;

public class UserModel {
    String id,name,num;

    public String getName() {
        return name;
    }

    public UserModel(String id, String name, String num) {
        this.id = id;
        this.name = name;
        this.num = num;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
