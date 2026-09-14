package android.view;

public final class InputChannel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.InputChannel> CREATOR = null;
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "InputChannel";
    private final long mPtr = 0L;
    private InputChannel(long p0) {}
    private void checkValid() {}
    private native void nativeDispose(long p0);
    private native long nativeDup(long p0);
    private static native long nativeGetFinalizer();
    private native java.lang.String nativeGetName(long p0);
    private native android.os.IBinder nativeGetToken(long p0);
    private native boolean nativeIsValid(long p0);
    private static native long[] nativeOpenInputChannelPair(java.lang.String p0);
    private static native long nativeReadFromParcel(android.os.Parcel p0);
    private native void nativeWriteToParcel(android.os.Parcel p0, long p1);
    public static android.view.InputChannel[] openInputChannelPair(java.lang.String p0) { return null; }
    public int describeContents() { return 0; }
    public void dispose() {}
    public android.view.InputChannel dup() { return null; }
    public java.lang.String getName() { return null; }
    public android.os.IBinder getToken() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class UninitializedException extends java.lang.IllegalStateException {
        public UninitializedException(java.lang.String p0) { super(); }
    }

    private static class RegistryHolder {
        private RegistryHolder() {}
    }
}
