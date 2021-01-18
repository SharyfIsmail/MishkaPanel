package com.oim.mishka.usb.usbDriver;

import android.hardware.usb.UsbDevice;

public interface UsbSerialDriver
{
    public UsbDevice getDevice();
    public java.util.List<UsbSerialPort> getPorts();
}
