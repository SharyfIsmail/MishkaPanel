package com.oim.mishka.app.acivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.oim.mishka.R;
import com.oim.mishka.app.module.UnitMapper;
import com.oim.mishka.app.threads.ReceiveThread;
import com.oim.mishka.databinding.ActivityMainBinding;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding activityMainBinding;
    private UnitMapper unitMapper;
    private ReceiveThread receiveThread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        unitMapper = new UnitMapper();
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setVcuToAll01Model(unitMapper.getVcuToAll_01_Model());

        receiveThread = new ReceiveThread();
        receiveThread.setFuck(unitMapper.getVcuToAll_01_Model());
    }

    @Override
    protected void onResume() {
        super.onResume();
        receiveThread.setDaemon(true);
        receiveThread.setUnitIdMapper(unitMapper.getDataModel());
        receiveThread.start();
    }
    @Override
    protected  void onPause()
    {
        super.onPause();
    }
    @Override
    protected void onDestroy(){
            super.onDestroy();
    }
}