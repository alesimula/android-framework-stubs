package com.android.internal.widget.remotecompose.player;

@android.widget.RemoteViews.RemoteView
public class RemoteComposePlayer extends android.widget.FrameLayout implements com.android.internal.widget.remotecompose.core.RemoteContextActions {
    private static final int MAX_SUPPORTED_MAJOR_VERSION = 1;
    private static final int MAX_SUPPORTED_MINOR_VERSION = 3;
    public static final int THEME_DARK = -2;
    public static final int THEME_LIGHT = -3;
    public static final int THEME_UNSPECIFIED = -1;
    private com.android.internal.widget.remotecompose.player.RemoteComposePlayer.FloatSystemVariables mFloatSystemVariables;
    private final com.android.internal.widget.remotecompose.player.platform.HapticSupport mHapticSupport = null;
    protected com.android.internal.widget.remotecompose.player.platform.RemoteComposeView mInner;
    private final com.android.internal.widget.remotecompose.player.platform.SensorSupport mSensorsSupport = null;
    private com.android.internal.widget.remotecompose.core.CoreDocument.ShaderControl mShaderControl;
    private com.android.internal.widget.remotecompose.player.state.StateUpdater mStateUpdater;
    private final com.android.internal.widget.remotecompose.player.platform.ThemeSupport mThemeSupport = null;
    public RemoteComposePlayer(android.content.Context p0) { super((android.content.Context)null); }
    public RemoteComposePlayer(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public RemoteComposePlayer(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    private void applyContentBehavior(int p0) {}
    private static com.android.internal.widget.remotecompose.core.semantics.ScrollableComponent findScrollable(com.android.internal.widget.remotecompose.core.operations.layout.Component p0) { return null; }
    private com.android.internal.widget.remotecompose.core.RemoteContext getRemoteContext() { return null; }
    private void init(android.content.Context p0, android.util.AttributeSet p1, int p2) {}
    private boolean isCompatible(com.android.internal.widget.remotecompose.player.RemoteDocument p0) { return false; }
    public void addIdActionListener(com.android.internal.widget.remotecompose.player.RemoteComposePlayer.IdActionCallbacks p0) {}
    public void clearLocalString(java.lang.String p0, java.lang.String p1) {}
    public void clearSystemLocalString(java.lang.String p0) {}
    public void clearUserLocalBitmap(java.lang.String p0) {}
    public void clearUserLocalColor(java.lang.String p0) {}
    public void clearUserLocalFloat(java.lang.String p0) {}
    public void clearUserLocalInt(java.lang.String p0) {}
    public void clearUserLocalString(java.lang.String p0) {}
    public boolean dispatchHoverEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public float getAnimationTime() { return 0.0f; }
    public com.android.internal.widget.remotecompose.player.RemoteDocument getDocument() { return null; }
    public float getEvalTime() { return 0.0f; }
    public java.lang.String[] getNamedColors() { return null; }
    public java.lang.String[] getNamedFloats() { return null; }
    public java.lang.String[] getNamedImages() { return null; }
    public java.lang.String[] getNamedStrings() { return null; }
    public int getOpsPerFrame() { return 0; }
    public com.android.internal.widget.remotecompose.player.state.StateUpdater getStateUpdater() { return null; }
    public void invalidate() {}
    public boolean isDraggable() { return false; }
    protected void onDetachedFromWindow() {}
    public void onFocusChanged(boolean p0, int p1, android.graphics.Rect p2) {}
    public boolean performClick(com.android.internal.widget.remotecompose.core.CoreDocument p0, com.android.internal.widget.remotecompose.core.operations.layout.Component p1, java.lang.String p2) { return false; }
    public com.android.internal.widget.remotecompose.player.RemoteComposePlayer.PreparedDocument prepareDocument(com.android.internal.widget.remotecompose.player.RemoteDocument p0) { return null; }
    public void reloadPalette() {}
    public void requestLayout() {}
    public int scrollByOffset(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, int p1) { return 0; }
    public boolean scrollDirection(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, com.android.internal.widget.remotecompose.core.semantics.ScrollableComponent.ScrollDirection p1) { return false; }
    public void setBitmapLoader(com.android.internal.widget.remotecompose.player.platform.BitmapLoader p0) {}
    public void setColor(java.lang.String p0, int p1) {}
    public void setDebug(int p0) {}
    public void setDefaultMaxFps(int p0) {}
    public void setDocument(com.android.internal.widget.remotecompose.player.RemoteDocument p0) {}
    public void setDocument(java.io.InputStream p0) {}
    public void setDocument(byte[] p0) {}
    public void setFloatSystemVariables(com.android.internal.widget.remotecompose.player.RemoteComposePlayer.FloatSystemVariables p0) {}
    public void setLocalFloat(java.lang.String p0, float p1) {}
    public void setLocalString(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
    public void setLong(java.lang.String p0, long p1) {}
    public void setMaxBitmapMemory(int p0) {}
    public void setMaxFps(int p0) {}
    public void setMaxImageDimension(int p0) {}
    public void setMaxOpCount(int p0) {}
    public void setPreparedDocument(com.android.internal.widget.remotecompose.player.RemoteComposePlayer.PreparedDocument p0) {}
    public void setShaderControl(com.android.internal.widget.remotecompose.core.CoreDocument.ShaderControl p0) {}
    public void setSystemLocalString(java.lang.String p0, java.lang.String p1) {}
    public void setTheme(int p0) {}
    public void setUseChoreographer(boolean p0) {}
    public void setUserLocalBitmap(java.lang.String p0, android.graphics.Bitmap p1) {}
    public void setUserLocalColor(java.lang.String p0, int p1) {}
    public void setUserLocalFloat(java.lang.String p0, float p1) {}
    public void setUserLocalInt(java.lang.String p0, int p1) {}
    public void setUserLocalString(java.lang.String p0, java.lang.String p1) {}
    public boolean shouldPrepare(com.android.internal.widget.remotecompose.player.RemoteDocument p0) { return false; }
    public boolean showOnScreen(com.android.internal.widget.remotecompose.core.operations.layout.Component p0) { return false; }
    public void updateDocument(com.android.internal.widget.remotecompose.player.RemoteDocument p0) {}
    public void updateDocument(byte[] p0) {}

    public static interface FloatSystemVariables {
        public void loadSystemVariables(com.android.internal.widget.remotecompose.player.platform.RemoteComposeView p0, java.lang.String[] p1);
    }

    public static interface IdActionCallbacks {
        public void onAction(int p0, java.lang.String p1);
    }

    public static interface PreparedDocument {
        public com.android.internal.widget.remotecompose.player.RemoteDocument getOriginalDoc();
    }
}
