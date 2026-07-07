package android.app.permissionui;

public class LocationButtonClientWrapper extends android.app.permissionui.ILocationButtonClient.Stub {
    private static final java.lang.String LOG_TAG = "LocationButtonClientWrapper";
    private final android.app.Activity mActivity = null;
    private final android.app.permissionui.LocationButtonClient mClient = null;
    private final java.util.concurrent.Executor mClientExecutor = null;
    private final android.app.permissionui.LocationButtonProviderFactory.LocationButtonProviderImpl mProvider = null;
    LocationButtonClientWrapper(android.app.Activity p0, android.app.permissionui.LocationButtonProviderFactory.LocationButtonProviderImpl p1, android.app.permissionui.LocationButtonClient p2, java.util.concurrent.Executor p3) { super(); }
    public void onPermissionsResult(boolean p0) {}
    public void onRequestPermissions(android.app.PendingIntent p0) {}
    public void onSessionError(android.os.ParcelableException p0) {}
    public void onSessionOpened(android.app.permissionui.LocationButtonSessionResponse p0) {}
}
