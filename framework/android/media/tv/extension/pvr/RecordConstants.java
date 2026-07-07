package android.media.tv.extension.pvr;

public final class RecordConstants {
    public static final int CHANNEL_STATUS_LOCKED = 1;
    public static final int CHANNEL_STATUS_UNLOCKED = 0;
    public static final int DELETION_RESULT_FAILED_CONTENT_IS_BUSY = 4;
    public static final int DELETION_RESULT_FAILED_INVALID_CONTENTS_URI = 3;
    public static final int DELETION_RESULT_FAILED_REASON_UNKNOWN = 2;
    public static final int DELETION_RESULT_FAILED_STORAGE_IO_ERROR = 1;
    public static final int DELETION_RESULT_SUCCESS = 0;
    public RecordConstants() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeletionResult {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LockStatus {
    }
}
