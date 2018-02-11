package mokey.d.luffy.paradox.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import mokey.d.luffy.paradox.utils.Preferences;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(Preferences.getFirstRun(this)) {
            startActivity(new Intent(this, IntroActivity.class));
        }

        else if (!Preferences.isLoggedIn(this)) {
            startActivity(new Intent(this, LoginActivity.class));
        }

        else
            startActivity(new Intent(this, MainActivity.class));
    }
}
