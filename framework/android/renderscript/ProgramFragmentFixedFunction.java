package android.renderscript;

@java.lang.Deprecated
public class ProgramFragmentFixedFunction extends android.renderscript.ProgramFragment {
    ProgramFragmentFixedFunction(long p0, android.renderscript.RenderScript p1) { super(0L, null); }

    public static class Builder {
        public static final int MAX_TEXTURE = 2;
        int mNumTextures;
        boolean mPointSpriteEnable;
        android.renderscript.RenderScript mRS;
        java.lang.String mShader;
        android.renderscript.ProgramFragmentFixedFunction.Builder.Slot[] mSlots;
        boolean mVaryingColorEnable;
        public Builder(android.renderscript.RenderScript p0) {}
        private void buildShaderString() {}
        public android.renderscript.ProgramFragmentFixedFunction create() { return null; }
        public android.renderscript.ProgramFragmentFixedFunction.Builder setPointSpriteTexCoordinateReplacement(boolean p0) { return null; }
        public android.renderscript.ProgramFragmentFixedFunction.Builder setTexture(android.renderscript.ProgramFragmentFixedFunction.Builder.EnvMode p0, android.renderscript.ProgramFragmentFixedFunction.Builder.Format p1, int p2) throws java.lang.IllegalArgumentException { return null; }
        public android.renderscript.ProgramFragmentFixedFunction.Builder setVaryingColor(boolean p0) { return null; }

        public static enum EnvMode {
            DECAL,
            MODULATE,
            REPLACE;
            private static final android.renderscript.ProgramFragmentFixedFunction.Builder.EnvMode[] $VALUES = null;
            int mID;
            private EnvMode() {}
        }

        public static enum Format {
            ALPHA,
            LUMINANCE_ALPHA,
            RGB,
            RGBA;
            private static final android.renderscript.ProgramFragmentFixedFunction.Builder.Format[] $VALUES = null;
            int mID;
            private Format() {}
        }

        private class Slot {
            android.renderscript.ProgramFragmentFixedFunction.Builder.EnvMode env;
            android.renderscript.ProgramFragmentFixedFunction.Builder.Format format;
            Slot(android.renderscript.ProgramFragmentFixedFunction.Builder p0, android.renderscript.ProgramFragmentFixedFunction.Builder.EnvMode p1, android.renderscript.ProgramFragmentFixedFunction.Builder.Format p2) {}
        }
    }

    static class InternalBuilder extends android.renderscript.Program.BaseProgramBuilder {
        public InternalBuilder(android.renderscript.RenderScript p0) { super(null); }
        public android.renderscript.ProgramFragmentFixedFunction create() { return null; }
    }
}
