package android.system.keystore2;

public class Authorization implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.system.keystore2.Authorization> CREATOR = null;
    public android.hardware.security.keymint.KeyParameter keyParameter;
    public int securityLevel;
    public Authorization() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
