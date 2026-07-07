package android.hardware.radio.config;

public class PhoneCapability implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.config.PhoneCapability> CREATOR = null;
    public static final byte UNKNOWN = -1;
    public boolean isInternetLingeringSupported;
    public byte[] logicalModemIds;
    public byte maxActiveData;
    public byte maxActiveInternetData;
    public byte maxActiveVoice;
    public PhoneCapability() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
