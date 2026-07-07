package android.app.backup;

@android.annotation.SystemApi
public final class BackupRestoreEventLogger {
    public static final int DATA_TYPES_ALLOWED = 150;
    private static final java.lang.String TAG = "BackupRestoreEventLogger";
    private final java.security.MessageDigest mHashDigest = null;
    private final int mOperationType = 0;
    private final java.util.Map<java.lang.String, android.app.backup.BackupRestoreEventLogger.DataTypeResult> mResults = null;
    public BackupRestoreEventLogger(int p0) {}
    private android.app.backup.BackupRestoreEventLogger.DataTypeResult getDataTypeResult(int p0, java.lang.String p1) { return null; }
    private int getDataTypesAllowed() { return 0; }
    private byte[] getMetaDataHash(java.lang.String p0) { return null; }
    private void logFailure(int p0, java.lang.String p1, int p2, java.lang.String p3) {}
    private void logMetaData(int p0, java.lang.String p1, java.lang.String p2) {}
    private void logSuccess(int p0, java.lang.String p1, int p2) {}
    public static java.lang.String toString(android.app.backup.BackupRestoreEventLogger.DataTypeResult p0) { return null; }
    public void clearData() {}
    public java.util.List<android.app.backup.BackupRestoreEventLogger.DataTypeResult> getLoggingResults() { return null; }
    public int getOperationType() { return 0; }
    public void logBackupMetadata(java.lang.String p0, java.lang.String p1) {}
    public void logItemsBackedUp(java.lang.String p0, int p1) {}
    public void logItemsBackupFailed(java.lang.String p0, int p1, java.lang.String p2) {}
    public void logItemsRestoreFailed(java.lang.String p0, int p1, java.lang.String p2) {}
    public void logItemsRestored(java.lang.String p0, int p1) {}
    public void logRestoreMetadata(java.lang.String p0, java.lang.String p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BackupRestoreDataType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BackupRestoreError {
    }

    public static final class DataTypeResult implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.backup.BackupRestoreEventLogger.DataTypeResult> CREATOR = null;
        private final java.lang.String mDataType = null;
        private final java.util.Map<java.lang.String, java.lang.Integer> mErrors = null;
        private int mFailCount;
        private byte[] mMetadataHash;
        private int mSuccessCount;
        public DataTypeResult(java.lang.String p0) {}
        public int describeContents() { return 0; }
        public java.lang.String getDataType() { return null; }
        public java.util.Map<java.lang.String, java.lang.Integer> getErrors() { return null; }
        public int getFailCount() { return 0; }
        public byte[] getMetadataHash() { return null; }
        public int getSuccessCount() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
