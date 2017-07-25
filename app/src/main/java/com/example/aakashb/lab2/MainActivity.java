package com.example.aakashb.lab2;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mBlueButton;
    private Button mGreenButton;
    private LinearLayout mLayout;
    private TextView mtext;

    private enum AppState {START, GREEN, BLUE};
    private AppState mAppState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBlueButton = (Button) findViewById(R.id.button1);

        mGreenButton = (Button) findViewById(R.id.button2);
        mLayout = (LinearLayout)findViewById(R.id.layout1);
        mtext = (TextView) findViewById(R.id.textview1);
        mAppState = AppState.START;




       /* mGreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mLayout.setBackgroundColor(getResources().getColor(R.color.Green));



            }
        }); */

        /*mBlueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mLayout.setBackgroundColor(getResources().getColor(R.color.Blue));




            }
        });*/
    }

    public void sendMessage(View view){
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        if(view.getId() == R.id.button1 && mAppState!=AppState.BLUE){
            //mLayout.setBackgroundColor(getResources().getColor(R.color.Blue));
            mLayout.setBackgroundColor(ContextCompat.getColor(context, R.color.Blue));
            mtext.setText("Now we are feeling Blue");
            CharSequence text = "Hi! we are in colour Blue!";
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            mAppState = AppState.BLUE;

        }
        else if(view.getId() == R.id.button2 &&  mAppState!=AppState.GREEN){
            //mLayout.setBackgroundColor(getResources().getColor(R.color.Green));
            mLayout.setBackgroundColor(ContextCompat.getColor(context, R.color.Green));
            mtext.setText("Now we are feeling Green");
            CharSequence text = "Hi! we are in colour Green!";
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            mAppState = AppState.GREEN;
        }


    }
}

