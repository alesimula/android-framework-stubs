package android.os.image;

public class DynamicSystemManager {
    private static final java.lang.String TAG = "DynamicSystemManager";
    private final android.os.image.IDynamicSystemService mService = null;
    public DynamicSystemManager(android.os.image.IDynamicSystemService p0) {}
    public boolean abort() { return false; }
    public boolean closePartition() { return false; }
    public android.util.Pair<java.lang.Integer, android.os.image.DynamicSystemManager.Session> createPartition(java.lang.String p0, long p1, boolean p2) { return null; }
    public boolean finishInstallation() { return false; }
    public java.lang.String getActiveDsuSlot() { return null; }
    public android.gsi.GsiProgress getInstallationProgress() { return null; }
    public boolean isEnabled() { return false; }
    public boolean isInUse() { return false; }
    public boolean isInstalled() { return false; }
    public boolean remove() { return false; }
    public boolean setEnable(boolean p0, boolean p1) { return false; }
    public boolean startInstallation(java.lang.String p0) { return false; }
    public long suggestScratchSize() { return 0L; }

    public class Session {
        private Session(android.os.image.DynamicSystemManager p0) {}
        public boolean commit() { return false; }
        public boolean getAvbPublicKey(android.gsi.AvbPublicKey p0) { return false; }
        public boolean setAshmem(android.os.ParcelFileDescriptor p0, long p1) { return false; }
        public boolean submitFromAshmem(int p0) { return false; }
    }
}
