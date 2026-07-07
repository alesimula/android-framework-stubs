package com.android.internal.widget;

public class SlidingTab extends android.view.ViewGroup {
    private static final int ANIM_DURATION = 250;
    private static final int ANIM_TARGET_TIME = 500;
    private static final boolean DBG = false;
    private static final int HORIZONTAL = 0;
    private static final java.lang.String LOG_TAG = "SlidingTab";
    private static final float THRESHOLD = 0.6666666865348816f;
    private static final android.os.VibrationAttributes TOUCH_VIBRATION_ATTRIBUTES = null;
    private static final int TRACKING_MARGIN = 50;
    private static final int VERTICAL = 1;
    private static final long VIBRATE_LONG = 40L;
    private static final long VIBRATE_SHORT = 30L;
    private boolean mAnimating;
    private final android.view.animation.Animation.AnimationListener mAnimationDoneListener = null;
    private com.android.internal.widget.SlidingTab.Slider mCurrentSlider;
    private final float mDensity = 0.0f;
    private int mGrabbedState;
    private boolean mHoldLeftOnTransition;
    private boolean mHoldRightOnTransition;
    private final com.android.internal.widget.SlidingTab.Slider mLeftSlider = null;
    private com.android.internal.widget.SlidingTab.OnTriggerListener mOnTriggerListener;
    private final int mOrientation = 0;
    private com.android.internal.widget.SlidingTab.Slider mOtherSlider;
    private final com.android.internal.widget.SlidingTab.Slider mRightSlider = null;
    private float mThreshold;
    private final android.graphics.Rect mTmpRect = null;
    private boolean mTracking;
    private boolean mTriggered;
    private android.os.Vibrator mVibrator;
    public SlidingTab(android.content.Context p0) { super((android.content.Context)null); }
    public SlidingTab(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    private void cancelGrab() {}
    private void dispatchTriggerEvent(int p0) {}
    private boolean isHorizontal() { return false; }
    private void log(java.lang.String p0) {}
    private void moveHandle(float p0, float p1) {}
    private void onAnimationDone() {}
    private void resetView() {}
    private void setGrabbedState(int p0) {}
    private void vibrate(long p0) {}
    private boolean withinView(float p0, float p1, android.view.View p2) { return false; }
    public boolean onInterceptTouchEvent(android.view.MotionEvent p0) { return false; }
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onMeasure(int p0, int p1) {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    protected void onVisibilityChanged(android.view.View p0, int p1) {}
    public void reset(boolean p0) {}
    public void setHoldAfterTrigger(boolean p0, boolean p1) {}
    public void setLeftHintText(int p0) {}
    public void setLeftTabResources(int p0, int p1, int p2, int p3) {}
    public void setOnTriggerListener(com.android.internal.widget.SlidingTab.OnTriggerListener p0) {}
    public void setRightHintText(int p0) {}
    public void setRightTabResources(int p0, int p1, int p2, int p3) {}
    public void setVisibility(int p0) {}
    void startAnimating(boolean p0) {}

    public static interface OnTriggerListener {
        public static final int LEFT_HANDLE = 1;
        public static final int NO_HANDLE = 0;
        public static final int RIGHT_HANDLE = 2;
        public void onGrabbedStateChange(android.view.View p0, int p1);
        public void onTrigger(android.view.View p0, int p1);
    }

    private static class Slider {
        public static final int ALIGN_BOTTOM = 3;
        public static final int ALIGN_LEFT = 0;
        public static final int ALIGN_RIGHT = 1;
        public static final int ALIGN_TOP = 2;
        public static final int ALIGN_UNKNOWN = 4;
        private static final int STATE_ACTIVE = 2;
        private static final int STATE_NORMAL = 0;
        private static final int STATE_PRESSED = 1;
        private int alignment;
        private int alignment_value;
        private int currentState;
        private final android.widget.ImageView tab = null;
        private final android.widget.ImageView target = null;
        private final android.widget.TextView text = null;
        Slider(android.view.ViewGroup p0, int p1, int p2, int p3) {}
        public int getTabHeight() { return 0; }
        public int getTabWidth() { return 0; }
        void hide() {}
        public void hideTarget() {}
        void layout(int p0, int p1, int p2, int p3, int p4) {}
        public void measure(int p0, int p1) {}
        void reset(boolean p0) {}
        void setBarBackgroundResource(int p0) {}
        void setHintText(int p0) {}
        void setIcon(int p0) {}
        void setState(int p0) {}
        void setTabBackgroundResource(int p0) {}
        void setTarget(int p0) {}
        void show(boolean p0) {}
        void showTarget() {}
        public void startAnimation(android.view.animation.Animation p0, android.view.animation.Animation p1) {}
        public void updateDrawableStates() {}
    }
}
