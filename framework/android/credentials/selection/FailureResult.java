package android.credentials.selection;

@android.annotation.SystemApi
public final class FailureResult {
    public static final int ERROR_CODE_CANCELED_AND_LAUNCHED_SETTINGS = 2;
    public static final int ERROR_CODE_DIALOG_CANCELED_BY_USER = 1;
    public static final int ERROR_CODE_UI_FAILURE = 0;
    private final int mErrorCode = 0;
    private final java.lang.String mErrorMessage = null;
    public FailureResult(int p0, java.lang.String p1) {}
    public static void sendFailureResult(android.os.ResultReceiver p0, android.credentials.selection.FailureResult p1) {}
    int errorCodeToResultCode() { return 0; }
    public int getErrorCode() { return 0; }
    public java.lang.String getErrorMessage() { return null; }
    android.credentials.selection.FailureDialogResult toFailureDialogResult() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ErrorCode {
    }
}
