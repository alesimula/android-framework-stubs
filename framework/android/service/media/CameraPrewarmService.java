package android.service.media;

public abstract class CameraPrewarmService extends android.app.Service {
    public static final java.lang.String ACTION_PREWARM = "android.service.media.CameraPrewarmService.ACTION_PREWARM";
    public static final int MSG_CAMERA_FIRED = 1;
    private boolean mCameraIntentFired;
    private final android.os.Handler mHandler = null;
    public CameraPrewarmService() { super(); }
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onCooldown(boolean p0);
    public abstract void onPrewarm();
    public boolean onUnbind(android.content.Intent p0) { return false; }
}
