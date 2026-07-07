package android.app.backup;

public class BackupAgentHelper extends android.app.backup.BackupAgent {
    static final java.lang.String TAG = "BackupAgentHelper";
    android.app.backup.BackupHelperDispatcher mDispatcher;
    public BackupAgentHelper() { super(); }
    public void addHelper(java.lang.String p0, android.app.backup.BackupHelper p1) {}
    public android.app.backup.BackupHelperDispatcher getDispatcher() { return null; }
    public void onBackup(android.os.ParcelFileDescriptor p0, android.app.backup.BackupDataOutput p1, android.os.ParcelFileDescriptor p2) throws java.io.IOException {}
    @android.annotation.SystemApi
    public void onDelayedRestore(android.app.backup.DelayedRestoreRequest p0, android.app.backup.BackupDataInput p1, long p2, android.os.ParcelFileDescriptor p3) throws java.io.IOException {}
    public void onRestore(android.app.backup.BackupDataInput p0, int p1, android.os.ParcelFileDescriptor p2) throws java.io.IOException {}
}
