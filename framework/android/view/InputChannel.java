package android.view;

public final class InputChannel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.InputChannel> CREATOR = null;
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "InputChannel";
    private long mPtr;
    public InputChannel() {}
    private void checkValid() {}
    private native void nativeDispose(long p0);
    private native long nativeDup(long p0);
    private static native long nativeGetFinalizer();
    private native java.lang.String nativeGetName(long p0);
    private native android.os.IBinder nativeGetToken(long p0);
    private native boolean nativeIsValid(long p0);
    private static native long[] nativeOpenInputChannelPair(java.lang.String p0);
    private native long nativeReadFromParcel(android.os.Parcel p0);
    private native void nativeWriteToParcel(android.os.Parcel p0, long p1);
    public static android.view.InputChannel[] openInputChannelPair(java.lang.String p0) { return null; }
    private void setNativeInputChannel(long p0) {}
    public void copyTo(android.view.InputChannel p0) {}
    public int describeContents() { return 0; }
    public void dispose() {}
    public android.view.InputChannel dup() { return null; }
    public java.lang.String getName() { return null; }
    public android.os.IBinder getToken() { return null; }
    public void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    private static class RegistryHolder {
        private RegistryHolder() {}
    }

    public static class UninitializedException extends java.lang.IllegalStateException {
        public UninitializedException(java.lang.String p0) { super(); }
    }
}
