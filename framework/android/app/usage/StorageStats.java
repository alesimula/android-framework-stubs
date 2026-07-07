package android.app.usage;

public final class StorageStats implements android.os.Parcelable {
    public static final int APP_DATA_TYPE_FILE_TYPE_APK = 3;
    public static final int APP_DATA_TYPE_FILE_TYPE_CURRENT_PROFILE = 2;
    public static final int APP_DATA_TYPE_FILE_TYPE_DEXOPT_ARTIFACT = 0;
    public static final int APP_DATA_TYPE_FILE_TYPE_DM = 4;
    public static final int APP_DATA_TYPE_FILE_TYPE_REFERENCE_PROFILE = 1;
    public static final int APP_DATA_TYPE_LIB = 5;
    public static final android.os.Parcelable.Creator<android.app.usage.StorageStats> CREATOR = null;
    private static final java.lang.String TAG = "StorageStats";
    public long apkBytes;
    private boolean artStatsFetched;
    public long cacheBytes;
    public long codeBytes;
    public long curProfBytes;
    public long dataBytes;
    public long dexoptBytes;
    public long dmBytes;
    public long externalCacheBytes;
    public long libBytes;
    public java.lang.String packageName;
    public long refProfBytes;
    public int uid;
    public int userHandle;
    public StorageStats() {}
    public StorageStats(android.os.Parcel p0) {}
    private void getArtManagedStats() {}
    private long getCurProfBytes() { return 0L; }
    private long getDexoptBytes() { return 0L; }
    private long getRefProfBytes() { return 0L; }
    public int describeContents() { return 0; }
    public long getAppBytes() { return 0L; }
    public long getAppBytesByDataType(int p0) { return 0L; }
    public long getCacheBytes() { return 0L; }
    public long getDataBytes() { return 0L; }
    public long getExternalCacheBytes() { return 0L; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AppDataType {
    }
}
