package android.os.storage;

public final class FileManager {
    public static final java.lang.String ACTION_FILE_OPERATION_COMPLETED = "android.os.storage.action.FILE_OPERATION_COMPLETED";
    public static final java.lang.String EXTRA_REQUEST_ID = "android.os.storage.extra.REQUEST_ID";
    public static final java.lang.String EXTRA_RESULT = "android.os.storage.extra.RESULT";
    private static final int MAX_REPORTED_FAILURES = 200;
    private final android.content.Context mContext = null;
    private final android.os.storage.IFileService mService = null;
    public FileManager(android.content.Context p0, android.os.storage.IFileService p1) {}
    public static int getMaxReportedFailures() { return 0; }
    public android.os.storage.operations.FileOperationEnqueueResult enqueueOperation(android.os.storage.operations.FileOperationRequest p0) { return null; }
    public android.os.storage.operations.FileOperationResult fetchResult(java.lang.String p0) { return null; }
    public void registerCompletionListener(java.lang.String p0) {}
    public void unregisterCompletionListener(java.lang.String p0) {}
}
