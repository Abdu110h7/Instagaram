package com.example.instagaram;

public class PostModel {
    int avatar, mainPicture;
    String personName;
    String action_Time;
    String like;

    public PostModel(int avatar, int mainPicture, String personName, String action_Time, String like) {
        this.avatar = avatar;
        this.mainPicture = mainPicture;
        this.personName = personName;
        this.action_Time = action_Time;
        this.like = like;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public int getMainPicture() {
        return mainPicture;
    }

    public void setMainPicture(int mainPicture) {
        this.mainPicture = mainPicture;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getAction_Time() {
        return action_Time;
    }

    public void setAction_Time(String action_Time) {
        this.action_Time = action_Time;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }
}