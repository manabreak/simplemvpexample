package me.manabreak.simplemvpexample.content;

import me.manabreak.simplemvpexample.mvp.MvpView;

public interface ContentView extends MvpView {
    void showContent(String content);
}
