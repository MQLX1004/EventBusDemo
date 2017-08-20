package com.mql.www.eventbusdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mql.www.eventbusdemo.events.MessageEvent;

import org.greenrobot.eventbus.EventBus;

public class ThirdActivity extends AppCompatActivity {
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        btn = (Button)findViewById(R.id.btn_third_message);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                EventBus.getDefault().post(new MessageEvent("这是ThirdActivity发送的massage"));
                EventBus.getDefault().post("这是ThirdActivity发送的String");
            }
        });
    }
}
