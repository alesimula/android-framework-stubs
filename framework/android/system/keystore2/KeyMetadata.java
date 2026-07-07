package android.system.keystore2;

public class KeyMetadata implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.system.keystore2.KeyMetadata> CREATOR = null;
    public android.system.keystore2.Authorization[] authorizations;
    public byte[] certificate;
    public byte[] certificateChain;
    public android.system.keystore2.KeyDescriptor key;
    public int keySecurityLevel;
    public long modificationTimeMs;
    public KeyMetadata() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
