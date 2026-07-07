package android.filterfw.core;

public abstract class Frame {
    public static final int NO_BINDING = 0;
    public static final long TIMESTAMP_NOT_SET = -2L;
    public static final long TIMESTAMP_UNKNOWN = -1L;
    private long mBindingId;
    private int mBindingType;
    private android.filterfw.core.FrameFormat mFormat;
    private android.filterfw.core.FrameManager mFrameManager;
    private boolean mReadOnly;
    private int mRefCount;
    private boolean mReusable;
    private long mTimestamp;
    Frame(android.filterfw.core.FrameFormat p0, android.filterfw.core.FrameManager p1) {}
    Frame(android.filterfw.core.FrameFormat p0, android.filterfw.core.FrameManager p1, int p2, long p3) {}
    protected static android.graphics.Bitmap convertBitmapToRGBA(android.graphics.Bitmap p0) { return null; }
    protected void assertFrameMutable() {}
    final int decRefCount() { return 0; }
    public long getBindingId() { return 0L; }
    public int getBindingType() { return 0; }
    public abstract android.graphics.Bitmap getBitmap();
    public int getCapacity() { return 0; }
    public abstract java.nio.ByteBuffer getData();
    public abstract float[] getFloats();
    public android.filterfw.core.FrameFormat getFormat() { return null; }
    public android.filterfw.core.FrameManager getFrameManager() { return null; }
    public abstract int[] getInts();
    public abstract java.lang.Object getObjectValue();
    public int getRefCount() { return 0; }
    public long getTimestamp() { return 0L; }
    protected abstract boolean hasNativeAllocation();
    final int incRefCount() { return 0; }
    public boolean isReadOnly() { return false; }
    final boolean isReusable() { return false; }
    final void markReadOnly() {}
    protected void onFrameFetch() {}
    protected void onFrameStore() {}
    public android.filterfw.core.Frame release() { return null; }
    protected abstract void releaseNativeAllocation();
    protected boolean requestResize(int[] p0) { return false; }
    protected void reset(android.filterfw.core.FrameFormat p0) {}
    public android.filterfw.core.Frame retain() { return null; }
    public abstract void setBitmap(android.graphics.Bitmap p0);
    public void setData(java.nio.ByteBuffer p0) {}
    public abstract void setData(java.nio.ByteBuffer p0, int p1, int p2);
    public void setData(byte[] p0, int p1, int p2) {}
    public void setDataFromFrame(android.filterfw.core.Frame p0) {}
    public abstract void setFloats(float[] p0);
    protected void setFormat(android.filterfw.core.FrameFormat p0) {}
    protected void setGenericObjectValue(java.lang.Object p0) {}
    public abstract void setInts(int[] p0);
    public void setObjectValue(java.lang.Object p0) {}
    protected void setReusable(boolean p0) {}
    public void setTimestamp(long p0) {}
}
