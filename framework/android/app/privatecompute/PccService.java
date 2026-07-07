package android.app.privatecompute;

public abstract class PccService extends android.app.Service {
    private static final java.lang.String TAG = null;
    private final android.app.privatecompute.IPccService.Stub mBinder = null;
    protected PccService() { super(); }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onReceiveData(android.os.Bundle p0, java.lang.String p1);
}
