package me.manabreak.simplemvpexample.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class MvpActivity<V extends MvpView, P extends MvpPresenter> extends AppCompatActivity implements MvpView {

    protected P presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = createPresenter();
        presenter.attachView(this);
    }

    protected abstract P createPresenter();
}
