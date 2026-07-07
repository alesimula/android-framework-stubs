package android.app;

class DexLoadReporter {
    private static final boolean DEBUG = false;
    private static final android.app.DexLoadReporter INSTANCE = null;
    private static final java.lang.String TAG = "DexLoadReporter";
    private final java.util.Set<java.lang.String> mDataDirs = null;
    private DexLoadReporter() {}
    static android.app.DexLoadReporter getInstance() { return null; }
    private boolean isSecondaryDexFile(java.lang.String p0, java.lang.String[] p1) { return false; }
    private void notifyPackageManager(java.util.Map<java.lang.String, java.lang.String> p0) {}
    private void registerSecondaryDexForProfiling(java.lang.String p0, java.lang.String[] p1) {}
    private void registerSecondaryDexForProfiling(java.util.Set<java.lang.String> p0) {}
    void registerAppDataDir(java.lang.String p0, java.lang.String p1) {}
    public void report(java.util.Map<java.lang.String, java.lang.String> p0) {}
}
