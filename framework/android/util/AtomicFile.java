package android.util;

public class AtomicFile {
    private static final java.lang.String LOG_TAG = "AtomicFile";
    private final java.io.File mBaseName = null;
    private android.util.SystemConfigFileCommitEventLogger mCommitEventLogger;
    private final java.io.File mLegacyBackupName = null;
    private final java.io.File mNewName = null;
    public AtomicFile(java.io.File p0) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public AtomicFile(java.io.File p0, android.util.SystemConfigFileCommitEventLogger p1) {}
    public AtomicFile(java.io.File p0, java.lang.String p1) {}
    private static void rename(java.io.File p0, java.io.File p1) {}
    public void delete() {}
    public boolean exists() { return false; }
    public void failWrite(java.io.FileOutputStream p0) {}
    public void finishWrite(java.io.FileOutputStream p0) {}
    public java.io.File getBaseFile() { return null; }
    public long getLastModifiedTime() { return 0L; }
    @java.lang.Deprecated
    public java.io.FileOutputStream openAppend() throws java.io.IOException { return null; }
    public java.io.FileInputStream openRead() throws java.io.FileNotFoundException { return null; }
    public byte[] readFully() throws java.io.IOException { return null; }
    public java.io.FileOutputStream startWrite() throws java.io.IOException { return null; }
    @java.lang.Deprecated
    public java.io.FileOutputStream startWrite(long p0) throws java.io.IOException { return null; }
    public java.lang.String toString() { return null; }
    @java.lang.Deprecated
    public void truncate() throws java.io.IOException {}
    public void write(java.util.function.Consumer<java.io.FileOutputStream> p0) {}
}
