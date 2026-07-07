package android.media.tv.ad;

public class TvAdView extends android.view.ViewGroup {
    private static final boolean DEBUG = false;
    public static final java.lang.String ERROR_KEY_ERROR_CODE = "error_code";
    public static final java.lang.String ERROR_KEY_METHOD_NAME = "method_name";
    private static final java.lang.String TAG = "TvAdView";
    private final android.util.AttributeSet mAttrs = null;
    private android.media.tv.ad.TvAdView.TvAdCallback mCallback;
    private java.util.concurrent.Executor mCallbackExecutor;
    private final java.lang.Object mCallbackLock = null;
    private final int mDefStyleAttr = 0;
    private final android.media.tv.ad.TvAdManager.Session.FinishedInputEventCallback mFinishedInputEventCallback = null;
    private final android.os.Handler mHandler = null;
    private boolean mMediaViewCreated;
    private android.graphics.Rect mMediaViewFrame;
    private android.media.tv.ad.TvAdView.OnUnhandledInputEventListener mOnUnhandledInputEventListener;
    private final android.content.res.XmlResourceParser mParser = null;
    private android.media.tv.ad.TvAdManager.Session mSession;
    private android.media.tv.ad.TvAdView.MySessionCallback mSessionCallback;
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
    private final android.media.tv.ad.TvAdManager mTvAdManager = null;
    private boolean mUseRequestedSurfaceLayout;
    public TvAdView(android.content.Context p0) { super((android.content.Context)null); }
    public TvAdView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public TvAdView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    private void createSessionMediaView() {}
    private void dispatchSurfaceChanged(int p0, int p1, int p2) {}
    private android.graphics.Rect getViewFrameOnScreen() { return null; }
    private void relayoutSessionMediaView() {}
    private void removeSessionMediaView() {}
    private void resetInternal() {}
    private void resetSurfaceView() {}
    private void setSessionSurface(android.view.Surface p0) {}
    private boolean unsetTvView() { return false; }
    public void clearCallback() {}
    public void clearOnUnhandledInputEventListener() {}
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean dispatchUnhandledInputEvent(android.view.InputEvent p0) { return false; }
    public android.media.tv.ad.TvAdManager.Session getAdSession() { return null; }
    public android.media.tv.ad.TvAdView.OnUnhandledInputEventListener getOnUnhandledInputEventListener() { return null; }
    public void notifyError(java.lang.String p0, android.os.Bundle p1) {}
    public void notifyTvMessage(int p0, android.os.Bundle p1) {}
    public void onAttachedToWindow() {}
    public void onDetachedFromWindow() {}
    public void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public void onMeasure(int p0, int p1) {}
    public boolean onUnhandledInputEvent(android.view.InputEvent p0) { return false; }
    public void onVisibilityChanged(android.view.View p0, int p1) {}
    public void prepareAdService(java.lang.String p0, java.lang.String p1) {}
    public void reset() {}
    public void resetAdService() {}
    public void sendCurrentChannelUri(android.net.Uri p0) {}
    public void sendCurrentTvInputId(java.lang.String p0) {}
    public void sendCurrentVideoBounds(android.graphics.Rect p0) {}
    public void sendSigningResult(java.lang.String p0, byte[] p1) {}
    public void sendTrackInfoList(java.util.List<android.media.tv.TvTrackInfo> p0) {}
    public void setCallback(java.util.concurrent.Executor p0, android.media.tv.ad.TvAdView.TvAdCallback p1) {}
    public void setOnUnhandledInputEventListener(android.media.tv.ad.TvAdView.OnUnhandledInputEventListener p0) {}
    public boolean setTvView(android.media.tv.TvView p0) { return false; }
    public void setZOrderMediaOverlay(boolean p0) {}
    public void setZOrderOnTop(boolean p0) {}
    public void startAdService() {}
    public void stopAdService() {}

    private class MySessionCallback extends android.media.tv.ad.TvAdManager.SessionCallback {
        final java.lang.String mServiceId = null;
        MySessionCallback(android.media.tv.ad.TvAdView p0, java.lang.String p1) { super(); }
        public void onLayoutSurface(android.media.tv.ad.TvAdManager.Session p0, int p1, int p2, int p3, int p4) {}
        public void onRequestCurrentChannelUri(android.media.tv.ad.TvAdManager.Session p0) {}
        public void onRequestCurrentTvInputId(android.media.tv.ad.TvAdManager.Session p0) {}
        public void onRequestCurrentVideoBounds(android.media.tv.ad.TvAdManager.Session p0) {}
        public void onRequestSigning(android.media.tv.ad.TvAdManager.Session p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, byte[] p4) {}
        public void onRequestTrackInfoList(android.media.tv.ad.TvAdManager.Session p0) {}
        public void onSessionCreated(android.media.tv.ad.TvAdManager.Session p0) {}
        public void onSessionReleased(android.media.tv.ad.TvAdManager.Session p0) {}
    }

    public static interface OnUnhandledInputEventListener {
        public boolean onUnhandledInputEvent(android.view.InputEvent p0);
    }

    public static abstract class TvAdCallback {
        public TvAdCallback() {}
        public void onRequestCurrentChannelUri(java.lang.String p0) {}
        public void onRequestCurrentTvInputId(java.lang.String p0) {}
        public void onRequestCurrentVideoBounds(java.lang.String p0) {}
        public void onRequestSigning(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, byte[] p4) {}
        public void onRequestTrackInfoList(java.lang.String p0) {}
        public void onStateChanged(java.lang.String p0, int p1, int p2) {}
    }
}
