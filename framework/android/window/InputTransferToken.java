package android.window;

public final class InputTransferToken implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.window.InputTransferToken> CREATOR = null;
    public final long mNativeObject = 0L;
    public InputTransferToken() {}
    private InputTransferToken(long p0) {}
    public InputTransferToken(android.os.IBinder p0) {}
    private InputTransferToken(android.os.Parcel p0) {}
    private static native long nativeCreate();
    private static native long nativeCreate(android.os.IBinder p0);
    private static native boolean nativeEquals(long p0, long p1);
    private static native android.os.IBinder nativeGetBinderToken(long p0);
    private static native long nativeGetBinderTokenRef(long p0);
    private static native long nativeGetNativeInputTransferTokenFinalizer();
    private static native long nativeReadFromParcel(android.os.Parcel p0);
    private static native void nativeWriteToParcel(long p0, android.os.Parcel p1);
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.os.IBinder getToken() { return null; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
