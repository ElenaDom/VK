package ru.netology.domain;

public class Post {
    private int id;
    private String user;
    private int date;
    private int image;
    private String notesInfo;
    private MessagesInfo messagesInfo;
    private int friend;
    private StoriesInfo storiesInfo;
    private int player;
    private GroupsInfo groupsInfo;
    private PhotosInfo photosInfo;
    private LikesInfo likesInfo;


    public StoriesInfo getStoriesInfo() {
        return storiesInfo;
    }

    public void setStoriesInfo(StoriesInfo storiesInfo) {
        this.storiesInfo = storiesInfo;
    }

    public GroupsInfo getGroupsInfo() {
        return groupsInfo;
    }

    public void setGroupsInfo(GroupsInfo groupsInfo) {
        this.groupsInfo = groupsInfo;
    }

    public PhotosInfo getPhotosInfo() {
        return photosInfo;
    }

    public void setPhotosInfo(PhotosInfo photosInfo) {
        this.photosInfo = photosInfo;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public MessagesInfo getMessagesInfo() {
        return messagesInfo;
    }

    public void setMessagesInfo(MessagesInfo messagesInfo) {
        this.messagesInfo = messagesInfo;
    }

    public String getNotesInfo() {
        return notesInfo;
    }

    public void setNotesInfo(String notesInfo) {
        this.notesInfo = notesInfo;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getPlayer() {
        return player;
    }

    public void setPlayer(int player) {
        this.player = player;
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
