package com.divyavashisth.knectus;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.Spinner;

import agency.tango.materialintroscreen.SlideFragment;

public class CustomSlide2 extends SlideFragment {
    private CheckBox checkBox;
    private Spinner spinner;
    data d2;
    String spin1;
    String spin2;
    String spin3;
    String spin4;
    String spin5;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        d2=new data();

        final View view = inflater.inflate(R.layout.fragment_custom_slide2, container, false);
        checkBox = (CheckBox) view.findViewById(R.id.checkBox);
        final Spinner feedbackSpinner = (Spinner) view.findViewById(R.id.Spinner);
        feedbackSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                spin1 = feedbackSpinner.getSelectedItem().toString();
                d2.setOp1(spin1);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                spin1="nala";
            }
        });
        final Spinner s2 = (Spinner) view.findViewById(R.id.Spinner2);
        s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                spin2 = s2.getSelectedItem().toString();
                d2.setOp2(spin2);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                spin2="nala";
            }

        });
        final Spinner s3 = (Spinner) view.findViewById(R.id.Spinner3);
        s3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                spin3 = s3.getSelectedItem().toString();
                d2.setOp3(spin3);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                spin3="nala";
            }

        });
        final Spinner s4 = (Spinner) view.findViewById(R.id.Spinner4);
        s4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                spin4 = s4.getSelectedItem().toString();
                d2.setOp4(spin4);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                spin4="nala";
            }

        });
        final Spinner s5 = (Spinner) view.findViewById(R.id.Spinner5);
        s5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                spin5 = s5.getSelectedItem().toString();
                d2.setOp5(spin5);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                spin5="nala";
            }

        });
        return view;
    }

    @Override
    public int backgroundColor() {
        return R.color.second_slide_background;
    }

    @Override
    public int buttonsColor() {
        return R.color.second_slide_buttons;
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