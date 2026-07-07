package android.hardware.keymaster;

public class HardwareAuthToken implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.keymaster.HardwareAuthToken> CREATOR = null;
    public long authenticatorId;
    public int authenticatorType;
    public long challenge;
    public byte[] mac;
    public android.hardware.keymaster.Timestamp timestamp;
    public long userId;
    public HardwareAuthToken() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
