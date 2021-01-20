package com.oim.mishka.app.module.battery.model;

import androidx.databinding.ObservableInt;

import com.oim.mishka.can.candata.DataFromDevice;
import com.oim.mishka.can.candata.DataFromDeviceModel;
import com.oim.mishka.Battery.tx.BmsVcu_03;

public class BmsVcu_03_Model implements DataFromDeviceModel {
    private BmsVcu_03 bmsVcu03;
    private ObservableInt soc;
    public BmsVcu_03_Model(){
        bmsVcu03 = new BmsVcu_03();
        soc = new ObservableInt(0);
    }
    @Override
    public void updateModel() {
        soc.set(bmsVcu03.getSoc());
    }

    @Override
    public DataFromDevice getDataFromDevice() {
        return bmsVcu03;
    }
}
