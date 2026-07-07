package android.hardware.usb;

public class UsbRequest {
    static final int MAX_USBFS_BUFFER_SIZE = 16384;
    private static final java.lang.String TAG = "UsbRequest";
    private java.nio.ByteBuffer mBuffer;
    private java.lang.Object mClientData;
    private android.hardware.usb.UsbDeviceConnection mConnection;
    private android.hardware.usb.UsbEndpoint mEndpoint;
    private boolean mIsUsingNewQueue;
    private int mLength;
    private final java.lang.Object mLock = null;
    private long mNativeContext;
    private java.nio.ByteBuffer mTempBuffer;
    public UsbRequest() {}
    private native boolean native_cancel();
    private native void native_close();
    private native int native_dequeue_array(byte[] p0, int p1, boolean p2);
    private native int native_dequeue_direct();
    private native boolean native_init(android.hardware.usb.UsbDeviceConnection p0, int p1, int p2, int p3, int p4);
    private native boolean native_queue(java.nio.ByteBuffer p0, int p1, int p2);
    private native boolean native_queue_array(byte[] p0, int p1, boolean p2);
    private native boolean native_queue_direct(java.nio.ByteBuffer p0, int p1, boolean p2);
    public boolean cancel() { return false; }
    boolean cancelIfOpen() { return false; }
    public void close() {}
    void dequeue(boolean p0) {}
    protected void finalize() throws java.lang.Throwable {}
    public java.lang.Object getClientData() { return null; }
    public android.hardware.usb.UsbEndpoint getEndpoint() { return null; }
    public boolean initialize(android.hardware.usb.UsbDeviceConnection p0, android.hardware.usb.UsbEndpoint p1) { return false; }
    public boolean queue(java.nio.ByteBuffer p0) { return false; }
    @java.lang.Deprecated
    public boolean queue(java.nio.ByteBuffer p0, int p1) { return false; }
    boolean queueIfConnectionOpen(java.nio.ByteBuffer p0) { return false; }
    boolean queueIfConnectionOpen(java.nio.ByteBuffer p0, int p1) { return false; }
    public void setClientData(java.lang.Object p0) {}
}
