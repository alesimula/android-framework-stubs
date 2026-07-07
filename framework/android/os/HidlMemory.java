package android.os;

@android.annotation.SystemApi
public class HidlMemory implements java.io.Closeable {
    private android.os.NativeHandle mHandle;
    private final java.lang.String mName = null;
    private long mNativeContext;
    private final long mSize = 0L;
    public HidlMemory(java.lang.String p0, long p1, android.os.NativeHandle p2) {}
    private native void nativeFinalize();
    public void close() throws java.io.IOException {}
    public android.os.HidlMemory dup() throws java.io.IOException { return null; }
    protected void finalize() {}
    public android.os.NativeHandle getHandle() { return null; }
    public java.lang.String getName() { return null; }
    public long getSize() { return 0L; }
    public android.os.NativeHandle releaseHandle() { return null; }
}
