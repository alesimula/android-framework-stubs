package android.hardware.serial;

public final class SerialManager extends android.hardware.SerialManager {
    private static final java.lang.String DEV_PREFIX = "/dev/";
    public static final java.lang.String EXTRA_PACKAGE_NAME = "android.hardware.serial.EXTRA_PACKAGE_NAME";
    public static final java.lang.String EXTRA_PORT = "android.hardware.serial.EXTRA_PORT";
    public static final java.lang.String EXTRA_REQUEST_TOKEN = "android.hardware.serial.EXTRA_REQUEST_TOKEN";
    public static final java.lang.String EXTRA_UID = "android.hardware.serial.EXTRA_UID";
    private static final java.lang.String TAG = "SerialManager";
    private final android.content.Context mContext = null;
    private android.util.ArrayMap<android.hardware.serial.SerialPortListener, java.util.concurrent.Executor> mListeners;
    private final java.lang.Object mLock = null;
    private final android.hardware.serial.ISerialManager mService = null;
    private android.hardware.serial.SerialManager.SerialPortServiceListener mServiceListener;
    public SerialManager(android.content.Context p0, android.hardware.serial.ISerialManager p1) { super(null, null); }
    public java.util.List<android.hardware.serial.SerialPort> getPorts() { return null; }
    public java.lang.String[] getSerialPorts() { return null; }
    public void grantSerialPortAccess(java.lang.String p0, int p1, boolean p2, android.os.IBinder p3) {}
    public android.hardware.SerialPort openSerialPort(java.lang.String p0, int p1) throws java.io.IOException { return null; }
    public void registerSerialPortListener(java.util.concurrent.Executor p0, android.hardware.serial.SerialPortListener p1) {}
    public void revokeSerialPortAccess(java.lang.String p0, int p1, boolean p2, android.os.IBinder p3) {}
    public void unregisterSerialPortListener(android.hardware.serial.SerialPortListener p0) {}

    private class SerialPortServiceListener extends android.hardware.serial.ISerialPortListener.Stub {
        private SerialPortServiceListener(android.hardware.serial.SerialManager p0) { super(); }
        public void onSerialPortConnected(android.hardware.serial.SerialPortInfo p0) {}
        public void onSerialPortDisconnected(android.hardware.serial.SerialPortInfo p0) {}
    }
}
