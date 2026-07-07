package android.os;

public class AppZygote {
    private static final java.lang.String LOG_TAG = "AppZygote";
    private final android.content.pm.ApplicationInfo mAppInfo = null;
    private final boolean mIsNativeService = false;
    private final java.lang.Object mLock = null;
    private final android.content.pm.ProcessInfo mProcessInfo = null;
    private final java.lang.String mProcessName = null;
    private android.os.ChildZygoteProcess mZygote;
    private final int mZygoteUid = 0;
    private final int mZygoteUidGidMax = 0;
    private final int mZygoteUidGidMin = 0;
    public AppZygote(android.content.pm.ApplicationInfo p0, android.content.pm.ProcessInfo p1, int p2, int p3, int p4, boolean p5, java.lang.String p6) {}
    private void connectToZygoteIfNeededLocked() {}
    private void stopZygoteLocked() {}
    public android.content.pm.ApplicationInfo getAppInfo() { return null; }
    public android.os.ChildZygoteProcess getProcess() { return null; }
    public java.lang.String getProcessName() { return null; }
    public int getZygoteUid() { return 0; }
    public final android.os.Process.ProcessStartResult startProcess(java.lang.String p0, java.lang.String p1, int p2, int[] p3, int p4, int p5, int p6, java.lang.String p7, java.lang.String p8, java.lang.String p9, java.lang.String p10, java.lang.String p11, boolean p12, long[] p13, long[] p14, boolean p15, java.util.Map<java.lang.String, android.util.Pair<java.lang.String, java.lang.Long>> p16, java.util.Map<java.lang.String, android.util.Pair<java.lang.String, java.lang.Long>> p17, long p18, java.lang.String[] p19) { return null; }
    public void stopZygote() {}
}
