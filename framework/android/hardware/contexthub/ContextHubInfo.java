package android.hardware.contexthub;

public class ContextHubInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.contexthub.ContextHubInfo> CREATOR = null;
    public byte chreApiMajorVersion;
    public byte chreApiMinorVersion;
    public char chrePatchVersion;
    public long chrePlatformId;
    public int id;
    public int maxSupportedMessageLengthBytes;
    public java.lang.String name;
    public float peakMips;
    public java.lang.String[] supportedPermissions;
    public boolean supportsReliableMessages;
    public java.lang.String toolchain;
    public java.lang.String vendor;
    public ContextHubInfo() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
