package android.media.tv.ad;

public abstract class TvAdService extends android.app.Service {
    private static final boolean DEBUG = false;
    private static final int DETACH_MEDIA_VIEW_TIMEOUT_MS = 5000;
    public static final java.lang.String SERVICE_INTERFACE = "android.media.tv.ad.TvAdService";
    public static final java.lang.String SERVICE_META_DATA = "android.media.tv.ad.service";
    private static final java.lang.String TAG = "TvAdService";
    private final android.os.RemoteCallbackList<android.media.tv.ad.ITvAdServiceCallback> mCallbacks = null;
    private final android.os.Handler mServiceHandler = null;
    public TvAdService() { super(); }
    public void onAppLinkCommand(android.os.Bundle p0) {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract android.media.tv.ad.TvAdService.Session onCreateSession(java.lang.String p0, java.lang.String p1);

    private static final class MediaViewCleanUpTask extends android.os.AsyncTask<android.view.View, java.lang.Void, java.lang.Void> {
        private MediaViewCleanUpTask() { super(); }
        protected java.lang.Void doInBackground(android.view.View... p0) { return null; }
    }

    private final class ServiceHandler extends android.os.Handler {
        private static final int DO_CREATE_SESSION = 1;
        private static final int DO_NOTIFY_SESSION_CREATED = 2;
        private ServiceHandler(android.media.tv.ad.TvAdService p0) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    public static abstract class Session implements android.view.KeyEvent.Callback {
        private final android.content.Context mContext = null;
        private final android.view.KeyEvent.DispatcherState mDispatcherState = null;
        final android.os.Handler mHandler = null;
        private final java.lang.Object mLock = null;
        private android.graphics.Rect mMediaFrame;
        private android.view.View mMediaView;
        private android.media.tv.ad.TvAdService.MediaViewCleanUpTask mMediaViewCleanUpTask;
        private android.widget.FrameLayout mMediaViewContainer;
        private boolean mMediaViewEnabled;
        private final java.util.List<java.lang.Runnable> mPendingActions = null;
        private android.media.tv.ad.ITvAdSessionCallback mSessionCallback;
        private android.view.Surface mSurface;
        private final android.view.WindowManager mWindowManager = null;
        private android.view.WindowManager.LayoutParams mWindowParams;
        private android.os.IBinder mWindowToken;
        public Session(android.content.Context p0) {}
        private void executeOrPostRunnableOnMainThread(java.lang.Runnable p0) {}
        private void initialize(android.media.tv.ad.ITvAdSessionCallback p0) {}
        void createMediaView(android.os.IBinder p0, android.graphics.Rect p1) {}
        int dispatchInputEvent(android.view.InputEvent p0, android.view.InputEventReceiver p1) { return 0; }
        void dispatchSurfaceChanged(int p0, int p1, int p2) {}
        public boolean isMediaViewEnabled() { return false; }
        public void layoutSurface(int p0, int p1, int p2, int p3) {}
        void notifyError(java.lang.String p0, android.os.Bundle p1) {}
        public void notifySessionStateChanged(int p0, int p1) {}
        void notifyTvInputSessionData(java.lang.String p0, android.os.Bundle p1) {}
        void notifyTvMessage(int p0, android.os.Bundle p1) {}
        public android.view.View onCreateMediaView() { return null; }
        public void onCurrentChannelUri(android.net.Uri p0) {}
        public void onCurrentTvInputId(java.lang.String p0) {}
        public void onCurrentVideoBounds(android.graphics.Rect p0) {}
        public void onError(java.lang.String p0, android.os.Bundle p1) {}
        public boolean onGenericMotionEvent(android.view.MotionEvent p0) { return false; }
        public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
        public boolean onKeyLongPress(int p0, android.view.KeyEvent p1) { return false; }
        public boolean onKeyMultiple(int p0, int p1, android.view.KeyEvent p2) { return false; }
        public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
        public void onMediaViewSizeChanged(int p0, int p1) {}
        public abstract void onRelease();
        public void onResetAdService() {}
        public abstract boolean onSetSurface(android.view.Surface p0);
        public void onSigningResult(java.lang.String p0, byte[] p1) {}
        public void onStartAdService() {}
        public void onStopAdService() {}
        public void onSurfaceChanged(int p0, int p1, int p2) {}
        public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
        public void onTrackInfoList(java.util.List<android.media.tv.TvTrackInfo> p0) {}
        public boolean onTrackballEvent(android.view.MotionEvent p0) { return false; }
        public void onTvInputSessionData(java.lang.String p0, android.os.Bundle p1) {}
        public void onTvMessage(int p0, android.os.Bundle p1) {}
        void relayoutMediaView(android.graphics.Rect p0) {}
        void release() {}
        void removeMediaView(boolean p0) {}
        public void requestCurrentChannelUri() {}
        public void requestCurrentTvInputId() {}
        public void requestCurrentVideoBounds() {}
        public void requestSigning(java.lang.String p0, java.lang.String p1, java.lang.String p2, byte[] p3) {}
        public void requestTrackInfoList() {}
        void resetAdService() {}
        void scheduleMediaViewCleanup() {}
        void sendCurrentChannelUri(android.net.Uri p0) {}
        void sendCurrentTvInputId(java.lang.String p0) {}
        void sendCurrentVideoBounds(android.graphics.Rect p0) {}
        void sendSigningResult(java.lang.String p0, byte[] p1) {}
        void sendTrackInfoList(java.util.List<android.media.tv.TvTrackInfo> p0) {}
        public void sendTvAdSessionData(java.lang.String p0, android.os.Bundle p1) {}
        public void setMediaViewEnabled(boolean p0) {}
        void setSurface(android.view.Surface p0) {}
        void startAdService() {}
        void stopAdService() {}
    }
}
