package android.graphics;

public class MeshSpecification {
    public static final int ALPHA_TYPE_OPAQUE = 1;
    public static final int ALPHA_TYPE_PREMULTIPLIED = 2;
    public static final int ALPHA_TYPE_UNKNOWN = 0;
    public static final int ALPHA_TYPE_UNPREMULTIPLIED = 3;
    public static final int TYPE_FLOAT = 0;
    public static final int TYPE_FLOAT2 = 1;
    public static final int TYPE_FLOAT3 = 2;
    public static final int TYPE_FLOAT4 = 3;
    public static final int TYPE_UBYTE4 = 4;
    long mNativeMeshSpec;
    private MeshSpecification(long p0) {}
    public static android.graphics.MeshSpecification make(android.graphics.MeshSpecification.Attribute[] p0, int p1, android.graphics.MeshSpecification.Varying[] p2, java.lang.String p3, java.lang.String p4) { return null; }
    public static android.graphics.MeshSpecification make(android.graphics.MeshSpecification.Attribute[] p0, int p1, android.graphics.MeshSpecification.Varying[] p2, java.lang.String p3, java.lang.String p4, android.graphics.ColorSpace p5) { return null; }
    public static android.graphics.MeshSpecification make(android.graphics.MeshSpecification.Attribute[] p0, int p1, android.graphics.MeshSpecification.Varying[] p2, java.lang.String p3, java.lang.String p4, android.graphics.ColorSpace p5, int p6) { return null; }
    private static native long nativeGetFinalizer();
    private static native long nativeMake(android.graphics.MeshSpecification.Attribute[] p0, int p1, android.graphics.MeshSpecification.Varying[] p2, java.lang.String p3, java.lang.String p4);
    private static native long nativeMakeWithAlpha(android.graphics.MeshSpecification.Attribute[] p0, int p1, android.graphics.MeshSpecification.Varying[] p2, java.lang.String p3, java.lang.String p4, long p5, int p6);
    private static native long nativeMakeWithCS(android.graphics.MeshSpecification.Attribute[] p0, int p1, android.graphics.MeshSpecification.Varying[] p2, java.lang.String p3, java.lang.String p4, long p5);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface AlphaType {
    }

    public static class Attribute {
        private final java.lang.String mName = null;
        private final int mOffset = 0;
        private final int mType = 0;
        public Attribute(int p0, int p1, java.lang.String p2) {}
        public java.lang.String getName() { return null; }
        public int getOffset() { return 0; }
        public int getType() { return 0; }
        public java.lang.String toString() { return null; }
    }

    private static class MeshSpecificationHolder {
        private MeshSpecificationHolder() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface Type {
    }

    public static class Varying {
        private final java.lang.String mName = null;
        private final int mType = 0;
        public Varying(int p0, java.lang.String p1) {}
        public java.lang.String getName() { return null; }
        public int getType() { return 0; }
        public java.lang.String toString() { return null; }
    }
}
