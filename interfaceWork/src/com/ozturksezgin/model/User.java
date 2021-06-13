package com.ozturksezgin.model;

import java.util.Date;

public class User {
    private Long userId;
    private String userFirstName;
    private String userLastName;
    private String userBirthdate;
    private String userNationalIdentity;

    public User(Long userId, String userFirstName, String userLastName, String userBirthdate, String userNationalIdentity) {
        this.userId = userId;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userBirthdate = userBirthdate;
        this.userNationalIdentity = userNationalIdentity;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserBirthdate() {
        return userBirthdate;
    }

    public void setUserBirthdate(String userBirthdate) {
        this.userBirthdate = userBirthdate;
    }

    public String getUserNationalIdentity() {
        return userNationalIdentity;
    }

    public void setUserNationalIdentity(String userNationalIdentity) {
        this.userNationalIdentity = userNationalIdentity;
    }


}
