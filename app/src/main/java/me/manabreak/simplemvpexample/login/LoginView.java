package me.manabreak.simplemvpexample.login;

import me.manabreak.simplemvpexample.mvp.MvpView;

public interface LoginView extends MvpView {
    void showError(String error);

    void hideError();

    void proceed(String username);
}
