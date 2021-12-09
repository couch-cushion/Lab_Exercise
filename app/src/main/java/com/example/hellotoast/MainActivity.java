package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount,mreset;
    Button countbutton,zerobutton;
    int zero;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        mreset = (TextView) findViewById(R.id.show_count);
        countbutton = (Button)  findViewById(R.id.button_count );
        zerobutton = (Button)  findViewById(R.id.button_zero );

    }

    public void showtoast(View view) {
        Toast toast = Toast.makeText(this,R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            if (mCount % 2 == 0){

                countbutton.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));
                zerobutton.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
                mShowCount.setText(Integer.toString((mCount)));}

        if (mCount % 2 != 0){

            countbutton.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
            zerobutton.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
            mShowCount.setText(Integer.toString((mCount)));}

    }
    public void initial(View view) {
        zero=0;
        zero++;
        mCount =0;
        if(mreset != null)
            mreset.setText(Integer.toString((zero)));
        mShowCount.setText(Integer.toString((mCount)));
        zerobutton.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
        countbutton.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));
    }

}

