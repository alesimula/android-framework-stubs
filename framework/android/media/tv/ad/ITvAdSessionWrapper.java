package android.media.tv.ad;

public class ITvAdSessionWrapper extends android.media.tv.ad.ITvAdSession.Stub implements com.android.internal.os.HandlerCaller.Callback {
    private static final int DO_CREATE_MEDIA_VIEW = 4;
    private static final int DO_DISPATCH_SURFACE_CHANGED = 3;
    private static final int DO_NOTIFY_ERROR = 15;
    private static final int DO_NOTIFY_INPUT_SESSION_DATA = 17;
    private static final int DO_NOTIFY_TV_MESSAGE = 16;
    private static final int DO_RELAYOUT_MEDIA_VIEW = 5;
    private static final int DO_RELEASE = 1;
    private static final int DO_REMOVE_MEDIA_VIEW = 6;
    private static final int DO_RESET_AD_SERVICE = 9;
    private static final int DO_SEND_CURRENT_CHANNEL_URI = 11;
    private static final int DO_SEND_CURRENT_TV_INPUT_ID = 13;
    private static final int DO_SEND_CURRENT_VIDEO_BOUNDS = 10;
    private static final int DO_SEND_SIGNING_RESULT = 14;
    private static final int DO_SEND_TRACK_INFO_LIST = 12;
    private static final int DO_SET_SURFACE = 2;
    private static final int DO_START_AD_SERVICE = 7;
    private static final int DO_STOP_AD_SERVICE = 8;
    private static final int EXECUTE_MESSAGE_TIMEOUT_LONG_MILLIS = 5000;
    private static final int EXECUTE_MESSAGE_TIMEOUT_SHORT_MILLIS = 1000;
    private static final java.lang.String TAG = "ITvAdSessionWrapper";
    private final com.android.internal.os.HandlerCaller mCaller = null;
    private android.view.InputChannel mChannel;
    private android.media.tv.ad.ITvAdSessionWrapper.TvAdEventReceiver mReceiver;
    private android.media.tv.ad.TvAdService.Session mSessionImpl;
    public ITvAdSessionWrapper(android.content.Context p0, android.media.tv.ad.TvAdService.Session p1, android.view.InputChannel p2) { super(); }
    public void createMediaView(android.os.IBinder p0, android.graphics.Rect p1) {}
    public void dispatchSurfaceChanged(int p0, int p1, int p2) {}
    public void executeMessage(android.os.Message p0) {}
    public void notifyError(java.lang.String p0, android.os.Bundle p1) {}
    public void notifyTvInputSessionData(java.lang.String p0, android.os.Bundle p1) {}
    public void notifyTvMessage(int p0, android.os.Bundle p1) {}
    public void relayoutMediaView(android.graphics.Rect p0) {}
    public void release() {}
    public void removeMediaView() {}
    public void resetAdService() {}
    public void sendCurrentChannelUri(android.net.Uri p0) {}
    public void sendCurrentTvInputId(java.lang.String p0) {}
    public void sendCurrentVideoBounds(android.graphics.Rect p0) {}
    public void sendSigningResult(java.lang.String p0, byte[] p1) {}
    public void sendTrackInfoList(java.util.List<android.media.tv.TvTrackInfo> p0) {}
    public void setSurface(android.view.Surface p0) {}
    public void startAdService() throws android.os.RemoteException {}
    public void stopAdService() {}

    private final class TvAdEventReceiver extends android.view.InputEventReceiver {
        TvAdEventReceiver(android.media.tv.ad.ITvAdSessionWrapper p0, android.view.InputChannel p1, android.os.Looper p2) { super(null, null); }
        public void onInputEvent(android.view.InputEvent p0) {}
    }
}
