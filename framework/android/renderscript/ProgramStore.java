package android.renderscript;

@java.lang.Deprecated
public class ProgramStore extends android.renderscript.BaseObj {
    android.renderscript.ProgramStore.BlendDstFunc mBlendDst;
    android.renderscript.ProgramStore.BlendSrcFunc mBlendSrc;
    boolean mColorMaskA;
    boolean mColorMaskB;
    boolean mColorMaskG;
    boolean mColorMaskR;
    android.renderscript.ProgramStore.DepthFunc mDepthFunc;
    boolean mDepthMask;
    boolean mDither;
    ProgramStore(long p0, android.renderscript.RenderScript p1) { super(0L, null); }
    public static android.renderscript.ProgramStore BLEND_ALPHA_DEPTH_NONE(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.ProgramStore BLEND_ALPHA_DEPTH_TEST(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.ProgramStore BLEND_NONE_DEPTH_NONE(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.ProgramStore BLEND_NONE_DEPTH_TEST(android.renderscript.RenderScript p0) { return null; }
    public android.renderscript.ProgramStore.BlendDstFunc getBlendDstFunc() { return null; }
    public android.renderscript.ProgramStore.BlendSrcFunc getBlendSrcFunc() { return null; }
    public android.renderscript.ProgramStore.DepthFunc getDepthFunc() { return null; }
    public boolean isColorMaskAlphaEnabled() { return false; }
    public boolean isColorMaskBlueEnabled() { return false; }
    public boolean isColorMaskGreenEnabled() { return false; }
    public boolean isColorMaskRedEnabled() { return false; }
    public boolean isDepthMaskEnabled() { return false; }
    public boolean isDitherEnabled() { return false; }

    public static enum BlendDstFunc {
        DST_ALPHA,
        ONE,
        ONE_MINUS_DST_ALPHA,
        ONE_MINUS_SRC_ALPHA,
        ONE_MINUS_SRC_COLOR,
        SRC_ALPHA,
        SRC_COLOR,
        ZERO;
        private static final android.renderscript.ProgramStore.BlendDstFunc[] $VALUES = null;
        int mID;
        private BlendDstFunc() {}
    }

    public static enum BlendSrcFunc {
        DST_ALPHA,
        DST_COLOR,
        ONE,
        ONE_MINUS_DST_ALPHA,
        ONE_MINUS_DST_COLOR,
        ONE_MINUS_SRC_ALPHA,
        SRC_ALPHA,
        SRC_ALPHA_SATURATE,
        ZERO;
        private static final android.renderscript.ProgramStore.BlendSrcFunc[] $VALUES = null;
        int mID;
        private BlendSrcFunc() {}
    }

    public static class Builder {
        android.renderscript.ProgramStore.BlendDstFunc mBlendDst;
        android.renderscript.ProgramStore.BlendSrcFunc mBlendSrc;
        boolean mColorMaskA;
        boolean mColorMaskB;
        boolean mColorMaskG;
        boolean mColorMaskR;
        android.renderscript.ProgramStore.DepthFunc mDepthFunc;
        boolean mDepthMask;
        boolean mDither;
        android.renderscript.RenderScript mRS;
        public Builder(android.renderscript.RenderScript p0) {}
        public android.renderscript.ProgramStore create() { return null; }
        public android.renderscript.ProgramStore.Builder setBlendFunc(android.renderscript.ProgramStore.BlendSrcFunc p0, android.renderscript.ProgramStore.BlendDstFunc p1) { return null; }
        public android.renderscript.ProgramStore.Builder setColorMaskEnabled(boolean p0, boolean p1, boolean p2, boolean p3) { return null; }
        public android.renderscript.ProgramStore.Builder setDepthFunc(android.renderscript.ProgramStore.DepthFunc p0) { return null; }
        public android.renderscript.ProgramStore.Builder setDepthMaskEnabled(boolean p0) { return null; }
        public android.renderscript.ProgramStore.Builder setDitherEnabled(boolean p0) { return null; }
    }

    public static enum DepthFunc {
        ALWAYS,
        EQUAL,
        GREATER,
        GREATER_OR_EQUAL,
        LESS,
        LESS_OR_EQUAL,
        NOT_EQUAL;
        private static final android.renderscript.ProgramStore.DepthFunc[] $VALUES = null;
        int mID;
        private DepthFunc() {}
    }
}
