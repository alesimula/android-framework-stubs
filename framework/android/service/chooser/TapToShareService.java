package android.service.chooser;

@android.annotation.SystemApi
public abstract class TapToShareService extends android.app.Service {
    private static final java.lang.String TAG = null;
    public static final java.lang.String TAP_TO_SHARE_SERVICE_INTERFACE = "android.service.chooser.TapToShareService";
    private android.service.chooser.ITapToShareCallback mActiveCallback;
    private final android.service.chooser.ITapToShareService.Stub mBinder = null;
    private final android.os.IBinder.DeathRecipient mDeathRecipient = null;
    private final android.os.Handler mHandler = null;
    private boolean mIsSessionStarted;
    public TapToShareService() { super(); }
    private void handleClearActiveCallback(android.service.chooser.ITapToShareCallback p0) {}
    private void handleClientDied(android.os.IBinder p0) {}
    private void handlePerformTapToShare() {}
    private void handleSetActiveCallback(android.service.chooser.ITapToShareCallback p0) {}
    private void handleUnbind() {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onSessionEnd();
    public abstract void onSessionStart();
    public final boolean onUnbind(android.content.Intent p0) { return false; }
    public final void performTapToShare() {}
}
