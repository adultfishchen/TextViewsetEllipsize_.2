package com.e.textviewsetellipsize;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView2=(TextView) findViewById(R.id.textView2);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setSingleLine(true);
        textView2.setText("在程式中所設的省略文字: Hello World!! ");

    }
}
