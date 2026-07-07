package android.app;

public class ComponentOptions {
    public static final java.lang.String KEY_PENDING_INTENT_BACKGROUND_ACTIVITY_ALLOWED = "android.pendingIntent.backgroundActivityAllowed";
    private java.lang.Integer mPendingIntentBalAllowed;
    ComponentOptions() {}
    ComponentOptions(android.os.Bundle p0) {}
    public static android.app.ComponentOptions fromBundle(android.os.Bundle p0) { return null; }
    public int getPendingIntentBackgroundActivityStartMode() { return 0; }
    @java.lang.Deprecated
    public boolean isPendingIntentBackgroundActivityLaunchAllowed() { return false; }
    @java.lang.Deprecated
    public void setPendingIntentBackgroundActivityLaunchAllowed(boolean p0) {}
    public android.app.ComponentOptions setPendingIntentBackgroundActivityStartMode(int p0) { return null; }
    public android.os.Bundle toBundle() { return null; }
}
