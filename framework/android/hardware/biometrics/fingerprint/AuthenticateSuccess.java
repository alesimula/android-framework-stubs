package android.hardware.biometrics.fingerprint;

public class AuthenticateSuccess implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.fingerprint.AuthenticateSuccess> CREATOR = null;
    public int enrollmentId;
    public android.hardware.keymaster.HardwareAuthToken hat;
    public final android.os.ParcelableHolder metadata = null;
    public AuthenticateSuccess() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
