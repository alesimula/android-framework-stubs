package android.hardware.security.secureclock;

public class Timestamp implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.security.secureclock.Timestamp> CREATOR = null;
    public long milliSeconds;
    public Timestamp() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
