package android.app.backup;

class FileBackupHelperBase {
    private static final java.lang.String TAG = "FileBackupHelperBase";
    android.content.Context mContext;
    boolean mExceptionLogged;
    long mPtr;
    FileBackupHelperBase(android.content.Context p0) {}
    private static native long ctor();
    private static native void dtor(long p0);
    static void performBackup_checked(android.os.ParcelFileDescriptor p0, android.app.backup.BackupDataOutput p1, android.os.ParcelFileDescriptor p2, java.lang.String[] p3, java.lang.String[] p4) {}
    private static native int performBackup_native(java.io.FileDescriptor p0, long p1, java.io.FileDescriptor p2, java.lang.String[] p3, java.lang.String[] p4);
    private static native int writeFile_native(long p0, java.lang.String p1, long p2);
    private static native int writeSnapshot_native(long p0, java.io.FileDescriptor p1);
    protected void finalize() throws java.lang.Throwable {}
    boolean isKeyInList(java.lang.String p0, java.lang.String[] p1) { return false; }
    boolean writeFile(java.io.File p0, android.app.backup.BackupDataInputStream p1) { return false; }
    public void writeNewStateDescription(android.os.ParcelFileDescriptor p0) {}
}
