package com.oim.mishka.app.module.battery.model;

import androidx.databinding.ObservableFloat;

import com.oim.mishka.Battery.tx.BmsVcu_04;
import com.oim.mishka.can.candata.DataFromDevice;
import com.oim.mishka.can.candata.DataFromDeviceModel;

public class BmsVcu_04_Model implements DataFromDeviceModel {
    private BmsVcu_04 bmsVcu04;

    public ObservableFloat getTotalVoltage() {
        return totalVoltage;
    }

    private ObservableFloat totalVoltage;

    public BmsVcu_04_Model(){
        bmsVcu04 = new BmsVcu_04();
        totalVoltage = new ObservableFloat(0.0f);
    }
    @Override
    public void updateModel() {
        totalVoltage.set(bmsVcu04.getBatteryVoltage());
    }

    @Override
    public DataFromDevice getDataFromDevice() {
        return bmsVcu04;
    }
}
