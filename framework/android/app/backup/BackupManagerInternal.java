package android.app.backup;

public interface BackupManagerInternal {
    public void agentConnectedForUser(java.lang.String p0, int p1, android.os.IBinder p2);
    public void agentDisconnectedForUser(java.lang.String p0, int p1);
    public void onDelayedRestoreCachedDataExpiredForUser(int p0, java.lang.String p1);
    public void onDelayedRestoreConditionMetForUser(int p0, android.app.backup.DelayedRestoreRequest p1);
    public boolean scheduleDelayedRestoreForUser(int p0, android.app.backup.DelayedRestoreRequest p1);
}
