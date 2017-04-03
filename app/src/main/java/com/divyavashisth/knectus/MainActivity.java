package com.divyavashisth.knectus;

import android.Manifest;
import android.support.annotation.FloatRange;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import agency.tango.materialintroscreen.MaterialIntroActivity;
import agency.tango.materialintroscreen.MessageButtonBehaviour;
import agency.tango.materialintroscreen.SlideFragmentBuilder;
import agency.tango.materialintroscreen.animations.IViewTranslation;
import android.Manifest;
import android.os.Bundle;
import android.support.annotation.FloatRange;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import agency.tango.materialintroscreen.MaterialIntroActivity;
import agency.tango.materialintroscreen.MessageButtonBehaviour;
import agency.tango.materialintroscreen.SlideFragmentBuilder;
import agency.tango.materialintroscreen.animations.IViewTranslation;

    public class MainActivity extends MaterialIntroActivity {
        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            enableLastSlideAlphaExitTransition(true);

            getBackButtonTranslationWrapper()
                    .setEnterTranslation(new IViewTranslation() {
                        @Override
                        public void translate(View view, @FloatRange(from = 0, to = 1.0) float percentage) {
                            view.setAlpha(percentage);
                        }
                    });



            addSlide(new CustomSlide());
            addSlide(new CustomSlide2());
            addSlide(new CustomSlide3());
            addSlide(new CustomSlide4());
            addSlide(new CustomSlide5());


        }

        @Override
        public void onFinish() {
            super.onFinish();
            Toast.makeText(this, "Try this library in your project! :)", Toast.LENGTH_SHORT).show();
        }
    }

