package android.service.quicksettings;

public class TileService extends android.app.Service {
    public static final java.lang.String ACTION_QS_TILE = "android.service.quicksettings.action.QS_TILE";
    public static final java.lang.String ACTION_QS_TILE_PREFERENCES = "android.service.quicksettings.action.QS_TILE_PREFERENCES";
    public static final java.lang.String CATEGORY_ACCESSIBILITY = "android.service.quicksettings.CATEGORY_ACCESSIBILITY";
    public static final java.lang.String CATEGORY_CONNECTIVITY = "android.service.quicksettings.CATEGORY_CONNECTIVITY";
    public static final java.lang.String CATEGORY_DISPLAY = "android.service.quicksettings.CATEGORY_DISPLAY";
    public static final java.lang.String CATEGORY_PRIVACY = "android.service.quicksettings.CATEGORY_PRIVACY";
    public static final java.lang.String CATEGORY_UTILITIES = "android.service.quicksettings.CATEGORY_UTILITIES";
    private static final boolean DEBUG = false;
    public static final java.lang.String EXTRA_SERVICE = "service";
    public static final java.lang.String EXTRA_STATE = "state";
    public static final java.lang.String EXTRA_TOKEN = "token";
    public static final java.lang.String META_DATA_ACTIVE_TILE = "android.service.quicksettings.ACTIVE_TILE";
    public static final java.lang.String META_DATA_TILE_CATEGORY = "android.service.quicksettings.TILE_CATEGORY";
    public static final java.lang.String META_DATA_TOGGLEABLE_TILE = "android.service.quicksettings.TOGGLEABLE_TILE";
    public static final long START_ACTIVITY_NEEDS_PENDING_INTENT = 241766793L;
    private static final java.lang.String TAG = "TileService";
    private final android.service.quicksettings.TileService.H mHandler = null;
    private boolean mListening;
    private android.service.quicksettings.IQSService mService;
    private android.service.quicksettings.Tile mTile;
    private android.os.IBinder mTileToken;
    private android.os.IBinder mToken;
    private java.lang.Runnable mUnlockRunnable;
    public TileService() { super(); }
    public static boolean isQuickSettingsSupported() { return false; }
    public static final void requestListeningState(android.content.Context p0, android.content.ComponentName p1) {}
    public final android.service.quicksettings.Tile getQsTile() { return null; }
    public final boolean isLocked() { return false; }
    public final boolean isSecure() { return false; }
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onClick() {}
    public void onDestroy() {}
    public void onStartListening() {}
    public void onStopListening() {}
    public void onTileAdded() {}
    public void onTileRemoved() {}
    @android.annotation.SystemApi
    public final void setStatusIcon(android.graphics.drawable.Icon p0, java.lang.String p1) {}
    public final void showDialog(android.app.Dialog p0) {}
    public final void startActivityAndCollapse(android.app.PendingIntent p0) {}
    @java.lang.Deprecated
    public final void startActivityAndCollapse(android.content.Intent p0) {}
    public final void unlockAndRun(java.lang.Runnable p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Categories {
    }

    private class H extends android.os.Handler {
        private static final int MSG_START_LISTENING = 1;
        private static final int MSG_START_SUCCESS = 7;
        private static final int MSG_STOP_LISTENING = 2;
        private static final int MSG_TILE_ADDED = 3;
        private static final int MSG_TILE_CLICKED = 5;
        private static final int MSG_TILE_REMOVED = 4;
        private static final int MSG_UNLOCK_COMPLETE = 6;
        private final java.lang.String mTileServiceName = null;
        public H(android.service.quicksettings.TileService p0, android.os.Looper p1) { super(); }
        private void logMessage(java.lang.String p0) {}
        public void handleMessage(android.os.Message p0) {}
    }
}
