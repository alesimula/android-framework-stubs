package android.hardware.radio.network;

public class RadioAccessSpecifier implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.RadioAccessSpecifier> CREATOR = null;
    public int accessNetwork;
    public android.hardware.radio.network.RadioAccessSpecifierBands bands;
    public int[] channels;
    public RadioAccessSpecifier() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
