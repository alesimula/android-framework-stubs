package com.android.internal.display;

public class BrightnessSynchronizer {
    private static final android.net.Uri BRIGHTNESS_URI = null;
    private static final boolean DEBUG = false;
    public static final float EPSILON = 9.999999747378752e-05f;
    private static final int MSG_RUN_UPDATE = 1;
    private static final java.lang.String TAG = "BrightnessSynchronizer";
    private static final long WAIT_FOR_RESPONSE_MILLIS = 200L;
    private static int sBrightnessUpdateCount;
    private final com.android.internal.display.BrightnessSynchronizer.BrightnessSyncObserver mBrightnessSyncObserver = null;
    private final com.android.internal.display.BrightnessSynchronizer.Clock mClock = null;
    private final android.content.Context mContext = null;
    private com.android.internal.display.BrightnessSynchronizer.BrightnessUpdate mCurrentUpdate;
    private android.hardware.display.DisplayManager mDisplayManager;
    private final android.os.Handler mHandler = null;
    private float mLatestFloatBrightness;
    private int mLatestIntBrightness;
    private com.android.internal.display.BrightnessSynchronizer.BrightnessUpdate mPendingUpdate;
    public BrightnessSynchronizer(android.content.Context p0, android.os.Looper p1) {}
    public BrightnessSynchronizer(android.content.Context p0, android.os.Looper p1, com.android.internal.display.BrightnessSynchronizer.Clock p2) {}
    public static int brightnessFloatToInt(float p0) { return 0; }
    public static float brightnessFloatToIntRange(float p0) { return 0.0f; }
    public static float brightnessIntToFloat(int p0) { return 0.0f; }
    public static boolean floatEquals(float p0, float p1) { return false; }
    private float getScreenBrightnessFloat() { return 0.0f; }
    private int getScreenBrightnessInt() { return 0; }
    private void handleBrightnessChange(int p0, float p1) {}
    private void handleBrightnessChangeFloat(float p0) {}
    private void handleBrightnessChangeInt(int p0) {}
    private void runUpdate() {}
    public void dump(java.io.PrintWriter p0) {}
    public void startSynchronizing() {}

    class BrightnessSynchronizerHandler extends android.os.Handler {
        BrightnessSynchronizerHandler(com.android.internal.display.BrightnessSynchronizer p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    private class BrightnessSyncObserver {
        private boolean mIsObserving;
        private final android.hardware.display.DisplayManager.DisplayListener mListener = null;
        private BrightnessSyncObserver(com.android.internal.display.BrightnessSynchronizer p0) {}
        private android.database.ContentObserver createBrightnessContentObserver(android.os.Handler p0) { return null; }
        boolean isObserving() { return false; }
        void startObserving(android.os.Handler p0) {}
    }

    public class BrightnessUpdate {
        private static final int STATE_COMPLETED = 3;
        private static final int STATE_NOT_STARTED = 1;
        private static final int STATE_RUNNING = 2;
        static final int TYPE_FLOAT = 2;
        static final int TYPE_INT = 1;
        private final float mBrightness = 0.0f;
        private int mConfirmedTypes;
        private int mId;
        private final int mSourceType = 0;
        private int mState;
        private long mTimeUpdated;
        private int mUpdatedTypes;
        BrightnessUpdate(com.android.internal.display.BrightnessSynchronizer p0, int p1, float p2) {}
        private float getBrightnessAsFloat() { return 0.0f; }
        private int getBrightnessAsInt() { return 0; }
        private java.lang.String toStringLabel(int p0, float p1) { return null; }
        boolean isCompleted() { return false; }
        boolean isRunning() { return false; }
        boolean madeUpdates() { return false; }
        boolean swallowUpdate(int p0, float p1) { return false; }
        public java.lang.String toString() { return null; }
        void update() {}
    }

    public static interface Clock {
        public long uptimeMillis();
    }
}
