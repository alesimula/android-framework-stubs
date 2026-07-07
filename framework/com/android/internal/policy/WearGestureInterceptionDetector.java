package com.android.internal.policy;

public class WearGestureInterceptionDetector {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "WearGestureInterceptor";
    private int mActivePointerId;
    private boolean mDiscardIntercept;
    private float mDownX;
    private float mDownY;
    private final com.android.internal.policy.DecorView mInstalledDecorView = null;
    private boolean mSwiping;
    private final float mSwipingStartThreshold = 0.0f;
    private final float mTouchSlop = 0.0f;
    WearGestureInterceptionDetector(android.content.Context p0, com.android.internal.policy.DecorView p1) {}
    private boolean canScroll(android.view.View p0, boolean p1, boolean p2, float p3, float p4) { return false; }
    private int getIndexForValidPointer(android.view.MotionEvent p0) { return 0; }
    public static boolean isEnabled(android.content.Context p0) { return false; }
    private void resetMembers() {}
    private void updateDiscardIntercept(android.view.MotionEvent p0, int p1) {}
    private void updateSwiping(android.view.MotionEvent p0) {}
    public boolean isIntercepting() { return false; }
    public boolean onInterceptTouchEvent(android.view.MotionEvent p0) { return false; }
}
