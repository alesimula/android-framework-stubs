package android.renderscript;

@java.lang.Deprecated
public class ProgramVertexFixedFunction extends android.renderscript.ProgramVertex {
    ProgramVertexFixedFunction(long p0, android.renderscript.RenderScript p1) { super(0L, null); }
    public void bindConstants(android.renderscript.ProgramVertexFixedFunction.Constants p0) {}

    public static class Builder {
        android.renderscript.RenderScript mRS;
        java.lang.String mShader;
        boolean mTextureMatrixEnable;
        public Builder(android.renderscript.RenderScript p0) {}
        private void buildShaderString() {}
        static android.renderscript.Type getConstantInputType(android.renderscript.RenderScript p0) { return null; }
        public android.renderscript.ProgramVertexFixedFunction create() { return null; }
        public android.renderscript.ProgramVertexFixedFunction.Builder setTextureMatrixEnable(boolean p0) { return null; }
    }

    public static class Constants {
        static final int MODELVIEW_OFFSET = 0;
        static final int PROJECTION_OFFSET = 16;
        static final int TEXTURE_OFFSET = 32;
        android.renderscript.Allocation mAlloc;
        private android.renderscript.FieldPacker mIOBuffer;
        android.renderscript.Matrix4f mModel;
        android.renderscript.Matrix4f mProjection;
        android.renderscript.Matrix4f mTexture;
        public Constants(android.renderscript.RenderScript p0) {}
        private void addToBuffer(int p0, android.renderscript.Matrix4f p1) {}
        public void destroy() {}
        android.renderscript.Allocation getAllocation() { return null; }
        public void setModelview(android.renderscript.Matrix4f p0) {}
        public void setProjection(android.renderscript.Matrix4f p0) {}
        public void setTexture(android.renderscript.Matrix4f p0) {}
    }

    static class InternalBuilder extends android.renderscript.Program.BaseProgramBuilder {
        public InternalBuilder(android.renderscript.RenderScript p0) { super(null); }
        public android.renderscript.ProgramVertexFixedFunction.InternalBuilder addInput(android.renderscript.Element p0) throws java.lang.IllegalStateException { return null; }
        public android.renderscript.ProgramVertexFixedFunction create() { return null; }
    }
}
