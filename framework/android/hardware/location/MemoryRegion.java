package android.hardware.location;

@android.annotation.SystemApi
public class MemoryRegion implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.location.MemoryRegion> CREATOR = null;
    private boolean mIsExecutable;
    private boolean mIsReadable;
    private boolean mIsWritable;
    private int mSizeBytes;
    private int mSizeBytesFree;
    public MemoryRegion(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getCapacityBytes() { return 0; }
    public int getFreeCapacityBytes() { return 0; }
    public int hashCode() { return 0; }
    public boolean isExecutable() { return false; }
    public boolean isReadable() { return false; }
    public boolean isWritable() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
