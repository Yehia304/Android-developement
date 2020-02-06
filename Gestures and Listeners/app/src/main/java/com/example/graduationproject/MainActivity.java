package com.example.graduationproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.GestureDetector;

import android.os.Bundle;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,
GestureDetector.OnDoubleTapListener {

    private TextView Scroll;
    private GestureDetectorCompat GestureDetector;

    private static final String TAG = "Message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"OnCreate");
        Button Login = (Button)findViewById(R.id.Loginbutton);
        Button Tapme = (Button)findViewById(R.id.button2);
        Scroll = (TextView)findViewById(R.id.Scroll);
        this.GestureDetector = new GestureDetectorCompat(this,this);
        GestureDetector.setOnDoubleTapListener(this);
        Tapme.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView TapmeText = (TextView)findViewById(R.id.Scroll);
                        TapmeText.setText("Tapped IN!");


                    }

                }
        );

        Login.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView SigninText = (TextView)findViewById(R.id.Signin);
                        SigninText.setText("Logged IN!");


            }

        }
        );


    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        Scroll.setText("onSingleTapConfirmed");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        Scroll.setText("onDoubleTap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        Scroll.setText("onDoubleTapEvent");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        Scroll.setText("onDown");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        Scroll.setText("onShowPress");

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        Scroll.setText("onSingleTapUp");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        Scroll.setText("onScroll");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        Scroll.setText("onLongPress");

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        Scroll.setText("onFling");
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.GestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"OnStart");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "onSaveInstanceState");
    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "onRestoreInstanceState");
    }
}
