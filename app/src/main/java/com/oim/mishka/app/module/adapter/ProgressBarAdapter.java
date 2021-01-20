package com.oim.mishka.app.module.adapter;

import android.content.Context;
import android.widget.ProgressBar;

import androidx.databinding.BindingAdapter;
import androidx.lifecycle.ViewModel;

public class ProgressBarAdapter extends ViewModel {

    @BindingAdapter("android:SpeedProgressBar")
    public static void setSpeedProgess(ProgressBar speedProgess, int value){
        speedProgess.setProgress(setSpeedProgress(value));
    }

    private static int setSpeedProgress(int value){
        return (value * 80)/ 140;
    }
}
