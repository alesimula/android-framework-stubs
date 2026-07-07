package android.inputmethodservice.navigationbar;

final class DeadZone {
    private static final boolean CHATTY = true;
    public static final boolean DEBUG = false;
    private static final android.util.FloatProperty<android.inputmethodservice.navigationbar.DeadZone> FLASH_PROPERTY = null;
    public static final int HORIZONTAL = 0;
    public static final java.lang.String TAG = "DeadZone";
    public static final int VERTICAL = 1;
    private final java.lang.Runnable mDebugFlash = null;
    private int mDecay;
    private int mDisplayRotation;
    private float mFlashFrac;
    private int mHold;
    private long mLastPokeTime;
    private final android.inputmethodservice.navigationbar.NavigationBarView mNavigationBarView = null;
    private boolean mShouldFlash;
    private int mSizeMax;
    private int mSizeMin;
    private boolean mVertical;
    DeadZone(android.inputmethodservice.navigationbar.NavigationBarView p0) {}
    private float getSize(long p0) { return 0.0f; }
    static float lerp(float p0, float p1, float p2) { return 0.0f; }
    private void poke(android.view.MotionEvent p0) {}
    public float getFlash() { return 0.0f; }
    public void onConfigurationChanged(int p0) {}
    public void onDraw(android.graphics.Canvas p0) {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public void setFlash(float p0) {}
    public void setFlashOnTouchCapture(boolean p0) {}
}
