package android.media.tv.interactive;

public class TvInteractiveAppView extends android.view.ViewGroup {
    public static final java.lang.String BI_INTERACTIVE_APP_KEY_ALIAS = "alias";
    public static final java.lang.String BI_INTERACTIVE_APP_KEY_CERTIFICATE = "certificate";
    public static final java.lang.String BI_INTERACTIVE_APP_KEY_HTTP_ADDITIONAL_HEADERS = "http_additional_headers";
    public static final java.lang.String BI_INTERACTIVE_APP_KEY_HTTP_USER_AGENT = "http_user_agent";
    public static final java.lang.String BI_INTERACTIVE_APP_KEY_PRIVATE_KEY = "private_key";
    private static final boolean DEBUG = false;
    public static final java.lang.String ERROR_KEY_METHOD_NAME = "method_name";
    private static final int SET_TVVIEW_FAIL = 2;
    private static final int SET_TVVIEW_SUCCESS = 1;
    private static final java.lang.String TAG = "TvInteractiveAppView";
    private static final int UNSET_TVVIEW_FAIL = 4;
    private static final int UNSET_TVVIEW_SUCCESS = 3;
    private final android.util.AttributeSet mAttrs = null;
    private android.media.tv.interactive.TvInteractiveAppView.TvInteractiveAppCallback mCallback;
    private java.util.concurrent.Executor mCallbackExecutor;
    private final java.lang.Object mCallbackLock = null;
    private final int mDefStyleAttr = 0;
    private final android.media.tv.interactive.TvInteractiveAppManager.Session.FinishedInputEventCallback mFinishedInputEventCallback = null;
    private final android.os.Handler mHandler = null;
    private boolean mMediaViewCreated;
    private android.graphics.Rect mMediaViewFrame;
    private android.media.tv.interactive.TvInteractiveAppView.OnUnhandledInputEventListener mOnUnhandledInputEventListener;
    private final android.content.res.XmlResourceParser mParser = null;
    private android.media.tv.interactive.TvInteractiveAppManager.Session mSession;
    private android.media.tv.interactive.TvInteractiveAppView.MySessionCallback mSessionCallback;
    private android.view.Surface mSurface;
    private boolean mSurfaceChanged;
    private int mSurfaceFormat;
    private int mSurfaceHeight;
    private final android.view.SurfaceHolder.Callback mSurfaceHolderCallback = null;
    private android.view.SurfaceView mSurfaceView;
    private int mSurfaceViewBottom;
    private int mSurfaceViewLeft;
    private int mSurfaceViewRight;
    private int mSurfaceViewTop;
    private int mSurfaceWidth;
    private final android.media.tv.interactive.TvInteractiveAppManager mTvInteractiveAppManager = null;
    private boolean mUseRequestedSurfaceLayout;
    public TvInteractiveAppView(android.content.Context p0) { super((android.content.Context)null); }
    public TvInteractiveAppView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public TvInteractiveAppView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    private void createSessionMediaView() {}
    private void dispatchSurfaceChanged(int p0, int p1, int p2) {}
    private android.graphics.Rect getViewFrameOnScreen() { return null; }
    private void relayoutSessionMediaView() {}
    private void removeSessionMediaView() {}
    private void resetInternal() {}
    private void resetSurfaceView() {}
    private void setSessionSurface(android.view.Surface p0) {}
    private int unsetTvView() { return 0; }
    public void clearCallback() {}
    public void clearOnUnhandledInputEventListener() {}
    public void createBiInteractiveApp(android.net.Uri p0, android.os.Bundle p1) {}
    public void destroyBiInteractiveApp(java.lang.String p0) {}
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean dispatchUnhandledInputEvent(android.view.InputEvent p0) { return false; }
    public android.media.tv.interactive.TvInteractiveAppManager.Session getInteractiveAppSession() { return null; }
    public java.util.List<android.media.tv.TvTrackInfo> getInteractiveAppStreamingTracks(int p0) { return null; }
    public android.media.tv.interactive.TvInteractiveAppView.OnUnhandledInputEventListener getOnUnhandledInputEventListener() { return null; }
    public java.lang.String getSelectedInteractiveAppStreamingTrack(int p0) { return null; }
    public void notifyError(java.lang.String p0, android.os.Bundle p1) {}
    public void notifyInteractiveAppFocusChanged(boolean p0) {}
    public void notifyRecordingConnectionFailed(java.lang.String p0, java.lang.String p1) {}
    public void notifyRecordingDisconnected(java.lang.String p0, java.lang.String p1) {}
    public void notifyRecordingError(java.lang.String p0, int p1) {}
    public void notifyRecordingScheduled(java.lang.String p0, java.lang.String p1) {}
    public void notifyRecordingStarted(java.lang.String p0, java.lang.String p1) {}
    public void notifyRecordingStopped(java.lang.String p0) {}
    public void notifyRecordingTuned(java.lang.String p0, android.net.Uri p1) {}
    public void notifyTimeShiftCurrentPositionChanged(java.lang.String p0, long p1) {}
    public void notifyTimeShiftPlaybackParams(android.media.PlaybackParams p0) {}
    public void notifyTimeShiftStartPositionChanged(java.lang.String p0, long p1) {}
    public void notifyTimeShiftStatusChanged(java.lang.String p0, int p1) {}
    public void notifyTvMessage(int p0, android.os.Bundle p1) {}
    public void notifyVideoFreezeUpdated(boolean p0) {}
    public void onAttachedToWindow() {}
    public void onDetachedFromWindow() {}
    public void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public void onMeasure(int p0, int p1) {}
    public boolean onUnhandledInputEvent(android.view.InputEvent p0) { return false; }
    public void onVisibilityChanged(android.view.View p0, int p1) {}
    public void prepareInteractiveApp(java.lang.String p0, int p1) {}
    public void prepareInteractiveApp(java.lang.String p0, int p1, int p2) {}
    public void removeWebServiceClient(int p0) {}
    public void requestOperatorAppSupportedStatus() {}
    public void requestWebServiceClients() {}
    public void reset() {}
    public void resetInteractiveApp() {}
    public void selectInteractiveAppStreamingTrack(int p0, java.lang.String p1) {}
    public void sendAvailableSpeeds(float[] p0) {}
    public void sendCertificate(java.lang.String p0, int p1, android.net.http.SslCertificate p2) {}
    public void sendCurrentChannelLcn(int p0) {}
    public void sendCurrentChannelUri(android.net.Uri p0) {}
    public void sendCurrentTvInputId(java.lang.String p0) {}
    public void sendCurrentVideoBounds(android.graphics.Rect p0) {}
    public void sendParentalControlApprovalResult(int p0, boolean p1) {}
    public void sendParentalControlPinLength(int p0) {}
    public void sendSelectedTrackInfo(java.util.List<android.media.tv.TvTrackInfo> p0) {}
    public void sendSetParentalControlPinResult(int p0) {}
    public void sendSigningResult(java.lang.String p0, byte[] p1) {}
    public void sendStreamVolume(float p0) {}
    public void sendTimeShiftMode(int p0) {}
    public void sendTrackInfoList(java.util.List<android.media.tv.TvTrackInfo> p0) {}
    public void sendTvRecordingInfo(android.media.tv.TvRecordingInfo p0) {}
    public void sendTvRecordingInfoList(java.util.List<android.media.tv.TvRecordingInfo> p0) {}
    public void sendVerifyParentalControlPinResult(int p0, int p1) {}
    public void setCallback(java.util.concurrent.Executor p0, android.media.tv.interactive.TvInteractiveAppView.TvInteractiveAppCallback p1) {}
    public void setOnUnhandledInputEventListener(java.util.concurrent.Executor p0, android.media.tv.interactive.TvInteractiveAppView.OnUnhandledInputEventListener p1) {}
    public void setTeletextAppEnabled(boolean p0) {}
    public int setTvView(android.media.tv.TvView p0) { return 0; }
    public void setZOrderMediaOverlay(boolean p0) {}
    public void setZOrderOnTop(boolean p0) {}
    public void startInteractiveApp() {}
    public void startInteractiveApp(int p0) {}
    public void startOperatorApp(android.media.tv.interactive.OperatorAppServiceInfo p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3) {}
    public void stopInteractiveApp() {}
    public void stopInteractiveApp(int p0) {}
    public void stopOperatorApp(android.media.tv.interactive.OperatorAppServiceInfo p0) {}
    public void switchOperatorAppState(android.media.tv.interactive.OperatorAppServiceInfo p0, int p1) {}
    public void updateWebServiceClientState(int p0, int p1) {}

