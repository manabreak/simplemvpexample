package me.manabreak.simplemvpexample.mvp;

public abstract class MvpPresenter<V extends MvpView> {

    protected V view;

    public void attachView(V view) {
        this.view = view;
    }

    public void detachView() {
        view = null;
    }
}
