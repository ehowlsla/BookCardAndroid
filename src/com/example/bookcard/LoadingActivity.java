package com.example.bookcard;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Menu;

public class LoadingActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_loading);
		Handler handler = new Handler(){                           // 핸들러 객체 생성
			public void handleMessage(Message msg){            //handleMessage 메소드를 오버라이딩
				finish();                                        
			}
		};
		
		handler.sendEmptyMessageDelayed(0, 3000);  // 핸들러 메시지를 통해 4초간 로딩페이지 출력
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.loading_page, menu);
		return true;
	}
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		//super.onBackPressed();
	}
}
