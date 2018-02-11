package mokey.d.luffy.paradox.ui;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

import mokey.d.luffy.paradox.R;
import mokey.d.luffy.paradox.utils.Preferences;

/**
 * Created by shasha on 11/2/18.
 */

public class IntroActivity extends AppIntro {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addSlide(AppIntroFragment.newInstance("1", "desc", R.mipmap.ic_launcher, Color.DKGRAY));
        addSlide(AppIntroFragment.newInstance("1", "desc", R.mipmap.ic_launcher, Color.DKGRAY));
        addSlide(AppIntroFragment.newInstance("1", "desc", R.mipmap.ic_launcher, Color.DKGRAY));
        addSlide(AppIntroFragment.newInstance("1", "desc", R.mipmap.ic_launcher, Color.DKGRAY));
        addSlide(AppIntroFragment.newInstance("1", "desc", R.mipmap.ic_launcher, Color.DKGRAY));
        addSlide(AppIntroFragment.newInstance("1", "desc", R.mipmap.ic_launcher, Color.DKGRAY));

        setFlowAnimation();
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        onComplete();
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        onComplete();
    }

    private void onComplete() {
        Preferences.setFirstRun(this);
        startActivity(new Intent(this, LoginActivity.class));
    }
}