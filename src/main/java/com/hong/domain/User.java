package com.hong.domain;


import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;

public class User implements Serializable {
    private int id;
    @NotNull(message = "手机号码不为空")
    private String securephone;
    private String nickname;
    @NotNull(message = "用户名密码不为空")
    private String password;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime registertime;
    private boolean isactive;
    private String verifystatus;
    private String qq;                        //QQ号
    private String telephone;                 //固定电话
    private LocalDateTime verifytime;
    private int clienttype;                   //客户端类型
    private String email;			          //email
    private LocalDateTime sendmailtime;
    private LocalDateTime verifymailtime;
    private String verifyuuid;		          //激活码
    private String userFrom;                  //用户来源
    private Integer traderid;                 //配置交易员id

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(){}

    public User(int id, String nickname, String securephone, boolean isactive, int clienttype, String verifystatus , String userFrom, String email) {
        this.id = id;
        this.nickname = nickname;
        this.securephone = securephone;
        this.verifystatus = verifystatus;
        this.isactive = isactive;
        this.clienttype = clienttype;
        this.userFrom = userFrom;
        this.email = email;
    }

    public User(String securephone, String password, LocalDateTime registertime, boolean isactive, int clienttype) {
        this.securephone = securephone;
        this.password = password;
        this.registertime = registertime;
        this.isactive = isactive;
        this.clienttype = clienttype;
    }

    public User(String securephone, String password, LocalDateTime registertime, boolean isactive, int clienttype, String userFrom) {
        this.securephone = securephone;
        this.password = password;
        this.registertime = registertime;
        this.isactive = isactive;
        this.clienttype = clienttype;
        this.userFrom = userFrom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSecurephone() {
        return securephone;
    }

    public void setSecurephone(String securephone) {
        this.securephone = securephone;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getRegistertime() {
        return registertime;
    }

    public void setRegistertime(LocalDateTime registertime) {
        this.registertime = registertime;
    }

    public boolean isIsactive() {
        return isactive;
    }

    public void setIsactive(boolean isactive) {
        this.isactive = isactive;
    }

    public String getVerifystatus() {
        return verifystatus;
    }

    public void setVerifystatus(String verifystatus) {
        this.verifystatus = verifystatus;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public LocalDateTime getVerifytime() {
        return verifytime;
    }

    public void setVerifytime(LocalDateTime verifytime) {
        this.verifytime = verifytime;
    }

    public int getClienttype() {
        return clienttype;
    }

    public void setClienttype(int clienttype) {
        this.clienttype = clienttype;
    }

    public LocalDateTime getSendmailtime() {
        return sendmailtime;
    }

    public void setSendmailtime(LocalDateTime sendmailtime) {
        this.sendmailtime = sendmailtime;
    }

    public LocalDateTime getVerifymailtime() {
        return verifymailtime;
    }

    public void setVerifymailtime(LocalDateTime verifymailtime) {
        this.verifymailtime = verifymailtime;
    }

    public String getVerifyuuid() {
        return verifyuuid;
    }

    public void setVerifyuuid(String verifyuuid) {
        this.verifyuuid = verifyuuid;
    }

    public String getUserFrom() {
        return userFrom;
    }

    public void setUserFrom(String userFrom) {
        this.userFrom = userFrom;
    }

    public Integer getTraderid() {
        return traderid;
    }

    public void setTraderid(Integer traderid) {
        this.traderid = traderid;
    }

    @Override
    public String toString() {
        return "User{" +
                "securephone='" + securephone + '\'' +
                ", isactive=" + isactive +
                ", registertime=" + registertime +
                ", verifystatus='" + verifystatus + '\'' +
                ", verifytime=" + verifytime +
                ", email='" + email + '\'' +
                '}';
    }
}