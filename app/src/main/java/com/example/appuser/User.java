package com.example.appuser;

public class User {
     String name, lastMessage, lastMsgTime, phoneNo,adress;
     int imageId;

    public User(String name, String lastMessage, String lastMsgTime, String phoneNo, String adress, int imageId) {
        this.name = name;
        this.lastMessage = lastMessage;
        this.lastMsgTime = lastMsgTime;
        this.phoneNo = phoneNo;
        this.adress = adress;
        this.imageId = imageId;
    }
}