    private class MySessionCallback extends android.media.tv.interactive.TvInteractiveAppManager.SessionCallback {
        final java.lang.String mIAppServiceId = null;
        int mSubtype;
        int mType;
        MySessionCallback(android.media.tv.interactive.TvInteractiveAppView p0, java.lang.String p1, int p2, int p3) { super(); }
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

    public static interface OnUnhandledInputEventListener {
        public boolean onUnhandledInputEvent(android.view.InputEvent p0);
    }

    public static abstract class OperatorAppCallback extends android.media.tv.interactive.TvInteractiveAppView.TvInteractiveAppCallback {
        public OperatorAppCallback() { super(); }
        public void onKeySetChanged(java.lang.String p0, int p1, int[] p2) {}
        public void onOperatorAppStateChanged(java.lang.String p0, android.media.tv.interactive.OperatorAppServiceInfo p1, int p2) {}
        public void onOperatorAppStatusChanged(java.lang.String p0, android.media.tv.interactive.OperatorAppServiceInfo p1, int p2, android.os.Bundle p3) {}
        public void onOperatorAppSupportedStatus(java.lang.String p0, boolean p1) {}
        public void onOperatorAppUpdateRequest(java.lang.String p0, android.media.tv.interactive.OperatorAppServiceInfo p1, boolean p2) {}
        public void onReplaceUiElements(java.lang.String p0, int[] p1) {}
    }

