package android.app.admin;

@android.annotation.SystemApi
public class DevicePolicyKeyguardService extends android.app.Service {
    private static final java.lang.String TAG = "DevicePolicyKeyguardService";
    private android.app.admin.IKeyguardCallback mCallback;
    private final android.app.admin.IKeyguardClient mClient = null;
    private final android.os.Handler mHandler = null;
    public DevicePolicyKeyguardService() { super(); }
    public void dismiss() {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public android.view.SurfaceControlViewHost.SurfacePackage onCreateKeyguardSurface(android.os.IBinder p0) { return null; }
    public void onDestroy() {}
}
