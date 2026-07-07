package android.system.keystore2;

public class AuthenticatorSpec implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.system.keystore2.AuthenticatorSpec> CREATOR = null;
    public long authenticatorId;
    public int authenticatorType;
    public AuthenticatorSpec() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
