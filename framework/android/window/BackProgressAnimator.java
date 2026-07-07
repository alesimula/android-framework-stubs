package android.window;

public class BackProgressAnimator implements com.android.internal.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener {
    private static final float BUTTON_SPRING_STIFFNESS = 100.0f;
    private static final android.util.FloatProperty<android.window.BackProgressAnimator> PROGRESS_PROP = null;
    private static final float SCALE_FACTOR = 100.0f;
    private boolean mBackAnimationInProgress;
    private android.window.OnBackAnimationCallback mBackCallback;
    private java.lang.Runnable mBackCancelledFinishRunnable;
    private final com.android.internal.dynamicanimation.animation.SpringForce mButtonSpringForce = null;
    private android.window.BackProgressAnimator.ProgressCallback mCallback;
    private final com.android.internal.dynamicanimation.animation.SpringForce mGestureSpringForce = null;
    private android.window.BackMotionEvent mLastBackEvent;
    private final com.android.internal.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener mOnAnimationEndListener = null;
    private float mProgress;
    private final com.android.internal.dynamicanimation.animation.SpringAnimation mSpring = null;
    private float mVelocity;
    public BackProgressAnimator() {}
    private float getProgress() { return 0.0f; }
    private void invokeBackCancelledRunnable() {}
    private void setProgress(float p0) {}
    private void updateProgressValue(float p0, float p1, long p2) {}
    public android.window.OnBackAnimationCallback getActiveBackCallback() { return null; }
    public float getVelocity() { return 0.0f; }
    public boolean isBackAnimationInProgress() { return false; }
    public void onAnimationUpdate(com.android.internal.dynamicanimation.animation.DynamicAnimation p0, float p1, float p2) {}
    public void onBackCancelled(java.lang.Runnable p0) {}
    public void onBackProgressed(android.window.BackMotionEvent p0) {}
    public void onBackStarted(android.window.BackMotionEvent p0, android.window.BackProgressAnimator.ProgressCallback p1) {}
    public void onBackStarted(android.window.BackMotionEvent p0, android.window.BackProgressAnimator.ProgressCallback p1, android.window.OnBackAnimationCallback p2) {}
    public void removeOnBackCancelledFinishCallback() {}
    public void reset() {}

    public static interface ProgressCallback {
        public void onProgressUpdate(android.window.BackEvent p0);
    }
}
