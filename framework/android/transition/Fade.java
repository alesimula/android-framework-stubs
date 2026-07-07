package android.transition;

public class Fade extends android.transition.Visibility {
    private static boolean DBG;
    public static final int IN = 1;
    private static final java.lang.String LOG_TAG = "Fade";
    public static final int OUT = 2;
    static final java.lang.String PROPNAME_TRANSITION_ALPHA = "android:fade:transitionAlpha";
    public Fade() { super(); }
    public Fade(int p0) { super(); }
    public Fade(android.content.Context p0, android.util.AttributeSet p1) { super(); }
    private android.animation.Animator createAnimation(android.view.View p0, float p1, float p2) { return null; }
    private static float getStartAlpha(android.transition.TransitionValues p0, float p1) { return 0.0f; }
    public void captureStartValues(android.transition.TransitionValues p0) {}
    public android.animation.Animator onAppear(android.view.ViewGroup p0, android.view.View p1, android.transition.TransitionValues p2, android.transition.TransitionValues p3) { return null; }
    public android.animation.Animator onDisappear(android.view.ViewGroup p0, android.view.View p1, android.transition.TransitionValues p2, android.transition.TransitionValues p3) { return null; }

    private static class FadeAnimatorListener extends android.animation.AnimatorListenerAdapter {
        private boolean mLayerTypeChanged;
        private final android.view.View mView = null;
        public FadeAnimatorListener(android.view.View p0) { super(); }
        public void onAnimationEnd(android.animation.Animator p0) {}
        public void onAnimationStart(android.animation.Animator p0) {}
    }
}
