package android.filterfw.core;

public class NativeBuffer {
    private android.filterfw.core.Frame mAttachedFrame;
    private long mDataPointer;
    private boolean mOwnsData;
    private int mRefCount;
    private int mSize;
    public NativeBuffer() {}
    public NativeBuffer(int p0) {}
    private native boolean allocate(int p0);
    private native boolean deallocate(boolean p0);
    private native boolean nativeCopyTo(android.filterfw.core.NativeBuffer p0);
    protected void assertReadable() {}
    protected void assertWritable() {}
    void attachToFrame(android.filterfw.core.Frame p0) {}
    public int count() { return 0; }
    public int getElementSize() { return 0; }
    public boolean isReadOnly() { return false; }
    public android.filterfw.core.NativeBuffer mutableCopy() { return null; }
    public android.filterfw.core.NativeBuffer release() { return null; }
    public android.filterfw.core.NativeBuffer retain() { return null; }
    public int size() { return 0; }
}
