package android.animation;

public class LayoutTransition {
    private static android.animation.TimeInterpolator ACCEL_DECEL_INTERPOLATOR;
    public static final int APPEARING = 2;
    public static final int CHANGE_APPEARING = 0;
    public static final int CHANGE_DISAPPEARING = 1;
    public static final int CHANGING = 4;
    private static android.animation.TimeInterpolator DECEL_INTERPOLATOR;
    private static long DEFAULT_DURATION;
    public static final int DISAPPEARING = 3;
    private static final int FLAG_APPEARING = 1;
    private static final int FLAG_CHANGE_APPEARING = 4;
    private static final int FLAG_CHANGE_DISAPPEARING = 8;
    private static final int FLAG_CHANGING = 16;
    private static final int FLAG_DISAPPEARING = 2;
    private static android.animation.ObjectAnimator defaultChange;
    private static android.animation.ObjectAnimator defaultChangeIn;
    private static android.animation.ObjectAnimator defaultChangeOut;
    private static android.animation.ObjectAnimator defaultFadeIn;
    private static android.animation.ObjectAnimator defaultFadeOut;
    private static android.animation.TimeInterpolator sAppearingInterpolator;
    private static android.animation.TimeInterpolator sChangingAppearingInterpolator;
    private static android.animation.TimeInterpolator sChangingDisappearingInterpolator;
    private static android.animation.TimeInterpolator sChangingInterpolator;
    private static android.animation.TimeInterpolator sDisappearingInterpolator;
    private final java.util.LinkedHashMap<android.view.View, android.animation.Animator> currentAppearingAnimations = null;
    private final java.util.LinkedHashMap<android.view.View, android.animation.Animator> currentChangingAnimations = null;
    private final java.util.LinkedHashMap<android.view.View, android.animation.Animator> currentDisappearingAnimations = null;
    private final java.util.HashMap<android.view.View, android.view.View.OnLayoutChangeListener> layoutChangeListenerMap = null;
    private boolean mAnimateParentHierarchy;
    private android.animation.Animator mAppearingAnim;
    private long mAppearingDelay;
    private long mAppearingDuration;
    private android.animation.TimeInterpolator mAppearingInterpolator;
    private android.animation.Animator mChangingAnim;
    private android.animation.Animator mChangingAppearingAnim;
    private long mChangingAppearingDelay;
    private long mChangingAppearingDuration;
    private android.animation.TimeInterpolator mChangingAppearingInterpolator;
    private long mChangingAppearingStagger;
    private long mChangingDelay;
    private android.animation.Animator mChangingDisappearingAnim;
    private long mChangingDisappearingDelay;
    private long mChangingDisappearingDuration;
    private android.animation.TimeInterpolator mChangingDisappearingInterpolator;
    private long mChangingDisappearingStagger;
    private long mChangingDuration;
    private android.animation.TimeInterpolator mChangingInterpolator;
    private long mChangingStagger;
    private android.animation.Animator mDisappearingAnim;
    private long mDisappearingDelay;
    private long mDisappearingDuration;
    private android.animation.TimeInterpolator mDisappearingInterpolator;
    private java.util.ArrayList<android.animation.LayoutTransition.TransitionListener> mListeners;
    private int mTransitionTypes;
    private final java.util.HashMap<android.view.View, android.animation.Animator> pendingAnimations = null;
    private long staggerDelay;
    public LayoutTransition() {}
    private void addChild(android.view.ViewGroup p0, android.view.View p1, boolean p2) {}
    private boolean hasListeners() { return false; }
    private void removeChild(android.view.ViewGroup p0, android.view.View p1, boolean p2) {}
    private void runAppearingTransition(android.view.ViewGroup p0, android.view.View p1) {}
    private void runChangeTransition(android.view.ViewGroup p0, android.view.View p1, int p2) {}
    private void runDisappearingTransition(android.view.ViewGroup p0, android.view.View p1) {}
    private void setupChangeAnimation(android.view.ViewGroup p0, int p1, android.animation.Animator p2, long p3, android.view.View p4) {}
    public void addChild(android.view.ViewGroup p0, android.view.View p1) {}
    public void addTransitionListener(android.animation.LayoutTransition.TransitionListener p0) {}
    public void cancel() {}
    public void cancel(int p0) {}
    public void disableTransitionType(int p0) {}
    public void enableTransitionType(int p0) {}
    public void endChangingAnimations() {}
    public android.animation.Animator getAnimator(int p0) { return null; }
    public long getDuration(int p0) { return 0L; }
    public android.animation.TimeInterpolator getInterpolator(int p0) { return null; }
    public long getStagger(int p0) { return 0L; }
    public long getStartDelay(int p0) { return 0L; }
    public java.util.List<android.animation.LayoutTransition.TransitionListener> getTransitionListeners() { return null; }
    @java.lang.Deprecated
    public void hideChild(android.view.ViewGroup p0, android.view.View p1) {}
    public void hideChild(android.view.ViewGroup p0, android.view.View p1, int p2) {}
    public boolean isChangingLayout() { return false; }
    public boolean isRunning() { return false; }
    public boolean isTransitionTypeEnabled(int p0) { return false; }
    public void layoutChange(android.view.ViewGroup p0) {}
    public void removeChild(android.view.ViewGroup p0, android.view.View p1) {}
    public void removeTransitionListener(android.animation.LayoutTransition.TransitionListener p0) {}
    public void setAnimateParentHierarchy(boolean p0) {}
    public void setAnimator(int p0, android.animation.Animator p1) {}
    public void setDuration(int p0, long p1) {}
    public void setDuration(long p0) {}
    public void setInterpolator(int p0, android.animation.TimeInterpolator p1) {}
    public void setStagger(int p0, long p1) {}
    public void setStartDelay(int p0, long p1) {}
    @java.lang.Deprecated
    public void showChild(android.view.ViewGroup p0, android.view.View p1) {}
    public void showChild(android.view.ViewGroup p0, android.view.View p1, int p2) {}
    public void startChangingAnimations() {}

    private static final class CleanupCallback implements android.view.ViewTreeObserver.OnPreDrawListener, android.view.View.OnAttachStateChangeListener {
        final java.util.Map<android.view.View, android.view.View.OnLayoutChangeListener> layoutChangeListenerMap = null;
        final android.view.ViewGroup parent = null;
        CleanupCallback(java.util.Map<android.view.View, android.view.View.OnLayoutChangeListener> p0, android.view.ViewGroup p1) {}
        private void cleanup() {}
        public boolean onPreDraw() { return false; }
        public void onViewAttachedToWindow(android.view.View p0) {}
        public void onViewDetachedFromWindow(android.view.View p0) {}
    }

    public static interface TransitionListener {
        public void endTransition(android.animation.LayoutTransition p0, android.view.ViewGroup p1, android.view.View p2, int p3);
        public void startTransition(android.animation.LayoutTransition p0, android.view.ViewGroup p1, android.view.View p2, int p3);
    }
}
