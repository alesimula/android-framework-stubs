package android.os;

public class RevocableFileDescriptor {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "RevocableFileDescriptor";
    private final android.os.ProxyFileDescriptorCallback mCallback = null;
    private java.io.FileDescriptor mInner;
    private android.os.ParcelFileDescriptor.OnCloseListener mOnCloseListener;
    private android.os.ParcelFileDescriptor mOuter;
    private volatile boolean mRevoked;
    public RevocableFileDescriptor() {}
    public RevocableFileDescriptor(android.content.Context p0, java.io.File p1) throws java.io.IOException {}
    public RevocableFileDescriptor(android.content.Context p0, java.io.FileDescriptor p1) throws java.io.IOException {}
    public RevocableFileDescriptor(android.content.Context p0, java.io.FileDescriptor p1, android.os.Handler p2) throws java.io.IOException {}
    public void addOnCloseListener(android.os.ParcelFileDescriptor.OnCloseListener p0) {}
    public android.os.ParcelFileDescriptor getRevocableFileDescriptor() { return null; }
    public void init(android.content.Context p0, java.io.FileDescriptor p1) throws java.io.IOException {}
    public void init(android.content.Context p0, java.io.FileDescriptor p1, android.os.Handler p2) throws java.io.IOException {}
    public boolean isRevoked() { return false; }
    public void revoke() {}
}
