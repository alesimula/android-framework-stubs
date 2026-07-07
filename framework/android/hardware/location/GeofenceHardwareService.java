package android.hardware.location;

public class GeofenceHardwareService extends android.app.Service {
    private android.os.IBinder mBinder;
    private android.content.Context mContext;
    private android.hardware.location.GeofenceHardwareImpl mGeofenceHardwareImpl;
    public GeofenceHardwareService() { super(); }
    private void checkPermission(int p0, int p1, int p2) {}
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onCreate() {}
    public void onDestroy() {}
    public boolean onUnbind(android.content.Intent p0) { return false; }
}
