package shameek.com.sectumsempra.delegate;

import android.content.Context;
import android.content.SharedPreferences;

import shameek.com.sectumsempra.BaseApplication;

/**
 * Sometimes, I feel the compiler ignores all my comments
 * Created by Shameek Sarkar
 */
public class SharedPreferenceDelegate {
  public static SharedPreferences getSharedPreferences() {
    return BaseApplication.getInstance().getSharedPreferences("twitter-auth", Context.MODE_PRIVATE);
  }

  public static String getStringValue(String key) {
    return getSharedPreferences().getString(key, null);
  }

  public static boolean setValue(String key, String value) {
    return getSharedPreferences().edit().putString(key, value).commit();
  }
}
