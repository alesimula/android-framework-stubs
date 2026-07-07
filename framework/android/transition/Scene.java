package android.transition;

public final class Scene {
    private android.content.Context mContext;
    java.lang.Runnable mEnterAction;
    java.lang.Runnable mExitAction;
    private android.view.View mLayout;
    private int mLayoutId;
    private android.view.ViewGroup mSceneRoot;
    public Scene(android.view.ViewGroup p0) {}
    private Scene(android.view.ViewGroup p0, int p1, android.content.Context p2) {}
    public Scene(android.view.ViewGroup p0, android.view.View p1) {}
    @java.lang.Deprecated
    public Scene(android.view.ViewGroup p0, android.view.ViewGroup p1) {}
    public static android.transition.Scene getCurrentScene(android.view.ViewGroup p0) { return null; }
    public static android.transition.Scene getSceneForLayout(android.view.ViewGroup p0, int p1, android.content.Context p2) { return null; }
    static void setCurrentScene(android.view.ViewGroup p0, android.transition.Scene p1) {}
    public void enter() {}
    public void exit() {}
    public android.view.ViewGroup getSceneRoot() { return null; }
    boolean isCreatedFromLayoutResource() { return false; }
    public void setEnterAction(java.lang.Runnable p0) {}
    public void setExitAction(java.lang.Runnable p0) {}
}
