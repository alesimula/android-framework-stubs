package android.apex;

public class CompressedApexInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.apex.CompressedApexInfo> CREATOR = null;
    public long decompressedSize;
    public java.lang.String moduleName;
    public long versionCode;
    public CompressedApexInfo() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
