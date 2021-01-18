package com.oim.mishka.app.module.battery.model;

import androidx.databinding.ObservableFloat;

import com.oim.mishka.Battery.tx.Battery_CB2D0F3;
import com.oim.mishka.can.candata.DataFromDevice;
import com.oim.mishka.can.candata.DataFromDeviceModel;

public class Battery_CB2D0F3_Model implements DataFromDeviceModel {
    private Battery_CB2D0F3 battery_cb2D0F3 ;
    private ObservableFloat current;

    public Battery_CB2D0F3_Model(){
        battery_cb2D0F3 = new Battery_CB2D0F3();
        current = new ObservableFloat(0.0f);
    }
    @Override
    public void updateModel() {
        current.set(battery_cb2D0F3.getCurrent());
    }

    @Override
    public DataFromDevice getDataFromDevice() {
        return battery_cb2D0F3;
    }
}
