package android.media.tv;

public class ITvInputSessionWrapper extends android.media.tv.ITvInputSession.Stub implements com.android.internal.os.HandlerCaller.Callback {
    private static final int DO_APP_PRIVATE_COMMAND = 9;
    private static final int DO_CREATE_OVERLAY_VIEW = 10;
    private static final int DO_DISPATCH_SURFACE_CHANGED = 4;
    private static final int DO_NOTIFY_AD_BUFFER = 28;
    private static final int DO_NOTIFY_AD_SESSION_DATA = 36;
    private static final int DO_NOTIFY_TV_MESSAGE = 32;
    private static final int DO_PAUSE_RECORDING = 22;
    private static final int DO_RELAYOUT_OVERLAY_VIEW = 11;
    private static final int DO_RELEASE = 1;
    private static final int DO_REMOVE_BROADCAST_INFO = 25;
    private static final int DO_REMOVE_OVERLAY_VIEW = 12;
    private static final int DO_REQUEST_AD = 27;
    private static final int DO_REQUEST_BROADCAST_INFO = 24;
    private static final int DO_RESUME_PLAYBACK = 34;
    private static final int DO_RESUME_RECORDING = 23;
    private static final int DO_SELECT_AUDIO_PRESENTATION = 29;
    private static final int DO_SELECT_TRACK = 8;
    private static final int DO_SET_CAPTION_ENABLED = 7;
    private static final int DO_SET_IAPP_NOTIFICATION_ENABLED = 26;
    private static final int DO_SET_MAIN = 2;
    private static final int DO_SET_STREAM_VOLUME = 5;
    private static final int DO_SET_SURFACE = 3;
    private static final int DO_SET_TV_MESSAGE_ENABLED = 31;
    private static final int DO_SET_VIDEO_FROZEN = 35;
    private static final int DO_START_RECORDING = 20;
    private static final int DO_STOP_PLAYBACK = 33;
    private static final int DO_STOP_RECORDING = 21;
    private static final int DO_TIME_SHIFT_ENABLE_POSITION_TRACKING = 19;
    private static final int DO_TIME_SHIFT_PAUSE = 15;
    private static final int DO_TIME_SHIFT_PLAY = 14;
    private static final int DO_TIME_SHIFT_RESUME = 16;
    private static final int DO_TIME_SHIFT_SEEK_TO = 17;
    private static final int DO_TIME_SHIFT_SET_MODE = 30;
    private static final int DO_TIME_SHIFT_SET_PLAYBACK_PARAMS = 18;
    private static final int DO_TUNE = 6;
    private static final int DO_UNBLOCK_CONTENT = 13;
    private static final int EXECUTE_MESSAGE_TIMEOUT_LONG_MILLIS = 5000;
    private static final int EXECUTE_MESSAGE_TIMEOUT_SHORT_MILLIS = 50;
    private static final int EXECUTE_MESSAGE_TUNE_TIMEOUT_MILLIS = 2000;
    private static final java.lang.String TAG = "TvInputSessionWrapper";
    private final com.android.internal.os.HandlerCaller mCaller = null;
    private android.view.InputChannel mChannel;
    private final boolean mIsRecordingSession = false;
    private android.media.tv.ITvInputSessionWrapper.TvInputEventReceiver mReceiver;
    private android.media.tv.TvInputService.RecordingSession mTvInputRecordingSessionImpl;
    private android.media.tv.TvInputService.Session mTvInputSessionImpl;
    public ITvInputSessionWrapper(android.content.Context p0, android.media.tv.TvInputService.RecordingSession p1) { super(); }
    public ITvInputSessionWrapper(android.content.Context p0, android.media.tv.TvInputService.Session p1, android.view.InputChannel p2) { super(); }
    public void appPrivateCommand(java.lang.String p0, android.os.Bundle p1) {}
    public void createOverlayView(android.os.IBinder p0, android.graphics.Rect p1) {}
    public void dispatchSurfaceChanged(int p0, int p1, int p2) {}
    public void executeMessage(android.os.Message p0) {}
    public void notifyAdBufferReady(android.media.tv.AdBuffer p0) {}
    public void notifyTvAdSessionData(java.lang.String p0, android.os.Bundle p1) {}
    public void notifyTvMessage(int p0, android.os.Bundle p1) {}
    public void pauseRecording(android.os.Bundle p0) {}
    public void relayoutOverlayView(android.graphics.Rect p0) {}
    public void release() {}
    public void removeBroadcastInfo(int p0) {}
    public void removeOverlayView() {}
    public void requestAd(android.media.tv.AdRequest p0) {}
    public void requestBroadcastInfo(android.media.tv.BroadcastInfoRequest p0) {}
    public void resumePlayback() {}
    public void resumeRecording(android.os.Bundle p0) {}
    public void selectAudioPresentation(int p0, int p1) {}
    public void selectTrack(int p0, java.lang.String p1) {}
    public void setCaptionEnabled(boolean p0) {}
    public void setInteractiveAppNotificationEnabled(boolean p0) {}
    public void setMain(boolean p0) {}
    public void setSurface(android.view.Surface p0) {}
    public void setTvMessageEnabled(int p0, boolean p1) {}
    public void setVideoFrozen(boolean p0) {}
    public final void setVolume(float p0) {}
    public void startRecording(android.net.Uri p0, android.os.Bundle p1) {}
    public void stopPlayback(int p0) {}
    public void stopRecording() {}
    public void timeShiftEnablePositionTracking(boolean p0) {}
    public void timeShiftPause() {}
    public void timeShiftPlay(android.net.Uri p0) {}
    public void timeShiftResume() {}
    public void timeShiftSeekTo(long p0) {}
    public void timeShiftSetMode(int p0) {}
    public void timeShiftSetPlaybackParams(android.media.PlaybackParams p0) {}
    public void tune(android.net.Uri p0, android.os.Bundle p1) {}
    public void unblockContent(java.lang.String p0) {}

    private final class TvInputEventReceiver extends android.view.InputEventReceiver {
        TvInputEventReceiver(android.media.tv.ITvInputSessionWrapper p0, android.view.InputChannel p1, android.os.Looper p2) { super(null, null); }
        public void onInputEvent(android.view.InputEvent p0) {}
    }
}
