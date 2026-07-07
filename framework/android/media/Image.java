package android.media;

public abstract class Image implements java.lang.AutoCloseable {
    private android.graphics.Rect mCropRect;
    private int mDataSpace;
    protected boolean mIsImageValid;
    protected Image() {}
    public abstract void close();
    public android.graphics.Rect getCropRect() { return null; }
    public int getDataSpace() { return 0; }
    public android.hardware.SyncFence getFence() throws java.io.IOException { return null; }
    public abstract int getFormat();
    public android.hardware.HardwareBuffer getHardwareBuffer() { return null; }
    public abstract int getHeight();
    long getNativeContext() { return 0L; }
    java.lang.Object getOwner() { return null; }
    public int getPlaneCount() { return 0; }
    public abstract android.media.Image.Plane[] getPlanes();
    public abstract int getScalingMode();
    public abstract long getTimestamp();
    public abstract int getTransform();
    public abstract int getWidth();
    public boolean isAttachable() { return false; }
    public void setCropRect(android.graphics.Rect p0) {}
    public void setDataSpace(int p0) {}
    public void setFence(android.hardware.SyncFence p0) throws java.io.IOException {}
    public void setTimestamp(long p0) {}
    protected void throwISEIfImageIsInvalid() {}

    public static abstract class Plane {
        protected Plane() {}
        public abstract java.nio.ByteBuffer getBuffer();
        public abstract int getPixelStride();
        public abstract int getRowStride();
    }
}
