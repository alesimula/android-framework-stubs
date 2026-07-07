package android.credentials.selection;

@android.annotation.SystemApi
public final class CancelSelectionRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.credentials.selection.CancelSelectionRequest> CREATOR = null;
    public static final java.lang.String EXTRA_CANCEL_UI_REQUEST = "android.credentials.selection.extra.CANCEL_UI_REQUEST";
    private final java.lang.String mPackageName = null;
    private final boolean mShouldShowCancellationExplanation = false;
    private final android.os.IBinder mToken = null;
    public CancelSelectionRequest(android.credentials.selection.RequestToken p0, boolean p1, java.lang.String p2) {}
    private CancelSelectionRequest(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public java.lang.String getPackageName() { return null; }
    public android.credentials.selection.RequestToken getRequestToken() { return null; }
    public android.os.IBinder getToken() { return null; }
    public boolean shouldShowCancellationExplanation() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
