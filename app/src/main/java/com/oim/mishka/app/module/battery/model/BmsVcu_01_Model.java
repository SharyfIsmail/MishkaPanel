package com.oim.mishka.app.module.battery.model;

import androidx.databinding.ObservableByte;
import androidx.databinding.ObservableField;

import com.oim.mishka.Battery.tx.BmsVcu_01;
import com.oim.mishka.can.candata.DataFromDevice;
import com.oim.mishka.can.candata.DataFromDeviceModel;

public class BmsVcu_01_Model implements DataFromDeviceModel {
    private BmsVcu_01 bmsVcu01;
    private ObservableField<String> batteryStatus;
    private ObservableByte batteryError;

    public ObservableField<String> getBatteryStatus() {
        return batteryStatus;
    }

    public ObservableByte getBatteryError() {
        return batteryError;
    }

    public BmsVcu_01_Model(){
        bmsVcu01 = new BmsVcu_01();
        batteryStatus = new ObservableField<>();
        batteryError = new ObservableByte();
    }
    @Override
    public void updateModel() {
        batteryStatus.set(bmsVcu01.getBatteryStatus());
        batteryError.set(bmsVcu01.getBatteryError());
    }

    @Override
    public DataFromDevice getDataFromDevice() {
        return bmsVcu01;
    }
}
