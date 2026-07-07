package android.app;

@java.lang.Deprecated
public class ActivityGroup extends android.app.Activity {
    static final java.lang.String PARENT_NON_CONFIG_INSTANCE_KEY = "android:parent_non_config_instance";
    private static final java.lang.String STATES_KEY = "android:states";
    protected android.app.LocalActivityManager mLocalActivityManager;
    public ActivityGroup() { super(); }
    public ActivityGroup(boolean p0) { super(); }
    void dispatchActivityResult(java.lang.String p0, int p1, int p2, android.content.Intent p3, android.app.ComponentCaller p4, java.lang.String p5) {}
    public android.app.Activity getCurrentActivity() { return null; }
    public final android.app.LocalActivityManager getLocalActivityManager() { return null; }
    protected void onCreate(android.os.Bundle p0) {}
    protected void onDestroy() {}
    protected void onPause() {}
    protected void onResume() {}
    public java.util.HashMap<java.lang.String, java.lang.Object> onRetainNonConfigurationChildInstances() { return null; }
    protected void onSaveInstanceState(android.os.Bundle p0) {}
    protected void onStop() {}
}
