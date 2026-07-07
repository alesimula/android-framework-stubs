package android.os;

public class NativeZygoteProcess implements android.os.IZygoteProcess {
    private static final java.lang.String LOG_TAG = "NativeZygoteProcess";
    private android.net.LocalSocket mSocket;
    private android.net.LocalSocketAddress mSocketAddress;
    public NativeZygoteProcess() {}
    public NativeZygoteProcess(android.net.LocalSocketAddress p0) {}
    private void connectToZygote() throws java.io.IOException {}
    private static native boolean nativeEnsureNativeZygoteReadyBlocking();
    private static native void nativePrewarmNativeZygote();
    private static native int nativeStartNativeChildZygote(java.io.FileDescriptor p0, int p1, int p2, java.lang.String p3, java.lang.String p4, int p5, int p6, java.lang.String p7, int p8, int p9, java.lang.String p10, java.lang.String p11, boolean p12, java.lang.String p13, java.lang.String p14, java.lang.String p15, java.lang.String p16, long p17, long p18, java.lang.String p19) throws java.io.IOException;
    private static native int nativeStartNativeProcess(java.io.FileDescriptor p0, int p1, int p2, long p3, java.lang.String p4, java.lang.String p5, int p6, boolean p7, int p8, java.lang.String p9, boolean p10) throws java.io.IOException;
    public static void prewarmNativeZygote() {}
    public void close() {}
    public android.net.LocalSocketAddress getPrimarySocketAddress() { return null; }
    public boolean preloadApp(android.content.pm.ApplicationInfo p0, java.lang.String p1) { return false; }
    public final android.os.Process.ProcessStartResult start(java.lang.String p0, java.lang.String p1, int p2, int p3, int[] p4, int p5, int p6, int p7, java.lang.String p8, java.lang.String p9, java.lang.String p10, java.lang.String p11, java.lang.String p12, java.lang.String p13, int p14, boolean p15, long[] p16, long[] p17, boolean p18, java.util.Map<java.lang.String, android.util.Pair<java.lang.String, java.lang.Long>> p19, java.util.Map<java.lang.String, android.util.Pair<java.lang.String, java.lang.Long>> p20, boolean p21, boolean p22, boolean p23, long p24, java.lang.String[] p25) { return null; }
    public android.os.ChildZygoteProcess startChildZygote(java.lang.String p0, java.lang.String p1, int p2, int p3, int[] p4, int p5, java.lang.String p6, java.lang.String p7, java.lang.String p8, java.lang.String p9, int p10, int p11, android.content.pm.ApplicationInfo p12, java.lang.String p13, java.lang.String p14, long p15, long p16, java.lang.String p17) { return null; }
}
