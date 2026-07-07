package android.util;

public abstract class NtpTrustedTime implements android.util.TrustedTime {
    private static final boolean LOGD = false;
    public static final java.lang.String NTP_SETTING_SERVER_NAME_DELIMITER = "|";
    private static final java.lang.String NTP_SETTING_SERVER_NAME_DELIMITER_REGEXP = "\\|";
    private static final java.lang.String TAG = "NtpTrustedTime";
    private static final java.lang.String URI_SCHEME_NTP = "ntp";
    private static android.util.NtpTrustedTime sSingleton;
    private final java.lang.Object mConfigLock = null;
    private final java.util.Map<java.net.URI, java.lang.String> mLastServerFailureReasons = null;
    private volatile java.net.URI mLastSuccessfulNtpServerUri;
    private android.util.NtpTrustedTime.NtpConfig mNtpConfigForTests;
    private final java.lang.Object mRefreshLock = null;
    private volatile android.util.NtpTrustedTime.TimeResult mTimeResult;
    protected NtpTrustedTime() {}
    private boolean forceRefreshLocked(android.net.Network p0) { return false; }
    public static android.util.NtpTrustedTime getInstance(android.content.Context p0) { return null; }
    private android.util.NtpTrustedTime.NtpConfig getNtpConfig() { return null; }
    public static java.util.List<java.net.URI> parseNtpServerSetting(java.lang.String p0) { return null; }
    public static java.net.URI parseNtpUriStrict(java.lang.String p0) throws java.net.URISyntaxException { return null; }
    private static java.net.URI validateNtpServerUri(java.net.URI p0) throws java.net.URISyntaxException { return null; }
    public void clearCachedTimeResult() {}
    @java.lang.Deprecated
    public long currentTimeMillis() { return 0L; }
    public void dump(java.io.PrintWriter p0) {}
    public boolean forceRefresh() { return false; }
    public boolean forceRefresh(android.net.Network p0) { return false; }
    @java.lang.Deprecated
    public long getCacheAge() { return 0L; }
    @java.lang.Deprecated
    public long getCachedNtpTime() { return 0L; }
    @java.lang.Deprecated
    public long getCachedNtpTimeReference() { return 0L; }
    public android.util.NtpTrustedTime.TimeResult getCachedTimeResult() { return null; }
    public abstract android.net.Network getDefaultNetwork();
    public java.lang.String getLastFailureReason() { return null; }
    public abstract android.util.NtpTrustedTime.NtpConfig getNtpConfigInternal();
    @java.lang.Deprecated
    public boolean hasCache() { return false; }
    public abstract boolean isNetworkConnected(android.net.Network p0);
    public abstract android.util.NtpTrustedTime.NtpQueryResult queryNtpServer(android.net.Network p0, java.net.URI p1, java.time.Duration p2);
    public void setCachedTimeResult(android.util.NtpTrustedTime.TimeResult p0) {}
    public void setServerConfigForTests(android.util.NtpTrustedTime.NtpConfig p0) {}

    public static final class NtpConfig {
        private final java.util.List<java.net.URI> mServerUris = null;
        private final java.time.Duration mTimeout = null;
        public NtpConfig(java.util.List<java.net.URI> p0, java.time.Duration p1) throws java.lang.IllegalArgumentException {}
        public java.util.List<java.net.URI> getServerUris() { return null; }
        public java.time.Duration getTimeout() { return null; }
        public java.lang.String toString() { return null; }
    }

    public static class NtpQueryResult {
        private final java.lang.String mFailureString = null;
        private final android.util.NtpTrustedTime.TimeResult mTimeResult = null;
        private NtpQueryResult(android.util.NtpTrustedTime.TimeResult p0, java.lang.String p1) {}
        public static android.util.NtpTrustedTime.NtpQueryResult failure(java.lang.String p0) { return null; }
        public static android.util.NtpTrustedTime.NtpQueryResult success(android.util.NtpTrustedTime.TimeResult p0) { return null; }
        public java.lang.String getFailureString() { return null; }
        public android.util.NtpTrustedTime.TimeResult getTimeResult() { return null; }
        public boolean isSuccess() { return false; }
    }

    private static final class NtpTrustedTimeImpl extends android.util.NtpTrustedTime {
        private final android.content.Context mContext = null;
        private NtpTrustedTimeImpl(android.content.Context p0) { super(); }
        private android.net.ConnectivityManager getConnectivityManager() { return null; }
        private static int saturatedCast(long p0) { return 0; }
        public android.net.Network getDefaultNetwork() { return null; }
        public android.util.NtpTrustedTime.NtpConfig getNtpConfigInternal() { return null; }
        public boolean isNetworkConnected(android.net.Network p0) { return false; }
        public android.util.NtpTrustedTime.NtpQueryResult queryNtpServer(android.net.Network p0, java.net.URI p1, java.time.Duration p2) { return null; }
    }

    public static class TimeResult {
        private final long mElapsedRealtimeMillis = 0L;
        private final java.net.InetSocketAddress mNtpServerSocketAddress = null;
        private final int mUncertaintyMillis = 0;
        private final long mUnixEpochTimeMillis = 0L;
        public TimeResult(long p0, long p1, int p2, java.net.InetSocketAddress p3) {}
        public long currentTimeMillis() { return 0L; }
        public boolean equals(java.lang.Object p0) { return false; }
        public long getAgeMillis() { return 0L; }
        public long getAgeMillis(long p0) { return 0L; }
        public long getElapsedRealtimeMillis() { return 0L; }
        public long getTimeMillis() { return 0L; }
        public int getUncertaintyMillis() { return 0; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }
}
