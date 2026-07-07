package android.hardware.vibrator;

public class VendorEffect implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.vibrator.VendorEffect> CREATOR = null;
    public float scale;
    public byte strength;
    public android.os.PersistableBundle vendorData;
    public float vendorScale;
    public VendorEffect() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
