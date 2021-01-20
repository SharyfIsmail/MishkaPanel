package com.oim.mishka.app.module.battery.model;

import androidx.databinding.ObservableFloat;

import com.oim.mishka.Battery.tx.BmsVcu_02;
import com.oim.mishka.can.candata.DataFromDevice;
import com.oim.mishka.can.candata.DataFromDeviceModel;

public class BmsVcu_02_Model implements DataFromDeviceModel {
    private BmsVcu_02 bmsVcu02;
    private ObservableFloat current;

    public BmsVcu_02_Model(){
        bmsVcu02 = new BmsVcu_02();
        current = new ObservableFloat(0.0f);
    }
    @Override
    public void updateModel() {
        current.set(bmsVcu02.getCurrent());
    }

    @Override
    public DataFromDevice getDataFromDevice() {
        return bmsVcu02;
    }
}
