package android.permissionpresenterservice;

@android.annotation.SystemApi
@java.lang.Deprecated
public abstract class RuntimePermissionPresenterService extends android.app.Service {
    private static final java.lang.String KEY_RESULT = "android.content.pm.permission.RuntimePermissionPresenter.key.result";
    public static final java.lang.String SERVICE_INTERFACE = "android.permissionpresenterservice.RuntimePermissionPresenterService";
    private android.os.Handler mHandler;
    public RuntimePermissionPresenterService() { super(); }
    private void getAppPermissions(java.lang.String p0, android.os.RemoteCallback p1) {}
    public final void attachBaseContext(android.content.Context p0) {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract java.util.List<android.content.pm.permission.RuntimePermissionPresentationInfo> onGetAppPermissions(java.lang.String p0);
}
