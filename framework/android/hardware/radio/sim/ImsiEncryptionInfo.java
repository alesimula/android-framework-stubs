package android.hardware.radio.sim;

public class ImsiEncryptionInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.sim.ImsiEncryptionInfo> CREATOR = null;
    public static final byte PUBLIC_KEY_TYPE_EPDG = 1;
    public static final byte PUBLIC_KEY_TYPE_WLAN = 2;
    public byte[] carrierKey;
    public long expirationTime;
    public java.lang.String keyIdentifier;
    public byte keyType;
    public java.lang.String mcc;
    public java.lang.String mnc;
    public ImsiEncryptionInfo() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
