package android.view;

public class HapticScrollFeedbackProvider implements android.view.ScrollFeedbackProvider {
    private static final boolean INITIAL_END_OF_LIST_HAPTICS_ENABLED = false;
    private static final java.lang.String TAG = "HapticScrollFeedbackProvider";
    private static final int TICK_INTERVAL_NO_TICK = 0;
    private int mAxis;
    private boolean mCanPlayLimitFeedback;
    private int mDeviceId;
    private boolean mHapticScrollFeedbackEnabled;
    private final boolean mIsFromView = false;
    private int mSource;
    private int mTickIntervalPixels;
    private int mTotalScrollPixels;
    private final android.view.View mView = null;
    private final android.view.ViewConfiguration mViewConfig = null;
    public HapticScrollFeedbackProvider(android.view.View p0) {}
    public HapticScrollFeedbackProvider(android.view.View p0, android.view.ViewConfiguration p1, boolean p2) {}
    private void maybeUpdateCurrentConfig(int p0, int p1, int p2) {}
    private void updateTickIntervals(int p0, int p1, int p2) {}
    public void onScrollLimit(int p0, int p1, int p2, boolean p3) {}
    public void onScrollProgress(int p0, int p1, int p2, int p3) {}
    public void onSnapToItem(int p0, int p1, int p2) {}
}
