package android.renderscript;

@java.lang.Deprecated
public class Type extends android.renderscript.BaseObj {
    static final int mMaxArrays = 4;
    int[] mArrays;
    boolean mDimFaces;
    boolean mDimMipmaps;
    int mDimX;
    int mDimY;
    int mDimYuv;
    int mDimZ;
    android.renderscript.Element mElement;
    int mElementCount;
    Type(long p0, android.renderscript.RenderScript p1) { super(0L, null); }
    public static android.renderscript.Type createX(android.renderscript.RenderScript p0, android.renderscript.Element p1, int p2) { return null; }
    public static android.renderscript.Type createXY(android.renderscript.RenderScript p0, android.renderscript.Element p1, int p2, int p3) { return null; }
    public static android.renderscript.Type createXYZ(android.renderscript.RenderScript p0, android.renderscript.Element p1, int p2, int p3, int p4) { return null; }
    void calcElementCount() {}
    public int getArray(int p0) { return 0; }
    public int getArrayCount() { return 0; }
    public int getCount() { return 0; }
    public android.renderscript.Element getElement() { return null; }
    public int getX() { return 0; }
    public int getY() { return 0; }
    public int getYuv() { return 0; }
    public int getZ() { return 0; }
    public boolean hasFaces() { return false; }
    public boolean hasMipmaps() { return false; }
    void updateFromNative() {}

    public static class Builder {
        int[] mArray;
        boolean mDimFaces;
        boolean mDimMipmaps;
        int mDimX;
        int mDimY;
        int mDimZ;
        android.renderscript.Element mElement;
        android.renderscript.RenderScript mRS;
        int mYuv;
        public Builder(android.renderscript.RenderScript p0, android.renderscript.Element p1) {}
        public android.renderscript.Type create() { return null; }
        public android.renderscript.Type.Builder setArray(int p0, int p1) { return null; }
        public android.renderscript.Type.Builder setFaces(boolean p0) { return null; }
        public android.renderscript.Type.Builder setMipmaps(boolean p0) { return null; }
        public android.renderscript.Type.Builder setX(int p0) { return null; }
        public android.renderscript.Type.Builder setY(int p0) { return null; }
        public android.renderscript.Type.Builder setYuvFormat(int p0) { return null; }
        public android.renderscript.Type.Builder setZ(int p0) { return null; }
    }

    public static enum CubemapFace {
        NEGATIVE_X,
        NEGATIVE_Y,
        NEGATIVE_Z,
        POSITIVE_X,
        POSITIVE_Y,
        POSITIVE_Z,
        POSITVE_X,
        POSITVE_Y,
        POSITVE_Z;
        private static final android.renderscript.Type.CubemapFace[] $VALUES = null;
        int mID;
        private CubemapFace() {}
    }
}
