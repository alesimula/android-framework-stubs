package android.security.attestationverification;

public class IVerificationResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.security.attestationverification.IVerificationResult> CREATOR = null;
    public int resultCode;
    public android.security.attestationverification.VerificationToken token;
    public IVerificationResult() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
