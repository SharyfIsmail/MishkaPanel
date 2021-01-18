package com.oim.mishka.app.module.vcu;

import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

import com.oim.mishka.can.candata.DataFromDevice;
import com.oim.mishka.can.candata.DataFromDeviceModel;
import com.oim.mishka.vcu.tx.Vcu_1851A0D0;

public class Vcu_1851A0D0_Model implements DataFromDeviceModel {
    private Vcu_1851A0D0 vcu_1851A0D0;
    private ObservableInt speed;
    private ObservableField<String> motionMode;

    public Vcu_1851A0D0_Model(){
        vcu_1851A0D0 = new Vcu_1851A0D0();
        speed = new ObservableInt(0);
        motionMode = new ObservableField<>(" ");
    }
    @Override
    public void updateModel() {
        speed.set(vcu_1851A0D0.getSpeed());
        motionMode.set(vcu_1851A0D0.getMotionMode());
    }

    @Override
    public DataFromDevice getDataFromDevice() {
        return vcu_1851A0D0;
    }
}
