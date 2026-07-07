package android.hardware.contexthub;

public class NanoappBinary implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.contexthub.NanoappBinary> CREATOR = null;
    public static final int FLAG_ENCRYPTED = 2;
    public static final int FLAG_SIGNED = 1;
    public static final int FLAG_TCM_CAPABLE = 4;
    public byte[] customBinary;
    public int flags;
    public long nanoappId;
    public int nanoappVersion;
    public byte targetChreApiMajorVersion;
    public byte targetChreApiMinorVersion;
    public NanoappBinary() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
