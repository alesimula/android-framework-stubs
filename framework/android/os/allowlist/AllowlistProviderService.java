package android.os.allowlist;

@android.annotation.SystemApi
public abstract class AllowlistProviderService extends android.app.Service {
    public static final java.lang.String ACTION_ALLOWLIST_PROVIDER = "android.os.allowlist.action.ALLOWLIST_PROVIDER";
    private static final java.lang.String LOG_TAG = null;
    private final android.util.ArraySet<android.os.allowlist.AllowlistRequest> mAllowlistListenerRequests = null;
    private final java.lang.Object mLock = null;
    private android.os.allowlist.AllowlistProviderService.ProviderOnAllowlistChangedListener mProviderOnAllowlistChangedListener;
    private android.os.allowlist.IAllowlistProviderService.Stub mStub;
    public AllowlistProviderService() { super(); }
    public final java.util.List<android.os.allowlist.AllowlistRequest> getAllowlistListenerRequests() { return null; }
    public final void notifyAllowlistChanged(java.util.List<android.os.allowlist.AllowlistRequest> p0) {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onCreate() {}
    public void onNotifyAllowlistChangedListenersForTestProvider(java.util.List<android.os.allowlist.AllowlistRequest> p0) {}
    public abstract android.os.allowlist.AllowlistResponse onQueryAllowlist(android.os.allowlist.AllowlistRequest p0);

    private class ProviderOnAllowlistChangedListener implements android.os.IBinder.DeathRecipient {
        private final android.os.allowlist.IProviderOnAllowlistChangedListener mRemoteListener = null;
        ProviderOnAllowlistChangedListener(android.os.allowlist.AllowlistProviderService p0, android.os.allowlist.IProviderOnAllowlistChangedListener p1) {}
        public void binderDied() {}
        void onAllowlistChanged(java.util.List<android.os.allowlist.AllowlistRequest> p0) {}
    }

    private class Stub extends android.os.allowlist.IAllowlistProviderService.Stub {
        private Stub(android.os.allowlist.AllowlistProviderService p0) { super(); }
        public void addRequestForAllowlistChange(android.os.allowlist.AllowlistRequest p0, android.os.allowlist.IProviderOnAllowlistChangedListener p1) {}
        public void notifyAllowlistChangedListenersForTestProvider(java.util.List<android.os.allowlist.AllowlistRequest> p0) throws android.os.RemoteException {}
        public void queryAllowlist(android.os.allowlist.AllowlistRequest p0, android.os.RemoteCallback p1) throws android.os.RemoteException {}
        public void removeRequestForAllowlistChange(android.os.allowlist.AllowlistRequest p0) {}
    }
}
