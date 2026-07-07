package android.hardware.hid;

public final class HidManager {
    private static final java.lang.String TAG = "HidManager";
    private final android.content.Context mContext = null;
    private final android.util.ArrayMap<android.hardware.hid.HidDeviceInfo, android.hardware.hid.HidDevice> mDeviceCache = null;
    private final android.util.ArrayMap<android.hardware.hid.HidDeviceListener, android.hardware.hid.HidManager.ListenerDelegate> mListeners = null;
    private final java.lang.Object mLock = null;
    private volatile android.hardware.hid.IHidManager mService;
    private final java.lang.Object mServiceLock = null;
    public HidManager(android.content.Context p0) {}
    public HidManager(android.content.Context p0, android.hardware.hid.IHidManager p1) {}
    private android.hardware.hid.HidDevice getOrCreateDeviceLocked(android.hardware.hid.HidDeviceInfo p0) { return null; }
    private android.hardware.hid.IHidManager getService() { return null; }
    public boolean canEnumerateDevices() { return false; }
    public java.util.List<android.hardware.hid.HidDevice> getDevices() { return null; }
    public java.util.List<android.hardware.hid.HidDevicePermission> getGrantedPermissions(java.lang.String p0) { return null; }
    public void registerListener(android.hardware.hid.HidDeviceListener p0, java.util.concurrent.Executor p1) {}
    public void unregisterListener(android.hardware.hid.HidDeviceListener p0) {}
    public void updatePermission(android.hardware.hid.HidDevicePermission p0, boolean p1) {}

    private final class ListenerDelegate extends android.hardware.hid.IHidDeviceListener.Stub {
        private final java.lang.Object mDelegateLock = null;
        private final java.util.concurrent.Executor mExecutor = null;
        private android.hardware.hid.HidDeviceListener mListener;
        private final android.hardware.hid.IHidManager mService = null;
        ListenerDelegate(android.hardware.hid.HidManager p0, android.hardware.hid.HidDeviceListener p1, java.util.concurrent.Executor p2, android.hardware.hid.IHidManager p3) { super(); }
        private void dispatchCallback(android.hardware.hid.HidDevice p0, java.util.function.BiConsumer<android.hardware.hid.HidDeviceListener, android.hardware.hid.HidDevice> p1) {}
        void nullify() {}
        public void onHidDeviceAdded(android.hardware.hid.HidDeviceInfo p0) {}
        public void onHidDeviceRemoved(android.hardware.hid.HidDeviceInfo p0) {}
    }
}
