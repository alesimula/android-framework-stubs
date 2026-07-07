package android.media.tv.interactive;

public final class TvInteractiveAppManager {
    public static final java.lang.String ACTION_APP_LINK_COMMAND = "android.media.tv.interactive.action.APP_LINK_COMMAND";
    public static final java.lang.String APP_LINK_KEY_BACK_URI = "back_uri";
    public static final java.lang.String APP_LINK_KEY_CLASS_NAME = "class_name";
    public static final java.lang.String APP_LINK_KEY_COMMAND_TYPE = "command_type";
    public static final java.lang.String APP_LINK_KEY_PACKAGE_NAME = "package_name";
    public static final java.lang.String APP_LINK_KEY_SERVICE_ID = "service_id";
    public static final int ERROR_BLOCKED = 5;
    public static final int ERROR_ENCRYPTED = 6;
    public static final int ERROR_FORBIDDEN_BY_TERMINAL = 9;
    public static final int ERROR_FORBIDDEN_BY_USER = 10;
    public static final int ERROR_INTERACTIVE_APP_NOT_FOUND = 8;
    public static final int ERROR_INTERNAL_SERVER_ERROR = 11;
    public static final int ERROR_NONE = 0;
    public static final int ERROR_NOT_SUPPORTED = 2;
    public static final int ERROR_RESOURCE_UNAVAILABLE = 4;
    public static final int ERROR_SERVICE_UNAVAILABLE = 12;
    public static final int ERROR_UNKNOWN = 1;
    public static final int ERROR_UNKNOWN_CHANNEL = 7;
    public static final int ERROR_WEAK_SIGNAL = 3;
    public static final java.lang.String INTENT_KEY_BI_INTERACTIVE_APP_TYPE = "bi_interactive_app_type";
    public static final java.lang.String INTENT_KEY_BI_INTERACTIVE_APP_URI = "bi_interactive_app_uri";
    public static final java.lang.String INTENT_KEY_CHANNEL_URI = "channel_uri";
    public static final java.lang.String INTENT_KEY_COMMAND_TYPE = "command_type";
    public static final java.lang.String INTENT_KEY_INTERACTIVE_APP_SERVICE_ID = "interactive_app_id";
    public static final java.lang.String INTENT_KEY_TV_INPUT_ID = "tv_input_id";
    public static final int INTERACTIVE_APP_STATE_ERROR = 3;
    public static final int INTERACTIVE_APP_STATE_RUNNING = 2;
    public static final int INTERACTIVE_APP_STATE_STOPPED = 1;
    public static final int PIN_VERIFICATION_RESULT_CORRECT = 0;
    public static final int PIN_VERIFICATION_RESULT_INCORRECT = 1;
    public static final int PIN_VERIFICATION_RESULT_LOCKED = 2;
    public static final int SERVICE_STATE_ERROR = 4;
    public static final int SERVICE_STATE_PREPARING = 2;
    public static final int SERVICE_STATE_READY = 3;
    public static final int SERVICE_STATE_UNREALIZED = 1;
    public static final int STREAMING_PLAYBACK_STATUS_ERROR = 4;
    public static final int STREAMING_PLAYBACK_STATUS_PAUSED = 2;
    public static final int STREAMING_PLAYBACK_STATUS_PLAYING = 1;
    public static final int STREAMING_PLAYBACK_STATUS_READY = 5;
    public static final int STREAMING_PLAYBACK_STATUS_STOPPED = 3;
    private static final java.lang.String TAG = "TvInteractiveAppManager";
    public static final int TELETEXT_APP_STATE_ERROR = 3;
    public static final int TELETEXT_APP_STATE_HIDE = 2;
    public static final int TELETEXT_APP_STATE_SHOW = 1;
    private final java.util.List<android.media.tv.interactive.TvInteractiveAppManager.TvInteractiveAppCallbackRecord> mCallbackRecords = null;
    private final android.media.tv.interactive.ITvInteractiveAppClient mClient = null;
    private final java.lang.Object mLock = null;
    private int mNextSeq;
    private final android.media.tv.interactive.ITvInteractiveAppManager mService = null;
    private final android.util.SparseArray<android.media.tv.interactive.TvInteractiveAppManager.SessionCallbackRecord> mSessionCallbackRecordMap = null;
    private final int mUserId = 0;
    public TvInteractiveAppManager(android.media.tv.interactive.ITvInteractiveAppManager p0, int p1) {}
    private void createSessionInternal(java.lang.String p0, int p1, int p2, android.media.tv.interactive.TvInteractiveAppManager.SessionCallback p3, android.os.Handler p4) {}
    public void cancelOngoingOperatorAppPackageOperation(java.lang.String p0, android.media.tv.interactive.OperatorAppServiceInfo p1) {}
    public void createSession(java.lang.String p0, int p1, int p2, android.media.tv.interactive.TvInteractiveAppManager.SessionCallback p3, android.os.Handler p4) {}
    public java.util.List<android.media.tv.interactive.AppLinkInfo> getAppLinkInfoList() { return null; }
    public java.util.List<android.media.tv.interactive.TvInteractiveAppServiceInfo> getTvInteractiveAppServiceList() { return null; }
    public void installOperatorApp(java.lang.String p0, android.media.tv.interactive.OperatorAppServiceInfo p1) {}
    public void registerAppLinkInfo(java.lang.String p0, android.media.tv.interactive.AppLinkInfo p1) {}
    public void registerCallback(java.util.concurrent.Executor p0, android.media.tv.interactive.TvInteractiveAppManager.TvInteractiveAppCallback p1) {}
    public void requestOperatorAppPackageStatus(java.lang.String p0, android.media.tv.interactive.OperatorAppServiceInfo p1) {}
    public void searchOperatorApp(java.lang.String p0, android.media.tv.interactive.OperatorAppServiceInfo p1, int p2, android.os.Bundle p3) {}
    public void sendAppLinkCommand(java.lang.String p0, android.os.Bundle p1) {}
    public void uninstallOperatorApp(java.lang.String p0, android.media.tv.interactive.OperatorAppServiceInfo p1, int p2, java.lang.String p3) {}
    public void unregisterAppLinkInfo(java.lang.String p0, android.media.tv.interactive.AppLinkInfo p1) {}
    public void unregisterCallback(android.media.tv.interactive.TvInteractiveAppManager.TvInteractiveAppCallback p0) {}
    public void updateOperatorApp(java.lang.String p0, android.media.tv.interactive.OperatorAppServiceInfo p1, int p2, android.os.Bundle p3) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ErrorCode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InteractiveAppState {
    }

