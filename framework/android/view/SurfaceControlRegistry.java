package android.view;

public class SurfaceControlRegistry {
    static final java.lang.String APPLY = "apply";
    private static final java.lang.String DEBUG_CALL_FORMAT_STRING = "%s (tx: %s, sc: %s) details: %s";
    private static final int DUMP_LIMIT = 256;
    private static final int MAX_LAYERS_REPORTING_THRESHOLD = 1024;
    private static final android.view.SurfaceControlRegistry NO_OP_REGISTRY = null;
    private static final int RESET_REPORTING_THRESHOLD = 256;
    private static final java.lang.String TAG = "SurfaceControlRegistry";
    static boolean sCallStackDebuggingEnabled;
    static boolean sCallStackDebuggingInitialized;
    private static java.lang.String sCallStackDebuggingMatchCall;
    private static java.lang.String sCallStackDebuggingMatchName;
    private static final android.view.SurfaceControlRegistry.DefaultReporter sDefaultReporter = null;
    private static final java.lang.Object sLock = null;
    static boolean sLogAllTxCallsOnApply;
    private static volatile android.view.SurfaceControlRegistry sProcessRegistry;
    private boolean mHasReportedExceedingMaxThreshold;
    private int mMaxLayersReportingThreshold;
    private android.view.SurfaceControlRegistry.Reporter mReporter;
    private int mResetReportingThreshold;
    private final java.util.WeakHashMap<android.view.SurfaceControl, java.lang.Long> mSurfaceControls = null;
    private SurfaceControlRegistry() {}
    public static void createProcessInstance(android.content.Context p0) {}
    public static void destroyProcessInstance() {}
    public static void dump(int p0, boolean p1, java.io.PrintWriter p2) {}
    public static android.view.SurfaceControlRegistry getProcessInstance() { return null; }
    static final void initializeCallStackDebugging() {}
    static final boolean isCallStackDebuggingEnabled() { return false; }
    private static void logCallStack(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {}
    private static void runGcAndFinalizers() {}
    private static void updateCallStackDebuggingParams() {}
    void add(android.view.SurfaceControl p0) {}
    final void checkCallStackDebugging(java.lang.String p0, android.view.SurfaceControl.Transaction p1, android.view.SurfaceControl p2, java.lang.String p3) {}
    public int hashCode() { return 0; }
    public final boolean matchesForCallStackDebugging(java.lang.String p0, java.lang.String p1) { return false; }
    void remove(android.view.SurfaceControl p0) {}
    public void setCallStackDebuggingParams(java.lang.String p0, java.lang.String p1) {}
    public void setReportingThresholds(int p0, int p1, android.view.SurfaceControlRegistry.Reporter p2) {}

    private static class DefaultReporter implements android.view.SurfaceControlRegistry.Reporter {
        private DefaultReporter() {}
        public void onMaxLayersExceeded(java.util.WeakHashMap<android.view.SurfaceControl, java.lang.Long> p0, int p1, java.io.PrintWriter p2) {}
    }

    private static class NoOpRegistry extends android.view.SurfaceControlRegistry {
        private NoOpRegistry() { super(); }
        void add(android.view.SurfaceControl p0) {}
        void remove(android.view.SurfaceControl p0) {}
        public void setReportingThresholds(int p0, int p1, android.view.SurfaceControlRegistry.Reporter p2) {}
    }

    public static interface Reporter {
        public void onMaxLayersExceeded(java.util.WeakHashMap<android.view.SurfaceControl, java.lang.Long> p0, int p1, java.io.PrintWriter p2);
    }
}
