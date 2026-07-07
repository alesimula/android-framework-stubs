package android.graphics.drawable;

public class AnimatedRotateDrawable extends android.graphics.drawable.DrawableWrapper implements android.graphics.drawable.Animatable {
    private float mCurrentDegrees;
    private float mIncrement;
    private final java.lang.Runnable mNextFrame = null;
    private boolean mRunning;
    private android.graphics.drawable.AnimatedRotateDrawable.AnimatedRotateState mState;
    public AnimatedRotateDrawable() { super((android.graphics.drawable.Drawable)null); }
    private AnimatedRotateDrawable(android.graphics.drawable.AnimatedRotateDrawable.AnimatedRotateState p0, android.content.res.Resources p1) { super((android.graphics.drawable.Drawable)null); }
    private void nextFrame() {}
    private void updateLocalState() {}
    private void updateStateFromTypedArray(android.content.res.TypedArray p0) {}
    private void verifyRequiredAttributes(android.content.res.TypedArray p0) throws org.xmlpull.v1.XmlPullParserException {}
    public void applyTheme(android.content.res.Resources.Theme p0) {}
    public void draw(android.graphics.Canvas p0) {}
    public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public boolean isRunning() { return false; }
    android.graphics.drawable.DrawableWrapper.DrawableWrapperState mutateConstantState() { return null; }
    public void setFramesCount(int p0) {}
    public void setFramesDuration(int p0) {}
    public boolean setVisible(boolean p0, boolean p1) { return false; }
    public void start() {}
    public void stop() {}

    static final class AnimatedRotateState extends android.graphics.drawable.DrawableWrapper.DrawableWrapperState {
        int mFrameDuration;
        int mFramesCount;
        float mPivotX;
        boolean mPivotXRel;
        float mPivotY;
        boolean mPivotYRel;
        private int[] mThemeAttrs;
        public AnimatedRotateState(android.graphics.drawable.AnimatedRotateDrawable.AnimatedRotateState p0, android.content.res.Resources p1) { super(null, null); }
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p0) { return null; }
    }
}
