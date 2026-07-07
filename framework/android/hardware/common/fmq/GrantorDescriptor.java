package android.hardware.common.fmq;

public class GrantorDescriptor implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.common.fmq.GrantorDescriptor> CREATOR = null;
    public long extent;
    public int fdIndex;
    public int offset;
    public GrantorDescriptor() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
