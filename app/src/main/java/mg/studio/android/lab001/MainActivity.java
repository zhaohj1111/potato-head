package mg.studio.android.lab001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView mouth, arms, ears, eyebrows, eyes, glasses, hat, mustache, nose, shoes;
    CheckBox cmouth,carms,cears,ceyebrows,ceyes,cglasses,chat,cmustache,cnose,cshoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        int orientation = getResources().getConfiguration().orientation;
//        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
//            setContentView(R.layout.activity_landmain);
//        } else if (orientation == Configuration.ORIENTATION_PORTRAIT) {
//            setContentView(R.layout.activity_main);
//        }

        mouth = findViewById(R.id.mouth);
        arms = findViewById(R.id.arms);
        ears = findViewById(R.id.ears);
        eyebrows = findViewById(R.id.eyebrows);
        eyes = findViewById(R.id.eyes);
        glasses = findViewById(R.id.glasses);
        hat = findViewById(R.id.hat);
        mustache = findViewById(R.id.mustache);
        nose = findViewById(R.id.nose);
        shoes = findViewById(R.id.shoes);

        cmouth=findViewById(R.id.cb_mouth);
        carms=findViewById(R.id.cb_arms);
        cears=findViewById(R.id.cb_ears);
        ceyebrows=findViewById(R.id.cb_eyebrow);
        ceyes=findViewById(R.id.cb_eye);
        cglasses=findViewById(R.id.cb_glasses);
        chat=findViewById(R.id.cb_hat);
        cmustache=findViewById(R.id.cb_mustache);
        cnose=findViewById(R.id.cb_nose);
        cshoes=findViewById(R.id.cb_shoes);
    }

    public void cbMouth(View view) {
        if(cmouth.isChecked())
        {
            mouth.setVisibility(view.VISIBLE);
        }else{
            mouth.setVisibility(view.INVISIBLE);
        }
    }

    public void cbArms(View view) {
        if(carms.isChecked()){
            arms.setVisibility(view.VISIBLE);
        }else {
            arms.setVisibility(view.INVISIBLE);
        }
    }

    public void cbEars(View view) {
        if(cears.isChecked()){
            ears.setVisibility(view.VISIBLE);
        }else {
            ears.setVisibility(view.INVISIBLE);
        }
    }

    public void cbEyebrow(View view) {
        if(ceyebrows.isChecked()){
            eyebrows.setVisibility(view.VISIBLE);
        }else {
            eyebrows.setVisibility(view.INVISIBLE);
        }
    }

    public void cbHat(View view) {
        if(chat.isChecked()){
            hat.setVisibility(view.VISIBLE);
        }else {
            hat.setVisibility(view.INVISIBLE);
        }
    }

    public void cbEye(View view) {
        if(ceyes.isChecked()){
            eyes.setVisibility(view.VISIBLE);
        }else {
            eyes.setVisibility(view.INVISIBLE);
        }
    }

    public void cbGlasses(View view) {
        if(cglasses.isChecked()){
            glasses.setVisibility(view.VISIBLE);
        }else {
            glasses.setVisibility(view.INVISIBLE);
        }
    }

    public void cbMustache(View view) {
        if(cmustache.isChecked()){
            mustache.setVisibility(view.VISIBLE);
        }else {
            mustache.setVisibility(view.INVISIBLE);
        }
    }

    public void cbNose(View view) {
        if(cnose.isChecked()){
            nose.setVisibility(view.VISIBLE);
        }else {
            nose.setVisibility(view.INVISIBLE);
        }
    }

    public void cbShoes(View view) {
        if(cshoes.isChecked()){
            shoes.setVisibility(view.VISIBLE);
        }else {
            shoes.setVisibility(view.INVISIBLE);
        }
    }
}
