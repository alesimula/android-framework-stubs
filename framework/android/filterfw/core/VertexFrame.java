package android.filterfw.core;

public class VertexFrame extends android.filterfw.core.Frame {
    private int vertexFrameId;
    VertexFrame(android.filterfw.core.FrameFormat p0, android.filterfw.core.FrameManager p1) { super((android.filterfw.core.FrameFormat)null, (android.filterfw.core.FrameManager)null); }
    private native int getNativeVboId();
    private native boolean nativeAllocate(int p0);
    private native boolean nativeDeallocate();
    private native boolean setNativeData(byte[] p0, int p1, int p2);
    private native boolean setNativeFloats(float[] p0);
    private native boolean setNativeInts(int[] p0);
    public android.graphics.Bitmap getBitmap() { return null; }
    public java.nio.ByteBuffer getData() { return null; }
    public float[] getFloats() { return null; }
    public int[] getInts() { return null; }
    public java.lang.Object getObjectValue() { return null; }
    public int getVboId() { return 0; }
    protected boolean hasNativeAllocation() { return false; }
    protected void releaseNativeAllocation() {}
    public void setBitmap(android.graphics.Bitmap p0) {}
    public void setData(java.nio.ByteBuffer p0, int p1, int p2) {}
    public void setDataFromFrame(android.filterfw.core.Frame p0) {}
    public void setFloats(float[] p0) {}
    public void setInts(int[] p0) {}
    public java.lang.String toString() { return null; }
}
