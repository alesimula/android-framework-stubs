package android.app.backup;

public interface BackupHelper {
    @android.annotation.SystemApi
    default public void delayedRestoreEntity(android.app.backup.DelayedRestoreRequest p0, android.app.backup.BackupDataInputStream p1) {}
    public void performBackup(android.os.ParcelFileDescriptor p0, android.app.backup.BackupDataOutput p1, android.os.ParcelFileDescriptor p2);
    public void restoreEntity(android.app.backup.BackupDataInputStream p0);
    public void writeNewStateDescription(android.os.ParcelFileDescriptor p0);
}
