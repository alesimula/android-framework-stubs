package android.os.storage.operations;

public final class FileOperationResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.storage.operations.FileOperationResult> CREATOR = null;
    public static final int ERROR_BUSY = 1;
    public static final int ERROR_DISK_FULL = 6;
    public static final int ERROR_INVALID_REQUEST = 2;
    public static final int ERROR_NONE = -1;
    public static final int ERROR_PERMISSION_DENIED = 5;
    public static final int ERROR_UNKNOWN = 0;
    public static final int ERROR_UNSUPPORTED_SOURCE = 3;
    public static final int ERROR_UNSUPPORTED_TARGET = 4;
    public static final int STATUS_FAILED = 4;
    public static final int STATUS_FINISHED = 3;
    public static final int STATUS_IN_PROGRESS = 2;
    public static final int STATUS_QUEUED = 1;
    public static final int STATUS_UNKNOWN = 0;
    private final int mErrorCode = 0;
    private final java.lang.String mErrorMessage = null;
    private final java.util.List<java.lang.String> mFailedPaths = null;
    private final java.lang.String mRequestId = null;
    private final android.os.storage.operations.sources.OperationSource mSource = null;
    private final int mStatus = 0;
    private final android.os.storage.operations.targets.OperationTarget mTarget = null;
    private FileOperationResult(android.os.Parcel p0) {}
    private FileOperationResult(android.os.storage.operations.FileOperationResult.Builder p0) {}
    public int describeContents() { return 0; }
    public int getErrorCode() { return 0; }
    public java.lang.String getErrorMessage() { return null; }
    public java.util.List<java.lang.String> getFailedPaths() { return null; }
    public java.lang.String getRequestId() { return null; }
    public android.os.storage.operations.sources.OperationSource getSource() { return null; }
    public int getStatus() { return 0; }
    public android.os.storage.operations.targets.OperationTarget getTarget() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private int mErrorCode;
        private java.lang.String mErrorMessage;
        private java.util.List<java.lang.String> mFailedPaths;
        private final java.lang.String mRequestId = null;
        private final android.os.storage.operations.sources.OperationSource mSource = null;
        private int mStatus;
        private final android.os.storage.operations.targets.OperationTarget mTarget = null;
        public Builder(java.lang.String p0, android.os.storage.operations.FileOperationRequest p1) {}
        public android.os.storage.operations.FileOperationResult build() { return null; }
        public android.os.storage.operations.FileOperationResult.Builder setErrorCode(int p0) { return null; }
        public android.os.storage.operations.FileOperationResult.Builder setErrorMessage(java.lang.String p0) { return null; }
        public android.os.storage.operations.FileOperationResult.Builder setFailedPaths(java.util.List<java.lang.String> p0) { return null; }
        public android.os.storage.operations.FileOperationResult.Builder setStatus(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ErrorCode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Status {
    }
}
