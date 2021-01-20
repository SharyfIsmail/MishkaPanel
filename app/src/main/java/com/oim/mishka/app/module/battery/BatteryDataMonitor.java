package com.oim.mishka.app.module.battery;

import com.oim.mishka.app.module.battery.model.BmsVcu_04_Model;
import com.oim.mishka.app.module.battery.model.BmsVcu_01_Model;
import com.oim.mishka.app.module.battery.model.BmsVcu_02_Model;
import com.oim.mishka.app.module.battery.model.BmsVcu_03_Model;

public class BatteryDataMonitor {
    private BmsVcu_04_Model bmsVcu04_model;
    private BmsVcu_01_Model bmsVcu01_model;
    private BmsVcu_02_Model bmsVcy02_model;
    private BmsVcu_03_Model bmsVcu03_model;

    public BatteryDataMonitor(){
        bmsVcu04_model = new BmsVcu_04_Model();
        bmsVcu01_model = new BmsVcu_01_Model();
        bmsVcy02_model = new BmsVcu_02_Model();
        bmsVcu03_model = new BmsVcu_03_Model();
    }

    public BmsVcu_04_Model getBmsVcu04_model() {
        return bmsVcu04_model;
    }

    public BmsVcu_01_Model getBmsVcu01_model() {
        return bmsVcu01_model;
    }

    public BmsVcu_02_Model getBmsVcy02_model() {
        return bmsVcy02_model;
    }

    public BmsVcu_03_Model getBmsVcu03_model() {
        return bmsVcu03_model;
    }
}
