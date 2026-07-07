package android.app;

public final class AppCompatCallbacks {
    public static final long[] CHANGES_DISABLED_FOR_SYSTEM_UID = null;
    private final com.android.internal.compat.ChangeReporter mChangeReporter = null;
    private final long[] mDisabledChanges = null;
    private final long[] mEnabledChanges = null;
    private boolean mLogChangeChecksToStatsD;
    private final long[] mLoggableChanges = null;
    private final int mTargetSdkVersion = 0;
    private AppCompatCallbacks(long[] p0, long[] p1, long[] p2, boolean p3, int p4) {}
    private boolean changeIdInChangeList(long[] p0, long p1) { return false; }
    public static void install(long[] p0, long[] p1) {}
    public static void install(long[] p0, long[] p1, boolean p2) {}
    public static void install(long[] p0, long[] p1, long[] p2, boolean p3, int p4) {}
    private boolean isChangeEnabledAndReport(long p0, boolean p1) { return false; }
    private boolean isChangeEnabledInternal(long p0) { return false; }
    private void reportChange(long p0, int p1, boolean p2) {}
    public boolean isChangeEnabled(long p0) { return false; }
    public void onChangeReported(long p0) {}
}
