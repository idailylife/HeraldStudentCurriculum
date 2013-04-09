package com.herald.blankapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
	EditText mEditTextYikatong; //EditText: 一卡通号
	EditText mEditTextPassword; //EditText: 密码
	Button mButtonLogin;		//Button: 登陆按钮

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		mEditTextYikatong = (EditText)findViewById(R.id.editTextYikatong);
		mEditTextPassword = (EditText)findViewById(R.id.editTextPassword);
		mButtonLogin = (Button)findViewById(R.id.buttonLogin);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}
	
	public void OnClickBtnLogin (View v){
		// 按下登陆按钮时的响应操作
		String numYikatong = mEditTextYikatong.getText().toString();
		String numPassword = mEditTextPassword.getText().toString();
		boolean canLogin = true;
		if ( canLogin ){
			//符合登陆条件
			//TODO:提示登陆成功
			Toast.makeText(getBaseContext(), "登陆成功...", Toast.LENGTH_SHORT).show();
			//然后Intent到新的Activity
			startActivity(new Intent(this, MainActivity.class));
			finish(); //终结自己
		} else{
			//不然
			//TODO:提示登陆失败
			Toast.makeText(getBaseContext(), "登陆失败...", Toast.LENGTH_SHORT).show();
		}
	}

}
