package com.android.server.backup;

public class CompanionBackupHelper extends android.app.backup.BlobBackupHelper {
    private static final int BLOB_VERSION = 1;
    private static final java.lang.String KEY_COMPANION = "companion";
    private static final java.lang.String TAG = "CompanionBackupHelper";
    private final int mUserId = 0;
    public CompanionBackupHelper(int p0) { super(0, null); }
    protected void applyRestoredPayload(java.lang.String p0, byte[] p1) {}
    protected byte[] getBackupPayload(java.lang.String p0) { return null; }
}
