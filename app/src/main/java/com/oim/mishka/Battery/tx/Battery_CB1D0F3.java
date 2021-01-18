package com.oim.mishka.Battery.tx;

import com.oim.mishka.can.candata.DataFromDevice;
import com.oim.mishka.util.Parser;

import java.util.HashMap;
import java.util.Map;

public class Battery_CB1D0F3  implements DataFromDevice {
    private String batteryStatus;
    private byte batteryError;

    public byte getBatteryError() {
        return batteryError;
    }

    public String getBatteryStatus() {
        return batteryStatus;
    }
    @Override
    public void parseDataFromCan(byte[] data) {
        if(data.length == 8) {
            batteryStatus = BatteryState.getBatteryState(data[1]);
            batteryError  = (byte) ((Parser.LittleIndianParser.uint_8ToShort(data[2]) & 0x80) >> 7);

        }
    }
    private static class BatteryState
    {
        private static Map<Integer, String> batteryState = new HashMap<>();

        static
        {
            batteryState.put(0, "Battery Init");
            batteryState.put(1, "Battery On");
            batteryState.put(2, "Battery Charging");
            batteryState.put(3, "Battery Off");
            batteryState.put(4, "Battery Emergency Off");

        }
        public static String getBatteryState(byte code)
        {
            return batteryState.get((code & 0xF0) >> 4);
        }
    }
}
