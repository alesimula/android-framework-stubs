package android.hardware.usb;

public final class UsbOperationInternal extends android.hardware.usb.IUsbOperationInternal.Stub {
    private static final java.lang.String TAG = "UsbPortStatus";
    public static final int USB_OPERATION_ERROR_INTERNAL = 1;
    public static final int USB_OPERATION_ERROR_NOT_SUPPORTED = 2;
    public static final int USB_OPERATION_ERROR_PORT_MISMATCH = 3;
    public static final int USB_OPERATION_SUCCESS = 0;
    private static final int USB_OPERATION_TIMEOUT_MSECS = 5000;
    private boolean mAsynchronous;
    private java.util.function.Consumer<java.lang.Integer> mConsumer;
    private java.util.concurrent.Executor mExecutor;
    private final java.lang.String mId = null;
    final java.util.concurrent.locks.ReentrantLock mLock = null;
    private boolean mOperationComplete;
    private final int mOperationID = 0;
    final java.util.concurrent.locks.Condition mOperationWait = null;
    private int mResult;
    private int mStatus;
    public UsbOperationInternal(int p0, java.lang.String p1) { super(); }
    UsbOperationInternal(int p0, java.lang.String p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Integer> p3) { super(); }
    public int getStatus() { return 0; }
    public void onOperationComplete(int p0) {}
    public void waitForOperationComplete() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface UsbOperationStatus {
    }
}
