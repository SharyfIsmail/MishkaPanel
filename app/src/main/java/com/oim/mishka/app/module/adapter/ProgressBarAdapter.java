package com.oim.mishka.app.module.adapter;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.widget.ProgressBar;

import androidx.databinding.BindingAdapter;
import androidx.lifecycle.ViewModel;

public class ProgressBarAdapter extends ViewModel {

    @BindingAdapter("android:SpeedProgressBar")
    public static void setSpeedProgess(ProgressBar speedProgess, int value){
        speedProgess.setProgress(setSpeedProgress(value));
    }
    @BindingAdapter("android:BatteryProgessBar")
    public static void setBatteryProgess(ProgressBar batteryProgess, int value){
        batteryProgess.setProgress(setBattertProgress(value));
    }
    @BindingAdapter("android:TempProgressBar")
    public static void setTempProgressBar(ProgressBar tempProgress, int value){
        tempProgress.setProgress(setTempProgress(value));
    }

    private static int setSpeedProgress(int value){
        return (value * 80)/ 140;
    }
    private static int setBattertProgress(int value){
        return value / 2;
    }
    private static int setTempProgress(int value){
        int tempValue = value + 40;

        return tempValue / 4;
    }

}
