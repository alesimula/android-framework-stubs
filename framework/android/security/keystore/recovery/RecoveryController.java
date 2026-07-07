package android.security.keystore.recovery;

@android.annotation.SystemApi
public class RecoveryController {
    private static final java.lang.String APPLICATION_KEY_GRANT_PREFIX = "recoverable_key:";
    public static final int ERROR_BAD_CERTIFICATE_FORMAT = 25;
    public static final int ERROR_DECRYPTION_FAILED = 26;
    public static final int ERROR_DOWNGRADE_CERTIFICATE = 29;
    public static final int ERROR_INSECURE_USER = 23;
    public static final int ERROR_INVALID_CERTIFICATE = 28;
    public static final int ERROR_INVALID_KEY_FORMAT = 27;
    public static final int ERROR_KEY_NOT_FOUND = 30;
    public static final int ERROR_NO_SNAPSHOT_PENDING = 21;
    public static final int ERROR_SERVICE_INTERNAL_ERROR = 22;
    public static final int ERROR_SESSION_EXPIRED = 24;
    public static final int RECOVERY_STATUS_PERMANENT_FAILURE = 3;
    public static final int RECOVERY_STATUS_SYNCED = 0;
    public static final int RECOVERY_STATUS_SYNC_IN_PROGRESS = 1;
    private static final java.lang.String TAG = "RecoveryController";
    private final com.android.internal.widget.ILockSettings mBinder = null;
    private RecoveryController(com.android.internal.widget.ILockSettings p0) {}
    private static android.system.keystore2.KeyDescriptor getGrantDescriptor(java.lang.String p0) { return null; }
    public static android.security.keystore.recovery.RecoveryController getInstance(android.content.Context p0) { return null; }
    public static boolean isRecoverableKeyStoreEnabled(android.content.Context p0) { return false; }
    public android.security.keystore.recovery.RecoverySession createRecoverySession() { return null; }
    @java.lang.Deprecated
    public java.security.Key generateKey(java.lang.String p0) throws android.security.keystore.recovery.InternalRecoveryServiceException, android.security.keystore.recovery.LockScreenRequiredException { return null; }
    public java.security.Key generateKey(java.lang.String p0, byte[] p1) throws android.security.keystore.recovery.InternalRecoveryServiceException, android.security.keystore.recovery.LockScreenRequiredException { return null; }
    public java.util.List<java.lang.String> getAliases() throws android.security.keystore.recovery.InternalRecoveryServiceException { return null; }
    com.android.internal.widget.ILockSettings getBinder() { return null; }
    public java.security.Key getKey(java.lang.String p0) throws android.security.keystore.recovery.InternalRecoveryServiceException, java.security.UnrecoverableKeyException { return null; }
    public android.security.keystore.recovery.KeyChainSnapshot getKeyChainSnapshot() throws android.security.keystore.recovery.InternalRecoveryServiceException { return null; }
    java.security.Key getKeyFromGrant(java.lang.String p0) throws java.security.UnrecoverableKeyException, android.security.keystore.KeyPermanentlyInvalidatedException { return null; }
    public int[] getRecoverySecretTypes() throws android.security.keystore.recovery.InternalRecoveryServiceException { return null; }
    public int getRecoveryStatus(java.lang.String p0) throws android.security.keystore.recovery.InternalRecoveryServiceException { return 0; }
    public java.util.Map<java.lang.String, java.security.cert.X509Certificate> getRootCertificates() { return null; }
    @java.lang.Deprecated
    public java.security.Key importKey(java.lang.String p0, byte[] p1) throws android.security.keystore.recovery.InternalRecoveryServiceException, android.security.keystore.recovery.LockScreenRequiredException { return null; }
    public java.security.Key importKey(java.lang.String p0, byte[] p1, byte[] p2) throws android.security.keystore.recovery.InternalRecoveryServiceException, android.security.keystore.recovery.LockScreenRequiredException { return null; }
    public void initRecoveryService(java.lang.String p0, byte[] p1, byte[] p2) throws java.security.cert.CertificateException, android.security.keystore.recovery.InternalRecoveryServiceException {}
    public void removeKey(java.lang.String p0) throws android.security.keystore.recovery.InternalRecoveryServiceException {}
    public void setRecoverySecretTypes(int[] p0) throws android.security.keystore.recovery.InternalRecoveryServiceException {}
    public void setRecoveryStatus(java.lang.String p0, int p1) throws android.security.keystore.recovery.InternalRecoveryServiceException {}
    public void setServerParams(byte[] p0) throws android.security.keystore.recovery.InternalRecoveryServiceException {}
    public void setSnapshotCreatedPendingIntent(android.app.PendingIntent p0) throws android.security.keystore.recovery.InternalRecoveryServiceException {}
    android.security.keystore.recovery.InternalRecoveryServiceException wrapUnexpectedServiceSpecificException(android.os.ServiceSpecificException p0) { return null; }
}
