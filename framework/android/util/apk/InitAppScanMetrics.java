package android.util.apk;

public final class InitAppScanMetrics {
    public static final int FAST_TRACK_STATUS_FAILURE_DIGEST_MISMATCH = 3;
    public static final int FAST_TRACK_STATUS_FAILURE_MISSING_SIDECAR = 2;
    public static final int FAST_TRACK_STATUS_FAILURE_READ_ERROR = 4;
    public static final int FAST_TRACK_STATUS_SUCCESS = 1;
    public static final int FAST_TRACK_STATUS_UNSPECIFIED = 0;
    private int mFastTrackStatus;
    private int mInitAppScanOutcome;
    private boolean mIsFsiEnabled;
    private int mNumApkSplits;
    private java.lang.String mPackageName;
    private int mSignatureSchemeVersion;
    private long mTotalScanDurationMillis;
    private final long mTotalScanStartTimeMillis = 0L;
    public InitAppScanMetrics() {}
    private static int translateToFastTrackStatus(int p0) { return 0; }
    private static int translateToInitAppScanOutcome(int p0) { return 0; }
    private static int translateToSignatureSchemeVersion(int p0) { return 0; }
    public void log() {}
    public android.util.apk.InitAppScanMetrics setFastTrackStatus(int p0) { return null; }
    public android.util.apk.InitAppScanMetrics setInitAppScanOutcome(int p0) { return null; }
    public android.util.apk.InitAppScanMetrics setIsFsiEnabled(boolean p0) { return null; }
    public android.util.apk.InitAppScanMetrics setNumApkSplits(int p0) { return null; }
    public android.util.apk.InitAppScanMetrics setPackageName(java.lang.String p0) { return null; }
    public android.util.apk.InitAppScanMetrics setSignatureSchemeVersion(int p0) { return null; }
}
