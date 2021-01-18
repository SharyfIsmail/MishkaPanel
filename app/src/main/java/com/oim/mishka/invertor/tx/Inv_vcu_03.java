package com.oim.mishka.invertor.tx;

import com.oim.mishka.can.candata.DataFromDevice;
import com.oim.mishka.util.Parser;

public class Inv_vcu_03 implements DataFromDevice {
    private int invertorTemp;

    public int getInvertorTemp() {
        return  invertorTemp - 40;
    }

    @Override
    public void parseDataFromCan(byte[] data) {
        if(data.length == 8) {
            invertorTemp = Parser.LittleIndianParser.uint_8ToShort(data[4]);
        }
    }
}
