package com.jias.page.entity;

import java.util.Date;

public class User {

    private String userId;

    private String userName;

    private String userPassword;

    private String userNick;

    private String userEmail;

    private String userPhone;

    private Integer userGender;

    private String userBirthday;

    private String userCity;

    private String userAvatar;

    private String userMarks;

    private Integer isDeleted;

    private String createTime;

    private String updateTime;

    public User() {
    }

    public User(String userId, String userName, String userPassword, String userNick, String userEmail, String userPhone, Integer userGender, String userBirthday, String userCity, String userAvatar, String userMarks, Integer isDeleted, String createTime, String updateTime) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userNick = userNick;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
        this.userGender = userGender;
        this.userBirthday = userBirthday;
        this.userCity = userCity;
        this.userAvatar = userAvatar;
        this.userMarks = userMarks;
        this.isDeleted = isDeleted;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserNick() {
        return userNick;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Integer getUserGender() {
        return userGender;
    }

    public void setUserGender(Integer userGender) {
        this.userGender = userGender;
    }

    public String getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(String userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public String getUserMarks() {
        return userMarks;
    }

    public void setUserMarks(String userMarks) {
        this.userMarks = userMarks;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
