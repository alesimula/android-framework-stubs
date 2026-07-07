package android.hardware.serial;

public interface SerialPortListener {
    public void onSerialPortConnected(android.hardware.serial.SerialPort p0);
    public void onSerialPortDisconnected(android.hardware.serial.SerialPort p0);
}
