package android.hardware.hid;

public final class HidDevice implements java.lang.AutoCloseable {
    private static final java.lang.String TAG = "HidDevice";
    public static final int TRANSPORT_BLUETOOTH = 5;
    public static final int TRANSPORT_I2C = 24;
    public static final int TRANSPORT_SPI = 28;
    public static final int TRANSPORT_UNKNOWN = 0;
    public static final int TRANSPORT_USB = 3;
    public static final int TRANSPORT_VIRTUAL = 6;
    private final android.content.Context mContext = null;
    private final java.lang.Object mDeviceLock = null;
    private final android.hardware.hid.HidDeviceInfo mInfo = null;
    private int mOpenGeneration;
    private final java.util.List<android.util.Pair<java.util.concurrent.Executor, android.os.OutcomeReceiver<android.hardware.hid.HidDevice, java.lang.Exception>>> mPendingOpenCallbacks = null;
    private android.hardware.hid.IHidManager mService;
    private volatile android.hardware.hid.HidDevice.State mState;
    private final android.os.IBinder mToken = null;
    public HidDevice(android.content.Context p0, android.hardware.hid.HidDeviceInfo p1, android.hardware.hid.IHidManager p2) {}
    private java.lang.String getDeviceLogId() { return null; }
    private <T extends java.lang.Object> void notifyCallbackOfError(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<T, java.lang.Exception> p1, java.lang.Exception p2) {}
    private <T extends java.lang.Object> void notifyCallbackOfResult(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<T, java.lang.Exception> p1, T p2) {}
    private <T extends java.lang.Object> void notifyCallbacksOfError(java.util.List<android.util.Pair<java.util.concurrent.Executor, android.os.OutcomeReceiver<T, java.lang.Exception>>> p0, java.lang.Exception p1) {}
    private <T extends java.lang.Object> void notifyCallbacksOfResult(java.util.List<android.util.Pair<java.util.concurrent.Executor, android.os.OutcomeReceiver<T, java.lang.Exception>>> p0, T p1) {}
    private void sendReportInternal(android.hardware.hid.Report p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Void, java.lang.Exception> p2, java.lang.String p3, android.hardware.hid.HidDevice.BinderCall p4) {}
    private static java.lang.Exception toMappedException(android.os.ServiceSpecificException p0, java.lang.String p1) { return null; }
    public static java.lang.String transportToString(int p0) { return null; }
    public void close() {}
    public boolean equals(java.lang.Object p0) { return false; }
    public void getFeatureReport(int p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<android.hardware.hid.Report, java.lang.Exception> p2) {}
    public java.lang.String getName() { return null; }
    public java.lang.String getPhysicalAddress() { return null; }
    public int getProductId() { return 0; }
    public byte[] getReportDescriptor() { return null; }
    public int getTransport() { return 0; }
    public java.lang.String getUniqueId() { return null; }
    public int getVendorId() { return 0; }
    public int hashCode() { return 0; }
    public boolean isOpen() { return false; }
    public void open(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<android.hardware.hid.HidDevice, java.lang.Exception> p1) {}
    public void sendFeatureReport(android.hardware.hid.Report p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Void, java.lang.Exception> p2) {}
    public void sendOutputReport(android.hardware.hid.Report p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Void, java.lang.Exception> p2) {}
    public java.lang.String toString() { return null; }

    @java.lang.FunctionalInterface
    private static interface BinderCall {
        public void run(android.hardware.hid.AidlReport p0) throws android.os.RemoteException;
    }

    private static enum State {
        CLOSED,
        OPENED,
        OPENING;
        private static final android.hardware.hid.HidDevice.State[] $VALUES = null;
        private State() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Transport {
    }
}