    public static abstract class TvInteractiveAppCallback {
        public TvInteractiveAppCallback() {}
        public void onBiInteractiveAppCreated(java.lang.String p0, android.net.Uri p1, java.lang.String p2) {}
        public void onCancelParentalControlApproval(java.lang.String p0) {}
        public void onInteractiveAppInfoChanged(java.lang.String p0, android.media.tv.interactive.TvInteractiveAppInfo p1) {}
        public void onInteractiveAppStreamingTrackSelected(java.lang.String p0, int p1, java.lang.String p2) {}
        public void onInteractiveAppStreamingTracksChanged(java.lang.String p0, java.util.List<android.media.tv.TvTrackInfo> p1) {}
        public void onParentalControlPinLengthRequest(java.lang.String p0) {}
        public void onPlaybackCommandRequest(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) {}
        public void onRequestAvailableSpeeds(java.lang.String p0) {}
        public void onRequestCertificate(java.lang.String p0, java.lang.String p1, int p2) {}
        public void onRequestCurrentChannelLcn(java.lang.String p0) {}
        public void onRequestCurrentChannelUri(java.lang.String p0) {}
        public void onRequestCurrentTvInputId(java.lang.String p0) {}
        public void onRequestCurrentVideoBounds(java.lang.String p0) {}
        public void onRequestParentalControlApproval(java.lang.String p0, int p1, boolean p2, android.os.Bundle p3) {}
        public void onRequestScheduleRecording(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.net.Uri p3, long p4, long p5, int p6, android.os.Bundle p7) {}
        public void onRequestScheduleRecording(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.net.Uri p3, android.net.Uri p4, android.os.Bundle p5) {}
        public void onRequestSelectedTrackInfo(java.lang.String p0) {}
        public void onRequestSigning(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4, byte[] p5) {}
        public void onRequestSigning(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, byte[] p4) {}
        public void onRequestStartRecording(java.lang.String p0, java.lang.String p1, android.net.Uri p2) {}
        public void onRequestStopRecording(java.lang.String p0, java.lang.String p1) {}
        public void onRequestStreamVolume(java.lang.String p0) {}
        public void onRequestTimeShiftMode(java.lang.String p0) {}
        public void onRequestTrackInfoList(java.lang.String p0) {}
        public void onRequestTvRecordingInfo(java.lang.String p0, java.lang.String p1) {}
        public void onRequestTvRecordingInfoList(java.lang.String p0, int p1) {}
        public void onSendWebServiceClientList(java.lang.String p0, java.util.List<android.media.tv.interactive.WebServiceClientInfo> p1) {}
        public void onSetParentalControlPin(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
        public void onSetTvRecordingInfo(java.lang.String p0, java.lang.String p1, android.media.tv.TvRecordingInfo p2) {}
        public void onSetVideoBounds(java.lang.String p0, android.graphics.Rect p1) {}
        public void onStateChanged(java.lang.String p0, int p1, int p2) {}
        public void onStreamingPlaybackStatusChanged(java.lang.String p0, int p1) {}
        public void onTeletextAppStateChanged(java.lang.String p0, int p1) {}
        public void onTimeShiftCommandRequest(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) {}
        public void onVerifyParentalControlPinRequest(java.lang.String p0, int p1, java.lang.String p2) {}
    }
}
