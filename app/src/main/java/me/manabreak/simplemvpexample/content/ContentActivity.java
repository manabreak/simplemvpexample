package me.manabreak.simplemvpexample.content;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import me.manabreak.simplemvpexample.R;
import me.manabreak.simplemvpexample.mvp.MvpActivity;

public class ContentActivity extends MvpActivity<ContentView, ContentPresenter> implements ContentView {

    private TextView contentView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        contentView = (TextView) findViewById(R.id.content);

        presenter.loadData(getIntent().getExtras());
    }

    @Override
    protected ContentPresenter createPresenter() {
        return new ContentPresenter();
    }

    @Override
    public void showContent(String content) {
        this.contentView.setText(content);
    }
}
