package android.inputmethodservice.navigationbar;

final class ButtonDispatcher {
    private static final int FADE_DURATION_IN = 150;
    private static final int FADE_DURATION_OUT = 250;
    public static final android.view.animation.Interpolator LINEAR = null;
    private android.view.View.AccessibilityDelegate mAccessibilityDelegate;
    private float mAlpha;
    private final android.animation.ValueAnimator.AnimatorUpdateListener mAlphaListener = null;
    private android.view.View.OnClickListener mClickListener;
    private android.view.View mCurrentView;
    private java.lang.Float mDarkIntensity;
    private java.lang.Boolean mDelayTouchFeedback;
    private android.animation.ValueAnimator mFadeAnimator;
    private final android.animation.AnimatorListenerAdapter mFadeListener = null;
    private final int mId = 0;
    private android.inputmethodservice.navigationbar.KeyButtonDrawable mImageDrawable;
    private android.view.View.OnLongClickListener mLongClickListener;
    private java.lang.Boolean mLongClickable;
    private android.view.View.OnHoverListener mOnHoverListener;
    private android.view.View.OnTouchListener mTouchListener;
    private final java.util.ArrayList<android.view.View> mViews = null;
    private int mVisibility;
    ButtonDispatcher(int p0) {}
    public void addView(android.view.View p0) {}
    public void clear() {}
    public float getAlpha() { return 0.0f; }
    public android.view.View getCurrentView() { return null; }
    public int getId() { return 0; }
    public android.inputmethodservice.navigationbar.KeyButtonDrawable getImageDrawable() { return null; }
    public java.util.ArrayList<android.view.View> getViews() { return null; }
    public int getVisibility() { return 0; }
    public boolean isVisible() { return false; }
    public void onDestroy() {}
    public void setAccessibilityDelegate(android.view.View.AccessibilityDelegate p0) {}
    public void setAlpha(float p0) {}
    public void setAlpha(float p0, boolean p1) {}
    public void setAlpha(float p0, boolean p1, long p2) {}
    public void setAlpha(float p0, boolean p1, long p2, boolean p3) {}
    public void setAlpha(float p0, boolean p1, boolean p2) {}
    public void setCurrentView(android.view.View p0) {}
    public void setDarkIntensity(float p0) {}
    public void setDelayTouchFeedback(boolean p0) {}
    public void setImageDrawable(android.inputmethodservice.navigationbar.KeyButtonDrawable p0) {}
    public void setLongClickable(boolean p0) {}
    public void setOnClickListener(android.view.View.OnClickListener p0) {}
    public void setOnHoverListener(android.view.View.OnHoverListener p0) {}
    public void setOnLongClickListener(android.view.View.OnLongClickListener p0) {}
    public void setOnTouchListener(android.view.View.OnTouchListener p0) {}
    public void setTranslation(int p0, int p1, int p2) {}
    public void setVisibility(int p0) {}
}
