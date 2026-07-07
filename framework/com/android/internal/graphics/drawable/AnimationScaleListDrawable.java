package com.android.internal.graphics.drawable;

public class AnimationScaleListDrawable extends android.graphics.drawable.DrawableContainer implements android.graphics.drawable.Animatable {
    private static final java.lang.String TAG = "AnimationScaleListDrawable";
    private com.android.internal.graphics.drawable.AnimationScaleListDrawable.AnimationScaleListState mAnimationScaleListState;
    private boolean mMutated;
    public AnimationScaleListDrawable() { super(); }
    private AnimationScaleListDrawable(com.android.internal.graphics.drawable.AnimationScaleListDrawable.AnimationScaleListState p0, android.content.res.Resources p1) { super(); }
    private void inflateChildElements(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public void applyTheme(android.content.res.Resources.Theme p0) {}
    public void clearMutated() {}
    public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public boolean isRunning() { return false; }
    public android.graphics.drawable.Drawable mutate() { return null; }
    protected boolean onStateChange(int[] p0) { return false; }
    protected void setConstantState(android.graphics.drawable.DrawableContainer.DrawableContainerState p0) {}
    public void start() {}
    public void stop() {}

    static class AnimationScaleListState extends android.graphics.drawable.DrawableContainer.DrawableContainerState {
        int mAnimatableDrawableIndex;
        int mStaticDrawableIndex;
        int[] mThemeAttrs;
        AnimationScaleListState(com.android.internal.graphics.drawable.AnimationScaleListDrawable.AnimationScaleListState p0, com.android.internal.graphics.drawable.AnimationScaleListDrawable p1, android.content.res.Resources p2) { super(null, null, null); }
        int addDrawable(android.graphics.drawable.Drawable p0) { return 0; }
        public boolean canApplyTheme() { return false; }
        public int getCurrentDrawableIndexBasedOnScale() { return 0; }
        void mutate() {}
        public android.graphics.drawable.Drawable newDrawable() { return null; }
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p0) { return null; }
    }
}
