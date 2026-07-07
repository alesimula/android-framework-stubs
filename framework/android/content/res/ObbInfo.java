package android.content.res;

public class ObbInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.res.ObbInfo> CREATOR = null;
    public static final int OBB_OVERLAY = 1;
    public java.lang.String filename;
    public int flags;
    public java.lang.String packageName;
    public byte[] salt;
    public int version;
    ObbInfo() {}
    private ObbInfo(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
