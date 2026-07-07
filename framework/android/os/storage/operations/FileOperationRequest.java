package android.os.storage.operations;

public final class FileOperationRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.storage.operations.FileOperationRequest> CREATOR = null;
    public static final int OPERATION_COPY = 2;
    public static final int OPERATION_MOVE = 1;
    private final int mMode = 0;
    private final boolean mShouldRegisterListener = false;
    private final android.os.storage.operations.sources.OperationSource mSource = null;
    private final android.os.storage.operations.targets.OperationTarget mTarget = null;
    private FileOperationRequest(android.os.Parcel p0) {}
    private FileOperationRequest(android.os.storage.operations.FileOperationRequest.Builder p0) {}
    public int describeContents() { return 0; }
    public int getMode() { return 0; }
    public android.os.storage.operations.sources.OperationSource getSource() { return null; }
    public android.os.storage.operations.targets.OperationTarget getTarget() { return null; }
    public boolean shouldRegisterCompletionListener() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private int mMode;
        private boolean mShouldRegisterListener;
        private android.os.storage.operations.sources.OperationSource mSource;
        private android.os.storage.operations.targets.OperationTarget mTarget;
        public Builder(int p0) {}
        public android.os.storage.operations.FileOperationRequest build() { return null; }
        public android.os.storage.operations.FileOperationRequest.Builder setRegisterCompletionListener(boolean p0) { return null; }
        public android.os.storage.operations.FileOperationRequest.Builder setSource(android.os.storage.operations.sources.OperationSource p0) { return null; }
        public android.os.storage.operations.FileOperationRequest.Builder setTarget(android.os.storage.operations.targets.OperationTarget p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface OperationMode {
    }
}
