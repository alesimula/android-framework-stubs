package android.hardware.radio.voice;

public class Dial implements android.os.Parcelable {
    public static final int CLIR_DEFAULT = 0;
    public static final int CLIR_INVOCATION = 1;
    public static final int CLIR_SUPPRESSION = 2;
    public static final android.os.Parcelable.Creator<android.hardware.radio.voice.Dial> CREATOR = null;
    public java.lang.String address;
    public int clir;
    public android.hardware.radio.voice.UusInfo[] uusInfo;
    public Dial() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
