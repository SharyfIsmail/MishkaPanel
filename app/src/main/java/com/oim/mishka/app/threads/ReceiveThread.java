package com.oim.mishka.app.threads;

import com.oim.mishka.app.module.vcu.VcuToAll_01_Model;
import com.oim.mishka.can.Can;
import com.oim.mishka.can.candata.DataFromDeviceModel;
import com.oim.mishka.usb.UsbCan;
import com.oim.mishka.usb.UsbCanCdr;
import com.oim.mishka.usb.UsbConnector;
import com.oim.mishka.vcu.tx.VcuToAll_01;

import java.util.Map;
import java.util.Objects;

public class ReceiveThread extends Thread {
    private Map<Integer, DataFromDeviceModel> canPackage ;
    private UsbConnector usbConnector ;
    private VcuToAll_01_Model vcuToAll_01;
    public Map<Integer, DataFromDeviceModel> getCanPackage() {
        return canPackage;
    }

    public UsbConnector getUsbConnector() {
        return usbConnector;
    }
int i = 0;
    public void setUsbConnector(UsbConnector usbConnector) {
        this.usbConnector = usbConnector;
    }
    @Override
    public void run() {

        while(true)
    {
        try {
            Thread.sleep(500);
            vcuToAll_01.getSpeed().set(i);
            i = i == 140 ? 0: ++i;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
//        if(usbConnector.getUsbConnection() != null) {
//            byte[] receiveBuffer = new byte[512];
//            while (!isInterrupted()) {
//                if(usbConnector.getUsbSerialPort().isOpen())
//                {
//                    try {
//                        int len =usbConnector.getUsbSerialPort().read(receiveBuffer, 100);// time doesn't matter
//                        if (len > 0) {
//                            byte[] array = Arrays.copyOf(receiveBuffer, len);
//                            objectMapping(array);
//                        }
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }
    }
    private void objectMapping(byte[] data) {
        UsbCan usbCanPackage = new UsbCanCdr();
        usbCanPackage.parseUsbPacket(data);
        for(Can can : usbCanPackage.getAllCan())
        {
            if(canPackage.get(can.getId()) != null)
            {
                DataFromDeviceModel dataFromDeviceModel = canPackage.get(can.getId());
                Objects.requireNonNull(dataFromDeviceModel).getDataFromDevice().parseDataFromCan(can.getData());
                dataFromDeviceModel.updateModel();
            }
        }
    }
    public void setUnitIdMapper(Map<Integer, DataFromDeviceModel> canPackage) {
        this.canPackage = canPackage;
    }
    public void setFuck(VcuToAll_01_Model sdsd){
        vcuToAll_01 = sdsd;
    }
}
