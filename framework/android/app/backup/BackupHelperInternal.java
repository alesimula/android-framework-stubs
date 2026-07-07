package android.app.backup;

public abstract class BackupHelperInternal implements android.app.backup.BackupHelper {
    private boolean mIsLoggerSet;
    private android.app.backup.BackupRestoreEventLogger mLogger;
    private int mSourceVersion;
    public BackupHelperInternal() {}
    public android.app.backup.BackupRestoreEventLogger getLogger() { return null; }
    public int getSourceVersion() { return 0; }
    public boolean isLoggerSet() { return false; }
    public abstract void performBackup(android.os.ParcelFileDescriptor p0, android.app.backup.BackupDataOutput p1, android.os.ParcelFileDescriptor p2);
    public abstract void restoreEntity(android.app.backup.BackupDataInputStream p0);
    public void setLogger(android.app.backup.BackupRestoreEventLogger p0) {}
    public void setSourceVersion(int p0) {}
    public abstract void writeNewStateDescription(android.os.ParcelFileDescriptor p0);
}
