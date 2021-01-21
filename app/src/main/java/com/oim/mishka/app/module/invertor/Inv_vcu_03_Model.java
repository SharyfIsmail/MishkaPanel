package com.oim.mishka.app.module.invertor;

import androidx.databinding.ObservableInt;

import com.oim.mishka.can.candata.DataFromDevice;
import com.oim.mishka.can.candata.DataFromDeviceModel;
import com.oim.mishka.invertor.tx.Inv_vcu_03;

public class Inv_vcu_03_Model implements DataFromDeviceModel {
    private Inv_vcu_03 inv_vcu_03;
    private ObservableInt invertorTemp;
    public Inv_vcu_03_Model(){
        inv_vcu_03 = new Inv_vcu_03();
        invertorTemp = new ObservableInt(0);
    }

    public ObservableInt getInvertorTemp() {
        return invertorTemp;
    }

    @Override
    public void updateModel() {
        invertorTemp.set(inv_vcu_03.getInvertorTemp());
    }

    @Override
    public DataFromDevice getDataFromDevice() {
        return inv_vcu_03;
    }
}
