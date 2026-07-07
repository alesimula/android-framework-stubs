package android.inputmethodservice.navigationbar;

public class KeyButtonView extends android.widget.ImageView implements android.inputmethodservice.navigationbar.ButtonInterface {
    public static final float QUICKSTEP_TOUCH_SLOP_RATIO = 3.0f;
    private static final java.lang.String TAG = null;
    private android.media.AudioManager mAudioManager;
    private final java.lang.Runnable mCheckLongPress = null;
    private int mCode;
    private float mDarkIntensity;
    private long mDownTime;
    private boolean mGestureAborted;
    private boolean mHasOvalBg;
    private boolean mLongClicked;
    private android.view.View.OnClickListener mOnClickListener;
    private final android.graphics.Paint mOvalBgPaint = null;
    private final boolean mPlaySounds = false;
    private final android.inputmethodservice.navigationbar.KeyButtonRipple mRipple = null;
    private int mTouchDownX;
    private int mTouchDownY;
    private boolean mTracking;
    public KeyButtonView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    private java.lang.CharSequence getAccessibilityLongClickActionLabel() { return null; }
    private static float getQuickStepTouchSlopPx(android.content.Context p0) { return 0.0f; }
    private void sendEvent(int p0, int p1) {}
    private void sendEvent(int p0, int p1, long p2) {}
    public void draw(android.graphics.Canvas p0) {}
    public boolean isClickable() { return false; }
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    protected void onVisibilityChanged(android.view.View p0, int p1) {}
    protected void onWindowVisibilityChanged(int p0) {}
    public boolean performAccessibilityActionInternal(int p0, android.os.Bundle p1) { return false; }
    public void playSoundEffect(int p0) {}
    public void setCode(int p0) {}
    public void setDarkIntensity(float p0) {}
    public void setDelayTouchFeedback(boolean p0) {}
    public void setImageDrawable(android.graphics.drawable.Drawable p0) {}
    public void setOnClickListener(android.view.View.OnClickListener p0) {}
}
