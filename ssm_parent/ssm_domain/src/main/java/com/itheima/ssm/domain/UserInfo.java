package com.itheima.ssm.domain;

import java.util.List;

/**
 * @Author: admin
 * @Date: 2019/11/2 10:40
 */
public class UserInfo {
    private String id; //id
    private String username; //用户名
    private String email; //邮箱
    private String password;//密码
    private String phoneNum; //手机号
    private int status; //状态 0 1
    private String statusStr; // 页面展示用户状态  启用  停用
    private List<Role> roles;
    public UserInfo() {
    }

    public UserInfo(String id, String username, String email, String password, String phoneNum, int status, String statusStr, List<Role> roles) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.phoneNum = phoneNum;
        this.status = status;
        this.statusStr = statusStr;
        this.roles = roles;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatusStr() {
        if(status == 0){
            statusStr = "未激活";
        }
        if (status == 1){
            statusStr = "以激活";
        }
        return statusStr;
    }

    public void setStatusStr(String statusStr) {
        this.statusStr = statusStr;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", status=" + status +
                ", statusStr='" + statusStr + '\'' +
                ", roles=" + roles +
                '}';
    }
}
