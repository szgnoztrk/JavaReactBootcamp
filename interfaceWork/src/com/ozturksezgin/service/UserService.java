package com.ozturksezgin.service;

import com.ozturksezgin.model.User;

public class UserService {
    private User user;

    public UserService(User user) {
        this.user = user;
    }

    public void signUp(){
        if(this.isRealPerson()) {
            if(!this.isSignUp())
                System.out.println(this.user.getUserFirstName() + " adlı kullanıcı sisteme kayıt edildi.");
            else
                this.signIn();
        }
    }

    public void signIn(){
        System.out.println(this.user.getUserFirstName() + " adlı kullanıcı sisteme giriş yaptı.");
    }

    public boolean isSignUp(){
        System.out.println(this.user.getUserNationalIdentity() + " adlı kullanıcı sisteme zaten kayıtlı.");
        return true;
    }

    public boolean isRealPerson(){
        return true;
    }

}
