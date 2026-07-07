package android.window;

public abstract class DisplayWindowPolicyController {
    private final java.util.Set<java.lang.Integer> mSupportedWindowingModes = null;
    private int mSystemWindowFlags;
    private int mWindowFlags;
    public DisplayWindowPolicyController() {}
    public abstract boolean canActivityBeLaunched(android.content.pm.ActivityInfo p0, android.content.Intent p1, int p2, int p3, boolean p4, boolean p5, java.util.function.Supplier<android.content.IntentSender> p6);
    public boolean canContainActivities(java.util.List<android.content.pm.ActivityInfo> p0, int p1) { return false; }
    protected abstract boolean canContainActivity(android.content.pm.ActivityInfo p0, int p1, int p2, boolean p3);
    public abstract boolean canShowTasksInHostDeviceRecents();
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    public abstract android.content.ComponentName getCustomHomeComponent();
    public boolean isEnteringPipAllowed(int p0) { return false; }
    public final boolean isInterestedWindowFlags(int p0, int p1) { return false; }
    public final boolean isWindowingModeSupported(int p0) { return false; }
    public abstract boolean keepActivityOnWindowFlagsChanged(android.content.pm.ActivityInfo p0, int p1, int p2);
    public void onRunningAppsChanged(android.util.ArraySet<android.util.Pair<java.lang.Integer, java.lang.String>> p0) {}
    public void onTopActivityChanged(android.content.ComponentName p0, int p1, int p2) {}
    public final void setInterestedWindowFlags(int p0, int p1) {}
    public final void setSupportedWindowingModes(java.util.Set<java.lang.Integer> p0) {}
}
