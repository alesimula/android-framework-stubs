package android.os;

public class DropBoxManager {
    public static final java.lang.String ACTION_DROPBOX_ENTRY_ADDED = "android.intent.action.DROPBOX_ENTRY_ADDED";
    public static final java.lang.String EXTRA_DROPPED_COUNT = "android.os.extra.DROPPED_COUNT";
    public static final java.lang.String EXTRA_TAG = "tag";
    public static final java.lang.String EXTRA_TIME = "time";
    private static final int HAS_BYTE_ARRAY = 8;
    public static final int IS_EMPTY = 1;
    public static final int IS_GZIPPED = 4;
    public static final int IS_TEXT = 2;
    private static final java.lang.String TAG = "DropBoxManager";
    private final android.content.Context mContext = null;
    private final com.android.internal.os.IDropBoxManagerService mService = null;
    protected DropBoxManager() {}
    public DropBoxManager(android.content.Context p0, com.android.internal.os.IDropBoxManagerService p1) {}
    public void addData(java.lang.String p0, byte[] p1, int p2) {}
    public void addFile(java.lang.String p0, java.io.File p1, int p2) throws java.io.IOException {}
    public void addText(java.lang.String p0, java.lang.String p1) {}
    public android.os.DropBoxManager.Entry getNextEntry(java.lang.String p0, long p1) { return null; }
    public boolean isTagEnabled(java.lang.String p0) { return false; }
    public boolean isTagEnabled(java.lang.String p0, java.lang.String p1) { return false; }

    public static class Entry implements android.os.Parcelable, java.io.Closeable {
        public static final android.os.Parcelable.Creator<android.os.DropBoxManager.Entry> CREATOR = null;
        private final byte[] mData = null;
        private final android.os.ParcelFileDescriptor mFileDescriptor = null;
        private final int mFlags = 0;
        private final java.lang.String mTag = null;
        private final long mTimeMillis = 0L;
        private Entry(com.android.internal.os.IDropBoxManagerService.Entry p0) {}
        public Entry(java.lang.String p0, long p1) {}
        public Entry(java.lang.String p0, long p1, android.os.ParcelFileDescriptor p2, int p3) {}
        public Entry(java.lang.String p0, long p1, java.io.File p2, int p3) throws java.io.IOException {}
        public Entry(java.lang.String p0, long p1, java.lang.String p2) {}
        public Entry(java.lang.String p0, long p1, byte[] p2, int p3) {}
        private com.android.internal.os.IDropBoxManagerService.Entry toInternalEntry() { return null; }
        public void close() {}
        public int describeContents() { return 0; }
        public int getFlags() { return 0; }
        public java.io.InputStream getInputStream() throws java.io.IOException { return null; }
        public java.lang.String getTag() { return null; }
        public java.lang.String getText(int p0) { return null; }
        public long getTimeMillis() { return 0L; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Flags {
    }
}
