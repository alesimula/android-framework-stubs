package android.content;

public final class UriPermission implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.UriPermission> CREATOR = null;
    public static final long INVALID_TIME = -9223372036854775808L;
    private final int mModeFlags = 0;
    private final long mPersistedTime = 0L;
    private final android.net.Uri mUri = null;
    public UriPermission(android.net.Uri p0, int p1, long p2) {}
    public UriPermission(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public long getPersistedTime() { return 0L; }
    public android.net.Uri getUri() { return null; }
    public boolean isReadPermission() { return false; }
    public boolean isWritePermission() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
