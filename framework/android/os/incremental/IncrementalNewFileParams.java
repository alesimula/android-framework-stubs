package android.os.incremental;

public class IncrementalNewFileParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.incremental.IncrementalNewFileParams> CREATOR = null;
    public byte[] fileId;
    public byte[] metadata;
    public byte[] signature;
    public long size;
    public IncrementalNewFileParams() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
