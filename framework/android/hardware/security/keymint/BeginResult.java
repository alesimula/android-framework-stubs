package android.hardware.security.keymint;

public class BeginResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.security.keymint.BeginResult> CREATOR = null;
    public long challenge;
    public android.hardware.security.keymint.IKeyMintOperation operation;
    public android.hardware.security.keymint.KeyParameter[] params;
    public BeginResult() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
