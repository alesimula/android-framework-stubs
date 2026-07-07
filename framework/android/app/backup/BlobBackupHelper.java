package android.app.backup;

public abstract class BlobBackupHelper extends android.app.backup.BackupHelperInternal {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "BlobBackupHelper";
    private final int mCurrentBlobVersion = 0;
    private final java.lang.String[] mKeys = null;
    public BlobBackupHelper(int p0, java.lang.String... p1) { super(); }
    private long checksum(byte[] p0) { return 0L; }
    private byte[] deflate(byte[] p0) { return null; }
    private byte[] inflate(byte[] p0) { return null; }
    private android.util.ArrayMap<java.lang.String, java.lang.Long> readOldState(android.os.ParcelFileDescriptor p0) { return null; }
    private void restoreEntity(android.app.backup.BackupDataInputStream p0, android.app.backup.DelayedRestoreRequest p1) {}
    private void writeBackupState(android.util.ArrayMap<java.lang.String, java.lang.Long> p0, android.os.ParcelFileDescriptor p1) {}
    protected void applyDelayedRestoredPayload(android.app.backup.DelayedRestoreRequest p0, java.lang.String p1, byte[] p2) {}
    protected abstract void applyRestoredPayload(java.lang.String p0, byte[] p1);
    public void delayedRestoreEntity(android.app.backup.DelayedRestoreRequest p0, android.app.backup.BackupDataInputStream p1) {}
    protected abstract byte[] getBackupPayload(java.lang.String p0);
    public void performBackup(android.os.ParcelFileDescriptor p0, android.app.backup.BackupDataOutput p1, android.os.ParcelFileDescriptor p2) {}
    public void restoreEntity(android.app.backup.BackupDataInputStream p0) {}
    public void writeNewStateDescription(android.os.ParcelFileDescriptor p0) {}
}
