package shameek.com.sectumsempra;

import android.app.Application;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;

/**
 * Sometimes, I feel the compiler ignores all my comments
 * Created by Shameek Sarkar
 */
public class BaseApplication extends Application {
    public Gson gson;
    public OkHttpClient okHttpClient;
    public static BaseApplication instance;


    @Override public void onCreate() {
        super.onCreate();
        instance = this;

        gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
        okHttpClient = new OkHttpClient();

    }

    public static BaseApplication getInstance() {
        return instance;
    }
}
