package ru.netology.domain;

public class Post {
    private int id;
    private int date;
    private int image;
    private int note;
    private int firstname;
    private int lastname;
    private String message;
    private int friend;
    private int likesCount;
    private String messagesInfo;
    private boolean storiesInfo;

    private int player;

    public int getPlayer() {
        return player;
    }

    public void setPlayer(int player) {
        this.player = player;
    }

    public boolean isStoriesInfo() {
        return storiesInfo;
    }

    public void setStoriesInfo(boolean storiesInfo) {
        this.storiesInfo = storiesInfo;
    }

    public int getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    public String getMessagesInfo() {
        return messagesInfo;
    }

    public void setMessagesInfo(String messagesInfo) {
        this.messagesInfo = messagesInfo;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public int getFirstname() {
        return firstname;
    }

    public void setFirstname(int firstname) {
        this.firstname = firstname;
    }

    public int getLastname() {
        return lastname;
    }

    public void setLastname(int lastname) {
        this.lastname = lastname;
    }

    public int getFriend() {
        return friend;
    }

    public void setFriend(int friend) {
        this.friend = friend;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
