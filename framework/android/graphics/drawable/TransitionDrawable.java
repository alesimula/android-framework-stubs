package android.graphics.drawable;

public class TransitionDrawable extends android.graphics.drawable.LayerDrawable implements android.graphics.drawable.Drawable.Callback {
    private static final int TRANSITION_NONE = 2;
    private static final int TRANSITION_RUNNING = 1;
    private static final int TRANSITION_STARTING = 0;
    private int mAlpha;
    private boolean mCrossFade;
    private int mDuration;
    private int mFrom;
    private int mOriginalDuration;
    private boolean mReverse;
    private long mStartTimeMillis;
    private int mTo;
    private int mTransitionState;
    TransitionDrawable() { super((android.graphics.drawable.Drawable[])null); }
    private TransitionDrawable(android.graphics.drawable.TransitionDrawable.TransitionState p0, android.content.res.Resources p1) { super((android.graphics.drawable.Drawable[])null); }
    private TransitionDrawable(android.graphics.drawable.TransitionDrawable.TransitionState p0, android.graphics.drawable.Drawable[] p1) { super((android.graphics.drawable.Drawable[])null); }
    public TransitionDrawable(android.graphics.drawable.Drawable[] p0) { super((android.graphics.drawable.Drawable[])null); }
    android.graphics.drawable.LayerDrawable.LayerState createConstantState(android.graphics.drawable.LayerDrawable.LayerState p0, android.content.res.Resources p1) { return null; }
    public void draw(android.graphics.Canvas p0) {}
    public boolean isCrossFadeEnabled() { return false; }
    public void resetTransition() {}
    public void reverseTransition(int p0) {}
    public void setCrossFadeEnabled(boolean p0) {}
    public void showSecondLayer() {}
    public void startTransition(int p0) {}

    static class TransitionState extends android.graphics.drawable.LayerDrawable.LayerState {
        TransitionState(android.graphics.drawable.TransitionDrawable.TransitionState p0, android.graphics.drawable.TransitionDrawable p1, android.content.res.Resources p2) { super(null, null, null); }
        public int getChangingConfigurations() { return 0; }
        public android.graphics.drawable.Drawable newDrawable() { return null; }
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p0) { return null; }
    }
}
