package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button myaskbutton;
    ImageView myImg;
    int[] myImageList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         myaskbutton = (Button)findViewById(R.id.myAskBtn);
         myImg  = (ImageView)findViewById(R.id.myImgAnswer);
        myImageList = new int[]{R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};

    }
    public void iaskedit(View view){
        try {
            Random rand = new Random();
            int i = rand.nextInt(5);
            myImg.setImageResource(myImageList[i]);
        }catch(Exception e){
            Toast.makeText(this, "Errot is that : "+e.getMessage() +" Cause "+e.getCause(),Toast.LENGTH_LONG).show();
        }
    }

}
