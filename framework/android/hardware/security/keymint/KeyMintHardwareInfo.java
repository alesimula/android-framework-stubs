package android.hardware.security.keymint;

public class KeyMintHardwareInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.security.keymint.KeyMintHardwareInfo> CREATOR = null;
    public java.lang.String keyMintAuthorName;
    public java.lang.String keyMintName;
    public int securityLevel;
    public boolean timestampTokenRequired;
    public int versionNumber;
    public KeyMintHardwareInfo() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
