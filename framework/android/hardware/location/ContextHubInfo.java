package android.hardware.location;

@android.annotation.SystemApi
public class ContextHubInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.location.ContextHubInfo> CREATOR = null;
    private byte mChreApiMajorVersion;
    private byte mChreApiMinorVersion;
    private short mChrePatchVersion;
    private long mChrePlatformId;
    private int mId;
    private int mMaxPacketLengthBytes;
    private android.hardware.location.MemoryRegion[] mMemoryRegions;
    private java.lang.String mName;
    private float mPeakMips;
    private float mPeakPowerDrawMw;
    private int mPlatformVersion;
    private float mSleepPowerDrawMw;
    private float mStoppedPowerDrawMw;
    private int[] mSupportedSensors;
    private boolean mSupportsReliableMessages;
    private java.lang.String mToolchain;
    private int mToolchainVersion;
    private java.lang.String mVendor;
    public ContextHubInfo() {}
    public ContextHubInfo(android.hardware.contexthub.ContextHubInfo p0) {}
    public ContextHubInfo(android.hardware.contexthub.V1_0.ContextHub p0) {}
    private ContextHubInfo(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void dump(android.util.proto.ProtoOutputStream p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public byte getChreApiMajorVersion() { return 0; }
    public byte getChreApiMinorVersion() { return 0; }
    public short getChrePatchVersion() { return 0; }
    public long getChrePlatformId() { return 0L; }
    public int getId() { return 0; }
    public int getMaxPacketLengthBytes() { return 0; }
    public android.hardware.location.MemoryRegion[] getMemoryRegions() { return null; }
    public java.lang.String getName() { return null; }
    public float getPeakMips() { return 0.0f; }
    public float getPeakPowerDrawMw() { return 0.0f; }
    public int getPlatformVersion() { return 0; }
    public float getSleepPowerDrawMw() { return 0.0f; }
    public int getStaticSwVersion() { return 0; }
    public float getStoppedPowerDrawMw() { return 0.0f; }
    public int[] getSupportedSensors() { return null; }
    public java.lang.String getToolchain() { return null; }
    public int getToolchainVersion() { return 0; }
    public java.lang.String getVendor() { return null; }
    public int hashCode() { return 0; }
    public boolean supportsReliableMessages() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
