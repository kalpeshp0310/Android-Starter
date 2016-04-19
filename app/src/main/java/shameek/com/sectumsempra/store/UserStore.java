package shameek.com.sectumsempra.store;

import com.google.gson.JsonObject;

import rx.Observable;
import shameek.com.sectumsempra.delegate.NetworkDelegate;

/**
 * Sometimes, I feel the compiler ignores all my comments
 * Created by Shameek Sarkar
 */
public class UserStore {

  public Observable<String> login(String username, String password) {
    JsonObject payload = new JsonObject();
    payload.addProperty("action", "login");
    payload.addProperty("username", username);
    payload.addProperty("password", password);

    return NetworkDelegate.post("http://baseUrl/api/users", payload.toString());
  }

  public void logout() {

  }

  public void getUser() {

  }

  public void getUsers() {

  }

  public void saveUser() {

  }

  public void saveUsers() {

  }
}
