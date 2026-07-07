package android.service.chooser;

public final class TapToShareClient {
    private static final java.lang.String TAG = null;
    private final android.service.chooser.ITapToShareCallback mCallback = null;
    private final android.content.ServiceConnection mConnection = null;
    private final android.content.Context mContext = null;
    private java.util.concurrent.Executor mExecutor;
    private final java.lang.Object mLock = null;
    private android.service.chooser.ITapToShareService mService;
    private android.service.chooser.TapToShareClient.SessionListener mSessionListener;
    public TapToShareClient(android.content.Context p0) {}
    private void reportConnectionFailed(java.lang.Exception p0) {}
    public void endSession() {}
    public void startSession(android.content.ComponentName p0, android.net.Uri p1, java.util.concurrent.Executor p2, android.service.chooser.TapToShareClient.SessionListener p3) {}

    public static interface SessionListener {
        public void onConnectionFailed(java.lang.Exception p0);
        public void onDeviceTapped();
    }
}
