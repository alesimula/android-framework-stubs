package android.renderscript;

@java.lang.Deprecated
public class Program extends android.renderscript.BaseObj {
    static final int MAX_CONSTANT = 8;
    static final int MAX_INPUT = 8;
    static final int MAX_OUTPUT = 8;
    static final int MAX_TEXTURE = 8;
    android.renderscript.Type[] mConstants;
    android.renderscript.Element[] mInputs;
    android.renderscript.Element[] mOutputs;
    java.lang.String mShader;
    int mTextureCount;
    java.lang.String[] mTextureNames;
    android.renderscript.Program.TextureType[] mTextures;
    Program(long p0, android.renderscript.RenderScript p1) { super(0L, null); }
    public void bindConstants(android.renderscript.Allocation p0, int p1) {}
    public void bindSampler(android.renderscript.Sampler p0, int p1) throws java.lang.IllegalArgumentException {}
    public void bindTexture(android.renderscript.Allocation p0, int p1) throws java.lang.IllegalArgumentException {}
    public android.renderscript.Type getConstant(int p0) { return null; }
    public int getConstantCount() { return 0; }
    public int getTextureCount() { return 0; }
    public java.lang.String getTextureName(int p0) { return null; }
    public android.renderscript.Program.TextureType getTextureType(int p0) { return null; }

    public static class BaseProgramBuilder {
        int mConstantCount;
        android.renderscript.Type[] mConstants;
        int mInputCount;
        android.renderscript.Element[] mInputs;
        int mOutputCount;
        android.renderscript.Element[] mOutputs;
        android.renderscript.RenderScript mRS;
        java.lang.String mShader;
        int mTextureCount;
        java.lang.String[] mTextureNames;
        android.renderscript.Program.TextureType[] mTextureTypes;
        android.renderscript.Type[] mTextures;
        protected BaseProgramBuilder(android.renderscript.RenderScript p0) {}
        public android.renderscript.Program.BaseProgramBuilder addConstant(android.renderscript.Type p0) throws java.lang.IllegalStateException { return null; }
        public android.renderscript.Program.BaseProgramBuilder addTexture(android.renderscript.Program.TextureType p0) throws java.lang.IllegalArgumentException { return null; }
        public android.renderscript.Program.BaseProgramBuilder addTexture(android.renderscript.Program.TextureType p0, java.lang.String p1) throws java.lang.IllegalArgumentException { return null; }
        public int getCurrentConstantIndex() { return 0; }
        public int getCurrentTextureIndex() { return 0; }
        protected void initProgram(android.renderscript.Program p0) {}
        public android.renderscript.Program.BaseProgramBuilder setShader(android.content.res.Resources p0, int p1) { return null; }
        public android.renderscript.Program.BaseProgramBuilder setShader(java.lang.String p0) { return null; }
    }

    static enum ProgramParam {
        CONSTANT,
        INPUT,
        OUTPUT,
        TEXTURE_TYPE;
        private static final android.renderscript.Program.ProgramParam[] $VALUES = null;
        int mID;
        private ProgramParam() {}
    }

    public static enum TextureType {
        TEXTURE_2D,
        TEXTURE_CUBE;
        private static final android.renderscript.Program.TextureType[] $VALUES = null;
        int mID;
        private TextureType() {}
    }
}
