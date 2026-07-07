package android.database;

public class CursorWindow extends android.database.sqlite.SQLiteClosable implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.database.CursorWindow> CREATOR = null;
    private static final java.lang.String STATS_TAG = "CursorWindowStats";
    private static int sCursorWindowSize;
    private final java.lang.String mName = null;
    private int mStartPos;
    public long mWindowPtr;
    private CursorWindow(android.os.Parcel p0) { super(); }
    public CursorWindow(java.lang.String p0) { super(); }
    public CursorWindow(java.lang.String p0, long p1) { super(); }
    @java.lang.Deprecated
    public CursorWindow(boolean p0) { super(); }
    private dalvik.system.CloseGuard createCloseGuard() { return null; }
    private dalvik.system.CloseGuard createCloseGuard$ravenwood() { return null; }
    private void dispose() {}
    private static int getCursorWindowSize() { return 0; }
    private static native boolean nativeAllocRow(long p0);
    private static native void nativeClear(long p0);
    private static native void nativeCopyStringToBuffer(long p0, int p1, int p2, android.database.CharArrayBuffer p3);
    private static native long nativeCreate(java.lang.String p0, int p1);
    private static native long nativeCreateFromParcel(android.os.Parcel p0);
    private static native void nativeDispose(long p0);
    private static native void nativeFreeLastRow(long p0);
    private static native byte[] nativeGetBlob(long p0, int p1, int p2);
    private static native double nativeGetDouble(long p0, int p1, int p2);
    private static native long nativeGetLong(long p0, int p1, int p2);
    private static native java.lang.String nativeGetName(long p0);
    private static native int nativeGetNumRows(long p0);
    private static native java.lang.String nativeGetString(long p0, int p1, int p2);
    private static native int nativeGetType(long p0, int p1, int p2);
    private static native boolean nativePutBlob(long p0, byte[] p1, int p2, int p3);
    private static native boolean nativePutDouble(long p0, double p1, int p2, int p3);
    private static native boolean nativePutLong(long p0, long p1, int p2, int p3);
    private static native boolean nativePutNull(long p0, int p1, int p2);
    private static native boolean nativePutString(long p0, java.lang.String p1, int p2, int p3);
    private static native boolean nativeSetNumColumns(long p0, int p1);
    private static native void nativeWriteToParcel(long p0, android.os.Parcel p1);
    public static android.database.CursorWindow newFromParcel(android.os.Parcel p0) { return null; }
    public boolean allocRow() { return false; }
    public void clear() {}
    public void copyStringToBuffer(int p0, int p1, android.database.CharArrayBuffer p2) {}
    public int describeContents() { return 0; }
    protected void finalize() throws java.lang.Throwable {}
    public void freeLastRow() {}
    public byte[] getBlob(int p0, int p1) { return null; }
    public double getDouble(int p0, int p1) { return 0.0; }
    public float getFloat(int p0, int p1) { return 0.0f; }
    public int getInt(int p0, int p1) { return 0; }
    public long getLong(int p0, int p1) { return 0L; }
    public java.lang.String getName() { return null; }
    public int getNumRows() { return 0; }
    public short getShort(int p0, int p1) { return 0; }
    public int getStartPosition() { return 0; }
    public java.lang.String getString(int p0, int p1) { return null; }
    public int getType(int p0, int p1) { return 0; }
    @java.lang.Deprecated
    public boolean isBlob(int p0, int p1) { return false; }
    @java.lang.Deprecated
    public boolean isFloat(int p0, int p1) { return false; }
    @java.lang.Deprecated
    public boolean isLong(int p0, int p1) { return false; }
    @java.lang.Deprecated
    public boolean isNull(int p0, int p1) { return false; }
    @java.lang.Deprecated
    public boolean isString(int p0, int p1) { return false; }
    protected void onAllReferencesReleased() {}
    public boolean putBlob(byte[] p0, int p1, int p2) { return false; }
    public boolean putDouble(double p0, int p1, int p2) { return false; }
    public boolean putLong(long p0, int p1, int p2) { return false; }
    public boolean putNull(int p0, int p1) { return false; }
    public boolean putString(java.lang.String p0, int p1, int p2) { return false; }
    public boolean setNumColumns(int p0) { return false; }
    public void setStartPosition(int p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
