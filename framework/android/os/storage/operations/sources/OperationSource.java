package android.os.storage.operations.sources;

public abstract class OperationSource {
    static final android.os.storage.operations.sources.OperationSource INVALID_SOURCE = null;
    static final java.lang.String KEY_SOURCE_TYPE = "key_source_type";
    private static final java.lang.String TAG = "OperationSource";
    public static final int TYPE_APP_DATA_FILE = 1;
    public static final int TYPE_INVALID = -1;
    OperationSource() {}
    OperationSource(android.os.Bundle p0) {}
    public static android.os.storage.operations.sources.OperationSource createSourceFromBundle(android.os.Bundle p0) { return null; }
    public static android.os.storage.operations.sources.OperationSource getInvalidSource() { return null; }
    android.os.Bundle getDataBundle() { return null; }
    public abstract int getSourceType();
    public abstract boolean isValid();
    public abstract java.lang.String toString();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SourceType {
    }
}
