package com.example.brandellpetty.brandell2017summer;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.gesture.Gesture;
import android.gesture.GestureOverlayView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.TextView;

import com.example.brandellpetty.brandell2017summer.util.UtilLog;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnTouch;

public class Quiz5Activity extends BaseActivity implements View.OnTouchListener {

    private GestureDetector gestureDetector;
    private int sumX = 0;

    @BindView(R.id.activity_gesture_bingo)
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz5);
        ButterKnife.bind(this);
        gestureDetector = new GestureDetector(this, new simpleGestureListener());
        tv.setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
//
//        if(clicked = false){
//            ObjectAnimator animator =
//                    ObjectAnimator.ofFloat(tv, "translationX", 0, -450);
//            animator.setDuration(500);
//            animator.start();
//            shortToast("Right to left");
//
//        }
//        else if(clicked){
//            ObjectAnimator animator =
//                    ObjectAnimator.ofFloat(tv, "translationX", -450, 0);
//            animator.setDuration(500);
//            animator.start();
//            shortToast("Left to right");
//        }
        return gestureDetector.onTouchEvent(event);
    }



    private class simpleGestureListener extends GestureDetector.SimpleOnGestureListener{
        boolean isToast = true;
//
//        @Override
//        public boolean onSingleTapUp(MotionEvent e) {
//            UtilLog.d("Gesture", "onSingleTapUp");
//            return super.onSingleTapUp(e);
//        }
//
//        @Override
//        public void onLongPress(MotionEvent e) {
//            UtilLog.d("Gesture", "onLongPress");
//            super.onLongPress(e);
//        }

        @Override
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            sumX += distanceX;
            //   isToast = false;
            if(!isToast){
                if (sumX>=0){
                    if(Math.abs(sumX)>200){
                        isToast = true;
                        ObjectAnimator animator =
                                ObjectAnimator.ofFloat(tv, "translationX", 0, -450);
                        animator.setDuration(0);
                        animator.start();
                        shortToast("Right to left");
                    }
                }
                if (sumX<0){
                    if(Math.abs(sumX)<200){
                        isToast = true;
                        ObjectAnimator animator =
                                ObjectAnimator.ofFloat(tv, "translationX", -450, 0);
                        animator.setDuration(0);
                        animator.start();
                        shortToast("Left to right");
                    }
                }
            }
            return super.onScroll(e1, e2, distanceX, distanceY);
        }
    }

}
