package ru.netology.domain;

public class Post {
    private int id;
    private String user;
    private int date;
    private int image;
    private String notesInfo;
    private String messagesInfo;
    private int friend;
    private boolean storiesInfo;
    private int player;
    private int groupsInfo;
    private int photosInfo;
    private int likesInfo;

    public int getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(int likesInfo) {
        this.likesInfo = likesInfo;
    }

    public String getNotesInfo() {
        return notesInfo;
    }

    public void setNotesInfo(String notesInfo) {
        this.notesInfo = notesInfo;
    }

    public int getPhotosInfo() {
        return photosInfo;
    }

    public void setPhotosInfo(int photosInfo) {
        this.photosInfo = photosInfo;
    }

    public int getGroupsInfo() {
        return groupsInfo;
    }

    public void setGroupsInfo(int groupsInfo) {
        this.groupsInfo = groupsInfo;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMessagesInfo() {
        return messagesInfo;
    }

    public void setMessagesInfo(String messagesInfo) {
        this.messagesInfo = messagesInfo;
    }

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

    public int getFriend() {
        return friend;
    }

    public void setFriend(int friend) {
        this.friend = friend;
    }


}
