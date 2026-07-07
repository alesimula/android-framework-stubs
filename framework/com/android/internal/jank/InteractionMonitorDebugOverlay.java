package com.android.internal.jank;

public class InteractionMonitorDebugOverlay {
    private static final long HIDE_OVERLAY_DELAY = 2000L;
    private static final int STATUS_CANCELLED = 2;
    private static final int STATUS_ENDED = 1;
    private static final int STATUS_RUNNING = 0;
    private static final java.lang.String TAG = "InteractionMonitorDebug";
    private final android.app.Application mCurrentApplication = null;
    private final com.android.internal.jank.InteractionMonitorDebugOverlay.DebugOverlayView mDebugOverlayView = null;
    private final java.lang.Runnable mHideOverlayRunnable = null;
    private final com.android.internal.util.LatencyTracker mLatencyTracker = null;
    private final java.util.ArrayList<com.android.internal.jank.InteractionMonitorDebugOverlay.TrackerState> mRunningCujs = null;
    private final android.os.Handler mUiThread = null;
    private final android.view.WindowManager mWindowManager = null;
    InteractionMonitorDebugOverlay(android.app.Application p0, android.os.Handler p1, int p2, double p3) {}
    void dispose() {}
    public void onTrackerAdded(java.lang.String p0, int p1) {}
    public void onTrackerRemoved(boolean p0, int p1) {}

    private class DebugOverlayView extends android.view.View {
        private static final java.lang.String TRACK_NAME = "InteractionJankMonitor";
        private final int mBgColor = 0;
        final int mCujFontSize = 0;
        final float mCujNameTextHeight = 0.0f;
        final float mCujStatusWidth = 0.0f;
        private final android.graphics.Paint.FontMetrics mDebugFontMetrics = null;
        private final android.graphics.Paint mDebugPaint = null;
        private final float mDensity = 0.0f;
        final int mPackageNameFontSize = 0;
        private final java.lang.String mPackageNameText = null;
        final float mPackageNameTextHeight = 0.0f;
        final float mPackageNameWidth = 0.0f;
        final int mPadding = 0;
        private final double mYOffset = 0.0;
        private DebugOverlayView(com.android.internal.jank.InteractionMonitorDebugOverlay p0, android.content.Context p1, int p2, double p3) { super((android.content.Context)null); }
        private int dipToPx(int p0) { return 0; }
        private float getTextHeight(int p0) { return 0.0f; }
        private float getWidthOfLongestCujName(int p0) { return 0.0f; }
        private float getWidthOfText(java.lang.String p0, int p1) { return 0.0f; }
        protected void onDraw(android.graphics.Canvas p0) {}
    }

    private static class TrackerState {
        final int mCookie = 0;
        final java.lang.String mName = null;
        int mState;
        private TrackerState(java.lang.String p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface TrackerStatus {
    }
}
