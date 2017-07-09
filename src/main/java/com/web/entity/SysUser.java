package com.web.entity;

/**
 * Created by Fookey on 2017/7/1.
 */
public class SysUser {

    private String userId;
    private String userName;
    private String password;
    private String sex;
    private String identityCard;
    private String deptId;
    private String authority;
    private String readAuthority;
    private String downloadAuthority;
    private String uploadAuthority;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getReadAuthority() {
        return readAuthority;
    }

    public void setReadAuthority(String readAuthority) {
        this.readAuthority = readAuthority;
    }

    public String getDownloadAuthority() {
        return downloadAuthority;
    }

    public void setDownloadAuthority(String downloadAuthority) {
        this.downloadAuthority = downloadAuthority;
    }

    public String getUploadAuthority() {
        return uploadAuthority;
    }

    public void setUploadAuthority(String uploadAuthority) {
        this.uploadAuthority = uploadAuthority;
    }
}
