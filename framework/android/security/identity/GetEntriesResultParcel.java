package android.security.identity;

public class GetEntriesResultParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.security.identity.GetEntriesResultParcel> CREATOR = null;
    public byte[] deviceNameSpaces;
    public byte[] mac;
    public android.security.identity.ResultNamespaceParcel[] resultNamespaces;
    public byte[] signature;
    public byte[] staticAuthenticationData;
    public GetEntriesResultParcel() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
