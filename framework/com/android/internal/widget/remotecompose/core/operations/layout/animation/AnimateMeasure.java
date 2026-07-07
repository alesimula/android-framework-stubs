package com.android.internal.widget.remotecompose.core.operations.layout.animation;

public class AnimateMeasure {
    protected final com.android.internal.widget.remotecompose.core.operations.layout.Component mComponent = null;
    protected float mDuration;
    protected float mDurationVisibilityChange;
    protected com.android.internal.widget.remotecompose.core.operations.layout.animation.AnimationSpec.ANIMATION mEnterAnimation;
    protected com.android.internal.widget.remotecompose.core.operations.layout.animation.AnimationSpec.ANIMATION mExitAnimation;
    protected com.android.internal.widget.remotecompose.core.operations.utilities.easing.FloatAnimation mMotionEasing;
    protected int mMotionEasingType;
    protected final com.android.internal.widget.remotecompose.core.operations.layout.measure.ComponentMeasure mOriginal = null;
    protected float mP;
    protected com.android.internal.widget.remotecompose.core.operations.layout.animation.ParticleAnimation mParticleAnimation;
    protected long mStartTime;
    protected final com.android.internal.widget.remotecompose.core.operations.layout.measure.ComponentMeasure mTarget = null;
    protected com.android.internal.widget.remotecompose.core.operations.utilities.easing.FloatAnimation mVisibilityEasing;
    protected int mVisibilityEasingType;
    protected float mVp;
    public com.android.internal.widget.remotecompose.core.operations.paint.PaintBundle paint;
    public AnimateMeasure(long p0, com.android.internal.widget.remotecompose.core.operations.layout.Component p1, com.android.internal.widget.remotecompose.core.operations.layout.measure.ComponentMeasure p2, com.android.internal.widget.remotecompose.core.operations.layout.measure.ComponentMeasure p3, float p4, float p5, com.android.internal.widget.remotecompose.core.operations.layout.animation.AnimationSpec.ANIMATION p6, com.android.internal.widget.remotecompose.core.operations.layout.animation.AnimationSpec.ANIMATION p7, int p8, int p9) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public float getHeight() { return 0.0f; }
    public float getVisibility() { return 0.0f; }
    public float getWidth() { return 0.0f; }
    public float getX() { return 0.0f; }
    public float getY() { return 0.0f; }
    public boolean isDone() { return false; }
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void update(long p0) {}
    public void updateTarget(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.operations.layout.measure.ComponentMeasure p1, long p2) {}
}
