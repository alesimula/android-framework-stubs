package android.app;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
public abstract class HomeVisibilityListener {
    private static final boolean DBG = Boolean.valueOf(false);
    private static final java.lang.String TAG = "HomeVisibilityListener";
    private android.app.ActivityTaskManager mActivityTaskManager;
    private java.util.concurrent.Executor mExecutor;
    boolean mIsHomeActivityVisible;
    private int mMaxScanTasksForHomeVisibility;
    android.app.ProcessObserver mObserver;
    public HomeVisibilityListener() {}
    private boolean isHomeActivityVisible() { return false; }
    void init(android.content.Context p0, java.util.concurrent.Executor p1) {}
    public abstract void onHomeVisibilityChanged(boolean p0);
}
