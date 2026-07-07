package android.hardware.radio.config;

public class SimTypeInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.config.SimTypeInfo> CREATOR = null;
    public int currentSimType;
    public int supportedSimTypes;
    public SimTypeInfo() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
