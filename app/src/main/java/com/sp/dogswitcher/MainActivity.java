package com.sp.dogswitcher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Boolean flag=false;
    public void clickMe(View view){

        ImageView imageView = findViewById(R.id.imageView);
        if(!flag)
        {
            imageView.setImageResource(R.drawable.cute_puppy);
            flag = true;
        }
        else
        {
            imageView.setImageResource(R.drawable.maxres);
            flag = false;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
