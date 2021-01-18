package com.oim.mishka.app.module.battery.model;

import androidx.databinding.ObservableInt;

import com.oim.mishka.can.candata.DataFromDevice;
import com.oim.mishka.can.candata.DataFromDeviceModel;
import com.oim.mishka.Battery.tx.Battery_CB3D0F3;

public class Battery_CB3D0F3_Model implements DataFromDeviceModel {
    private Battery_CB3D0F3 battery_CB3D0F3;
    private ObservableInt soc;
    public Battery_CB3D0F3_Model(){
        battery_CB3D0F3 = new Battery_CB3D0F3();
        soc = new ObservableInt(0);
    }
    @Override
    public void updateModel() {
        soc.set(battery_CB3D0F3.getSoc());
    }

    @Override
    public DataFromDevice getDataFromDevice() {
        return battery_CB3D0F3;
    }
}
