package com.somiao.miniprogram.entity;

public class User {
    private String userName ;
    private  String userCode ;
    private String image;
    private String log;
    private  String helpMessage;
    private String comment;
    private String submissionDate;

    public String getUserName() {
        return userName;
    }

    public String getUserCode() {
        return userCode;
    }

    public String getImage() {
        return image;
    }

    public String getComment() {
        return comment;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLog() {
        return log;
    }

    public String getHelpMessage() {
        return helpMessage;
    }

    public String getSubmissionDate() {
        return submissionDate;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setHelpMessage(String helpMessage) {
        this.helpMessage = helpMessage;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public void setSubmissionDate(String submissionDate) {
        this.submissionDate = submissionDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userCode='" + userCode + '\'' +
                ", image=" + image +
                ", log='" + log + '\'' +
                ", helpMessage='" + helpMessage + '\'' +
                ", comment='" + comment + '\'' +
                ", submissionDate='" + submissionDate + '\'' +
                '}';
    }
}
