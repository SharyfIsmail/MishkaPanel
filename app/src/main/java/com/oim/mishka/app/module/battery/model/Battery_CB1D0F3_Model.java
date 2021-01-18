package com.oim.mishka.app.module.battery.model;

import androidx.databinding.ObservableByte;
import androidx.databinding.ObservableField;

import com.oim.mishka.Battery.tx.Battery_CB1D0F3;
import com.oim.mishka.can.candata.DataFromDevice;
import com.oim.mishka.can.candata.DataFromDeviceModel;

public class Battery_CB1D0F3_Model implements DataFromDeviceModel {
    private Battery_CB1D0F3 battery_cb1D0F3;
    private ObservableField<String> batteryStatus;
    private ObservableByte batteryError;

    public ObservableField<String> getBatteryStatus() {
        return batteryStatus;
    }

    public ObservableByte getBatteryError() {
        return batteryError;
    }

    public Battery_CB1D0F3_Model(){
        battery_cb1D0F3 = new Battery_CB1D0F3();
        batteryStatus = new ObservableField<>();
        batteryError = new ObservableByte();
    }
    @Override
    public void updateModel() {
        batteryStatus.set(battery_cb1D0F3.getBatteryStatus());
        batteryError.set(battery_cb1D0F3.getBatteryError());
    }

    @Override
    public DataFromDevice getDataFromDevice() {
        return battery_cb1D0F3;
    }
}
