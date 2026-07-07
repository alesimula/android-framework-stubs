package android.media;

@java.lang.Deprecated
public final class RemoteController {
    private static final boolean DEBUG = false;
    private static final int MAX_BITMAP_DIMENSION = 512;
    private static final int MSG_CLIENT_CHANGE = 0;
    private static final int MSG_NEW_MEDIA_METADATA = 2;
    private static final int MSG_NEW_PLAYBACK_STATE = 1;
    public static final int POSITION_SYNCHRONIZATION_CHECK = 1;
    public static final int POSITION_SYNCHRONIZATION_NONE = 0;
    private static final int SENDMSG_NOOP = 1;
    private static final int SENDMSG_QUEUE = 2;
    private static final int SENDMSG_REPLACE = 0;
    private static final java.lang.String TAG = "RemoteController";
    private static final java.lang.Object mInfoLock = null;
    private int mArtworkHeight;
    private int mArtworkWidth;
    private final android.content.Context mContext = null;
    private android.media.session.MediaController mCurrentSession;
    private boolean mEnabled;
    private final android.media.RemoteController.EventHandler mEventHandler = null;
    private boolean mIsRegistered;
    private android.media.RemoteController.PlaybackInfo mLastPlaybackInfo;
    private final int mMaxBitmapDimension = 0;
    private android.media.RemoteController.MetadataEditor mMetadataEditor;
    private android.media.RemoteController.OnClientUpdateListener mOnClientUpdateListener;
    private android.media.session.MediaController.Callback mSessionCb;
    private android.media.session.MediaSessionManager.OnActiveSessionsChangedListener mSessionListener;
    private android.media.session.MediaSessionManager mSessionManager;
    public RemoteController(android.content.Context p0, android.media.RemoteController.OnClientUpdateListener p1) throws java.lang.IllegalArgumentException {}
    public RemoteController(android.content.Context p0, android.media.RemoteController.OnClientUpdateListener p1, android.os.Looper p2) throws java.lang.IllegalArgumentException {}
    private void onClientChange(boolean p0) {}
    private void onNewMediaMetadata(android.media.MediaMetadata p0) {}
    private void onNewPlaybackState(android.media.session.PlaybackState p0) {}
    private static void sendMsg(android.os.Handler p0, int p1, int p2, int p3, int p4, java.lang.Object p5, int p6) {}
    private void updateController(android.media.session.MediaController p0) {}
    public boolean clearArtworkConfiguration() { return false; }
    public android.media.RemoteController.MetadataEditor editMetadata() { return null; }
    public long getEstimatedMediaPosition() { return 0L; }
    android.media.RemoteController.OnClientUpdateListener getUpdateListener() { return null; }
    public boolean seekTo(long p0) throws java.lang.IllegalArgumentException { return false; }
    public boolean sendMediaKeyEvent(android.view.KeyEvent p0) throws java.lang.IllegalArgumentException { return false; }
    public boolean setArtworkConfiguration(int p0, int p1) throws java.lang.IllegalArgumentException { return false; }
    public boolean setArtworkConfiguration(boolean p0, int p1, int p2) throws java.lang.IllegalArgumentException { return false; }
    public boolean setSynchronizationMode(int p0) throws java.lang.IllegalArgumentException { return false; }
    void startListeningToSessions() {}
    void stopListeningToSessions() {}

    private class EventHandler extends android.os.Handler {
        public EventHandler(android.media.RemoteController p0, android.media.RemoteController p1, android.os.Looper p2) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    private class MediaControllerCallback extends android.media.session.MediaController.Callback {
        private MediaControllerCallback(android.media.RemoteController p0) { super(); }
        public void onMetadataChanged(android.media.MediaMetadata p0) {}
        public void onPlaybackStateChanged(android.media.session.PlaybackState p0) {}
    }

    public class MetadataEditor extends android.media.MediaMetadataEditor {
        protected MetadataEditor(android.media.RemoteController p0) { super(); }
        protected MetadataEditor(android.media.RemoteController p0, android.os.Bundle p1, long p2) { super(); }
        private void cleanupBitmapFromBundle(int p0) {}
        public void apply() {}
    }

    public static interface OnClientUpdateListener {
        public void onClientChange(boolean p0);
        public void onClientMetadataUpdate(android.media.RemoteController.MetadataEditor p0);
        public void onClientPlaybackStateUpdate(int p0);
        public void onClientPlaybackStateUpdate(int p0, long p1, long p2, float p3);
        public void onClientTransportControlUpdate(int p0);
    }

    private static class PlaybackInfo {
        long mCurrentPosMs;
        float mSpeed;
        int mState;
        long mStateChangeTimeMs;
        PlaybackInfo(int p0, long p1, long p2, float p3) {}
    }

    private class TopTransportSessionListener implements android.media.session.MediaSessionManager.OnActiveSessionsChangedListener {
        private TopTransportSessionListener(android.media.RemoteController p0) {}
        public void onActiveSessionsChanged(java.util.List<android.media.session.MediaController> p0) {}
    }
}
