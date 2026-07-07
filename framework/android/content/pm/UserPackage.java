package android.content.pm;

@android.annotation.SystemApi
public final class UserPackage implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.UserPackage> CREATOR = null;
    private static final boolean ENABLE_CACHING = true;
    static final int MAX_NUM_CACHED_ENTRIES_PER_USER = 1000;
    private static final android.util.SparseArrayMap<java.lang.String, android.content.pm.UserPackage> sCache = null;
    private static final java.lang.Object sCacheLock = null;
    private static int[] sUserIds;
    public final java.lang.String packageName = null;
    public final int userId = 0;
    private UserPackage(int p0, java.lang.String p1) {}
    private static void maybePurgeRandomEntriesLocked(int p0) {}
    public static int numEntriesForUser(int p0) { return 0; }
    public static android.content.pm.UserPackage of(int p0, java.lang.String p1) { return null; }
    public static void removeFromCache(int p0, java.lang.String p1) {}
    public static void setValidUserIds(int[] p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
