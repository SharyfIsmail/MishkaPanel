package com.oim.mishka.vcu.tx;

import com.oim.mishka.can.candata.DataFromDevice;
import com.oim.mishka.util.Parser;

import java.util.HashMap;
import java.util.Map;

public class VcuToAll_01 implements DataFromDevice {
    private int speed ;
    private  String motionMode;
    private String systemMode;

    public String getMotionMode() {
        return motionMode;
    }

    public int getSpeed() {
        return speed;
    }

    public String getSystemMode() {
        return systemMode;
    }

    @Override
    public void parseDataFromCan(byte[] data) {
        if(data.length == 8){
            motionMode = SystemModeCode.getMotionMode(data[1]);
            systemMode = SystemModeCode.getSystemMode(data[1]);
            speed = Parser.BigIndianByteParser.uint_8ToShort(data[7]);
        }
    }
    private static class SystemModeCode{
        private static Map<Integer, String> systemModes = new HashMap<>();
        static{
            systemModes.put(0, "I");
            systemModes.put(1, "P");
            systemModes.put(2, "N");
            systemModes.put(3, "D");
            systemModes.put(4, "R");
            systemModes.put(5, "C");
            systemModes.put(6, "S");
            systemModes.put(7, "E");
        }
        public static String getMotionMode(byte code) {
            String val =  systemModes.get((code >> 4 ) & 0x0F);
            assert val != null;
            if(val.equals("I") || val.equals("C") || val.equals("S") || val.equals("E") ){
                return " ";
            }
            return val;
        }
        public static String getSystemMode(byte code){
            return systemModes.get(code & 0x0F);
        }
    }
}
