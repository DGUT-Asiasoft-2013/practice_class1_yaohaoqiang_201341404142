package com.example.helloworld;

import com.example.helloworld.fragments.inputcells.SimpleTextInputCellFragment;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends Activity {
	
	SimpleTextInputCellFragment fragmentAccount,fragmentPassword;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		fragmentAccount=(SimpleTextInputCellFragment) getFragmentManager().findFragmentById(R.id.input_account);
		fragmentPassword=(SimpleTextInputCellFragment) getFragmentManager().findFragmentById(R.id.input_password);
		
		
		findViewById(R.id.btn_register).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				goRegister();
			}
		});
		
		findViewById(R.id.btn_login).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				goLogin();
				
			}
		});
	
		
	}
	@Override
	protected void onResume() {
		super.onResume();
		fragmentAccount.setLabelText("账户名");
		fragmentAccount.setHintText("请输入账户名");
		fragmentPassword.setLabelText("密码");
		fragmentPassword.setHintText("请输入密码");
		fragmentPassword.setIsPassword(true);
	}
	
	void goRegister(){
		Intent itnt = new Intent(this,RegisterActivity.class);
		startActivity(itnt);
	}
	void goLogin(){
		Intent itnt = new Intent(this ,LoginActivity.class);
		startActivity(itnt);
	}
}
