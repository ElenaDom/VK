package ru.netology;

public class Post {
    private int id;
    private int date;
    private int image;
    private int note;
    private int firstname;
    private int lastname;
    private int message;
    private int friend;
    private String likesCount;
    private String messagesInfo;
    private String storiesInfo;
    private String player;



    public String getMessagesInfo() {
        return messagesInfo;
    }

    public void setMessagesInfo(String messagesInfo) {
        this.messagesInfo = messagesInfo;
    }

    public String getStoriesInfo() {
        return storiesInfo;
    }

    public void setStoriesInfo(String storiesInfo) {
        this.storiesInfo = storiesInfo;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(String likesCount) {
        this.likesCount = likesCount;
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

    public int getMessage() {
        return message;
    }

    public void setMessage(int message) {
        this.message = message;
    }

}
