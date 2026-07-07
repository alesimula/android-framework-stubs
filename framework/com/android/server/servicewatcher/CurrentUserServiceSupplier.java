package com.android.server.servicewatcher;

public final class CurrentUserServiceSupplier extends android.content.BroadcastReceiver implements com.android.server.servicewatcher.ServiceWatcher.ServiceSupplier<com.android.server.servicewatcher.CurrentUserServiceSupplier.BoundServiceInfo> {
    private static final java.lang.String EXTRA_SERVICE_IS_MULTIUSER = "serviceIsMultiuser";
    private static final java.lang.String EXTRA_SERVICE_VERSION = "serviceVersion";
    private static final java.lang.String NO_MATCH_PACKAGE = "";
    private static final java.lang.String TAG = "CurrentUserServiceSupplier";
    private static final java.util.Comparator<com.android.server.servicewatcher.CurrentUserServiceSupplier.BoundServiceInfo> sBoundServiceInfoComparator = null;
    private final android.app.ActivityManagerInternal mActivityManager = null;
    private final java.lang.String mCallerPermission = null;
    private final android.content.Context mContext = null;
    private final android.content.Intent mIntent = null;
    private volatile com.android.server.servicewatcher.ServiceWatcher.ServiceChangedListener mListener;
    private final boolean mMatchSystemAppsOnly = false;
    private final java.lang.String mServicePermission = null;
    private java.lang.String mUnstableService;
    private CurrentUserServiceSupplier(android.content.Context p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, boolean p5) { super(); }
    public static com.android.server.servicewatcher.CurrentUserServiceSupplier create(android.content.Context p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) { return null; }
    public static com.android.server.servicewatcher.CurrentUserServiceSupplier createFromConfig(android.content.Context p0, java.lang.String p1, int p2, int p3) { return null; }
    public static com.android.server.servicewatcher.CurrentUserServiceSupplier createUnsafeForTestsOnly(android.content.Context p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) { return null; }
    private static java.lang.String retrieveExplicitPackage(android.content.Context p0, int p1, int p2) { return null; }
    public void alertUnstableService(java.lang.String p0) {}
    public com.android.server.servicewatcher.CurrentUserServiceSupplier.BoundServiceInfo getServiceInfo() { return null; }
    public boolean hasMatchingService() { return false; }
    public void onReceive(android.content.Context p0, android.content.Intent p1) {}
    public void register(com.android.server.servicewatcher.ServiceWatcher.ServiceChangedListener p0) {}
    public void unregister() {}

    public static class BoundServiceInfo extends com.android.server.servicewatcher.ServiceWatcher.BoundServiceInfo {
        private final android.os.Bundle mMetadata = null;
        private final int mVersion = 0;
        protected BoundServiceInfo(java.lang.String p0, int p1, android.content.ComponentName p2, int p3, android.os.Bundle p4) { super((java.lang.String)null, (android.content.pm.ResolveInfo)null); }
        protected BoundServiceInfo(java.lang.String p0, android.content.pm.ResolveInfo p1) { super((java.lang.String)null, (android.content.pm.ResolveInfo)null); }
        private static int parseUid(android.content.pm.ResolveInfo p0) { return 0; }
        private static int parseVersion(android.content.pm.ResolveInfo p0) { return 0; }
        public android.os.Bundle getMetadata() { return null; }
        public int getVersion() { return 0; }
        public java.lang.String toString() { return null; }
    }
}
