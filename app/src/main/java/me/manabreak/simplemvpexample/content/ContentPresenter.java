package me.manabreak.simplemvpexample.content;

import android.os.Bundle;

import me.manabreak.simplemvpexample.mvp.MvpPresenter;

public class ContentPresenter extends MvpPresenter<ContentView> {

    public void loadData(Bundle args) {
        String welcome = "Welcome, " + args.getString("USERNAME");
        view.showContent(welcome);
    }
}
