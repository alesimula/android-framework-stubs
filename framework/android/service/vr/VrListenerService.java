package android.service.vr;

public abstract class VrListenerService extends android.app.Service {
    private static final int MSG_ON_CURRENT_VR_ACTIVITY_CHANGED = 1;
    public static final java.lang.String SERVICE_INTERFACE = "android.service.vr.VrListenerService";
    private final android.service.vr.IVrListener.Stub mBinder = null;
    private final android.os.Handler mHandler = null;
    public VrListenerService() { super(); }
    public static final boolean isVrModePackageEnabled(android.content.Context p0, android.content.ComponentName p1) { return false; }
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onCurrentVrActivityChanged(android.content.ComponentName p0) {}
    public void onCurrentVrActivityChanged(android.content.ComponentName p0, boolean p1, int p2) {}

    private final class VrListenerHandler extends android.os.Handler {
        public VrListenerHandler(android.service.vr.VrListenerService p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}
