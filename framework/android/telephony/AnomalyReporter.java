package android.telephony;

public final class AnomalyReporter {
    private static final java.lang.String KEY_IS_TELEPHONY_ANOMALY_REPORT_ENABLED = "is_telephony_anomaly_report_enabled";
    private static final java.lang.String TAG = "AnomalyReporter";
    private static android.content.Context sContext;
    private static java.lang.String sDebugPackageName;
    private static java.util.Map<java.util.UUID, java.lang.Integer> sEvents;
    private AnomalyReporter() {}
    public static void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public static void initialize(android.content.Context p0) {}
    public static void reportAnomaly(java.util.UUID p0, java.lang.String p1) {}
    public static void reportAnomaly(java.util.UUID p0, java.lang.String p1, int p2) {}
}
