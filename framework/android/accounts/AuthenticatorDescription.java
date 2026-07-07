package android.accounts;

public class AuthenticatorDescription implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.accounts.AuthenticatorDescription> CREATOR = null;
    public final int accountPreferencesId = 0;
    public final boolean customTokens = false;
    public final int iconId = 0;
    public final int labelId = 0;
    public final java.lang.String packageName = null;
    public final int smallIconId = 0;
    public final java.lang.String type = null;
    private AuthenticatorDescription(android.os.Parcel p0) {}
    private AuthenticatorDescription(java.lang.String p0) {}
    public AuthenticatorDescription(java.lang.String p0, java.lang.String p1, int p2, int p3, int p4, int p5) {}
    public AuthenticatorDescription(java.lang.String p0, java.lang.String p1, int p2, int p3, int p4, int p5, boolean p6) {}
    public static android.accounts.AuthenticatorDescription newKey(java.lang.String p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
