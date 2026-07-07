package android.hardware.input;

public class VirtualGamepadMotionEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.input.VirtualGamepadMotionEvent> CREATOR = null;
    public long eventTimeNanos;
    public float hatX;
    public float hatY;
    public float lTrigger;
    public float rTrigger;
    public float rz;
    public float x;
    public float y;
    public float z;
    public VirtualGamepadMotionEvent() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
