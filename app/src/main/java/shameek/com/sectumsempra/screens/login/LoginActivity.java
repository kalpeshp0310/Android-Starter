package shameek.com.sectumsempra.screens.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import shameek.com.sectumsempra.R;
import shameek.com.sectumsempra.delegate.LogDelegate;
import shameek.com.sectumsempra.store.UserStore;

public class LoginActivity extends AppCompatActivity {

  @Bind(R.id.username) EditText username;
  @Bind(R.id.password) EditText password;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
    ButterKnife.bind(this);

  }

  @OnClick(R.id.action) public void onLogin() {

  }
}
