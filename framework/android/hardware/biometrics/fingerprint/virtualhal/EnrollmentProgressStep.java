package android.hardware.biometrics.fingerprint.virtualhal;

public class EnrollmentProgressStep implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.fingerprint.virtualhal.EnrollmentProgressStep> CREATOR = null;
    public android.hardware.biometrics.fingerprint.virtualhal.AcquiredInfoAndVendorCode[] acquiredInfoAndVendorCodes;
    public int durationMs;
    public EnrollmentProgressStep() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
