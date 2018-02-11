package monkey.d.luffy.paradox.ui;

import android.annotation.SuppressLint;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import monkey.d.luffy.paradox.R;

/**
 * Created by shasha on 11/2/18.
 */

public class LoginActivity extends AppCompatActivity {
    FloatingActionButton fab;
    Button go;
    private EditText editTextUsername, editTextPassword;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        fab = (FloatingActionButton) findViewById(R.id.fab);
        editTextUsername = (EditText) findViewById(R.id.et_username);
        editTextPassword = (EditText) findViewById(R.id.et_password);
        go = (Button) findViewById(R.id.bt_go);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View parentLayout = findViewById(android.R.id.content);
                Snackbar.make(parentLayout, "MainActivity under construction", Snackbar.LENGTH_SHORT).show();
            }
        });
    }

    @SuppressLint("RestrictedApi")
    public void clickRegisterLayout(View v) {
        getWindow().setExitTransition(null);
        getWindow().setEnterTransition(null);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            ActivityOptions options =
                    ActivityOptions.makeSceneTransitionAnimation(this, fab, fab.getTransitionName());
            startActivityForResult(new Intent(this, RegisterActivity.class), 2000, options.toBundle());
        } else {
            startActivityForResult(new Intent(this, RegisterActivity.class), 2000);
        }
    }
}
