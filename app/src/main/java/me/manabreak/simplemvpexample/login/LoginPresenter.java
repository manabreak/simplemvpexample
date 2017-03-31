package me.manabreak.simplemvpexample.login;

import me.manabreak.simplemvpexample.mvp.MvpPresenter;

public class LoginPresenter extends MvpPresenter<LoginView> {

    private String username = "";

    public LoginPresenter() {

    }


    public void usernameChanged(String username) {
        this.username = username;
        if (username == null || username.isEmpty()) {
            view.showError("Username cannot be empty!");
        } else {
            view.hideError();
        }
    }

    public void login() {
        if (username == null || username.isEmpty()) {
            view.showError("Username cannot be empty!");
        } else {
            view.proceed(username);
        }
    }
}
