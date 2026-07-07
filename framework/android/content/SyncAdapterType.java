package android.content;

public class SyncAdapterType implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.SyncAdapterType> CREATOR = null;
    public final java.lang.String accountType = null;
    private final boolean allowParallelSyncs = false;
    public final java.lang.String authority = null;
    private final boolean isAlwaysSyncable = false;
    public final boolean isKey = false;
    private final java.lang.String packageName = null;
    private final java.lang.String settingsActivity = null;
    private final boolean supportsUploading = false;
    private final boolean userVisible = false;
    public SyncAdapterType(android.os.Parcel p0) {}
    private SyncAdapterType(java.lang.String p0, java.lang.String p1) {}
    public SyncAdapterType(java.lang.String p0, java.lang.String p1, boolean p2, boolean p3) {}
    public SyncAdapterType(java.lang.String p0, java.lang.String p1, boolean p2, boolean p3, boolean p4, boolean p5, java.lang.String p6, java.lang.String p7) {}
    public static android.content.SyncAdapterType newKey(java.lang.String p0, java.lang.String p1) { return null; }
    public boolean allowParallelSyncs() { return false; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getPackageName() { return null; }
    public java.lang.String getSettingsActivity() { return null; }
    public int hashCode() { return 0; }
    public boolean isAlwaysSyncable() { return false; }
    public boolean isUserVisible() { return false; }
    public boolean supportsUploading() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
