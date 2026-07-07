package android.app;

public class ForegroundServiceDelegationOptions {
    public static final int DELEGATION_SERVICE_DEFAULT = 0;
    @java.lang.Deprecated
    public static final int DELEGATION_SERVICE_PHONE_CALL = 2;
    public static final int DELEGATION_SERVICE_SPECIAL_USE = 1;
    public static final int DELEGATION_SERVICE_VOIP = 3;
    public final android.app.IApplicationThread mClientAppThread = null;
    public java.lang.String mClientInstanceName;
    public final android.app.Notification mClientNotification = null;
    public final int mClientNotificationId = 0;
    public final java.lang.String mClientPackageName = null;
    public final int mClientPid = 0;
    public final int mClientUid = 0;
    public final int mDelegationService = 0;
    public final int mForegroundServiceTypes = 0;
    public final boolean mSticky = false;
    public ForegroundServiceDelegationOptions(int p0, int p1, java.lang.String p2, android.app.IApplicationThread p3, boolean p4, java.lang.String p5, int p6, int p7) {}
    public ForegroundServiceDelegationOptions(int p0, int p1, java.lang.String p2, android.app.IApplicationThread p3, boolean p4, java.lang.String p5, int p6, int p7, int p8, android.app.Notification p9) {}
    public static java.lang.String serviceCodeToString(int p0) { return null; }
    public android.content.ComponentName getComponentName() { return null; }
    public java.lang.String getDescription() { return null; }
    public boolean isSameDelegate(android.app.ForegroundServiceDelegationOptions p0) { return false; }

    public static class Builder {
        android.app.IApplicationThread mClientAppThread;
        java.lang.String mClientInstanceName;
        android.app.Notification mClientNotification;
        int mClientNotificationId;
        java.lang.String mClientPackageName;
        int mClientPid;
        int mClientUid;
        int mDelegationService;
        int mForegroundServiceTypes;
        boolean mSticky;
        public Builder() {}
        public android.app.ForegroundServiceDelegationOptions build() { return null; }
        public android.app.ForegroundServiceDelegationOptions.Builder setClientAppThread(android.app.IApplicationThread p0) { return null; }
        public android.app.ForegroundServiceDelegationOptions.Builder setClientInstanceName(java.lang.String p0) { return null; }
        public android.app.ForegroundServiceDelegationOptions.Builder setClientNotification(int p0, android.app.Notification p1) { return null; }
        public android.app.ForegroundServiceDelegationOptions.Builder setClientPackageName(java.lang.String p0) { return null; }
        public android.app.ForegroundServiceDelegationOptions.Builder setClientPid(int p0) { return null; }
        public android.app.ForegroundServiceDelegationOptions.Builder setClientUid(int p0) { return null; }
        public android.app.ForegroundServiceDelegationOptions.Builder setDelegationService(int p0) { return null; }
        public android.app.ForegroundServiceDelegationOptions.Builder setForegroundServiceTypes(int p0) { return null; }
        public android.app.ForegroundServiceDelegationOptions.Builder setSticky(boolean p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DelegationService {
    }
}
