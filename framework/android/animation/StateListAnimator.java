package android.animation;

public class StateListAnimator implements java.lang.Cloneable {
    private android.animation.AnimatorListenerAdapter mAnimatorListener;
    private int mChangingConfigurations;
    private android.animation.StateListAnimator.StateListAnimatorConstantState mConstantState;
    private android.animation.StateListAnimator.Tuple mLastMatch;
    private android.animation.Animator mRunningAnimator;
    private java.util.ArrayList<android.animation.StateListAnimator.Tuple> mTuples;
    private java.lang.ref.WeakReference<android.view.View> mViewRef;
    public StateListAnimator() {}
    private void cancel() {}
    private void clearTarget() {}
    private void initAnimatorListener() {}
    private void start(android.animation.StateListAnimator.Tuple p0) {}
    public void addState(int[] p0, android.animation.Animator p1) {}
    public void appendChangingConfigurations(int p0) {}
    public android.animation.StateListAnimator clone() { return null; }
    public android.content.res.ConstantState<android.animation.StateListAnimator> createConstantState() { return null; }
    public int getChangingConfigurations() { return 0; }
    public android.animation.Animator getRunningAnimator() { return null; }
    public android.view.View getTarget() { return null; }
    public java.util.ArrayList<android.animation.StateListAnimator.Tuple> getTuples() { return null; }
    public void jumpToCurrentState() {}
    public void setChangingConfigurations(int p0) {}
    public void setState(int[] p0) {}
    public void setTarget(android.view.View p0) {}

    private static class StateListAnimatorConstantState extends android.content.res.ConstantState<android.animation.StateListAnimator> {
        final android.animation.StateListAnimator mAnimator = null;
        int mChangingConf;
        public StateListAnimatorConstantState(android.animation.StateListAnimator p0) { super(); }
        public int getChangingConfigurations() { return 0; }
        public android.animation.StateListAnimator newInstance() { return null; }
    }

    public static class Tuple {
        final android.animation.Animator mAnimator = null;
        final int[] mSpecs = null;
        private Tuple(int[] p0, android.animation.Animator p1) {}
        public android.animation.Animator getAnimator() { return null; }
        public int[] getSpecs() { return null; }
    }
}
