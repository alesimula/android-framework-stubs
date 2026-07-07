package android.hardware.security.secureclock;

public class TimeStampToken implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.security.secureclock.TimeStampToken> CREATOR = null;
    public long challenge;
    public byte[] mac;
    public android.hardware.security.secureclock.Timestamp timestamp;
    public TimeStampToken() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
