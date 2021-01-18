package com.oim.mishka.app.module.battery.model;

import androidx.databinding.ObservableFloat;

import com.oim.mishka.Battery.tx.Battery_18B4D0F3;
import com.oim.mishka.can.candata.DataFromDevice;
import com.oim.mishka.can.candata.DataFromDeviceModel;

public class Battery_18B4D0F3_Model  implements DataFromDeviceModel {
    private Battery_18B4D0F3 battery_18B4D0F3;

    public ObservableFloat getTotalVoltage() {
        return totalVoltage;
    }

    private ObservableFloat totalVoltage;

    public Battery_18B4D0F3_Model(){
        battery_18B4D0F3 = new Battery_18B4D0F3();
        totalVoltage = new ObservableFloat(0.0f);
    }
    @Override
    public void updateModel() {
        totalVoltage.set(battery_18B4D0F3.getBatteryVoltage());
    }

    @Override
    public DataFromDevice getDataFromDevice() {
        return battery_18B4D0F3;
    }
}
