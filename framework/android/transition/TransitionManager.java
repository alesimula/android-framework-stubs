package android.transition;

public class TransitionManager {
    private static final java.lang.String[] EMPTY_STRINGS = null;
    private static java.lang.String LOG_TAG;
    private static android.transition.Transition sDefaultTransition;
    private static java.util.ArrayList<android.view.ViewGroup> sPendingTransitions;
    private static java.lang.ThreadLocal<java.lang.ref.WeakReference<android.util.ArrayMap<android.view.ViewGroup, java.util.ArrayList<android.transition.Transition>>>> sRunningTransitions;
    android.util.ArrayMap<android.transition.Scene, android.util.ArrayMap<android.transition.Scene, android.transition.Transition>> mScenePairTransitions;
    android.util.ArrayMap<android.transition.Scene, android.transition.Transition> mSceneTransitions;
    public TransitionManager() {}
    public static void beginDelayedTransition(android.view.ViewGroup p0) {}
    public static void beginDelayedTransition(android.view.ViewGroup p0, android.transition.Transition p1) {}
    private static void changeScene(android.transition.Scene p0, android.transition.Transition p1) {}
    public static void endTransitions(android.view.ViewGroup p0) {}
    public static android.transition.Transition getDefaultTransition() { return null; }
    private static android.util.ArrayMap<android.view.ViewGroup, java.util.ArrayList<android.transition.Transition>> getRunningTransitions() { return null; }
    public static void go(android.transition.Scene p0) {}
    public static void go(android.transition.Scene p0, android.transition.Transition p1) {}
    private static void sceneChangeRunTransition(android.view.ViewGroup p0, android.transition.Transition p1) {}
    private static void sceneChangeSetup(android.view.ViewGroup p0, android.transition.Transition p1) {}
    public android.transition.Transition getTransition(android.transition.Scene p0) { return null; }
    public void setDefaultTransition(android.transition.Transition p0) {}
    public void setTransition(android.transition.Scene p0, android.transition.Scene p1, android.transition.Transition p2) {}
    public void setTransition(android.transition.Scene p0, android.transition.Transition p1) {}
    public void transitionTo(android.transition.Scene p0) {}

    private static class MultiListener implements android.view.ViewTreeObserver.OnPreDrawListener, android.view.View.OnAttachStateChangeListener {
        android.view.ViewGroup mSceneRoot;
        android.transition.Transition mTransition;
        final android.view.ViewTreeObserver mViewTreeObserver = null;
        MultiListener(android.transition.Transition p0, android.view.ViewGroup p1) {}
        private void removeListeners() {}
        public boolean onPreDraw() { return false; }
        public void onViewAttachedToWindow(android.view.View p0) {}
        public void onViewDetachedFromWindow(android.view.View p0) {}
    }
}
