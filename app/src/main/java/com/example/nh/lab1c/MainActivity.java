package com.example.nh.lab1c;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView v1;
        v1 = (TextView) findViewById(R.id.name_text_view);
        v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1.setText("Juan");
            }
        });


    }
}
