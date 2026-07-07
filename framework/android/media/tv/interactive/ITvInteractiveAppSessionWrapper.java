package android.media.tv.interactive;

public class ITvInteractiveAppSessionWrapper extends android.media.tv.interactive.ITvInteractiveAppSession.Stub implements com.android.internal.os.HandlerCaller.Callback {
    private static final int DO_CREATE_BI_INTERACTIVE_APP = 5;
    private static final int DO_CREATE_MEDIA_VIEW = 27;
    private static final int DO_DESTROY_BI_INTERACTIVE_APP = 6;
    private static final int DO_DISPATCH_SURFACE_CHANGED = 24;
    private static final int DO_NOTIFY_AD_BUFFER_CONSUMED = 32;
    private static final int DO_NOTIFY_AD_RESPONSE = 26;
    private static final int DO_NOTIFY_BROADCAST_INFO_RESPONSE = 25;
    private static final int DO_NOTIFY_CONTENT_ALLOWED = 20;
    private static final int DO_NOTIFY_CONTENT_BLOCKED = 21;
    private static final int DO_NOTIFY_ERROR = 14;
    private static final int DO_NOTIFY_INTERACTIVE_APP_FOCUS_CHANGED = 55;
    private static final int DO_NOTIFY_RECORDING_CONNECTION_FAILED = 41;
    private static final int DO_NOTIFY_RECORDING_DISCONNECTED = 42;
    private static final int DO_NOTIFY_RECORDING_ERROR = 44;
    private static final int DO_NOTIFY_RECORDING_SCHEDULED = 45;
    private static final int DO_NOTIFY_RECORDING_STARTED = 30;
    private static final int DO_NOTIFY_RECORDING_STOPPED = 31;
    private static final int DO_NOTIFY_RECORDING_TUNED = 43;
    private static final int DO_NOTIFY_SIGNAL_STRENGTH = 22;
    private static final int DO_NOTIFY_TIME_SHIFT_CURRENT_POSITION_CHANGED = 39;
    private static final int DO_NOTIFY_TIME_SHIFT_PLAYBACK_PARAMS = 36;
    private static final int DO_NOTIFY_TIME_SHIFT_START_POSITION_CHANGED = 38;
    private static final int DO_NOTIFY_TIME_SHIFT_STATUS_CHANGED = 37;
    private static final int DO_NOTIFY_TRACKS_CHANGED = 17;
    private static final int DO_NOTIFY_TRACK_SELECTED = 16;
    private static final int DO_NOTIFY_TUNED = 15;
    private static final int DO_NOTIFY_TV_MESSAGE = 33;
    private static final int DO_NOTIFY_VIDEO_AVAILABLE = 18;
    private static final int DO_NOTIFY_VIDEO_FREEZE_UPDATED = 49;
    private static final int DO_NOTIFY_VIDEO_UNAVAILABLE = 19;
    private static final int DO_RELAYOUT_MEDIA_VIEW = 28;
    private static final int DO_RELEASE = 1;
    private static final int DO_REMOVE_MEDIA_VIEW = 29;
    private static final int DO_REMOVE_WEB_SERVICE_CLIENT = 53;
    private static final int DO_REQUEST_OPERATOR_APP_SUPPORTED_STATUS = 62;
    private static final int DO_REQUEST_WEB_SERVICE_CLIENTS = 54;
    private static final int DO_RESET_INTERACTIVE_APP = 4;
    private static final int DO_SELECT_INTERACTIVE_APP_STREAMING_TRACK = 61;
    private static final int DO_SEND_AVAILABLE_SPEEDS = 47;
    private static final int DO_SEND_CERTIFICATE = 50;
    private static final int DO_SEND_CURRENT_CHANNEL_LCN = 9;
    private static final int DO_SEND_CURRENT_CHANNEL_URI = 8;
    private static final int DO_SEND_CURRENT_TV_INPUT_ID = 12;
    private static final int DO_SEND_CURRENT_VIDEO_BOUNDS = 40;
    private static final int DO_SEND_PARENTAL_CONTROL_APPROVAL_RESULT = 56;
    private static final int DO_SEND_PARENTAL_CONTROL_PIN_LENGTH = 58;
    private static final int DO_SEND_RECORDING_INFO = 34;
    private static final int DO_SEND_RECORDING_INFO_LIST = 35;
    private static final int DO_SEND_SELECTED_TRACK_INFO = 48;
    private static final int DO_SEND_SET_PARENTAL_CONTROL_PIN_RESULT = 59;
    private static final int DO_SEND_SIGNING_RESULT = 13;
    private static final int DO_SEND_STREAM_VOLUME = 10;
    private static final int DO_SEND_TIME_SHIFT_MODE = 46;
    private static final int DO_SEND_TRACK_INFO_LIST = 11;
    private static final int DO_SEND_VERIFY_PARENTAL_CONTROL_PIN_RESULT = 57;
    private static final int DO_SET_SURFACE = 23;
    private static final int DO_SET_TELETEXT_APP_ENABLED = 7;
    private static final int DO_START_INTERACTIVE_APP = 2;
    private static final int DO_START_INTERACTIVE_APP_WITH_HANDLE = 51;
    private static final int DO_START_OPERATOR_APP = 63;
    private static final int DO_STOP_INTERACTIVE_APP = 3;
    private static final int DO_STOP_INTERACTIVE_APP_WITH_HANDLE = 60;
    private static final int DO_STOP_OPERATOR_APP = 64;
    private static final int DO_SWITCH_OPERATOR_APP_STATE = 65;
    private static final int DO_UPDATE_WEB_SERVICE_CLIENT_STATE = 52;
    private static final int EXECUTE_MESSAGE_TIMEOUT_LONG_MILLIS = 5000;
    private static final int EXECUTE_MESSAGE_TIMEOUT_SHORT_MILLIS = 1000;
    private static final java.lang.String TAG = "ITvInteractiveAppSessionWrapper";
    private final com.android.internal.os.HandlerCaller mCaller = null;
    private android.view.InputChannel mChannel;
    private android.media.tv.interactive.ITvInteractiveAppSessionWrapper.TvInteractiveAppEventReceiver mReceiver;
    private android.media.tv.interactive.TvInteractiveAppService.Session mSessionImpl;
    public ITvInteractiveAppSessionWrapper(android.content.Context p0, android.media.tv.interactive.TvInteractiveAppService.Session p1, android.view.InputChannel p2) { super(); }
    public void createBiInteractiveApp(android.net.Uri p0, android.os.Bundle p1) {}
    public void createMediaView(android.os.IBinder p0, android.graphics.Rect p1) {}
    public void destroyBiInteractiveApp(java.lang.String p0) {}
    public void dispatchSurfaceChanged(int p0, int p1, int p2) {}
    public void executeMessage(android.os.Message p0) {}
    public void notifyAdBufferConsumed(android.media.tv.AdBuffer p0) {}
    public void notifyAdResponse(android.media.tv.AdResponse p0) {}
    public void notifyBroadcastInfoResponse(android.media.tv.BroadcastInfoResponse p0) {}
    public void notifyContentAllowed() {}
    public void notifyContentBlocked(java.lang.String p0) {}
    public void notifyError(java.lang.String p0, android.os.Bundle p1) {}
    public void notifyInteractiveAppFocusChanged(boolean p0) {}
    public void notifyRecordingConnectionFailed(java.lang.String p0, java.lang.String p1) {}
    public void notifyRecordingDisconnected(java.lang.String p0, java.lang.String p1) {}
    public void notifyRecordingError(java.lang.String p0, int p1) {}
    public void notifyRecordingScheduled(java.lang.String p0, java.lang.String p1) {}
    public void notifyRecordingStarted(java.lang.String p0, java.lang.String p1) {}
    public void notifyRecordingStopped(java.lang.String p0) {}
    public void notifyRecordingTuned(java.lang.String p0, android.net.Uri p1) {}
    public void notifySignalStrength(int p0) {}
    public void notifyTimeShiftCurrentPositionChanged(java.lang.String p0, long p1) {}
    public void notifyTimeShiftPlaybackParams(android.media.PlaybackParams p0) {}
    public void notifyTimeShiftStartPositionChanged(java.lang.String p0, long p1) {}
    public void notifyTimeShiftStatusChanged(java.lang.String p0, int p1) {}
    public void notifyTrackSelected(int p0, java.lang.String p1) {}
    public void notifyTracksChanged(java.util.List<android.media.tv.TvTrackInfo> p0) {}
    public void notifyTuned(android.net.Uri p0) {}
    public void notifyTvMessage(int p0, android.os.Bundle p1) {}
    public void notifyVideoAvailable() {}
    public void notifyVideoFreezeUpdated(boolean p0) {}
    public void notifyVideoUnavailable(int p0) {}
    public void relayoutMediaView(android.graphics.Rect p0) {}
    public void release() {}
    public void removeMediaView() {}
    public void removeWebServiceClient(int p0) {}
    public void requestOperatorAppSupportedStatus() {}
    public void requestWebServiceClients() {}
    public void resetInteractiveApp() {}
    public void selectInteractiveAppStreamingTrack(int p0, java.lang.String p1) {}
    public void sendAvailableSpeeds(float[] p0) {}
    public void sendCertificate(java.lang.String p0, int p1, android.os.Bundle p2) {}
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
    public void setSurface(android.view.Surface p0) {}
    public void setTeletextAppEnabled(boolean p0) {}
    public void startInteractiveApp() {}
    public void startInteractiveAppWithHandle(int p0) {}
    public void startOperatorApp(android.media.tv.interactive.OperatorAppServiceInfo p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3) {}
    public void stopInteractiveApp() {}
    public void stopInteractiveAppWithHandle(int p0) {}
    public void stopOperatorApp(android.media.tv.interactive.OperatorAppServiceInfo p0) {}
    public void switchOperatorAppState(android.media.tv.interactive.OperatorAppServiceInfo p0, int p1) {}
    public void updateWebServiceClientState(int p0, int p1) {}

    private final class TvInteractiveAppEventReceiver extends android.view.InputEventReceiver {
        TvInteractiveAppEventReceiver(android.media.tv.interactive.ITvInteractiveAppSessionWrapper p0, android.view.InputChannel p1, android.os.Looper p2) { super(null, null); }
        public void onInputEvent(android.view.InputEvent p0) {}
    }
}
