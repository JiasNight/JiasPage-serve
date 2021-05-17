package com.jias.page.entity;

public class UserLoginLog {

    private String logId;

    private String userId;

    private String userName;

    private String loginIp;

    private String loginTime;

    private Integer loginStatus;

    private String logoutTime;

    private String createTime;

    private String updateTime;

    public UserLoginLog() {
    }

    public UserLoginLog(String logId, String userId, String userName, String loginIp, String loginTime, Integer loginStatus, String logoutTime, String createTime, String updateTime) {
        this.logId = logId;
        this.userId = userId;
        this.userName = userName;
        this.loginIp = loginIp;
        this.loginTime = loginTime;
        this.loginStatus = loginStatus;
        this.logoutTime = logoutTime;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
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

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    public Integer getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(Integer loginStatus) {
        this.loginStatus = loginStatus;
    }

    public String getLogoutTime() {
        return logoutTime;
    }

    public void setLogoutTime(String logoutTime) {
        this.logoutTime = logoutTime;
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
