package android.hardware.camera2.utils;

public class OutputAndInputStreamIds implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.camera2.utils.OutputAndInputStreamIds> CREATOR = null;
    public int inputStreamId;
    public int[] offlineStreamIds;
    public int[] outputStreamIds;
    public OutputAndInputStreamIds() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
