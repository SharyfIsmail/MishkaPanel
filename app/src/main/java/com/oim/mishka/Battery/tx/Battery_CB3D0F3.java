package com.oim.mishka.Battery.tx;

import com.oim.mishka.can.candata.DataFromDevice;
import com.oim.mishka.util.Parser;

public class Battery_CB3D0F3  implements DataFromDevice {
    private int soc;
    public int getSoc() {
        return soc;
    }

    @Override
    public void parseDataFromCan(byte[] data) {
        if(data.length == 8){
            soc = Parser.LittleIndianParser.uint_8ToShort(data[4]);
        }
    }
}
