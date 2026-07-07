package android.graphics.drawable;

public class AnimationDrawable extends android.graphics.drawable.DrawableContainer implements java.lang.Runnable, android.graphics.drawable.Animatable {
    private boolean mAnimating;
    private android.graphics.drawable.AnimationDrawable.AnimationState mAnimationState;
    private int mCurFrame;
    private boolean mMutated;
    private boolean mRunning;
    public AnimationDrawable() { super(); }
    private AnimationDrawable(android.graphics.drawable.AnimationDrawable.AnimationState p0, android.content.res.Resources p1) { super(); }
    private void inflateChildElements(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    private void nextFrame(boolean p0) {}
    private void setFrame(int p0, boolean p1, boolean p2) {}
    private void updateStateFromTypedArray(android.content.res.TypedArray p0) {}
    public void addFrame(android.graphics.drawable.Drawable p0, int p1) {}
    public void clearMutated() {}
    android.graphics.drawable.AnimationDrawable.AnimationState cloneConstantState() { return null; }
    public int getDuration(int p0) { return 0; }
    public android.graphics.drawable.Drawable getFrame(int p0) { return null; }
    public int getNumberOfFrames() { return 0; }
    public long getTotalDuration() { return 0L; }
    public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public boolean isOneShot() { return false; }
    public boolean isRunning() { return false; }
    public android.graphics.drawable.Drawable mutate() { return null; }
    public void run() {}
    protected void setConstantState(android.graphics.drawable.DrawableContainer.DrawableContainerState p0) {}
    public void setOneShot(boolean p0) {}
    public boolean setVisible(boolean p0, boolean p1) { return false; }
    public void start() {}
    public void stop() {}
    public void unscheduleSelf(java.lang.Runnable p0) {}

    private static final class AnimationState extends android.graphics.drawable.DrawableContainer.DrawableContainerState {
        private int[] mDurations;
        private boolean mOneShot;
        AnimationState(android.graphics.drawable.AnimationDrawable.AnimationState p0, android.graphics.drawable.AnimationDrawable p1, android.content.res.Resources p2) { super(null, null, null); }
        private void mutate() {}
        public void addFrame(android.graphics.drawable.Drawable p0, int p1) {}
        public long getTotalDuration() { return 0L; }
        public void growArray(int p0, int p1) {}
        public android.graphics.drawable.Drawable newDrawable() { return null; }
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p0) { return null; }
    }
}
