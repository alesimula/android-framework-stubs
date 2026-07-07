package android.os;

public class ZygoteProcess implements android.os.IZygoteProcess {
    private static final java.lang.String[] INVALID_USAP_FLAGS = null;
    private static final java.lang.String LOG_TAG = "ZygoteProcess";
    private static final int ZYGOTE_CONNECT_RETRY_DELAY_MS = 5;
    private static final int ZYGOTE_CONNECT_TIMEOUT_MS = 60000;
    static final int ZYGOTE_RETRY_MILLIS = 500;
    public static volatile int sAppZygotePreloadTimeoutMs;
    private java.util.List<java.lang.String> mApiDenylistExemptions;
    private int mHiddenApiAccessLogSampleRate;
    private int mHiddenApiAccessStatslogSampleRate;
    private boolean mIsFirstPropCheck;
    private long mLastPropCheckTimestamp;
    private final java.lang.Object mLock = null;
    private boolean mUsapPoolEnabled;
    private final android.net.LocalSocketAddress mUsapPoolSecondarySocketAddress = null;
    private final android.net.LocalSocketAddress mUsapPoolSocketAddress = null;
    private final boolean mUsapPoolSupported = false;
    private final android.net.LocalSocketAddress mZygoteSecondarySocketAddress = null;
    private final android.net.LocalSocketAddress mZygoteSocketAddress = null;
    private android.os.ZygoteProcess.ZygoteState primaryZygoteState;
    private android.os.ZygoteProcess.ZygoteState secondaryZygoteState;
    public ZygoteProcess() {}
    public ZygoteProcess(android.net.LocalSocketAddress p0, android.net.LocalSocketAddress p1) {}
    private void attemptConnectionToPrimaryZygote() throws java.io.IOException {}
    private void attemptConnectionToSecondaryZygote() throws java.io.IOException {}
    private android.os.Process.ProcessStartResult attemptUsapSendArgsAndGetResult(android.os.ZygoteProcess.ZygoteState p0, java.lang.String p1) throws android.os.ZygoteStartFailedEx, java.io.IOException { return null; }
    private android.os.Process.ProcessStartResult attemptZygoteSendArgsAndGetResult(android.os.ZygoteProcess.ZygoteState p0, java.lang.String p1) throws android.os.ZygoteStartFailedEx { return null; }
    private void bootCompleted(java.lang.String p0) {}
    private static boolean commandSupportedByUsap(java.util.ArrayList<java.lang.String> p0) { return false; }
    private boolean fetchUsapPoolEnabledProp() { return false; }
    private boolean fetchUsapPoolEnabledPropWithMinInterval() { return false; }
    private static java.util.List<java.lang.String> getAbiList(java.io.BufferedWriter p0, java.io.DataInputStream p1) throws java.io.IOException { return null; }
    private void informZygotesOfUsapPoolStatus() {}
    private boolean maybeSetApiDenylistExemptions(android.os.ZygoteProcess.ZygoteState p0, boolean p1) { return false; }
    private void maybeSetHiddenApiAccessLogSampleRate(android.os.ZygoteProcess.ZygoteState p0) {}
    private void maybeSetHiddenApiAccessStatslogSampleRate(android.os.ZygoteProcess.ZygoteState p0) {}
    private android.os.ZygoteProcess.ZygoteState openZygoteSocketIfNeeded(java.lang.String p0) throws android.os.ZygoteStartFailedEx { return null; }
    private static boolean policySpecifiesUsapPoolLaunch(int p0) { return false; }
    public static void setAppZygotePreloadTimeout(int p0) {}
    private boolean shouldAttemptUsapLaunch(int p0, java.util.ArrayList<java.lang.String> p1) { return false; }
    private android.os.Process.ProcessStartResult startViaZygote(java.lang.String p0, java.lang.String p1, int p2, int p3, int[] p4, int p5, int p6, int p7, java.lang.String p8, java.lang.String p9, java.lang.String p10, java.lang.String p11, java.lang.String p12, boolean p13, java.lang.String p14, int p15, boolean p16, long[] p17, long[] p18, boolean p19, java.util.Map<java.lang.String, android.util.Pair<java.lang.String, java.lang.Long>> p20, java.util.Map<java.lang.String, android.util.Pair<java.lang.String, java.lang.Long>> p21, boolean p22, boolean p23, boolean p24, long p25, java.lang.String[] p26) throws android.os.ZygoteStartFailedEx { return null; }
    public static void waitForConnectionToNativeZygote(android.net.LocalSocketAddress p0) {}
    public static void waitForConnectionToZygote(android.net.LocalSocketAddress p0) {}
    private static void waitForConnectionToZygote(android.net.LocalSocketAddress p0, boolean p1) {}
    public static void waitForConnectionToZygote(java.lang.String p0) {}
    private android.os.Process.ProcessStartResult zygoteSendArgsAndGetResult(android.os.ZygoteProcess.ZygoteState p0, int p1, java.util.ArrayList<java.lang.String> p2) throws android.os.ZygoteStartFailedEx { return null; }
    public void bootCompleted() {}
    public void close() {}
    public void establishZygoteConnectionForAbi(java.lang.String p0) {}
    public android.net.LocalSocketAddress getPrimarySocketAddress() { return null; }
    public int getZygotePid(java.lang.String p0) { return 0; }
    public boolean preloadApp(android.content.pm.ApplicationInfo p0, java.lang.String p1) throws android.os.ZygoteStartFailedEx, java.io.IOException { return false; }
    public boolean preloadDefault(java.lang.String p0) throws android.os.ZygoteStartFailedEx, java.io.IOException { return false; }
    public boolean setApiDenylistExemptions(java.util.List<java.lang.String> p0) { return false; }
    public void setHiddenApiAccessLogSampleRate(int p0) {}
    public void setHiddenApiAccessStatslogSampleRate(int p0) {}
    public final android.os.Process.ProcessStartResult start(java.lang.String p0, java.lang.String p1, int p2, int p3, int[] p4, int p5, int p6, int p7, java.lang.String p8, java.lang.String p9, java.lang.String p10, java.lang.String p11, java.lang.String p12, java.lang.String p13, int p14, boolean p15, long[] p16, long[] p17, boolean p18, java.util.Map<java.lang.String, android.util.Pair<java.lang.String, java.lang.Long>> p19, java.util.Map<java.lang.String, android.util.Pair<java.lang.String, java.lang.Long>> p20, boolean p21, boolean p22, boolean p23, long p24, java.lang.String[] p25) { return null; }
    public android.os.ChildZygoteProcess startChildZygote(java.lang.String p0, java.lang.String p1, int p2, int p3, int[] p4, int p5, java.lang.String p6, java.lang.String p7, java.lang.String p8, java.lang.String p9, int p10, int p11, android.content.pm.ApplicationInfo p12, java.lang.String p13, java.lang.String p14, long p15, long p16, java.lang.String p17) { return null; }

    private static class ZygoteState implements java.lang.AutoCloseable {
        private final java.util.List<java.lang.String> mAbiList = null;
        private boolean mClosed;
        final android.net.LocalSocketAddress mUsapSocketAddress = null;
        final java.io.DataInputStream mZygoteInputStream = null;
        final java.io.BufferedWriter mZygoteOutputWriter = null;
        private final android.net.LocalSocket mZygoteSessionSocket = null;
        final android.net.LocalSocketAddress mZygoteSocketAddress = null;
        private ZygoteState(android.net.LocalSocketAddress p0, android.net.LocalSocketAddress p1, android.net.LocalSocket p2, java.io.DataInputStream p3, java.io.BufferedWriter p4, java.util.List<java.lang.String> p5) {}
        static android.os.ZygoteProcess.ZygoteState connect(android.net.LocalSocketAddress p0, android.net.LocalSocketAddress p1) throws java.io.IOException { return null; }
        public void close() {}
        android.net.LocalSocket getUsapSessionSocket() throws java.io.IOException { return null; }
        boolean isClosed() { return false; }
        boolean matches(java.lang.String p0) { return false; }
    }
}
