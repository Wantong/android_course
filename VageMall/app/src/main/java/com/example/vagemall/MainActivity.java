package com.example.vagemall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = MainActivity.class.getName();
    public static final String TITLE = "title";
    public static final String USER_INFO = "userInfo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_first).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Splush.class);
                setResult(9999);
                finish();
//                startActivity(intent);
            }
        });
        Intent intent = getIntent();
        if(intent != null){
            String title =  intent.getStringExtra(TITLE);
            UserInfo userInfo = (UserInfo) intent.getSerializableExtra(USER_INFO);
            setTitle("小明的名字是:"+userInfo.getmUserName());
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"string:hello");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

}
