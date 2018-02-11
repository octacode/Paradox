package monkey.d.luffy.paradox.utils;

import android.content.Context;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by shasha on 11/2/18.
 */

public class Preferences {
    public static boolean getFirstRun(Context context) {
        return context.getSharedPreferences("PREFERENCE", MODE_PRIVATE).getBoolean("isFirstRun", true);
    }

    public static void setFirstRun(Context context) {
        context.getSharedPreferences("PREFERENCE", MODE_PRIVATE).edit().putBoolean("isFirstRun", false).apply();
    }

    public static boolean isLoggedIn(Context context) {
        return context.getSharedPreferences("PREFERENCE", MODE_PRIVATE).getBoolean("isLoggedIn", false);
    }

    public static void setLoggedIn(Context context) {
        context.getSharedPreferences("PREFERENCE", MODE_PRIVATE).edit().putBoolean("isLoggedIn", true).apply();
    }

    public static void logOut(Context context) {
        context.getSharedPreferences("PREFERENCE", MODE_PRIVATE).edit().putBoolean("isLoggedIn", false).apply();
    }
}
