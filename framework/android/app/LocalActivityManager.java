package android.app;

@java.lang.Deprecated
public class LocalActivityManager {
    static final int CREATED = 2;
    static final int DESTROYED = 5;
    static final int INITIALIZING = 1;
    static final int RESTORED = 0;
    static final int RESUMED = 4;
    static final int STARTED = 3;
    private static final java.lang.String TAG = "LocalActivityManager";
    private static final boolean localLOGV = false;
    private final java.util.Map<java.lang.String, android.app.LocalActivityManager.LocalActivityRecord> mActivities = null;
    private final java.util.ArrayList<android.app.LocalActivityManager.LocalActivityRecord> mActivityArray = null;
    private final android.app.ActivityThread mActivityThread = null;
    private int mCurState;
    private boolean mFinishing;
    private final android.app.Activity mParent = null;
    private android.app.LocalActivityManager.LocalActivityRecord mResumed;
    private boolean mSingleMode;
    public LocalActivityManager(android.app.Activity p0, boolean p1) {}
    private void moveToState(android.app.LocalActivityManager.LocalActivityRecord p0, int p1) {}
    private android.view.Window performDestroy(android.app.LocalActivityManager.LocalActivityRecord p0, boolean p1) { return null; }
    private void performPause(android.app.LocalActivityManager.LocalActivityRecord p0, boolean p1) {}
    public android.view.Window destroyActivity(java.lang.String p0, boolean p1) { return null; }
    public void dispatchCreate(android.os.Bundle p0) {}
    public void dispatchDestroy(boolean p0) {}
    public void dispatchPause(boolean p0) {}
    public void dispatchResume() {}
    public java.util.HashMap<java.lang.String, java.lang.Object> dispatchRetainNonConfigurationInstance() { return null; }
    public void dispatchStop() {}
    public android.app.Activity getActivity(java.lang.String p0) { return null; }
    public android.app.Activity getCurrentActivity() { return null; }
    public java.lang.String getCurrentId() { return null; }
    public void removeAllActivities() {}
    public android.os.Bundle saveInstanceState() { return null; }
    public android.view.Window startActivity(java.lang.String p0, android.content.Intent p1) { return null; }

    private static class LocalActivityRecord extends android.os.Binder {
        android.app.Activity activity;
        android.content.pm.ActivityInfo activityInfo;
        int curState;
        final java.lang.String id = null;
        android.os.Bundle instanceState;
        android.content.Intent intent;
        android.view.Window window;
        LocalActivityRecord(java.lang.String p0, android.content.Intent p1) { super(); }
    }
}
