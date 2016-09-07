package com.example.AnimationImage;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MyActivity extends Activity {

    // Создаем экземпляры для наших анимаций
    private Animation anim1, anim2, anim3, anim4;
    private Animation anim5, anim6, anim7, anim8;
    private Animation anim9, anim10, anim11, anim12;
    private ImageView imageView;
    private TextView text;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        imageView = (ImageView) findViewById(R.id.imageView);

        // Import font from assets
        String fontPath = "fonts/Paint Peel Initials.ttf";
        text = (TextView) findViewById(R.id.signature);
        // Font Face
        Typeface typeface = Typeface.createFromAsset(getAssets(), fontPath);
        // Applying font to text
        text.setTypeface(typeface);

        // Подгружаем все анимации
        anim1 = AnimationUtils.loadAnimation(this, R.anim.animation_left);
        anim2 = AnimationUtils.loadAnimation(this, R.anim.animation_right);
        anim3 = AnimationUtils.loadAnimation(this, R.anim.animation_up);
        anim4 = AnimationUtils.loadAnimation(this, R.anim.animation_down);
        anim5 = AnimationUtils.loadAnimation(this, R.anim.animation_rotate_left);
        anim6 = AnimationUtils.loadAnimation(this, R.anim.animation_rotate_right);
        anim7 = AnimationUtils.loadAnimation(this, R.anim.animation_zoomin);
        anim8 = AnimationUtils.loadAnimation(this, R.anim.animation_zoomout);
        anim9 = AnimationUtils.loadAnimation(this, R.anim.animation_zoomin_rotate_left);
        anim10 = AnimationUtils.loadAnimation(this, R.anim.animation_zoomin_rotate_right);
        anim11 = AnimationUtils.loadAnimation(this, R.anim.animation_zoomout_rotate_left);
        anim12 = AnimationUtils.loadAnimation(this, R.anim.animation_zoomout_rotate_right);
    }

    // Анимация №1
    public void onAnimationImage1(View v){
        imageView.startAnimation(anim1);
    }

    // Анимация №2
    public void onAnimationImage2(View v){
        imageView.startAnimation(anim2);
    }

    // Анимация №3
    public void onAnimationImage3(View v){
        imageView.startAnimation(anim3);
    }

    // Анимация №4
    public void onAnimationImage4(View v){
        imageView.startAnimation(anim4);
    }

    // Анимация №5
    public void onAnimationImage5(View v){
        imageView.startAnimation(anim5);
    }

    // Анимация №6
    public void onAnimationImage6(View v){
        imageView.startAnimation(anim6);
    }

    // Анимация №7
    public void onAnimationImage7(View v){
        imageView.startAnimation(anim7);
    }

    // Анимация №8
    public void onAnimationImage8(View v){
        imageView.startAnimation(anim8);
    }

    // Анимация №9
    public void onAnimationImage9(View v){
        imageView.startAnimation(anim9);
    }

    // Анимация №10
    public void onAnimationImage10(View v){
        imageView.startAnimation(anim10);
    }

    // Анимация №11
    public void onAnimationImage11(View v){
        imageView.startAnimation(anim11);
    }

    // Анимация №12
    public void onAnimationImage12(View v){
        imageView.startAnimation(anim12);
    }

    public void onRadioButtonClicked(View view) {
        // Check which radio button was clicked
        switch(view.getId()) {
            // Green
            case R.id.radioButton1:
                imageView.setImageResource(R.drawable.android_green_img);
                break;
            // Red
            case R.id.radioButton2:
                imageView.setImageResource(R.drawable.android_red_img);
                break;
            // Yellow
            case R.id.radioButton3:
                imageView.setImageResource(R.drawable.android_yellow_img);
                break;
            // Blue
            case R.id.radioButton4:
                imageView.setImageResource(R.drawable.android_blue_img);
                break;
        }
    }
}
