package com.divyavashisth.knectus;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.Spinner;

import agency.tango.materialintroscreen.SlideFragment;

public class CustomSlide4 extends SlideFragment {
    private CheckBox checkBox;
    private Spinner spinner;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_custom_slide4, container, false);
        checkBox = (CheckBox) view.findViewById(R.id.checkBox);
        spinner=(Spinner) view.findViewById(R.id.Spinner);
        return view;
    }

    @Override
    public int backgroundColor() {
        return R.color.fourth_slide_background;
    }

    @Override
    public int buttonsColor() {
        return R.color.fourth_slide_buttons;
    }

    @Override
    public boolean canMoveFurther() {
        return checkBox.isChecked();
    }

    @Override
    public String cantMoveFurtherErrorMessage() {
        return getString(R.string.error_message);
    }
}