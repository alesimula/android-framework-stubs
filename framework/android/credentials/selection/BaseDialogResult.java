package android.credentials.selection;

public class BaseDialogResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.credentials.selection.BaseDialogResult> CREATOR = null;
    private static final java.lang.String EXTRA_BASE_RESULT = "android.credentials.selection.extra.BASE_RESULT";
    public static final int RESULT_CODE_CANCELED_AND_LAUNCHED_SETTINGS = 1;
    public static final int RESULT_CODE_DATA_PARSING_FAILURE = 3;
    public static final int RESULT_CODE_DIALOG_COMPLETE_WITH_SELECTION = 2;
    public static final int RESULT_CODE_DIALOG_USER_CANCELED = 0;
    @java.lang.Deprecated
    private final android.os.IBinder mRequestToken = null;
    public BaseDialogResult(android.os.IBinder p0) {}
    protected BaseDialogResult(android.os.Parcel p0) {}
    public static void addToBundle(android.credentials.selection.BaseDialogResult p0, android.os.Bundle p1) {}
    public static android.credentials.selection.BaseDialogResult fromResultData(android.os.Bundle p0) { return null; }
    public int describeContents() { return 0; }
    @java.lang.Deprecated
    public android.os.IBinder getRequestToken() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ResultCode {
    }
}
