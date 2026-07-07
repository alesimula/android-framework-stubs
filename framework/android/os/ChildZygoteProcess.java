package android.os;

public class ChildZygoteProcess {
    private java.util.concurrent.atomic.AtomicBoolean mDead;
    private final int mPid = 0;
    private final int mUid = 0;
    private final android.os.IZygoteProcess mZygoteProcess = null;
    private ChildZygoteProcess(android.os.IZygoteProcess p0, int p1, int p2) {}
    public static android.os.ChildZygoteProcess createManagedChildZygoteProcess(android.net.LocalSocketAddress p0, int p1, int p2) { return null; }
    public static android.os.ChildZygoteProcess createNativeChildZygoteProcess(android.net.LocalSocketAddress p0, int p1, int p2) { return null; }
    public int getPid() { return 0; }
    public android.os.IZygoteProcess getZygoteProcess() { return null; }
    public boolean isDead() { return false; }
}
