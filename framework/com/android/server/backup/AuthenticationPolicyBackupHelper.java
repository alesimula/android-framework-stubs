package com.android.server.backup;

public class AuthenticationPolicyBackupHelper extends android.app.backup.BlobBackupHelper {
    private static final int BLOB_VERSION = 1;
    private static final java.lang.String DATA_TYPE_SETTINGS = "authentication_policy:settings";
    private static final java.lang.String ERROR_BACKUP_FAILURE = "backup_failure";
    private static final java.lang.String ERROR_RESTORE_FAILURE = "restore_failure";
    private static final java.lang.String ERROR_SERVICE_UNAVAILABLE = "service_unavailable";
    private static final java.lang.String KEY_SETTINGS = "authentication_policy";
    private static final java.lang.String TAG = "AuthenticationPolicyBackupHelper";
    private final android.util.Singleton<android.security.authenticationpolicy.IAuthenticationPolicyService> mService = null;
    private final int mUserId = 0;
    public AuthenticationPolicyBackupHelper(int p0) { super(0, null); }
    public AuthenticationPolicyBackupHelper(int p0, android.util.Singleton<android.security.authenticationpolicy.IAuthenticationPolicyService> p1) { super(0, null); }
    public void applyRestoredPayload(java.lang.String p0, byte[] p1) {}
    public byte[] getBackupPayload(java.lang.String p0) { return null; }
}
