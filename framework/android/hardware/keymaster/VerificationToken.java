package android.hardware.keymaster;

public class VerificationToken implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.keymaster.VerificationToken> CREATOR = null;
    public long challenge;
    public byte[] mac;
    public int securityLevel;
    public android.hardware.keymaster.Timestamp timestamp;
    public VerificationToken() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
