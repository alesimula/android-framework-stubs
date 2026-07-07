package android.app.motioncues;

@android.annotation.SystemApi
public abstract class MotionCuesService extends android.app.Service {
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_API_CALLBACK = "android.app.motioncues.extra.API_CALLBACK";
    public static final java.lang.String SERVICE_INTERFACE = "android.app.motioncues.MotionCuesService";
    private static final java.lang.String TAG = "MotionCuesService";
    private final android.os.IBinder mBinder = null;
    private android.app.motioncues.IMotionCuesCallback mCallback;
    private final android.os.IBinder.DeathRecipient mDeathRecipient = null;
    public MotionCuesService() { super(); }
    private void onCallbackDied() {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    @android.annotation.SystemApi
    public abstract void onClientConnected();
    @android.annotation.SystemApi
    public abstract void onClientDisconnected();
    public final boolean onUnbind(android.content.Intent p0) { return false; }
    @android.annotation.SystemApi
    public final void updateBubblePixelPos(float p0, float p1) {}
    @android.annotation.SystemApi
    public final void updateMotionCuesVisualStyle(android.app.motioncues.MotionCuesVisualStyle p0) {}
}
