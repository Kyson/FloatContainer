package com.tt.floatcontainersample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.WindowManager;
import android.widget.TextView;

import com.tt.floatcontainerlib.FloatContainer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = new TextView(getApplicationContext());
        textView.setTextColor(Color.WHITE);
        textView.setTextSize(14);
        textView.setText("Hello World");
        textView.setPadding(20, 20, 20, 20);
        FloatContainer floatContainer = new FloatContainer(this);
        textView.setBackgroundResource(R.color.colorPrimary);
        floatContainer.attachToWindow(textView, Gravity.LEFT | Gravity.TOP, 200, 300, WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
    }


}
