package com.example.multivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button button,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.activity1);
        button2=findViewById(R.id.activity2);
        button3=findViewById(R.id.activity3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTwo();
            }
           });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openThree();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFour();
            }
        });

    }

    private void openTwo() {
        Intent intent=new Intent(this , Activity2.class);
        startActivity(intent);
    }
    private void openThree() {
        Intent intent=new Intent(this , Activity3.class);
        startActivity(intent);
    }
    private void openFour() {
        Intent intent=new Intent(this , Activity4.class);
        startActivity(intent);
    }
}
