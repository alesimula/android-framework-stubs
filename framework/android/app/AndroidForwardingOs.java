package android.app;

class AndroidForwardingOs {
    private static final java.lang.String TAG = "AndroidForwardingOs";
    private AndroidForwardingOs(libcore.io.Os p0) {}
    private void deleteDeprecatedDataPath(java.lang.String p0) throws android.system.ErrnoException {}
    public static void install() {}
    private java.io.FileDescriptor openDeprecatedDataPath(java.lang.String p0, int p1) throws android.system.ErrnoException { return null; }
    public boolean access(java.lang.String p0, int p1) throws android.system.ErrnoException { return false; }
    public java.io.FileDescriptor open(java.lang.String p0, int p1, int p2) throws android.system.ErrnoException { return null; }
    public void remove(java.lang.String p0) throws android.system.ErrnoException {}
    public void rename(java.lang.String p0, java.lang.String p1) throws android.system.ErrnoException {}
    public android.system.StructStat stat(java.lang.String p0) throws android.system.ErrnoException { return null; }
    public void unlink(java.lang.String p0) throws android.system.ErrnoException {}
}
