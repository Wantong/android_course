package com.example.vagemall;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.service.autofill.OnClickAction;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;


public class Splush extends Activity {
    public static final int REQUEST_CODE = 9999;


//    private Button mEnterButton;
//    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            switch(view.getId()){
//                case  R.id.enter_button:
//                    Intent intent = new Intent(My1stactivity.this,MainActivity.class);
//                    startActivity(intent);
//                    break;
//            }
//        }
//    };


    Handler mHandler = new Handler();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splush);
//        mEnterButton = (Button)findViewById(R.id.enter_button);
//        mEnterButton.setOnClickListener(mOnClickListener);
        TextView testview = (TextView) findViewById(R.id.text_view_1st);
        final String title = testview.getText().toString();

        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                UserInfo userInfo = new UserInfo("小明",12);
                Intent intent = new Intent(Splush.this, MainActivity.class);
                intent.putExtra("Title", title);
                intent.putExtra("userInfo",userInfo);
//                startActivity(intent);
                startActivityForResult(intent, REQUEST_CODE);
            }
        }, 1000);
    }
}
