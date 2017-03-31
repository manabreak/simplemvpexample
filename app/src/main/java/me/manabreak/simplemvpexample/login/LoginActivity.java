package me.manabreak.simplemvpexample.login;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import me.manabreak.simplemvpexample.R;
import me.manabreak.simplemvpexample.content.ContentActivity;
import me.manabreak.simplemvpexample.mvp.MvpActivity;

public class LoginActivity extends MvpActivity<LoginView, LoginPresenter> implements LoginView {

    private TextView errorText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        errorText = (TextView) findViewById(R.id.error_text);

        EditText username = (EditText) findViewById(R.id.username);
        username.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                presenter.usernameChanged(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        Button loginButton = (Button) findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.login();
            }
        });
    }

    @Override
    protected LoginPresenter createPresenter() {
        return new LoginPresenter();
    }

    @Override
    public void showError(String error) {
        errorText.setText(error);
        errorText.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideError() {
        errorText.setVisibility(View.GONE);
    }

    @Override
    public void proceed(String username) {
        Intent i = new Intent(this, ContentActivity.class);
        i.putExtra("USERNAME", username);
        startActivity(i);
        finish();
    }
}