    public static abstract class OperatorAppCallback extends android.media.tv.interactive.TvInteractiveAppManager.TvInteractiveAppCallback {
        public OperatorAppCallback() { super(); }
        public void onOperatorAppPackageStatus(java.lang.String p0, android.media.tv.interactive.OperatorAppServiceInfo p1, int p2, android.os.Bundle p3) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PinVerificationResult {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ServiceState {
    }

    public static final class Session {
        static final int DISPATCH_HANDLED = 1;
        static final int DISPATCH_IN_PROGRESS = -1;
        static final int DISPATCH_NOT_HANDLED = 0;
        private static final long INPUT_SESSION_NOT_RESPONDING_TIMEOUT = 2500L;
        private final android.media.tv.interactive.TvInteractiveAppManager.Session.InputEventHandler mHandler = null;
        private android.view.InputChannel mInputChannel;
        private android.media.tv.TvInputManager.Session mInputSession;
        private final java.util.List<android.media.tv.TvTrackInfo> mInteractiveAppStreamingAudioTracks = null;
        private final java.util.List<android.media.tv.TvTrackInfo> mInteractiveAppStreamingSubtitleTracks = null;
        private final java.util.List<android.media.tv.TvTrackInfo> mInteractiveAppStreamingVideoTracks = null;
        private final java.lang.Object mMetadataLock = null;
        private final android.util.Pools.Pool<android.media.tv.interactive.TvInteractiveAppManager.Session.PendingEvent> mPendingEventPool = null;
        private final android.util.SparseArray<android.media.tv.interactive.TvInteractiveAppManager.Session.PendingEvent> mPendingEvents = null;
        private java.lang.String mSelectedInteractiveAppStreamingAudioTrackId;
        private java.lang.String mSelectedInteractiveAppStreamingSubtitleTrackId;
        private java.lang.String mSelectedInteractiveAppStreamingVideoTrackId;
        private android.media.tv.interactive.TvInteractiveAppManager.Session.TvInputEventSender mSender;
        private final int mSeq = 0;
        private final android.media.tv.interactive.ITvInteractiveAppManager mService = null;
        private final android.util.SparseArray<android.media.tv.interactive.TvInteractiveAppManager.SessionCallbackRecord> mSessionCallbackRecordMap = null;
        private android.os.IBinder mToken;
        private final int mUserId = 0;
        private Session(android.os.IBinder p0, android.view.InputChannel p1, android.media.tv.interactive.ITvInteractiveAppManager p2, int p3, int p4, android.util.SparseArray<android.media.tv.interactive.TvInteractiveAppManager.SessionCallbackRecord> p5) {}
        private void clearMetadataLocked() {}
        private boolean containsTrack(java.util.List<android.media.tv.TvTrackInfo> p0, java.lang.String p1) { return false; }
        private void flushPendingEventsLocked() {}
        private android.media.tv.interactive.TvInteractiveAppManager.Session.PendingEvent obtainPendingEventLocked(android.view.InputEvent p0, java.lang.Object p1, android.media.tv.interactive.TvInteractiveAppManager.Session.FinishedInputEventCallback p2, android.os.Handler p3) { return null; }
        private void recyclePendingEventLocked(android.media.tv.interactive.TvInteractiveAppManager.Session.PendingEvent p0) {}
        private void releaseInternal() {}
        private void sendInputEventAndReportResultOnMainLooper(android.media.tv.interactive.TvInteractiveAppManager.Session.PendingEvent p0) {}
        private int sendInputEventOnMainLooperLocked(android.media.tv.interactive.TvInteractiveAppManager.Session.PendingEvent p0) { return 0; }
        void createBiInteractiveApp(android.net.Uri p0, android.os.Bundle p1) {}
        void createMediaView(android.view.View p0, android.graphics.Rect p1) {}
        void destroyBiInteractiveApp(java.lang.String p0) {}
        public int dispatchInputEvent(android.view.InputEvent p0, java.lang.Object p1, android.media.tv.interactive.TvInteractiveAppManager.Session.FinishedInputEventCallback p2, android.os.Handler p3) { return 0; }
        public void dispatchSurfaceChanged(int p0, int p1, int p2) {}
        void finishedInputEvent(int p0, boolean p1, boolean p2) {}
        public android.media.tv.TvInputManager.Session getInputSession() { return null; }
        public java.util.List<android.media.tv.TvTrackInfo> getInteractiveAppStreamingTracks(int p0) { return null; }
        public java.lang.String getSelectedInteractiveAppStreamingTrack(int p0) { return null; }
        void invokeFinishedInputEventCallback(android.media.tv.interactive.TvInteractiveAppManager.Session.PendingEvent p0, boolean p1) {}
        public void notifyAdBufferConsumed(android.media.tv.AdBuffer p0) {}
        public void notifyAdResponse(android.media.tv.AdResponse p0) {}
        public void notifyBroadcastInfoResponse(android.media.tv.BroadcastInfoResponse p0) {}
        public void notifyContentAllowed() {}
        public void notifyContentBlocked(android.media.tv.TvContentRating p0) {}
        void notifyError(java.lang.String p0, android.os.Bundle p1) {}
        public void notifyInteractiveAppFocusChanged(boolean p0) {}
        void notifyRecordingConnectionFailed(java.lang.String p0, java.lang.String p1) {}
        void notifyRecordingDisconnected(java.lang.String p0, java.lang.String p1) {}
        void notifyRecordingError(java.lang.String p0, int p1) {}
        void notifyRecordingScheduled(java.lang.String p0, java.lang.String p1) {}
        void notifyRecordingStarted(java.lang.String p0, java.lang.String p1) {}
        void notifyRecordingStopped(java.lang.String p0) {}
        void notifyRecordingTuned(java.lang.String p0, android.net.Uri p1) {}
        public void notifySignalStrength(int p0) {}
        void notifyTimeShiftCurrentPositionChanged(java.lang.String p0, long p1) {}
        void notifyTimeShiftPlaybackParams(android.media.PlaybackParams p0) {}
        void notifyTimeShiftStartPositionChanged(java.lang.String p0, long p1) {}
        void notifyTimeShiftStatusChanged(java.lang.String p0, int p1) {}
        public void notifyTrackSelected(int p0, java.lang.String p1) {}
        public void notifyTracksChanged(java.util.List<android.media.tv.TvTrackInfo> p0) {}
        public void notifyTuned(android.net.Uri p0) {}
        public void notifyTvMessage(int p0, android.os.Bundle p1) {}
        public void notifyVideoAvailable() {}
        public void notifyVideoFreezeUpdated(boolean p0) {}
        public void notifyVideoUnavailable(int p0) {}
        void relayoutMediaView(android.graphics.Rect p0) {}
        public void release() {}
        void removeMediaView() {}
        public void removeWebServiceClient(int p0) {}
        public void requestOperatorAppSupportedStatus() {}
        public void requestWebServiceClients() {}
        void resetInteractiveApp() {}
        public void selectInteractiveAppStreamingTrack(int p0, java.lang.String p1) {}
        void sendAvailableSpeeds(float[] p0) {}
        void sendCertificate(java.lang.String p0, int p1, android.net.http.SslCertificate p2) {}
        void sendCurrentChannelLcn(int p0) {}
        void sendCurrentChannelUri(android.net.Uri p0) {}
        void sendCurrentTvInputId(java.lang.String p0) {}
        void sendCurrentVideoBounds(android.graphics.Rect p0) {}
        void sendParentalControlApprovalResult(int p0, boolean p1) {}
        void sendParentalControlPinLength(int p0) {}
        void sendSelectedTrackInfo(java.util.List<android.media.tv.TvTrackInfo> p0) {}
        void sendSetParentalControlPinResult(int p0) {}
        void sendSigningResult(java.lang.String p0, byte[] p1) {}
        void sendStreamVolume(float p0) {}
        void sendTimeShiftMode(int p0) {}
        void sendTrackInfoList(java.util.List<android.media.tv.TvTrackInfo> p0) {}
        void sendTvRecordingInfo(android.media.tv.TvRecordingInfo p0) {}
        void sendTvRecordingInfoList(java.util.List<android.media.tv.TvRecordingInfo> p0) {}
        void sendVerifyParentalControlPinResult(int p0, int p1) {}
        public void setInputSession(android.media.tv.TvInputManager.Session p0) {}
        public void setSurface(android.view.Surface p0) {}
        void setTeletextAppEnabled(boolean p0) {}
        void startInteractiveApp() {}
        void startInteractiveApp(int p0) {}
        public void startOperatorApp(android.media.tv.interactive.OperatorAppServiceInfo p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3) {}
        void stopInteractiveApp() {}
        void stopInteractiveApp(int p0) {}
        public void stopOperatorApp(android.media.tv.interactive.OperatorAppServiceInfo p0) {}
        public void switchOperatorAppState(android.media.tv.interactive.OperatorAppServiceInfo p0, int p1) {}
        boolean updateInteractiveAppStreamingTrackSelection(int p0, java.lang.String p1) { return false; }
        boolean updateInteractiveAppStreamingTracks(java.util.List<android.media.tv.TvTrackInfo> p0) { return false; }
        public void updateWebServiceClientState(int p0, int p1) {}

        public static interface FinishedInputEventCallback {
            public void onFinishedInputEvent(java.lang.Object p0, boolean p1);
        }

        private final class InputEventHandler extends android.os.Handler {
            public static final int MSG_FLUSH_INPUT_EVENT = 3;
            public static final int MSG_SEND_INPUT_EVENT = 1;
            public static final int MSG_TIMEOUT_INPUT_EVENT = 2;
            InputEventHandler(android.media.tv.interactive.TvInteractiveAppManager.Session p0, android.os.Looper p1) { super(); }
            public void handleMessage(android.os.Message p0) {}
        }

        private final class PendingEvent implements java.lang.Runnable {
            public android.media.tv.interactive.TvInteractiveAppManager.Session.FinishedInputEventCallback mCallback;
            public android.view.InputEvent mEvent;
            public android.os.Handler mEventHandler;
            public java.lang.Object mEventToken;
            public boolean mHandled;
            private PendingEvent(android.media.tv.interactive.TvInteractiveAppManager.Session p0) {}
            public void recycle() {}
            public void run() {}
        }

        private final class TvInputEventSender extends android.view.InputEventSender {
            TvInputEventSender(android.media.tv.interactive.TvInteractiveAppManager.Session p0, android.view.InputChannel p1, android.os.Looper p2) { super(null, null); }
            public void onInputEventFinished(int p0, boolean p1) {}
        }
    }

    public static abstract class SessionCallback {
        public SessionCallback() {}
        public void onBiInteractiveAppCreated(android.media.tv.interactive.TvInteractiveAppManager.Session p0, android.net.Uri p1, java.lang.String p2) {}
        public void onCancelParentalControlApproval(android.media.tv.interactive.TvInteractiveAppManager.Session p0) {}
        public void onCommandRequest(android.media.tv.interactive.TvInteractiveAppManager.Session p0, java.lang.String p1, android.os.Bundle p2) {}
        public void onInteractiveAppInfoChanged(android.media.tv.interactive.TvInteractiveAppManager.Session p0, android.media.tv.interactive.TvInteractiveAppInfo p1) {}
        public void onInteractiveAppStreamingTrackSelected(android.media.tv.interactive.TvInteractiveAppManager.Session p0, int p1, java.lang.String p2) {}
        public void onInteractiveAppStreamingTracksChanged(android.media.tv.interactive.TvInteractiveAppManager.Session p0, java.util.List<android.media.tv.TvTrackInfo> p1) {}
        public void onKeySetChanged(android.media.tv.interactive.TvInteractiveAppManager.Session p0, int p1, int[] p2) {}
        public void onLayoutSurface(android.media.tv.interactive.TvInteractiveAppManager.Session p0, int p1, int p2, int p3, int p4) {}
        public void onOperatorAppStateChanged(android.media.tv.interactive.TvInteractiveAppManager.Session p0, android.media.tv.interactive.OperatorAppServiceInfo p1, int p2) {}
        public void onOperatorAppStatusChanged(android.media.tv.interactive.TvInteractiveAppManager.Session p0, android.media.tv.interactive.OperatorAppServiceInfo p1, int p2, android.os.Bundle p3) {}
        public void onOperatorAppSupportedStatus(android.media.tv.interactive.TvInteractiveAppManager.Session p0, boolean p1) {}
        public void onOperatorAppUpdateRequest(android.media.tv.interactive.TvInteractiveAppManager.Session p0, android.media.tv.interactive.OperatorAppServiceInfo p1, boolean p2) {}
        public void onParentalControlPinLengthRequest(android.media.tv.interactive.TvInteractiveAppManager.Session p0) {}
        public void onReplaceUiElements(android.media.tv.interactive.TvInteractiveAppManager.Session p0, int[] p1) {}
        public void onRequestAvailableSpeeds(android.media.tv.interactive.TvInteractiveAppManager.Session p0) {}
        public void onRequestCertificate(android.media.tv.interactive.TvInteractiveAppManager.Session p0, java.lang.String p1, int p2) {}
        public void onRequestCurrentChannelLcn(android.media.tv.interactive.TvInteractiveAppManager.Session p0) {}
        public void onRequestCurrentChannelUri(android.media.tv.interactive.TvInteractiveAppManager.Session p0) {}
        public void onRequestCurrentTvInputId(android.media.tv.interactive.TvInteractiveAppManager.Session p0) {}
        public void onRequestCurrentVideoBounds(android.media.tv.interactive.TvInteractiveAppManager.Session p0) {}
        public void onRequestParentalControlApproval(android.media.tv.interactive.TvInteractiveAppManager.Session p0, int p1, boolean p2, android.os.Bundle p3) {}
        public void onRequestScheduleRecording(android.media.tv.interactive.TvInteractiveAppManager.Session p0, java.lang.String p1, java.lang.String p2, android.net.Uri p3, long p4, long p5, int p6, android.os.Bundle p7) {}
        public void onRequestScheduleRecording(android.media.tv.interactive.TvInteractiveAppManager.Session p0, java.lang.String p1, java.lang.String p2, android.net.Uri p3, android.net.Uri p4, android.os.Bundle p5) {}
        public void onRequestSelectedTrackInfo(android.media.tv.interactive.TvInteractiveAppManager.Session p0) {}
        public void onRequestSigning(android.media.tv.interactive.TvInteractiveAppManager.Session p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4, byte[] p5) {}
        public void onRequestSigning(android.media.tv.interactive.TvInteractiveAppManager.Session p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, byte[] p4) {}
        public void onRequestStartRecording(android.media.tv.interactive.TvInteractiveAppManager.Session p0, java.lang.String p1, android.net.Uri p2) {}
        public void onRequestStopRecording(android.media.tv.interactive.TvInteractiveAppManager.Session p0, java.lang.String p1) {}
        public void onRequestStreamVolume(android.media.tv.interactive.TvInteractiveAppManager.Session p0) {}
        public void onRequestTimeShiftMode(android.media.tv.interactive.TvInteractiveAppManager.Session p0) {}
        public void onRequestTrackInfoList(android.media.tv.interactive.TvInteractiveAppManager.Session p0) {}
        public void onRequestTvRecordingInfo(android.media.tv.interactive.TvInteractiveAppManager.Session p0, java.lang.String p1) {}
        public void onRequestTvRecordingInfoList(android.media.tv.interactive.TvInteractiveAppManager.Session p0, int p1) {}
        public void onSendWebServiceClientList(android.media.tv.interactive.TvInteractiveAppManager.Session p0, java.util.List<android.media.tv.interactive.WebServiceClientInfo> p1) {}
        public void onSessionCreated(android.media.tv.interactive.TvInteractiveAppManager.Session p0) {}
        public void onSessionReleased(android.media.tv.interactive.TvInteractiveAppManager.Session p0) {}
        public void onSessionStateChanged(android.media.tv.interactive.TvInteractiveAppManager.Session p0, int p1, int p2) {}
        public void onSetParentalControlPin(android.media.tv.interactive.TvInteractiveAppManager.Session p0, java.lang.String p1, java.lang.String p2) {}
        public void onSetTvRecordingInfo(android.media.tv.interactive.TvInteractiveAppManager.Session p0, java.lang.String p1, android.media.tv.TvRecordingInfo p2) {}
        public void onSetVideoBounds(android.media.tv.interactive.TvInteractiveAppManager.Session p0, android.graphics.Rect p1) {}
        public void onStreamingPlaybackStatusChanged(android.media.tv.interactive.TvInteractiveAppManager.Session p0, int p1) {}
        public void onTeletextAppStateChanged(android.media.tv.interactive.TvInteractiveAppManager.Session p0, int p1) {}
        public void onTimeShiftCommandRequest(android.media.tv.interactive.TvInteractiveAppManager.Session p0, java.lang.String p1, android.os.Bundle p2) {}
        public void onVerifyParentalControlPinRequest(android.media.tv.interactive.TvInteractiveAppManager.Session p0, int p1, java.lang.String p2) {}
    }

    private static final class SessionCallbackRecord {
        private final android.os.Handler mHandler = null;
        private android.media.tv.interactive.TvInteractiveAppManager.Session mSession;
        private final android.media.tv.interactive.TvInteractiveAppManager.SessionCallback mSessionCallback = null;
        SessionCallbackRecord(android.media.tv.interactive.TvInteractiveAppManager.SessionCallback p0, android.os.Handler p1) {}
        void postAdBufferReady(android.media.tv.AdBuffer p0) {}
        void postAdRequest(android.media.tv.AdRequest p0) {}
        void postBiInteractiveAppCreated(android.net.Uri p0, java.lang.String p1) {}
        void postBroadcastInfoRequest(android.media.tv.BroadcastInfoRequest p0) {}
        void postCancelParentalControlApproval() {}
        void postCommandRequest(java.lang.String p0, android.os.Bundle p1) {}
        void postInteractiveAppInfoChanged(android.media.tv.interactive.TvInteractiveAppInfo p0) {}
        void postInteractiveAppStreamingTrackSelected(int p0, java.lang.String p1) {}
        void postInteractiveAppStreamingTracksChanged(java.util.List<android.media.tv.TvTrackInfo> p0) {}
        void postKeySetChanged(int p0, int[] p1) {}
        void postLayoutSurface(int p0, int p1, int p2, int p3) {}
        void postOperatorAppStateChanged(android.media.tv.interactive.OperatorAppServiceInfo p0, int p1) {}
        void postOperatorAppStatusChanged(android.media.tv.interactive.OperatorAppServiceInfo p0, int p1, android.os.Bundle p2) {}
        void postOperatorAppSupportedStatus(boolean p0) {}
        void postOperatorAppUpdateRequest(android.media.tv.interactive.OperatorAppServiceInfo p0, boolean p1) {}
        void postParentalControlPinLengthRequest() {}
        void postRemoveBroadcastInfo(int p0) {}
        void postReplaceUiElements(int[] p0) {}
        void postRequestAvailableSpeeds() {}
        void postRequestCertificate(java.lang.String p0, int p1) {}
        void postRequestCurrentChannelLcn() {}
        void postRequestCurrentChannelUri() {}
        void postRequestCurrentTvInputId() {}
        void postRequestCurrentVideoBounds() {}
        void postRequestParentalControlApproval(int p0, boolean p1, android.os.Bundle p2) {}
        void postRequestScheduleRecording(java.lang.String p0, java.lang.String p1, android.net.Uri p2, long p3, long p4, int p5, android.os.Bundle p6) {}
        void postRequestScheduleRecording(java.lang.String p0, java.lang.String p1, android.net.Uri p2, android.net.Uri p3, android.os.Bundle p4) {}
        void postRequestSelectedTrackInfo() {}
        void postRequestSigning(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, byte[] p4) {}
        void postRequestSigning(java.lang.String p0, java.lang.String p1, java.lang.String p2, byte[] p3) {}
        void postRequestStartRecording(java.lang.String p0, android.net.Uri p1) {}
        void postRequestStopRecording(java.lang.String p0) {}
        void postRequestStreamVolume() {}
        void postRequestTimeShiftMode() {}
        void postRequestTrackInfoList() {}
        void postRequestTvRecordingInfo(java.lang.String p0) {}
        void postRequestTvRecordingInfoList(int p0) {}
        void postSessionCreated(android.media.tv.interactive.TvInteractiveAppManager.Session p0) {}
        void postSessionReleased() {}
        void postSessionStateChanged(int p0, int p1) {}
        void postSetParentalControlPin(java.lang.String p0, java.lang.String p1) {}
        void postSetTvRecordingInfo(java.lang.String p0, android.media.tv.TvRecordingInfo p1) {}
        void postSetVideoBounds(android.graphics.Rect p0) {}
        void postStreamingPlaybackStatusChanged(int p0) {}
        void postTeletextAppStateChanged(int p0) {}
        void postTimeShiftCommandRequest(java.lang.String p0, android.os.Bundle p1) {}
        void postVerifyParentalControlPinRequest(int p0, java.lang.String p1) {}
        void postWebServiceClientList(java.util.List<android.media.tv.interactive.WebServiceClientInfo> p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StreamingPlaybackStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TeletextAppState {
    }

    public static abstract class TvInteractiveAppCallback {
        public TvInteractiveAppCallback() {}
        public void onInteractiveAppServiceAdded(java.lang.String p0) {}
        public void onInteractiveAppServiceRemoved(java.lang.String p0) {}
        public void onInteractiveAppServiceUpdated(java.lang.String p0) {}
        public void onTvInteractiveAppServiceInfoUpdated(android.media.tv.interactive.TvInteractiveAppServiceInfo p0) {}
        public void onTvInteractiveAppServiceStateChanged(java.lang.String p0, int p1, int p2, int p3) {}
    }

    private static final class TvInteractiveAppCallbackRecord {
        private final android.media.tv.interactive.TvInteractiveAppManager.TvInteractiveAppCallback mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        TvInteractiveAppCallbackRecord(android.media.tv.interactive.TvInteractiveAppManager.TvInteractiveAppCallback p0, java.util.concurrent.Executor p1) {}
        public android.media.tv.interactive.TvInteractiveAppManager.TvInteractiveAppCallback getCallback() { return null; }
        public void postInteractiveAppServiceAdded(java.lang.String p0) {}
        public void postInteractiveAppServiceRemoved(java.lang.String p0) {}
        public void postInteractiveAppServiceUpdated(java.lang.String p0) {}
        public void postOperatorAppPackageStatus(java.lang.String p0, android.media.tv.interactive.OperatorAppServiceInfo p1, int p2, android.os.Bundle p3) {}
        public void postStateChanged(java.lang.String p0, int p1, int p2, int p3) {}
        public void postTvInteractiveAppServiceInfoUpdated(android.media.tv.interactive.TvInteractiveAppServiceInfo p0) {}
    }
}
