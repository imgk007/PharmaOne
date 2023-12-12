package com.pharmaone.model;

public class UserAccess {
    String userName;
    String password;
    String accountType;

    public UserAccess() {}
    public UserAccess(String userName, String password, String accountType) {
        this.userName = userName;
        this.password = password;
        this.accountType = accountType;
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

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
