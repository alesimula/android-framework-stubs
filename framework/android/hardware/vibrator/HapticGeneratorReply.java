package android.hardware.vibrator;

public class HapticGeneratorReply implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.vibrator.HapticGeneratorReply> CREATOR = null;
    public int burstBytesReady;
    public int status;
    public HapticGeneratorReply() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
