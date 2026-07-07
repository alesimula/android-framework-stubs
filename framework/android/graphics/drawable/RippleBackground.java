package android.graphics.drawable;

class RippleBackground extends android.graphics.drawable.RippleComponent {
    private static final android.animation.TimeInterpolator LINEAR_INTERPOLATOR = null;
    private static final android.graphics.drawable.RippleBackground.BackgroundProperty OPACITY = null;
    private static final int OPACITY_DURATION = 80;
    private android.animation.ObjectAnimator mAnimator;
    private boolean mFocused;
    private boolean mHovered;
    private boolean mIsBounded;
    private float mOpacity;
    public RippleBackground(android.graphics.drawable.RippleDrawable p0, android.graphics.Rect p1, boolean p2) { super(null, null); }
    private void onStateChanged() {}
    public void draw(android.graphics.Canvas p0, android.graphics.Paint p1) {}
    public boolean isVisible() { return false; }
    public void jumpToFinal() {}
    public void setState(boolean p0, boolean p1, boolean p2) {}

    private static abstract class BackgroundProperty extends android.util.FloatProperty<android.graphics.drawable.RippleBackground> {
        public BackgroundProperty(java.lang.String p0) { super(null); }
    }
}
