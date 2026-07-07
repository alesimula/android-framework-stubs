package android.media.tv;

public class TvView extends android.view.ViewGroup {
    private static final boolean DEBUG = false;
    private static final java.lang.ref.WeakReference<android.media.tv.TvView> NULL_TV_VIEW = null;
    private static final java.lang.String TAG = "TvView";
    private static final int ZORDER_MEDIA = 0;
    private static final int ZORDER_MEDIA_OVERLAY = 1;
    private static final int ZORDER_ON_TOP = 2;
    private static java.lang.ref.WeakReference<android.media.tv.TvView> sMainTvView;
    private static final java.lang.Object sMainTvViewLock = null;
    private final android.util.AttributeSet mAttrs = null;
    private android.media.tv.TvView.TvInputCallback mCallback;
    private java.lang.Boolean mCaptionEnabled;
    private final int mDefStyleAttr = 0;
    private final android.media.tv.TvInputManager.Session.FinishedInputEventCallback mFinishedInputEventCallback = null;
    private android.os.Handler mHandler;
    private final android.media.quality.MediaQualityManager mMediaQualityManager = null;
    private android.media.tv.TvView.OnUnhandledInputEventListener mOnUnhandledInputEventListener;
    private boolean mOverlayViewCreated;
    private android.graphics.Rect mOverlayViewFrame;
    private final android.content.res.XmlResourceParser mParser = null;
    private final java.util.Queue<android.util.Pair<java.lang.String, android.os.Bundle>> mPendingAppPrivateCommands = null;
    private android.media.tv.TvInputManager.Session mSession;
    private android.media.tv.TvView.MySessionCallback mSessionCallback;
    private java.lang.Float mStreamVolume;
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
    private android.media.tv.TvView.TimeShiftPositionCallback mTimeShiftPositionCallback;
    private android.content.AttributionSource mTvAppAttributionSource;
    private final android.media.tv.TvInputManager mTvInputManager = null;
    private boolean mUseRequestedSurfaceLayout;
    private int mWindowZOrder;
    public TvView(android.content.Context p0) { super((android.content.Context)null); }
    public TvView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public TvView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    private boolean checkChangeHdmiCecActiveSourcePermission() { return false; }
    private void createSessionOverlayView() {}
    private void dispatchSurfaceChanged(int p0, int p1, int p2) {}
    private void ensurePositionTracking() {}
    private android.graphics.Rect getViewFrameOnScreen() { return null; }
    private void relayoutSessionOverlayView() {}
    private void removeSessionOverlayView() {}
    private void resetInternal() {}
    private void resetSurfaceView() {}
    private void setSessionSurface(android.view.Surface p0) {}
    protected void dispatchDraw(android.graphics.Canvas p0) {}
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean dispatchTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchTrackballEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchUnhandledInputEvent(android.view.InputEvent p0) { return false; }
    public void dispatchWindowFocusChanged(boolean p0) {}
    public void draw(android.graphics.Canvas p0) {}
    public boolean gatherTransparentRegion(android.graphics.Region p0) { return false; }
    public java.util.List<android.media.AudioPresentation> getAudioPresentations() { return null; }
    public android.media.tv.TvInputManager.Session getInputSession() { return null; }
    public java.lang.String getSelectedTrack(int p0) { return null; }
    public java.util.List<android.media.tv.TvTrackInfo> getTracks(int p0) { return null; }
    public void notifyTvMessage(int p0, android.os.Bundle p1) {}
    protected void onAttachedToWindow() {}
    protected void onDetachedFromWindow() {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onMeasure(int p0, int p1) {}
    public boolean onUnhandledInputEvent(android.view.InputEvent p0) { return false; }
    protected void onVisibilityChanged(android.view.View p0, int p1) {}
    public void overrideTvAppAttributionSource(android.content.AttributionSource p0) {}
    public void requestUnblockContent(android.media.tv.TvContentRating p0) {}
    public void reset() {}
    public void resumePlayback() {}
    public void selectAudioPresentation(int p0, int p1) {}
    public void selectTrack(int p0, java.lang.String p1) {}
    public void sendAppPrivateCommand(java.lang.String p0, android.os.Bundle p1) {}
    public void setCallback(android.media.tv.TvView.TvInputCallback p0) {}
    public void setCaptionEnabled(boolean p0) {}
    public void setHandler(android.os.Handler p0) {}
    public void setInteractiveAppNotificationEnabled(boolean p0) {}
    @android.annotation.SystemApi
    public void setMain() {}
    public void setOnUnhandledInputEventListener(android.media.tv.TvView.OnUnhandledInputEventListener p0) {}
    public void setStreamVolume(float p0) {}
    public void setTimeShiftPositionCallback(android.media.tv.TvView.TimeShiftPositionCallback p0) {}
    public void setTvMessageEnabled(int p0, boolean p1) {}
    public void setVideoFrozen(boolean p0) {}
    public void setZOrderMediaOverlay(boolean p0) {}
    public void setZOrderOnTop(boolean p0) {}
    public void stopPlayback(int p0) {}
    public void timeShiftPause() {}
    public void timeShiftPlay(java.lang.String p0, android.net.Uri p1) {}
    public void timeShiftResume() {}
    public void timeShiftSeekTo(long p0) {}
    public void timeShiftSetMode(int p0) {}
    public void timeShiftSetPlaybackParams(android.media.PlaybackParams p0) {}
    public void tune(java.lang.String p0, android.net.Uri p1) {}
    public void tune(java.lang.String p0, android.net.Uri p1, android.os.Bundle p2) {}
    @android.annotation.SystemApi
    public void unblockContent(android.media.tv.TvContentRating p0) {}

    private class MySessionCallback extends android.media.tv.TvInputManager.SessionCallback {
        android.net.Uri mChannelUri;
        final java.lang.String mInputId = null;
        android.net.Uri mRecordedProgramUri;
        android.os.Bundle mTuneParams;
        MySessionCallback(android.media.tv.TvView p0, java.lang.String p1, android.net.Uri p2) { super(); }
        MySessionCallback(android.media.tv.TvView p0, java.lang.String p1, android.net.Uri p2, android.os.Bundle p3) { super(); }
        public void onAitInfoUpdated(android.media.tv.TvInputManager.Session p0, android.media.tv.AitInfo p1) {}
        public void onAudioPresentationSelected(android.media.tv.TvInputManager.Session p0, int p1, int p2) {}
        public void onAudioPresentationsChanged(android.media.tv.TvInputManager.Session p0, java.util.List<android.media.AudioPresentation> p1) {}
        public void onAvailableSpeeds(android.media.tv.TvInputManager.Session p0, float[] p1) {}
        public void onChannelRetuned(android.media.tv.TvInputManager.Session p0, android.net.Uri p1) {}
        public void onChannelRetunedWithExtraInfo(android.media.tv.TvInputManager.Session p0, android.net.Uri p1, android.os.Bundle p2) {}
        public void onContentAllowed(android.media.tv.TvInputManager.Session p0) {}
        public void onContentBlocked(android.media.tv.TvInputManager.Session p0, android.media.tv.TvContentRating p1) {}
        public void onCueingMessageAvailability(android.media.tv.TvInputManager.Session p0, boolean p1) {}
        public void onLayoutSurface(android.media.tv.TvInputManager.Session p0, int p1, int p2, int p3, int p4) {}
        public void onSessionCreated(android.media.tv.TvInputManager.Session p0) {}
        public void onSessionEvent(android.media.tv.TvInputManager.Session p0, java.lang.String p1, android.os.Bundle p2) {}
        public void onSessionReleased(android.media.tv.TvInputManager.Session p0) {}
        public void onSignalStrengthUpdated(android.media.tv.TvInputManager.Session p0, int p1) {}
        public void onTimeShiftCurrentPositionChanged(android.media.tv.TvInputManager.Session p0, long p1) {}
        public void onTimeShiftMode(android.media.tv.TvInputManager.Session p0, int p1) {}
        public void onTimeShiftStartPositionChanged(android.media.tv.TvInputManager.Session p0, long p1) {}
        public void onTimeShiftStatusChanged(android.media.tv.TvInputManager.Session p0, int p1) {}
        public void onTrackSelected(android.media.tv.TvInputManager.Session p0, int p1, java.lang.String p2) {}
        public void onTracksChanged(android.media.tv.TvInputManager.Session p0, java.util.List<android.media.tv.TvTrackInfo> p1) {}
        public void onTuned(android.media.tv.TvInputManager.Session p0, android.net.Uri p1) {}
        public void onTvMessage(android.media.tv.TvInputManager.Session p0, int p1, android.os.Bundle p2) {}
        public void onVideoAvailable(android.media.tv.TvInputManager.Session p0) {}
        public void onVideoFreezeUpdated(android.media.tv.TvInputManager.Session p0, boolean p1) {}
        public void onVideoSizeChanged(android.media.tv.TvInputManager.Session p0, int p1, int p2) {}
        public void onVideoUnavailable(android.media.tv.TvInputManager.Session p0, int p1) {}
    }

    public static interface OnUnhandledInputEventListener {
        public boolean onUnhandledInputEvent(android.view.InputEvent p0);
    }

    public static abstract class TimeShiftPositionCallback {
        public TimeShiftPositionCallback() {}
        public void onTimeShiftCurrentPositionChanged(java.lang.String p0, long p1) {}
        public void onTimeShiftStartPositionChanged(java.lang.String p0, long p1) {}
    }

    public static abstract class TvInputCallback {
        public TvInputCallback() {}
        public void onAitInfoUpdated(java.lang.String p0, android.media.tv.AitInfo p1) {}
        public void onAudioPresentationSelected(java.lang.String p0, int p1, int p2) {}
        public void onAudioPresentationsChanged(java.lang.String p0, java.util.List<android.media.AudioPresentation> p1) {}
        public void onAvailableSpeeds(java.lang.String p0, float[] p1) {}
        public void onChannelRetuned(java.lang.String p0, android.net.Uri p1) {}
        public void onChannelRetuned(java.lang.String p0, android.net.Uri p1, android.os.Bundle p2) {}
        public void onConnectionFailed(java.lang.String p0) {}
        public void onContentAllowed(java.lang.String p0) {}
        public void onContentBlocked(java.lang.String p0, android.media.tv.TvContentRating p1) {}
        public void onCueingMessageAvailability(java.lang.String p0, boolean p1) {}
        public void onDisconnected(java.lang.String p0) {}
        @android.annotation.SystemApi
        public void onEvent(java.lang.String p0, java.lang.String p1, android.os.Bundle p2) {}
        public void onSignalStrengthUpdated(java.lang.String p0, int p1) {}
        public void onTimeShiftMode(java.lang.String p0, int p1) {}
        public void onTimeShiftStatusChanged(java.lang.String p0, int p1) {}
        public void onTrackSelected(java.lang.String p0, int p1, java.lang.String p2) {}
        public void onTracksChanged(java.lang.String p0, java.util.List<android.media.tv.TvTrackInfo> p1) {}
        public void onTuned(java.lang.String p0, android.net.Uri p1) {}
        public void onTvMessage(java.lang.String p0, int p1, android.os.Bundle p2) {}
        public void onVideoAvailable(java.lang.String p0) {}
        public void onVideoFreezeUpdated(java.lang.String p0, boolean p1) {}
        public void onVideoSizeChanged(java.lang.String p0, int p1, int p2) {}
        public void onVideoUnavailable(java.lang.String p0, int p1) {}
    }
}
