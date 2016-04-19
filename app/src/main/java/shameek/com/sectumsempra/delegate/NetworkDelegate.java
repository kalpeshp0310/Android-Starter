package shameek.com.sectumsempra.delegate;

import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import rx.Observable;
import rx.Subscriber;
import shameek.com.sectumsempra.BaseApplication;

/**
 * Sometimes, I feel the compiler ignores all my comments
 * Created by Shameek Sarkar
 */
public class NetworkDelegate {

  public static Observable<String> get(final String url) {
    return Observable.create(new Observable.OnSubscribe<String>() {
      @Override public void call(Subscriber<? super String> subscriber) {
        try {
          Request request = new Request.Builder().url(url).get().build();
          Response response = BaseApplication.getInstance().okHttpClient.newCall(request).execute();
          String responseString = response.body().string();

          if (!subscriber.isUnsubscribed()) {
            subscriber.onNext(responseString);
            subscriber.onCompleted();
          }
        } catch (Exception e) {
          if (!subscriber.isUnsubscribed()) subscriber.onError(e);
        }
      }
    });
  }

  public static Observable<String> post(final String url, final String params) {
    return Observable.create(new Observable.OnSubscribe<String>() {
      @Override public void call(Subscriber<? super String> subscriber) {
        try {


          MediaType jsonMediaType = MediaType.parse("application/json; charset=utf-8");
          RequestBody requestBody = RequestBody.create(jsonMediaType, params);
          Request request = new Request.Builder().url(url).post(requestBody).build();
          Response response = BaseApplication.getInstance().okHttpClient.newCall(request).execute();
          String responseString = response.body().string();

          if (!subscriber.isUnsubscribed()) {
            subscriber.onNext(responseString);
            subscriber.onCompleted();
          }
        } catch (Exception e) {
          if (!subscriber.isUnsubscribed()) subscriber.onError(e);
        }
      }
    });
  }
}
