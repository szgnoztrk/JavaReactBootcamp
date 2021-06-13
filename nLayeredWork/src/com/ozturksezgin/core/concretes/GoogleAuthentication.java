package com.ozturksezgin.core.concretes;

import com.ozturksezgin.core.abstracts.Authentication;

public class GoogleAuthentication implements Authentication {
    @Override
    public void register() {
        System.out.println("Google ile kayıt olundu.");
    }

    @Override
    public void signIn() {
        System.out.println("Google ile giriş yapıldı.");
    }

    @Override
    public void signOut() {
        System.out.println("Google ile çıkış yapıldı.");
    }
}
