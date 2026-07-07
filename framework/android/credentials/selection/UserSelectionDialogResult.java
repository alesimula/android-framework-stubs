package android.credentials.selection;

public final class UserSelectionDialogResult extends android.credentials.selection.BaseDialogResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.credentials.selection.UserSelectionDialogResult> CREATOR = null;
    private static final java.lang.String EXTRA_USER_SELECTION_RESULT = "android.credentials.selection.extra.USER_SELECTION_RESULT";
    private final java.lang.String mEntryKey = null;
    private final java.lang.String mEntrySubkey = null;
    private final java.lang.String mProviderId = null;
    private android.credentials.selection.ProviderPendingIntentResponse mProviderPendingIntentResponse;
    public UserSelectionDialogResult(android.os.IBinder p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) { super((android.os.IBinder)null); }
    public UserSelectionDialogResult(android.os.IBinder p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, android.credentials.selection.ProviderPendingIntentResponse p4) { super((android.os.IBinder)null); }
    private UserSelectionDialogResult(android.os.Parcel p0) { super((android.os.IBinder)null); }
    public static void addToBundle(android.credentials.selection.UserSelectionDialogResult p0, android.os.Bundle p1) {}
    public static android.credentials.selection.UserSelectionDialogResult fromResultData(android.os.Bundle p0) { return null; }
    public int describeContents() { return 0; }
    public java.lang.String getEntryKey() { return null; }
    public java.lang.String getEntrySubkey() { return null; }
    public android.credentials.selection.ProviderPendingIntentResponse getPendingIntentProviderResponse() { return null; }
    public java.lang.String getProviderId() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
