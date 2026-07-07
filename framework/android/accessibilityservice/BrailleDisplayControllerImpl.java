package android.accessibilityservice;

public final class BrailleDisplayControllerImpl implements android.accessibilityservice.BrailleDisplayController {
    private static final boolean IS_HIDRAW_SUPPORTED = Boolean.valueOf(false);
    private final android.accessibilityservice.AccessibilityService mAccessibilityService = null;
    private android.accessibilityservice.IBrailleDisplayConnection mBrailleDisplayConnection;
    private android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback mCallback;
    private java.util.concurrent.Executor mCallbackExecutor;
    private final boolean mIsHidrawSupported = false;
    private final java.lang.Object mLock = null;
    BrailleDisplayControllerImpl(android.accessibilityservice.AccessibilityService p0, java.lang.Object p1) {}
    public BrailleDisplayControllerImpl(android.accessibilityservice.AccessibilityService p0, java.lang.Object p1, boolean p2) {}
    private void clearConnectionLocked() {}
    private void connect(com.android.internal.util.FunctionalUtils.RemoteExceptionIgnoringConsumer<android.accessibilityservice.IAccessibilityServiceConnection> p0, java.util.concurrent.Executor p1, android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback p2) {}
    public void connect(android.bluetooth.BluetoothDevice p0, android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback p1) {}
    public void connect(android.bluetooth.BluetoothDevice p0, java.util.concurrent.Executor p1, android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback p2) {}
    public void connect(android.hardware.usb.UsbDevice p0, android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback p1) {}
    public void connect(android.hardware.usb.UsbDevice p0, java.util.concurrent.Executor p1, android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback p2) {}
    public void disconnect() {}
    public boolean isConnected() { return false; }
    public void write(byte[] p0) throws java.io.IOException {}

    private final class IBrailleDisplayControllerWrapper extends android.accessibilityservice.IBrailleDisplayController.Stub {
        private IBrailleDisplayControllerWrapper(android.accessibilityservice.BrailleDisplayControllerImpl p0) { super(); }
        public void onConnected(android.accessibilityservice.IBrailleDisplayConnection p0, byte[] p1) {}
        public void onConnectionFailed(int p0) {}
        public void onDisconnected() {}
        public void onInput(byte[] p0) {}
    }
}
