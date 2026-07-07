package android.media.tv.ad;

public final class TvAdManager {
    public static final java.lang.String ACTION_APP_LINK_COMMAND = "android.media.tv.ad.action.APP_LINK_COMMAND";
    public static final java.lang.String APP_LINK_KEY_BACK_URI = "back_uri";
    public static final java.lang.String APP_LINK_KEY_CLASS_NAME = "class_name";
    public static final java.lang.String APP_LINK_KEY_COMMAND_TYPE = "command_type";
    public static final java.lang.String APP_LINK_KEY_PACKAGE_NAME = "package_name";
    public static final java.lang.String APP_LINK_KEY_SERVICE_ID = "service_id";
    public static final int ERROR_BLOCKED = 5;
    public static final int ERROR_ENCRYPTED = 6;
    public static final int ERROR_NONE = 0;
    public static final int ERROR_NOT_SUPPORTED = 2;
    public static final int ERROR_RESOURCE_UNAVAILABLE = 4;
    public static final int ERROR_UNKNOWN = 1;
    public static final int ERROR_UNKNOWN_CHANNEL = 7;
    public static final int ERROR_WEAK_SIGNAL = 3;
    public static final java.lang.String INTENT_KEY_AD_SERVICE_ID = "ad_service_id";
    public static final java.lang.String INTENT_KEY_CHANNEL_URI = "channel_uri";
    public static final java.lang.String INTENT_KEY_COMMAND_TYPE = "command_type";
    public static final java.lang.String INTENT_KEY_TV_INPUT_ID = "tv_input_id";
    public static final java.lang.String SESSION_DATA_KEY_AD_BUFFER = "ad_buffer";
    public static final java.lang.String SESSION_DATA_KEY_AD_REQUEST = "ad_request";
    public static final java.lang.String SESSION_DATA_KEY_BROADCAST_INFO_REQUEST = "broadcast_info_request";
    public static final java.lang.String SESSION_DATA_KEY_REQUEST_ID = "request_id";
    public static final java.lang.String SESSION_DATA_TYPE_AD_BUFFER_READY = "ad_buffer_ready";
    public static final java.lang.String SESSION_DATA_TYPE_AD_REQUEST = "ad_request";
    public static final java.lang.String SESSION_DATA_TYPE_BROADCAST_INFO_REQUEST = "broadcast_info_request";
    public static final java.lang.String SESSION_DATA_TYPE_REMOVE_BROADCAST_INFO_REQUEST = "remove_broadcast_info_request";
    public static final int SESSION_STATE_ERROR = 3;
    public static final int SESSION_STATE_RUNNING = 2;
    public static final int SESSION_STATE_STOPPED = 1;
    private static final java.lang.String TAG = "TvAdManager";
    private final java.util.List<android.media.tv.ad.TvAdManager.TvAdServiceCallbackRecord> mCallbackRecords = null;
    private final android.media.tv.ad.ITvAdClient mClient = null;
    private final java.lang.Object mLock = null;
    private int mNextSeq;
    private final android.media.tv.ad.ITvAdManager mService = null;
    private final android.util.SparseArray<android.media.tv.ad.TvAdManager.SessionCallbackRecord> mSessionCallbackRecordMap = null;
    private final int mUserId = 0;
    public TvAdManager(android.media.tv.ad.ITvAdManager p0, int p1) {}
    private void createSessionInternal(java.lang.String p0, java.lang.String p1, android.media.tv.ad.TvAdManager.SessionCallback p2, android.os.Handler p3) {}
    public void createSession(java.lang.String p0, java.lang.String p1, android.media.tv.ad.TvAdManager.SessionCallback p2, android.os.Handler p3) {}
    public java.util.List<android.media.tv.ad.TvAdServiceInfo> getTvAdServiceList() { return null; }
    public void registerCallback(java.util.concurrent.Executor p0, android.media.tv.ad.TvAdManager.TvAdServiceCallback p1) {}
    public void sendAppLinkCommand(java.lang.String p0, android.os.Bundle p1) {}
    public void unregisterCallback(android.media.tv.ad.TvAdManager.TvAdServiceCallback p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ErrorCode {
    }

    public static final class Session {
        static final int DISPATCH_HANDLED = 1;
        static final int DISPATCH_IN_PROGRESS = -1;
        static final int DISPATCH_NOT_HANDLED = 0;
        private static final long INPUT_SESSION_NOT_RESPONDING_TIMEOUT = 2500L;
        private final android.media.tv.ad.TvAdManager.Session.InputEventHandler mHandler = null;
        private android.view.InputChannel mInputChannel;
        private android.media.tv.TvInputManager.Session mInputSession;
        private final android.util.Pools.Pool<android.media.tv.ad.TvAdManager.Session.PendingEvent> mPendingEventPool = null;
        private final android.util.SparseArray<android.media.tv.ad.TvAdManager.Session.PendingEvent> mPendingEvents = null;
        private android.media.tv.ad.TvAdManager.Session.TvInputEventSender mSender;
        private final int mSeq = 0;
        private final android.media.tv.ad.ITvAdManager mService = null;
        private final android.util.SparseArray<android.media.tv.ad.TvAdManager.SessionCallbackRecord> mSessionCallbackRecordMap = null;
        private android.os.IBinder mToken;
        private final int mUserId = 0;
        private Session(android.os.IBinder p0, android.view.InputChannel p1, android.media.tv.ad.ITvAdManager p2, int p3, int p4, android.util.SparseArray<android.media.tv.ad.TvAdManager.SessionCallbackRecord> p5) {}
        private void flushPendingEventsLocked() {}
        private android.media.tv.ad.TvAdManager.Session.PendingEvent obtainPendingEventLocked(android.view.InputEvent p0, java.lang.Object p1, android.media.tv.ad.TvAdManager.Session.FinishedInputEventCallback p2, android.os.Handler p3) { return null; }
        private void recyclePendingEventLocked(android.media.tv.ad.TvAdManager.Session.PendingEvent p0) {}
        private void releaseInternal() {}
        private void sendInputEventAndReportResultOnMainLooper(android.media.tv.ad.TvAdManager.Session.PendingEvent p0) {}
        private int sendInputEventOnMainLooperLocked(android.media.tv.ad.TvAdManager.Session.PendingEvent p0) { return 0; }
        void createMediaView(android.view.View p0, android.graphics.Rect p1) {}
        public int dispatchInputEvent(android.view.InputEvent p0, java.lang.Object p1, android.media.tv.ad.TvAdManager.Session.FinishedInputEventCallback p2, android.os.Handler p3) { return 0; }
        public void dispatchSurfaceChanged(int p0, int p1, int p2) {}
        void finishedInputEvent(int p0, boolean p1, boolean p2) {}
        public android.media.tv.TvInputManager.Session getInputSession() { return null; }
        void invokeFinishedInputEventCallback(android.media.tv.ad.TvAdManager.Session.PendingEvent p0, boolean p1) {}
        void notifyError(java.lang.String p0, android.os.Bundle p1) {}
        public void notifyTvInputSessionData(java.lang.String p0, android.os.Bundle p1) {}
        public void notifyTvMessage(int p0, android.os.Bundle p1) {}
        void relayoutMediaView(android.graphics.Rect p0) {}
        public void release() {}
        void removeMediaView() {}
        void resetAdService() {}
        void sendCurrentChannelUri(android.net.Uri p0) {}
        void sendCurrentTvInputId(java.lang.String p0) {}
        void sendCurrentVideoBounds(android.graphics.Rect p0) {}
        void sendSigningResult(java.lang.String p0, byte[] p1) {}
        void sendTrackInfoList(java.util.List<android.media.tv.TvTrackInfo> p0) {}
        public void setInputSession(android.media.tv.TvInputManager.Session p0) {}
        public void setSurface(android.view.Surface p0) {}
        void startAdService() {}
        void stopAdService() {}

        public static interface FinishedInputEventCallback {
            public void onFinishedInputEvent(java.lang.Object p0, boolean p1);
        }

        private final class InputEventHandler extends android.os.Handler {
            public static final int MSG_FLUSH_INPUT_EVENT = 3;
            public static final int MSG_SEND_INPUT_EVENT = 1;
            public static final int MSG_TIMEOUT_INPUT_EVENT = 2;
            InputEventHandler(android.media.tv.ad.TvAdManager.Session p0, android.os.Looper p1) { super(); }
            public void handleMessage(android.os.Message p0) {}
        }

        private final class PendingEvent implements java.lang.Runnable {
            public android.media.tv.ad.TvAdManager.Session.FinishedInputEventCallback mCallback;
            public android.view.InputEvent mEvent;
            public android.os.Handler mEventHandler;
            public java.lang.Object mEventToken;
            public boolean mHandled;
            private PendingEvent(android.media.tv.ad.TvAdManager.Session p0) {}
            public void recycle() {}
            public void run() {}
        }

        private final class TvInputEventSender extends android.view.InputEventSender {
            TvInputEventSender(android.media.tv.ad.TvAdManager.Session p0, android.view.InputChannel p1, android.os.Looper p2) { super(null, null); }
            public void onInputEventFinished(int p0, boolean p1) {}
        }
    }

    public static abstract class SessionCallback {
        public SessionCallback() {}
        public void onLayoutSurface(android.media.tv.ad.TvAdManager.Session p0, int p1, int p2, int p3, int p4) {}
        public void onRequestCurrentChannelUri(android.media.tv.ad.TvAdManager.Session p0) {}
        public void onRequestCurrentTvInputId(android.media.tv.ad.TvAdManager.Session p0) {}
        public void onRequestCurrentVideoBounds(android.media.tv.ad.TvAdManager.Session p0) {}
        public void onRequestSigning(android.media.tv.ad.TvAdManager.Session p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, byte[] p4) {}
        public void onRequestTrackInfoList(android.media.tv.ad.TvAdManager.Session p0) {}
        public void onSessionCreated(android.media.tv.ad.TvAdManager.Session p0) {}
        public void onSessionReleased(android.media.tv.ad.TvAdManager.Session p0) {}
    }

    private static final class SessionCallbackRecord {
        private final android.os.Handler mHandler = null;
        private android.media.tv.ad.TvAdManager.Session mSession;
        private final android.media.tv.ad.TvAdManager.SessionCallback mSessionCallback = null;
        SessionCallbackRecord(android.media.tv.ad.TvAdManager.SessionCallback p0, android.os.Handler p1) {}
        void postLayoutSurface(int p0, int p1, int p2, int p3) {}
        void postRequestCurrentChannelUri() {}
        void postRequestCurrentTvInputId() {}
        void postRequestCurrentVideoBounds() {}
        void postRequestSigning(java.lang.String p0, java.lang.String p1, java.lang.String p2, byte[] p3) {}
        void postRequestTrackInfoList() {}
        void postSessionCreated(android.media.tv.ad.TvAdManager.Session p0) {}
        void postSessionReleased() {}
        void postTvAdSessionData(java.lang.String p0, android.os.Bundle p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SessionDataKey {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SessionDataType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SessionState {
    }

    public static abstract class TvAdServiceCallback {
        public TvAdServiceCallback() {}
        public void onAdServiceAdded(java.lang.String p0) {}
        public void onAdServiceRemoved(java.lang.String p0) {}
        public void onAdServiceUpdated(java.lang.String p0) {}
    }

    private static final class TvAdServiceCallbackRecord {
        private final android.media.tv.ad.TvAdManager.TvAdServiceCallback mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        TvAdServiceCallbackRecord(android.media.tv.ad.TvAdManager.TvAdServiceCallback p0, java.util.concurrent.Executor p1) {}
        public android.media.tv.ad.TvAdManager.TvAdServiceCallback getCallback() { return null; }
        public void postAdServiceAdded(java.lang.String p0) {}
        public void postAdServiceRemoved(java.lang.String p0) {}
        public void postAdServiceUpdated(java.lang.String p0) {}
    }
}
