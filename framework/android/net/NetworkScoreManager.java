package android.net;

@android.annotation.SystemApi
@java.lang.Deprecated
public class NetworkScoreManager {
    @java.lang.Deprecated
    public static final java.lang.String ACTION_CHANGE_ACTIVE = "android.net.scoring.CHANGE_ACTIVE";
    public static final java.lang.String ACTION_CUSTOM_ENABLE = "android.net.scoring.CUSTOM_ENABLE";
    public static final java.lang.String ACTION_RECOMMEND_NETWORKS = "android.net.action.RECOMMEND_NETWORKS";
    public static final java.lang.String ACTION_SCORER_CHANGED = "android.net.scoring.SCORER_CHANGED";
    @java.lang.Deprecated
    public static final java.lang.String ACTION_SCORE_NETWORKS = "android.net.scoring.SCORE_NETWORKS";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_NETWORKS_TO_SCORE = "networksToScore";
    public static final java.lang.String EXTRA_NEW_SCORER = "newScorer";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_PACKAGE_NAME = "packageName";
    public static final java.lang.String NETWORK_AVAILABLE_NOTIFICATION_CHANNEL_ID_META_DATA = "android.net.wifi.notification_channel_id_network_available";
    public static final int RECOMMENDATIONS_ENABLED_FORCED_OFF = -1;
    public static final int RECOMMENDATIONS_ENABLED_OFF = 0;
    public static final int RECOMMENDATIONS_ENABLED_ON = 1;
    public static final java.lang.String RECOMMENDATION_SERVICE_LABEL_META_DATA = "android.net.scoring.recommendation_service_label";
    public static final int SCORE_FILTER_CURRENT_NETWORK = 1;
    public static final int SCORE_FILTER_NONE = 0;
    public static final int SCORE_FILTER_SCAN_RESULTS = 2;
    private static final java.lang.String TAG = "NetworkScoreManager";
    public static final java.lang.String USE_OPEN_WIFI_PACKAGE_META_DATA = "android.net.wifi.use_open_wifi_package";
    private final android.content.Context mContext = null;
    private final android.net.INetworkScoreService mService = null;
    public NetworkScoreManager(android.content.Context p0) throws android.os.ServiceManager.ServiceNotFoundException {}
    public boolean clearScores() throws java.lang.SecurityException { return false; }
    public void disableScoring() throws java.lang.SecurityException {}
    public android.net.NetworkScorerAppData getActiveScorer() { return null; }
    public java.lang.String getActiveScorerPackage() { return null; }
    public java.util.List<android.net.NetworkScorerAppData> getAllValidScorers() { return null; }
    public boolean isCallerActiveScorer(int p0) { return false; }
    @java.lang.Deprecated
    public void registerNetworkScoreCache(int p0, android.net.INetworkScoreCache p1) {}
    public void registerNetworkScoreCache(int p0, android.net.INetworkScoreCache p1, int p2) {}
    @android.annotation.SystemApi
    public void registerNetworkScoreCallback(int p0, int p1, java.util.concurrent.Executor p2, android.net.NetworkScoreManager.NetworkScoreCallback p3) throws java.lang.SecurityException {}
    @android.annotation.SystemApi
    public boolean requestScores(java.util.Collection<android.net.NetworkKey> p0) throws java.lang.SecurityException { return false; }
    public boolean requestScores(android.net.NetworkKey[] p0) throws java.lang.SecurityException { return false; }
    @android.annotation.SystemApi
    public boolean setActiveScorer(java.lang.String p0) throws java.lang.SecurityException { return false; }
    public void unregisterNetworkScoreCache(int p0, android.net.INetworkScoreCache p1) {}
    public boolean updateScores(android.net.ScoredNetwork[] p0) throws java.lang.SecurityException { return false; }

    @android.annotation.SystemApi
    public static abstract class NetworkScoreCallback {
        public NetworkScoreCallback() {}
        public abstract void onScoresInvalidated();
        public abstract void onScoresUpdated(java.util.Collection<android.net.ScoredNetwork> p0);
    }

    private class NetworkScoreCallbackProxy extends android.net.INetworkScoreCache.Stub {
        private final android.net.NetworkScoreManager.NetworkScoreCallback mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        NetworkScoreCallbackProxy(android.net.NetworkScoreManager p0, java.util.concurrent.Executor p1, android.net.NetworkScoreManager.NetworkScoreCallback p2) { super(); }
        public void clearScores() {}
        public void updateScores(java.util.List<android.net.ScoredNetwork> p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RecommendationsEnabledSetting {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ScoreUpdateFilter {
    }
}
