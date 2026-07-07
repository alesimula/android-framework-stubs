package android.graphics;

public class Region implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.graphics.Region> CREATOR = null;
    private static final int MAX_POOL_SIZE = 10;
    private static final android.util.Pools.SynchronizedPool<android.graphics.Region> sPool = null;
    public long mNativeRegion;
    public Region() {}
    public Region(int p0, int p1, int p2, int p3) {}
    Region(long p0) {}
    private Region(long p0, int p1) {}
    public Region(android.graphics.Rect p0) {}
    public Region(android.graphics.Region p0) {}
    private static native long nativeConstructor();
    private static native long nativeCreateFromParcel(android.os.Parcel p0);
    private static native void nativeDestructor(long p0);
    private static native boolean nativeEquals(long p0, long p1);
    private static native boolean nativeGetBoundaryPath(long p0, long p1);
    private static native boolean nativeGetBounds(long p0, android.graphics.Rect p1);
    private static native boolean nativeOp(long p0, int p1, int p2, int p3, int p4, int p5);
    private static native boolean nativeOp(long p0, long p1, long p2, int p3);
    private static native boolean nativeOp(long p0, android.graphics.Rect p1, long p2, int p3);
    private static native boolean nativeSetPath(long p0, long p1, long p2);
    private static native boolean nativeSetRect(long p0, int p1, int p2, int p3, int p4);
    private static native void nativeSetRegion(long p0, long p1);
    private static native java.lang.String nativeToString(long p0);
    private static native boolean nativeWriteToParcel(long p0, android.os.Parcel p1);
    public static android.graphics.Region obtain() { return null; }
    public static android.graphics.Region obtain(android.graphics.Region p0) { return null; }
    public native boolean contains(int p0, int p1);
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    protected void finalize() throws java.lang.Throwable {}
    public android.graphics.Path getBoundaryPath() { return null; }
    public boolean getBoundaryPath(android.graphics.Path p0) { return false; }
    public android.graphics.Rect getBounds() { return null; }
    public boolean getBounds(android.graphics.Rect p0) { return false; }
    public native boolean isComplex();
    public native boolean isEmpty();
    public native boolean isRect();
    final long ni() { return 0L; }
    public boolean op(int p0, int p1, int p2, int p3, android.graphics.Region.Op p4) { return false; }
    public boolean op(android.graphics.Rect p0, android.graphics.Region.Op p1) { return false; }
    public boolean op(android.graphics.Rect p0, android.graphics.Region p1, android.graphics.Region.Op p2) { return false; }
    public boolean op(android.graphics.Region p0, android.graphics.Region.Op p1) { return false; }
    public boolean op(android.graphics.Region p0, android.graphics.Region p1, android.graphics.Region.Op p2) { return false; }
    public native boolean quickContains(int p0, int p1, int p2, int p3);
    public boolean quickContains(android.graphics.Rect p0) { return false; }
    public native boolean quickReject(int p0, int p1, int p2, int p3);
    public boolean quickReject(android.graphics.Rect p0) { return false; }
    public native boolean quickReject(android.graphics.Region p0);
    public void recycle() {}
    public void scale(float p0) {}
    public native void scale(float p0, android.graphics.Region p1);
    public boolean set(int p0, int p1, int p2, int p3) { return false; }
    public boolean set(android.graphics.Rect p0) { return false; }
    public boolean set(android.graphics.Region p0) { return false; }
    public void setEmpty() {}
    public boolean setPath(android.graphics.Path p0, android.graphics.Region p1) { return false; }
    public java.lang.String toString() { return null; }
    public void translate(int p0, int p1) {}
    public native void translate(int p0, int p1, android.graphics.Region p2);
    public final boolean union(android.graphics.Rect p0) { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static enum Op {
        DIFFERENCE,
        INTERSECT,
        REPLACE,
        REVERSE_DIFFERENCE,
        UNION,
        XOR;
        private static final android.graphics.Region.Op[] $VALUES = null;
        public final int nativeInt = 0;
        private Op() {}
    }
}
