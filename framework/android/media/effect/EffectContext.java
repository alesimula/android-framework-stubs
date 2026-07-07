package android.media.effect;

public class EffectContext {
    private final int GL_STATE_ARRAYBUFFER = 0;
    private final int GL_STATE_COUNT = 0;
    private final int GL_STATE_FBO = 0;
    private final int GL_STATE_PROGRAM = 0;
    private android.media.effect.EffectFactory mFactory;
    android.filterfw.core.FilterContext mFilterContext;
    private int[] mOldState;
    private EffectContext() {}
    public static android.media.effect.EffectContext createWithCurrentGlContext() { return null; }
    private void initInCurrentGlContext() {}
    final void assertValidGLState() {}
    public android.media.effect.EffectFactory getFactory() { return null; }
    public void release() {}
    final void restoreGLState() {}
    final void saveGLState() {}
}
