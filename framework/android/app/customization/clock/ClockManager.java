package android.app.customization.clock;

public class ClockManager {
    private static final java.lang.String TAG = "ClockManager";
    private static android.app.customization.clock.ClockManager.Globals sGlobals;
    private static final java.lang.Object sSync = null;
    private final android.content.Context mContext = null;
    public ClockManager(android.app.customization.clock.IClockManagerService p0, android.content.Context p1) {}
    private void closeQuietly(android.os.ParcelFileDescriptor p0) {}
    public static android.app.customization.clock.ClockManager getInstance(android.content.Context p0) { return null; }
    static void initGlobals(android.app.customization.clock.IClockManagerService p0) {}
    private void verifyServiceRunning() {}
    public void addOnClockChangedListener(android.app.customization.clock.ClockManager.OnClockChangedListener p0) {}
    public android.app.customization.clock.ClockDescription getClockDescription() { return null; }
    public android.os.ParcelFileDescriptor getClockDescriptionFile() { return null; }
    public android.app.customization.clock.ClockInstance getClockInstance() { return null; }
    public void removeOnClockChangedListener(android.app.customization.clock.ClockManager.OnClockChangedListener p0) {}
    public void setClock(android.app.customization.clock.ClockDescription p0, java.util.Map<java.lang.String, android.graphics.Bitmap> p1, android.app.customization.clock.IClockManagerCallback p2) throws java.io.IOException {}

    private static class Globals extends android.app.customization.clock.IClockManagerCallback.Stub {
        private final android.util.SparseArray<java.util.List<android.app.customization.clock.ClockManager.OnClockChangedListener>> mLocalListenersByUser = null;
        private final android.app.customization.clock.IClockManagerService mService = null;
        Globals(android.app.customization.clock.IClockManagerService p0) { super(); }
        void addListener(android.app.customization.clock.ClockManager.OnClockChangedListener p0, int p1) {}
        public void onClockChanged() {}
        void removeListener(android.app.customization.clock.ClockManager.OnClockChangedListener p0, int p1) {}
    }

    public static interface OnClockChangedListener {
        public void onClockChanged();
    }
}
