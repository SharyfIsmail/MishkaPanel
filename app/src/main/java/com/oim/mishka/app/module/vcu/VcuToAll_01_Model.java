package com.oim.mishka.app.module.vcu;

import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

import com.oim.mishka.can.candata.DataFromDevice;
import com.oim.mishka.can.candata.DataFromDeviceModel;
import com.oim.mishka.vcu.tx.VcuToAll_01;

public class VcuToAll_01_Model implements DataFromDeviceModel {
    private VcuToAll_01 vcu_ToAll;
    private ObservableInt speed;
    private ObservableField<String> motionMode;

    public ObservableInt getSpeed() {
        return speed;
    }

    public ObservableField<String> getMotionMode() {
        return motionMode;
    }

    public VcuToAll_01_Model(){
        vcu_ToAll = new com.oim.mishka.vcu.tx.VcuToAll_01();
        speed = new ObservableInt(0);
        motionMode = new ObservableField<>(" ");
    }
    @Override
    public void updateModel() {
        speed.set(vcu_ToAll.getSpeed());
        motionMode.set(vcu_ToAll.getMotionMode());
    }

    @Override
    public DataFromDevice getDataFromDevice() {
        return vcu_ToAll;
    }
}
