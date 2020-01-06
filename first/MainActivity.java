package com.stuff.qq.first;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b;
    TextView v1,v2,v3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.button);
        v1=(TextView)findViewById(R.id.editText);
        v2=(TextView)findViewById(R.id.editText2);
        v3=(TextView)findViewById(R.id.editText3);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value=Integer.parseInt((v1.getText().toString()));
                int value1=Integer.parseInt((v2.getText().toString()));

                int value3=value+value1;
                String s=String.valueOf(value3);
                v3.setText(s);

            }
        });

    }
}
