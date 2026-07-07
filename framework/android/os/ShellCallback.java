package android.os;

public class ShellCallback implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.ShellCallback> CREATOR = null;
    static final boolean DEBUG = false;
    static final java.lang.String TAG = "ShellCallback";
    final boolean mLocal = false;
    com.android.internal.os.IShellCallback mShellCallback;
    public ShellCallback() {}
    ShellCallback(android.os.Parcel p0) {}
    public static void writeToParcel(android.os.ShellCallback p0, android.os.Parcel p1) {}
    public int describeContents() { return 0; }
    public android.os.IBinder getShellCallbackBinder() { return null; }
    public android.os.ParcelFileDescriptor onOpenFile(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return null; }
    public android.os.ParcelFileDescriptor openFile(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    class MyShellCallback extends com.android.internal.os.IShellCallback.Stub {
        MyShellCallback(android.os.ShellCallback p0) { super(); }
        public android.os.ParcelFileDescriptor openFile(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return null; }
    }
}
