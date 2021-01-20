package com.oim.mishka.Battery.tx;

import com.oim.mishka.can.candata.DataFromDevice;
import com.oim.mishka.util.Parser;

public class BmsVcu_02 implements DataFromDevice {
    private float current;

    public float getCurrent() {
        return (current - 5000) / 10;
    }

    @Override
    public void parseDataFromCan(byte[] data) {
      if(data.length== 8){
          byte[] partArray = new byte[2];
          System.arraycopy(data, 5, partArray, 0, partArray.length);
          current = Parser.LittleIndianParser.uint_16ToInt(partArray);
      }
    }
}
