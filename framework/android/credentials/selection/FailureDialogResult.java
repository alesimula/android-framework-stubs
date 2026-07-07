package android.credentials.selection;

public final class FailureDialogResult extends android.credentials.selection.BaseDialogResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.credentials.selection.FailureDialogResult> CREATOR = null;
    private static final java.lang.String EXTRA_FAILURE_RESULT = "android.credentials.selection.extra.FAILURE_RESULT";
    private final java.lang.String mErrorMessage = null;
    public FailureDialogResult(android.os.IBinder p0, java.lang.String p1) { super((android.os.IBinder)null); }
    private FailureDialogResult(android.os.Parcel p0) { super((android.os.IBinder)null); }
    public static void addToBundle(android.credentials.selection.FailureDialogResult p0, android.os.Bundle p1) {}
    public static android.credentials.selection.FailureDialogResult fromResultData(android.os.Bundle p0) { return null; }
    public int describeContents() { return 0; }
    public java.lang.String getErrorMessage() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
