package android.renderscript;

@java.lang.Deprecated
public class ProgramRaster extends android.renderscript.BaseObj {
    android.renderscript.ProgramRaster.CullMode mCullMode;
    boolean mPointSprite;
    ProgramRaster(long p0, android.renderscript.RenderScript p1) { super(0L, null); }
    public static android.renderscript.ProgramRaster CULL_BACK(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.ProgramRaster CULL_FRONT(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.ProgramRaster CULL_NONE(android.renderscript.RenderScript p0) { return null; }
    public android.renderscript.ProgramRaster.CullMode getCullMode() { return null; }
    public boolean isPointSpriteEnabled() { return false; }

    public static class Builder {
        android.renderscript.ProgramRaster.CullMode mCullMode;
        boolean mPointSprite;
        android.renderscript.RenderScript mRS;
        public Builder(android.renderscript.RenderScript p0) {}
        public android.renderscript.ProgramRaster create() { return null; }
        public android.renderscript.ProgramRaster.Builder setCullMode(android.renderscript.ProgramRaster.CullMode p0) { return null; }
        public android.renderscript.ProgramRaster.Builder setPointSpriteEnabled(boolean p0) { return null; }
    }

    public static enum CullMode {
        BACK,
        FRONT,
        NONE;
        private static final android.renderscript.ProgramRaster.CullMode[] $VALUES = null;
        int mID;
        private CullMode() {}
    }
}
