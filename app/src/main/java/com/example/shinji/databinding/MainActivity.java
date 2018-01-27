package com.example.shinji.databinding;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.shinji.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements SampleEventHandlers {

	User mUser;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// キャメルケースにBindingが付くインスタンスを生成できる
		ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
		mUser = new User("Test", "User");
		binding.setUser(mUser);
		binding.setHandlers(this); //handlersにセット

		// firstNameの値を変更してもTextViewの表示は変わらない
//		user.setFirstName("Hoge");
	}

	@Override
	public void onChangeClick(View view) {    Log.d("DEBUG", "Change User Name");

		mUser.setFirstName("Jiro");

		Log.d("DEBUG", mUser.getFirstName());	}

}
