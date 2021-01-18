package com.oim.mishka.app.module.battery;

import com.oim.mishka.app.module.battery.model.Battery_18B4D0F3_Model;
import com.oim.mishka.app.module.battery.model.Battery_CB1D0F3_Model;
import com.oim.mishka.app.module.battery.model.Battery_CB2D0F3_Model;
import com.oim.mishka.app.module.battery.model.Battery_CB3D0F3_Model;

public class BatteryDataMonitor {
    private Battery_18B4D0F3_Model battery_18B4D0F3_model;
    private Battery_CB1D0F3_Model battery_cb1D0F3_model;
    private Battery_CB2D0F3_Model battery_cb2D0F3_model;
    private Battery_CB3D0F3_Model battery_cb3D0F3_model;

    public BatteryDataMonitor( Battery_18B4D0F3_Model battery_18B4D0F3_model,
                               Battery_CB1D0F3_Model battery_cb1D0F3_model,
                               Battery_CB2D0F3_Model battery_cb2D0F3_model,
                               Battery_CB3D0F3_Model battery_cb3D0F3_model){
        this.battery_18B4D0F3_model = battery_18B4D0F3_model;
        this.battery_cb1D0F3_model = battery_cb1D0F3_model;
        this.battery_cb2D0F3_model = battery_cb2D0F3_model;
        this.battery_cb3D0F3_model = battery_cb3D0F3_model;
    }

    public Battery_18B4D0F3_Model getBattery_18B4D0F3_model() {
        return battery_18B4D0F3_model;
    }

    public Battery_CB1D0F3_Model getBattery_cb1D0F3_model() {
        return battery_cb1D0F3_model;
    }

    public Battery_CB2D0F3_Model getBattery_cb2D0F3_model() {
        return battery_cb2D0F3_model;
    }

    public Battery_CB3D0F3_Model getBattery_cb3D0F3_model() {
        return battery_cb3D0F3_model;
    }
}
