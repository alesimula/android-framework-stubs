package android.content.pm;

public class InstallationFileParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.InstallationFileParcel> CREATOR = null;
    public int location;
    public byte[] metadata;
    public java.lang.String name;
    public byte[] signature;
    public long size;
    public InstallationFileParcel() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
