package android.hardware.location;

@android.annotation.SystemApi
public final class NanoAppBinary implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.location.NanoAppBinary> CREATOR = null;
    private static final int EXPECTED_HEADER_VERSION = 1;
    private static final int EXPECTED_MAGIC_VALUE = 1330528590;
    private static final java.nio.ByteOrder HEADER_ORDER = null;
    private static final int HEADER_SIZE_BYTES = 40;
    private static final int NANOAPP_ENCRYPTED_FLAG_BIT = 2;
    private static final int NANOAPP_SIGNED_FLAG_BIT = 1;
    private static final java.lang.String TAG = "NanoAppBinary";
    private int mFlags;
    private boolean mHasValidHeader;
    private int mHeaderVersion;
    private long mHwHubType;
    private int mMagic;
    private byte[] mNanoAppBinary;
    private long mNanoAppId;
    private int mNanoAppVersion;
    private byte mTargetChreApiMajorVersion;
    private byte mTargetChreApiMinorVersion;
    private NanoAppBinary(android.os.Parcel p0) {}
    public NanoAppBinary(byte[] p0) {}
    private void parseBinaryHeader() {}
    public int describeContents() { return 0; }
    public byte[] getBinary() { return null; }
    public byte[] getBinaryNoHeader() { return null; }
    public int getFlags() { return 0; }
    public int getHeaderVersion() { return 0; }
    public long getHwHubType() { return 0L; }
    public long getNanoAppId() { return 0L; }
    public int getNanoAppVersion() { return 0; }
    public byte getTargetChreApiMajorVersion() { return 0; }
    public byte getTargetChreApiMinorVersion() { return 0; }
    public boolean hasValidHeader() { return false; }
    public boolean isEncrypted() { return false; }
    public boolean isSigned() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
