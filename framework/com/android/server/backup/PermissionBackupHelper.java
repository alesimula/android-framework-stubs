package com.android.server.backup;

public class PermissionBackupHelper extends android.app.backup.BlobBackupHelper {
    private static final java.lang.String KEY_PERMISSIONS = "permissions";
    private static final int STATE_VERSION = 1;
    private static final java.lang.String TAG = "PermissionBackup";
    private final android.permission.PermissionManagerInternal mPermissionManager = null;
    private final int mUserId = 0;
    public PermissionBackupHelper(int p0) { super(0, null); }
    protected void applyRestoredPayload(java.lang.String p0, byte[] p1) {}
    protected byte[] getBackupPayload(java.lang.String p0) { return null; }
}
