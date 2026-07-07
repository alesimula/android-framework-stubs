package android.hardware.radio.voice;

public class EmergencyNumber implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.voice.EmergencyNumber> CREATOR = null;
    public static final int SOURCE_DEFAULT = 8;
    public static final int SOURCE_MODEM_CONFIG = 4;
    public static final int SOURCE_NETWORK_SIGNALING = 1;
    public static final int SOURCE_SIM = 2;
    public int categories;
    public java.lang.String mcc;
    public java.lang.String mnc;
    public java.lang.String number;
    public int sources;
    public java.lang.String[] urns;
    public EmergencyNumber() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
