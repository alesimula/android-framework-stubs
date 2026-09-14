package android.os;

public interface IZygoteProcess {
    public void close();
    public android.net.LocalSocketAddress getPrimarySocketAddress();
    public boolean preloadApp(android.content.pm.ApplicationInfo p0, java.lang.String p1) throws android.os.ZygoteStartFailedEx, java.io.IOException;
    public android.os.Process.ProcessStartResult start(java.lang.String p0, java.lang.String p1, int p2, int p3, int p4, int[] p5, int p6, int p7, int p8, java.lang.String p9, java.lang.String p10, java.lang.String p11, java.lang.String p12, java.lang.String p13, java.lang.String p14, int p15, boolean p16, long[] p17, long[] p18, boolean p19, java.util.Map<java.lang.String, android.util.Pair<java.lang.String, java.lang.Long>> p20, java.util.Map<java.lang.String, android.util.Pair<java.lang.String, java.lang.Long>> p21, boolean p22, boolean p23, boolean p24, long p25, java.lang.String[] p26);
    default public android.os.ChildZygoteProcess startChildZygote(java.lang.String p0, java.lang.String p1, int p2, int p3, int[] p4, int p5, java.lang.String p6, java.lang.String p7, java.lang.String p8, java.lang.String p9, int p10, int p11, android.content.pm.ApplicationInfo p12, java.lang.String p13, java.lang.String p14) { return null; }
    public android.os.ChildZygoteProcess startChildZygote(java.lang.String p0, java.lang.String p1, int p2, int p3, int[] p4, int p5, java.lang.String p6, java.lang.String p7, java.lang.String p8, java.lang.String p9, int p10, int p11, android.content.pm.ApplicationInfo p12, java.lang.String p13, java.lang.String p14, long p15, long p16, java.lang.String p17);
}
