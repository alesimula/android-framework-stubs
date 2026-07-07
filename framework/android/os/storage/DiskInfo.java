package android.os.storage;

public class DiskInfo implements android.os.Parcelable {
    public static final java.lang.String ACTION_DISK_SCANNED = "android.os.storage.action.DISK_SCANNED";
    public static final android.os.Parcelable.Creator<android.os.storage.DiskInfo> CREATOR = null;
    public static final java.lang.String EXTRA_DISK_ID = "android.os.storage.extra.DISK_ID";
    public static final java.lang.String EXTRA_VOLUME_COUNT = "android.os.storage.extra.VOLUME_COUNT";
    public static final int FLAG_ADOPTABLE = 1;
    public static final int FLAG_DEFAULT_PRIMARY = 2;
    public static final int FLAG_SD = 4;
    public static final int FLAG_STUB_VISIBLE = 64;
    public static final int FLAG_USB = 8;
    public final int flags = 0;
    public final java.lang.String id = null;
    public java.lang.String label;
    public long size;
    public java.lang.String sysPath;
    public int volumeCount;
    public DiskInfo(android.os.Parcel p0) {}
    public DiskInfo(java.lang.String p0, int p1) {}
    private boolean isInteresting(java.lang.String p0) { return false; }
    public android.os.storage.DiskInfo clone() { return null; }
    public int describeContents() { return 0; }
    public void dump(com.android.internal.util.IndentingPrintWriter p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getDescription() { return null; }
    public java.lang.String getId() { return null; }
    public java.lang.String getShortDescription() { return null; }
    public int hashCode() { return 0; }
    public boolean isAdoptable() { return false; }
    public boolean isDefaultPrimary() { return false; }
    public boolean isSd() { return false; }
    public boolean isStubVisible() { return false; }
    public boolean isUsb() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
