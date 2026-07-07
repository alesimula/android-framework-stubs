package android.hardware.radio;

public class RadioResponseInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.RadioResponseInfo> CREATOR = null;
    public int error;
    public int serial;
    public int type;
    public RadioResponseInfo() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
