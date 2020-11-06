package com.example.a1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity<bb> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView UglyGirl = (ImageView) findViewById(R.id.photo);
        UglyGirl.setOnClickListener(photo1);


    }

    private View.OnClickListener photo1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ImageView PrettyGirl = (ImageView) findViewById(R.id.photo);
            PrettyGirl.setImageResource(R.mipmap.photo2);


        }
    };
}

