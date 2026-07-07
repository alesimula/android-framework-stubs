package android.credentials;

public final class CredentialDescription implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.credentials.CredentialDescription> CREATOR = null;
    private static final int MAX_ALLOWED_ENTRIES_PER_DESCRIPTION = 16;
    private final java.util.List<android.service.credentials.CredentialEntry> mCredentialEntries = null;
    private final java.util.Set<java.lang.String> mSupportedElementKeys = null;
    private final java.lang.String mType = null;
    private CredentialDescription(android.os.Parcel p0) {}
    public CredentialDescription(java.lang.String p0, java.util.Set<java.lang.String> p1, java.util.List<android.service.credentials.CredentialEntry> p2) {}
    private static int compareEntryTypes(java.lang.String p0, java.util.List<android.service.credentials.CredentialEntry> p1) { return 0; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.List<android.service.credentials.CredentialEntry> getCredentialEntries() { return null; }
    public java.util.Set<java.lang.String> getSupportedElementKeys() { return null; }
    public java.lang.String getType() { return null; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
