package android.os.storage;

public class VolumeRecord implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.storage.VolumeRecord> CREATOR = null;
    public static final java.lang.String EXTRA_FS_UUID = "android.os.storage.extra.FS_UUID";
    public static final int USER_FLAG_INITED = 1;
    public static final int USER_FLAG_SNOOZED = 2;
    public long createdMillis;
    public final java.lang.String fsUuid = null;
    public long lastBenchMillis;
    public long lastSeenMillis;
    public long lastTrimMillis;
    public java.lang.String nickname;
    public java.lang.String partGuid;
    public final int type = 0;
    public int userFlags;
    public VolumeRecord(int p0, java.lang.String p1) {}
    public VolumeRecord(android.os.Parcel p0) {}
    public android.os.storage.StorageVolume buildStorageVolume(android.content.Context p0) { return null; }
    public android.os.storage.VolumeRecord clone() { return null; }
    public int describeContents() { return 0; }
    public void dump(com.android.internal.util.IndentingPrintWriter p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getFsUuid() { return null; }
    public java.lang.String getNickname() { return null; }
    public java.lang.String getNormalizedFsUuid() { return null; }
    public int getType() { return 0; }
    public int hashCode() { return 0; }
    public boolean isInited() { return false; }
    public boolean isSnoozed() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
