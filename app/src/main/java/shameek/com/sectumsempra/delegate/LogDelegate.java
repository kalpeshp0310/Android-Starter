package shameek.com.sectumsempra.delegate;

import android.util.Log;

/**
 * Sometimes, I feel the compiler ignores all my comments
 * Created by Shameek Sarkar
 */
public class LogDelegate {
  public static void log(String message) {
    Log.e("Sectumsempra", "Log: " + message);
  }
}
