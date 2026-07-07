package android.credentials;

public final class PrepareGetCredentialResponseInternal implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.credentials.PrepareGetCredentialResponseInternal> CREATOR = null;
    private static final java.lang.String TAG = "CredentialManager";
    private final android.util.ArraySet<java.lang.String> mCredentialResultTypes = null;
    private final boolean mHasAuthenticationResults = false;
    private final boolean mHasQueryApiPermission = false;
    private final boolean mHasRemoteResults = false;
    private final android.app.PendingIntent mPendingIntent = null;
    private PrepareGetCredentialResponseInternal(android.os.Parcel p0) {}
    public PrepareGetCredentialResponseInternal(boolean p0, java.util.Set<java.lang.String> p1, boolean p2, boolean p3, android.app.PendingIntent p4) {}
    public int describeContents() { return 0; }
    public android.app.PendingIntent getPendingIntent() { return null; }
    public boolean hasAuthenticationResults() { return false; }
    public boolean hasCredentialResults(java.lang.String p0) { return false; }
    public boolean hasRemoteResults() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
