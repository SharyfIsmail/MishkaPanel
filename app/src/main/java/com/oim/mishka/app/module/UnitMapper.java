package com.oim.mishka.app.module;

import com.oim.mishka.app.module.battery.BatteryDataMonitor;
import com.oim.mishka.app.module.invertor.Inv_vcu_03_Model;
import com.oim.mishka.app.module.vcu.VcuToAll_01_Model;
import com.oim.mishka.can.candata.DataFromDeviceModel;

import java.util.HashMap;
import java.util.Map;

public class UnitMapper {
    private Map<Integer, DataFromDeviceModel> dataModel;
    private BatteryDataMonitor batteryDataMonitor;
    private Inv_vcu_03_Model  inv_vcu_03_model;
    private VcuToAll_01_Model vcuToAll_01;
    public UnitMapper(){
        dataModel = new HashMap<>();
        batteryDataMonitor = new BatteryDataMonitor();
        inv_vcu_03_model = new Inv_vcu_03_Model();
        vcuToAll_01 = new VcuToAll_01_Model();
        fillMapUnit();
    }
    private void fillMapUnit(){
        dataModel.put(0xCB1D0F3, batteryDataMonitor.getBmsVcu01_model());
        dataModel.put(0xCB2D0F3, batteryDataMonitor.getBmsVcy02_model());
        dataModel.put(0xCB3D0F3, batteryDataMonitor.getBmsVcu03_model());
        dataModel.put(0x18B4D0F3, batteryDataMonitor.getBmsVcu04_model());
        dataModel.put(0x18A3D0EF, inv_vcu_03_model);
        dataModel.put(0x1851A0D0, vcuToAll_01);
    }

    public Map<Integer, DataFromDeviceModel> getDataModel() {
        return dataModel;
    }

    public BatteryDataMonitor getBatteryDataMonitor() {
        return batteryDataMonitor;
    }

    public Inv_vcu_03_Model getInv_vcu_03_model() {
        return inv_vcu_03_model;
    }

    public VcuToAll_01_Model getVcuToAll_01_Model() {
        return vcuToAll_01;
    }
}
