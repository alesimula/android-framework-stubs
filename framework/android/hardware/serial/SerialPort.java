package android.hardware.serial;

public final class SerialPort {
    public static final int INVALID_ID = -1;
    public static final int OPEN_FLAG_DATA_SYNC = 4096;
    public static final int OPEN_FLAG_NONBLOCK = 2048;
    public static final int OPEN_FLAG_READ_ONLY = 0;
    public static final int OPEN_FLAG_READ_WRITE = 2;
    public static final int OPEN_FLAG_SYNC = 1048576;
    public static final int OPEN_FLAG_WRITE_ONLY = 1;
    private final android.content.Context mContext = null;
    private final android.hardware.serial.SerialPortInfo mInfo = null;
    private final android.hardware.serial.ISerialManager mService = null;
    public SerialPort(android.content.Context p0, android.hardware.serial.SerialPortInfo p1, android.hardware.serial.ISerialManager p2) {}
    public java.lang.String getName() { return null; }
    public int getProductId() { return 0; }
    public int getVendorId() { return 0; }
    public void requestOpen(int p0, boolean p1, java.util.concurrent.Executor p2, android.os.OutcomeReceiver<android.hardware.serial.SerialPortResponse, java.lang.Exception> p3) {}
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface OpenFlags {
    }

    private class SerialPortResponseCallback extends android.hardware.serial.ISerialPortResponseCallback.Stub {
        private final java.util.concurrent.Executor mExecutor = null;
        private final android.os.OutcomeReceiver<android.hardware.serial.SerialPortResponse, java.lang.Exception> mReceiver = null;
        private SerialPortResponseCallback(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<android.hardware.serial.SerialPortResponse, java.lang.Exception> p1) { super(); }
        private static java.lang.Exception getException(int p0, java.lang.String p1) { return null; }
        public void onError(int p0, java.lang.String p1) {}
        public void onResult(android.hardware.serial.SerialPortInfo p0, android.os.ParcelFileDescriptor p1) {}
    }
}
