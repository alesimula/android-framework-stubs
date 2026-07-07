package android.service.credentials;

public final class CredentialEntry implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.credentials.CredentialEntry> CREATOR = null;
    private final java.lang.String mBeginGetCredentialOptionId = null;
    private final android.app.slice.Slice mSlice = null;
    private final java.lang.String mType = null;
    private CredentialEntry(android.os.Parcel p0) {}
    public CredentialEntry(android.service.credentials.BeginGetCredentialOption p0, android.app.slice.Slice p1) {}
    public CredentialEntry(java.lang.String p0, android.app.slice.Slice p1) {}
    public CredentialEntry(java.lang.String p0, java.lang.String p1, android.app.slice.Slice p2) {}
    public int describeContents() { return 0; }
    public java.lang.String getBeginGetCredentialOptionId() { return null; }
    public android.app.slice.Slice getSlice() { return null; }
    public java.lang.String getType() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
