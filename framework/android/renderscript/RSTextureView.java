package android.renderscript;

@java.lang.Deprecated
public class RSTextureView extends android.view.TextureView implements android.view.TextureView.SurfaceTextureListener {
    private android.renderscript.RenderScriptGL mRS;
    private android.graphics.SurfaceTexture mSurfaceTexture;
    public RSTextureView(android.content.Context p0) { super((android.content.Context)null); }
    public RSTextureView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    private void init() {}
    public android.renderscript.RenderScriptGL createRenderScriptGL(android.renderscript.RenderScriptGL.SurfaceConfig p0) { return null; }
    public void destroyRenderScriptGL() {}
    public android.renderscript.RenderScriptGL getRenderScriptGL() { return null; }
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture p0, int p1, int p2) {}
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture p0) { return false; }
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture p0, int p1, int p2) {}
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture p0) {}
    public void pause() {}
    public void resume() {}
    public void setRenderScriptGL(android.renderscript.RenderScriptGL p0) {}
}
