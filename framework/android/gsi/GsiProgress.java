package android.gsi;

public class GsiProgress implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.gsi.GsiProgress> CREATOR = null;
    public long bytes_processed;
    public int status;
    public java.lang.String step;
    public long total_bytes;
    public GsiProgress() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
