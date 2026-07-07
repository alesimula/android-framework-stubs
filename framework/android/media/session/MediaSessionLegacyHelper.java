package android.media.session;

public class MediaSessionLegacyHelper {
    private static final boolean DEBUG = Boolean.valueOf(false);
    private static final java.lang.String TAG = "MediaSessionHelper";
    private static android.media.session.MediaSessionLegacyHelper sInstance;
    private static final java.lang.Object sLock = null;
    private android.content.Context mContext;
    private android.os.Handler mHandler;
    private android.media.session.MediaSessionManager mSessionManager;
    private android.util.ArrayMap<android.app.PendingIntent, android.media.session.MediaSessionLegacyHelper.SessionHolder> mSessions;
    private MediaSessionLegacyHelper(android.content.Context p0) {}
    public static android.media.session.MediaSessionLegacyHelper getHelper(android.content.Context p0) { return null; }
    private android.media.session.MediaSessionLegacyHelper.SessionHolder getHolder(android.app.PendingIntent p0, boolean p1) { return null; }
    public static android.os.Bundle getOldMetadata(android.media.MediaMetadata p0, int p1, int p2) { return null; }
    private static android.graphics.Bitmap scaleBitmapIfTooBig(android.graphics.Bitmap p0, int p1, int p2) { return null; }
    private static void sendKeyEvent(android.app.PendingIntent p0, android.content.Context p1, android.content.Intent p2) {}
    public void addMediaButtonListener(android.app.PendingIntent p0, android.content.ComponentName p1, android.content.Context p2) {}
    public void addRccListener(android.app.PendingIntent p0, android.media.session.MediaSession.Callback p1) {}
    public android.media.session.MediaSession getSession(android.app.PendingIntent p0) { return null; }
    public boolean isGlobalPriorityActive() { return false; }
    public void removeMediaButtonListener(android.app.PendingIntent p0) {}
    public void removeRccListener(android.app.PendingIntent p0) {}
    public void sendAdjustVolumeBy(int p0, int p1, int p2) {}
    public void sendMediaButtonEvent(android.view.KeyEvent p0, boolean p1) {}
    public void sendVolumeKeyEvent(android.view.KeyEvent p0, int p1, boolean p2) {}

    private static final class MediaButtonListener extends android.media.session.MediaSession.Callback {
        private final android.content.Context mContext = null;
        private final android.app.PendingIntent mPendingIntent = null;
        public MediaButtonListener(android.app.PendingIntent p0, android.content.Context p1) { super(); }
        private void sendKeyEvent(int p0) {}
        public void onFastForward() {}
        public boolean onMediaButtonEvent(android.content.Intent p0) { return false; }
        public void onPause() {}
        public void onPlay() {}
        public void onRewind() {}
        public void onSkipToNext() {}
        public void onSkipToPrevious() {}
        public void onStop() {}
    }

    private class SessionHolder {
        public android.media.session.MediaSessionLegacyHelper.SessionHolder.SessionCallback mCb;
        public int mFlags;
        public android.media.session.MediaSessionLegacyHelper.MediaButtonListener mMediaButtonListener;
        public final android.app.PendingIntent mPi = null;
        public android.media.session.MediaSession.Callback mRccListener;
        public final android.media.session.MediaSession mSession = null;
        public SessionHolder(android.media.session.MediaSessionLegacyHelper p0, android.media.session.MediaSession p1, android.app.PendingIntent p2) {}
        public void update() {}

        private class SessionCallback extends android.media.session.MediaSession.Callback {
            private SessionCallback(android.media.session.MediaSessionLegacyHelper.SessionHolder p0) { super(); }
            public void onFastForward() {}
            public boolean onMediaButtonEvent(android.content.Intent p0) { return false; }
            public void onPause() {}
            public void onPlay() {}
            public void onRewind() {}
            public void onSeekTo(long p0) {}
            public void onSetRating(android.media.Rating p0) {}
            public void onSkipToNext() {}
            public void onSkipToPrevious() {}
            public void onStop() {}
        }
    }
}
