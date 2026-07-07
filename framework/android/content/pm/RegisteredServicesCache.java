package android.content.pm;

public abstract class RegisteredServicesCache<V extends java.lang.Object> {
    private static final boolean DEBUG = false;
    protected static final java.lang.String REGISTERED_SERVICES_DIR = "registered_services";
    static final long SERVICE_INFO_CACHES_TIMEOUT_MILLIS = 30000L;
    private static final java.lang.String TAG = "PackageManager";
    private final java.lang.String mAttributesName = null;
    private final android.os.Handler mBackgroundHandler = null;
    public final android.content.Context mContext = null;
    private final android.content.BroadcastReceiver mExternalReceiver = null;
    private android.os.Handler mHandler;
    private final java.lang.String mInterfaceName = null;
    private android.content.pm.RegisteredServicesCacheListener<V> mListener;
    private final java.lang.String mMetaDataName = null;
    private final android.content.BroadcastReceiver mPackageReceiver = null;
    private final android.content.pm.XmlSerializerAndParser<V> mSerializerAndParser = null;
    protected final java.lang.Object mServicesLock = null;
    private final android.util.SparseArrayMap<android.content.ComponentName, android.content.pm.RegisteredServicesCache.ServiceInfo<V>> mUserIdToServiceInfoCaches = null;
    private final android.content.BroadcastReceiver mUserRemovedReceiver = null;
    private final android.util.SparseArray<android.content.pm.RegisteredServicesCache.UserServices<V>> mUserServices = null;
    public RegisteredServicesCache(android.content.Context p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, android.content.pm.XmlSerializerAndParser<V> p4) {}
    public RegisteredServicesCache(android.content.pm.RegisteredServicesCache.Injector<V> p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, android.content.pm.XmlSerializerAndParser<V> p4) {}
    private boolean containsType(java.util.ArrayList<android.content.pm.RegisteredServicesCache.ServiceInfo<V>> p0, V p1) { return false; }
    private boolean containsTypeAndUid(java.util.ArrayList<android.content.pm.RegisteredServicesCache.ServiceInfo<V>> p0, V p1, int p2) { return false; }
    private boolean containsUid(int[] p0, int p1) { return false; }
    private android.util.AtomicFile createFileForUser(int p0) { return null; }
    private android.content.pm.RegisteredServicesCache.UserServices<V> findOrCreateUserLocked(int p0) { return null; }
    private android.content.pm.RegisteredServicesCache.UserServices<V> findOrCreateUserLocked(int p0, boolean p1) { return null; }
    private void generateServicesMap(int[] p0, int p1) {}
    private android.content.pm.RegisteredServicesCache.ServiceInfo<V> getServiceInfoFromServiceCache(int p0, android.content.ComponentName p1, long p2) { return null; }
    private void handlePackageEvent(android.content.Intent p0, int p1) {}
    private void migrateIfNecessaryLocked() {}
    private void notifyListener(V p0, int p1, boolean p2) {}
    private void readPersistentServicesLocked(java.io.InputStream p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    private void writePersistentServicesLocked(android.content.pm.RegisteredServicesCache.UserServices<V> p0, int p1) {}
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2, int p3) {}
    public java.util.Collection<android.content.pm.RegisteredServicesCache.ServiceInfo<V>> getAllServices(int p0) { return null; }
    public boolean getBindInstantServiceAllowed(int p0) { return false; }
    protected java.io.File getDataDirectory() { return null; }
    public android.content.pm.RegisteredServicesCacheListener<V> getListener() { return null; }
    protected java.util.Map<V, java.lang.Integer> getPersistentServices(int p0) { return null; }
    public android.content.pm.RegisteredServicesCache.ServiceInfo<V> getServiceInfo(V p0, int p1) { return null; }
    protected android.content.pm.UserInfo getUser(int p0) { return null; }
    protected java.io.File getUserSystemDirectory(int p0) { return null; }
    protected java.util.List<android.content.pm.UserInfo> getUsers() { return null; }
    protected boolean inSystemImage(int p0) { return false; }
    public void invalidateCache(int p0) {}
    protected void onServicesChangedLocked(int p0) {}
    protected void onUserRemoved(int p0) {}
    public abstract V parseServiceAttributes(android.content.res.Resources p0, java.lang.String p1, android.util.AttributeSet p2);
    protected android.content.pm.RegisteredServicesCache.ServiceInfo<V> parseServiceInfo(android.content.pm.ResolveInfo p0, long p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    protected java.util.List<android.content.pm.ResolveInfo> queryIntentServices(int p0) { return null; }
    public void setBindInstantServiceAllowed(int p0, boolean p1) {}
    public void setListener(android.content.pm.RegisteredServicesCacheListener<V> p0, android.os.Handler p1) {}
    public void unregisterReceivers() {}
    public void updateServices(int p0) {}

    class ClearServiceInfoCachesTimeoutRunnable implements java.lang.Runnable {
        final int mUserId = 0;
        ClearServiceInfoCachesTimeoutRunnable(android.content.pm.RegisteredServicesCache p0, int p1) {}
        public void run() {}
    }

    public static class Injector<V extends java.lang.Object> {
        private final android.content.Context mContext = null;
        public Injector(android.content.Context p0) {}
        public android.os.Handler getBackgroundHandler() { return null; }
        public android.content.Context getContext() { return null; }
    }

    public static class ServiceInfo<V extends java.lang.Object> {
        public final android.content.pm.ComponentInfo componentInfo = null;
        public final android.content.ComponentName componentName = null;
        public final long lastUpdateTime = 0L;
        public final V type = null;
        public final int uid = 0;
        public ServiceInfo(V p0, android.content.pm.ComponentInfo p1, android.content.ComponentName p2, long p3) {}
        public java.lang.String toString() { return null; }
    }

    public static final class ServiceInfoCachesToken<V extends java.lang.Object> {
        public final android.content.pm.RegisteredServicesCache<V> mRegisteredServicesCache = null;
        public final int mUserId = 0;
        public ServiceInfoCachesToken(android.content.pm.RegisteredServicesCache<V> p0, int p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    private static class UserServices<V extends java.lang.Object> {
        boolean mBindInstantServiceAllowed;
        boolean mPersistentServicesFileDidNotExist;
        final java.util.Map<V, java.lang.Integer> persistentServices = null;
        java.util.Map<V, android.content.pm.RegisteredServicesCache.ServiceInfo<V>> services;
        private UserServices() {}
    }
}
