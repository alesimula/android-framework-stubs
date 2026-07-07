package com.android.internal.app;

public class PlatLogoActivity extends android.app.Activity {
    private static final java.lang.String EGG_UNLOCK_SETTING = "egg_mode_v";
    private static final boolean FINISH_AFTER_NEXT_STAGE_LAUNCH = false;
    private static final long LAUNCH_TIME = 5000L;
    private static final float MAX_WARP = 16.0f;
    private static final float MIN_WARP = 1.0f;
    private static final java.lang.String TAG = "PlatLogoActivity";
    static final java.lang.String TOUCH_STATS = "touch.stats";
    private static final android.graphics.ColorSpace sSrgbExt = null;
    private android.animation.TimeAnimator mAnim;
    private boolean mAnimationsEnabled;
    private float mDp;
    private android.view.View mHeptaDecaView;
    private final java.lang.Runnable mLaunchNextStage = null;
    private android.widget.FrameLayout mLayout;
    private android.widget.ImageView mLogo;
    double mPressureMax;
    double mPressureMin;
    private java.util.Random mRandom;
    private com.android.internal.app.PlatLogoActivity.RumblePack mRumble;
    private com.android.internal.app.PlatLogoActivity.Starfield mStarfield;
    private final android.animation.TimeAnimator.TimeListener mTimeListener = null;
    private final android.view.View.OnTouchListener mTouchListener = null;
    private android.animation.ObjectAnimator mWarpAnim;
    public PlatLogoActivity() { super(); }
    private void launchNextStage(boolean p0) {}
    private void measureTouchPressure(android.view.MotionEvent p0) {}
    private static long packHdrWhite(float p0, float p1) { return 0L; }
    private static boolean pointInRadius(float p0, float p1, float p2) { return false; }
    private boolean shouldWriteSettings() { return false; }
    private void startAnimating() {}
    private void startWarp() {}
    private void stopAnimating() {}
    private void stopWarp() {}
    private void swapToPlatlogo() {}
    private void syncTouchPressure() {}
    protected void onCreate(android.os.Bundle p0) {}
    protected void onDestroy() {}
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
    public void onPause() {}
    public void onResume() {}
    public void onStart() {}
    public void onStop() {}

    private static class Heptadecagram extends android.graphics.drawable.Drawable {
        public static final int MAX_DOTS = 17;
        private final android.graphics.Paint mBgPaint = null;
        private final android.graphics.Paint mDotPaint = null;
        private float mDotRadius;
        private final float[] mDotsXY = null;
        private final float mDp = 0.0f;
        private android.graphics.Path mDrawingPath;
        private float mHitRadius;
        private boolean mIsTracking;
        private final android.graphics.Paint mLinePaint = null;
        private final int[] mPath = null;
        private int mPathLength;
        private float mRadius;
        private float mTouchX;
        private float mTouchY;
        Heptadecagram(float p0) { super(); }
        private boolean checkDot(float p0, float p1) { return false; }
        private void drawTargetDot(android.graphics.Canvas p0, float p1, float p2, float p3, android.graphics.Paint p4) {}
        public void draw(android.graphics.Canvas p0) {}
        public int getOpacity() { return 0; }
        public int getPathLength() { return 0; }
        public void onBoundsChange(android.graphics.Rect p0) {}
        public boolean onTouch(android.view.MotionEvent p0) { return false; }
        public void setAlpha(int p0) {}
        public void setColorFilter(android.graphics.ColorFilter p0) {}
    }

    private class RumblePack implements android.os.Handler.Callback {
        private static final int INTERVAL = 50;
        private static final int MSG = 6464;
        private long mLastVibe;
        private boolean mSpinPrimitiveSupported;
        private final android.os.Handler mVibeHandler = null;
        private final android.os.VibratorManager mVibeMan = null;
        private final android.os.HandlerThread mVibeThread = null;
        RumblePack(com.android.internal.app.PlatLogoActivity p0) {}
        private void rumble(float p0) {}
        public void destroy() {}
        public boolean handleMessage(android.os.Message p0) { return false; }
    }

    private static class Starfield extends android.graphics.drawable.Drawable {
        private static final int NUM_PLANES = 4;
        private static final int NUM_STARS = 128;
        private static final float ROTATION = 45.0f;
        private float mBuffer;
        private long mDt;
        private float mRadius;
        private final java.util.Random mRng = null;
        private final float mSize = 0.0f;
        private final android.graphics.Paint mStarPaint = null;
        private final float[] mStars = null;
        private float mWarp;
        Starfield(java.util.Random p0, float p1) { super(); }
        public void draw(android.graphics.Canvas p0) {}
        public int getOpacity() { return 0; }
        public float getWarp() { return 0.0f; }
        public void onBoundsChange(android.graphics.Rect p0) {}
        public void setAlpha(int p0) {}
        public void setColorFilter(android.graphics.ColorFilter p0) {}
        public void setWarp(float p0) {}
        public void update(long p0) {}
    }
}
