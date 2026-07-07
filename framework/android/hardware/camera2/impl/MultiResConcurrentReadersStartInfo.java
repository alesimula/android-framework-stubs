package android.hardware.camera2.impl;

public class MultiResConcurrentReadersStartInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.camera2.impl.MultiResConcurrentReadersStartInfo> CREATOR = null;
    public int groupId;
    public int[] streamIds;
    public long timestampOffset;
    public MultiResConcurrentReadersStartInfo() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
