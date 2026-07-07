package android.renderscript;

@java.lang.Deprecated
public class Mesh extends android.renderscript.BaseObj {
    android.renderscript.Allocation[] mIndexBuffers;
    android.renderscript.Mesh.Primitive[] mPrimitives;
    android.renderscript.Allocation[] mVertexBuffers;
    Mesh(long p0, android.renderscript.RenderScript p1) { super(0L, null); }
    public android.renderscript.Allocation getIndexSetAllocation(int p0) { return null; }
    public android.renderscript.Mesh.Primitive getPrimitive(int p0) { return null; }
    public int getPrimitiveCount() { return 0; }
    public android.renderscript.Allocation getVertexAllocation(int p0) { return null; }
    public int getVertexAllocationCount() { return 0; }
    void updateFromNative() {}

    public static class AllocationBuilder {
        java.util.Vector mIndexTypes;
        android.renderscript.RenderScript mRS;
        int mVertexTypeCount;
        android.renderscript.Mesh.AllocationBuilder.Entry[] mVertexTypes;
        public AllocationBuilder(android.renderscript.RenderScript p0) {}
        public android.renderscript.Mesh.AllocationBuilder addIndexSetAllocation(android.renderscript.Allocation p0, android.renderscript.Mesh.Primitive p1) { return null; }
        public android.renderscript.Mesh.AllocationBuilder addIndexSetType(android.renderscript.Mesh.Primitive p0) { return null; }
        public android.renderscript.Mesh.AllocationBuilder addVertexAllocation(android.renderscript.Allocation p0) throws java.lang.IllegalStateException { return null; }
        public android.renderscript.Mesh create() { return null; }
        public int getCurrentIndexSetIndex() { return 0; }
        public int getCurrentVertexTypeIndex() { return 0; }

        class Entry {
            android.renderscript.Allocation a;
            android.renderscript.Mesh.Primitive prim;
            Entry(android.renderscript.Mesh.AllocationBuilder p0) {}
        }
    }

    public static class Builder {
        java.util.Vector mIndexTypes;
        android.renderscript.RenderScript mRS;
        int mUsage;
        int mVertexTypeCount;
        android.renderscript.Mesh.Builder.Entry[] mVertexTypes;
        public Builder(android.renderscript.RenderScript p0, int p1) {}
        public android.renderscript.Mesh.Builder addIndexSetType(android.renderscript.Element p0, int p1, android.renderscript.Mesh.Primitive p2) { return null; }
        public android.renderscript.Mesh.Builder addIndexSetType(android.renderscript.Mesh.Primitive p0) { return null; }
        public android.renderscript.Mesh.Builder addIndexSetType(android.renderscript.Type p0, android.renderscript.Mesh.Primitive p1) { return null; }
        public android.renderscript.Mesh.Builder addVertexType(android.renderscript.Element p0, int p1) throws java.lang.IllegalStateException { return null; }
        public android.renderscript.Mesh.Builder addVertexType(android.renderscript.Type p0) throws java.lang.IllegalStateException { return null; }
        public android.renderscript.Mesh create() { return null; }
        public int getCurrentIndexSetIndex() { return 0; }
        public int getCurrentVertexTypeIndex() { return 0; }
        android.renderscript.Type newType(android.renderscript.Element p0, int p1) { return null; }

        class Entry {
            android.renderscript.Element e;
            android.renderscript.Mesh.Primitive prim;
            int size;
            android.renderscript.Type t;
            int usage;
            Entry(android.renderscript.Mesh.Builder p0) {}
        }
    }

    public static enum Primitive {
        LINE,
        LINE_STRIP,
        POINT,
        TRIANGLE,
        TRIANGLE_FAN,
        TRIANGLE_STRIP;
        private static final android.renderscript.Mesh.Primitive[] $VALUES = null;
        int mID;
        private Primitive() {}
    }

    public static class TriangleMeshBuilder {
        public static final int COLOR = 1;
        public static final int NORMAL = 2;
        public static final int TEXTURE_0 = 256;
        float mA;
        float mB;
        android.renderscript.Element mElement;
        int mFlags;
        float mG;
        int mIndexCount;
        short[] mIndexData;
        int mMaxIndex;
        float mNX;
        float mNY;
        float mNZ;
        float mR;
        android.renderscript.RenderScript mRS;
        float mS0;
        float mT0;
        int mVtxCount;
        float[] mVtxData;
        int mVtxSize;
        public TriangleMeshBuilder(android.renderscript.RenderScript p0, int p1, int p2) {}
        private void latch() {}
        private void makeSpace(int p0) {}
        public android.renderscript.Mesh.TriangleMeshBuilder addTriangle(int p0, int p1, int p2) { return null; }
        public android.renderscript.Mesh.TriangleMeshBuilder addVertex(float p0, float p1) { return null; }
        public android.renderscript.Mesh.TriangleMeshBuilder addVertex(float p0, float p1, float p2) { return null; }
        public android.renderscript.Mesh create(boolean p0) { return null; }
        public android.renderscript.Mesh.TriangleMeshBuilder setColor(float p0, float p1, float p2, float p3) { return null; }
        public android.renderscript.Mesh.TriangleMeshBuilder setNormal(float p0, float p1, float p2) { return null; }
        public android.renderscript.Mesh.TriangleMeshBuilder setTexture(float p0, float p1) { return null; }
    }
}
