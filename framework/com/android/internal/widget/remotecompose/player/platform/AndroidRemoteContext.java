package com.android.internal.widget.remotecompose.player.platform;

public class AndroidRemoteContext extends com.android.internal.widget.remotecompose.core.RemoteContext {
    private static final boolean CHECK_DATA_SIZE = true;
    private boolean mA11yAnimationEnabled;
    private com.android.internal.widget.remotecompose.player.platform.BitmapLoader mBitmapLoader;
    public com.android.internal.widget.remotecompose.player.platform.AndroidRemoteContext.EdgeEffectBuilder mEdgeEffectBuilder;
    java.util.HashMap<java.lang.String, java.util.ArrayList<com.android.internal.widget.remotecompose.player.platform.AndroidRemoteContext.VarName>> mVarNameHashMap;
    public AndroidRemoteContext() { super(); }
    public AndroidRemoteContext(com.android.internal.widget.remotecompose.core.RemoteClock p0) { super(); }
    public AndroidRemoteContext(java.time.Clock p0) { super(); }
    private android.graphics.Bitmap decodePreferringAlpha8(byte[] p0) { return null; }
    public void addClickArea(int p0, int p1, float p2, float p3, float p4, float p5, int p6) {}
    public void addCollection(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.ArrayAccess p1) {}
    public void addTouchListener(com.android.internal.widget.remotecompose.core.TouchListener p0) {}
    public void clearDataOverride(int p0) {}
    public void clearFloatOverride(int p0) {}
    public void clearIntegerOverride(int p0) {}
    public void clearNamedBooleanOverride(java.lang.String p0) {}
    public void clearNamedDataOverride(java.lang.String p0) {}
    public void clearNamedFloatOverride(java.lang.String p0) {}
    public void clearNamedIntegerOverride(java.lang.String p0) {}
    public void clearNamedStringOverride(java.lang.String p0) {}
    public com.android.internal.widget.remotecompose.core.ScrollingEdgeEffect createEdgeEffect(int p0) { return null; }
    public int getColor(int p0) { return 0; }
    public com.android.internal.widget.remotecompose.core.operations.utilities.DataMap getDataMap(int p0) { return null; }
    public float getFloat(int p0) { return 0.0f; }
    public int getInteger(int p0) { return 0; }
    public java.util.ArrayList<com.android.internal.widget.remotecompose.core.VariableSupport> getListeners(int p0) { return null; }
    public long getLong(int p0) { return 0L; }
    public java.lang.Object getObject(int p0) { return null; }
    public float[] getPathData(int p0) { return null; }
    public com.android.internal.widget.remotecompose.core.operations.ShaderData getShader(int p0) { return null; }
    public java.lang.String getStringVariableName(java.lang.String p0) { return null; }
    public java.lang.String getText(int p0) { return null; }
    public int getVariableId(java.lang.String p0) { return 0; }
    public void hapticEffect(int p0) {}
    public boolean isAnimationEnabled() { return false; }
    public void listensTo(int p0, com.android.internal.widget.remotecompose.core.VariableSupport p1) {}
    public void loadAnimatedFloat(int p0, com.android.internal.widget.remotecompose.core.operations.FloatExpression p1) {}
    public void loadBitmap(int p0, short p1, short p2, int p3, int p4, byte[] p5) {}
    public void loadColor(int p0, int p1) {}
    public void loadFloat(int p0, float p1) {}
    public void loadInteger(int p0, int p1) {}
    public void loadPathData(int p0, int p1, float[] p2) {}
    public void loadShader(int p0, com.android.internal.widget.remotecompose.core.operations.ShaderData p1) {}
    public void loadText(int p0, java.lang.String p1) {}
    public void loadVariableName(java.lang.String p0, int p1, int p2) {}
    public void markVariableDirty(int p0) {}
    public void overrideData(int p0, java.lang.Object p1) {}
    public void overrideFloat(int p0, float p1) {}
    public void overrideInt(int p0, int p1) {}
    public void overrideInteger(int p0, int p1) {}
    public void overrideText(int p0, int p1) {}
    public void overrideText(int p0, java.lang.String p1) {}
    public void putDataMap(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.DataMap p1) {}
    public void putObject(int p0, java.lang.Object p1) {}
    public void runAction(int p0, java.lang.String p1) {}
    public void runNamedAction(int p0, java.lang.Object p1) {}
    public void setAccessibilityAnimationEnabled(boolean p0) {}
    public void setBitmapLoader(com.android.internal.widget.remotecompose.player.platform.BitmapLoader p0) {}
    public void setEdgeEffectBuilder(com.android.internal.widget.remotecompose.player.platform.AndroidRemoteContext.EdgeEffectBuilder p0) {}
    public void setNamedBooleanOverride(java.lang.String p0, boolean p1) {}
    public void setNamedColorOverride(java.lang.String p0, int p1) {}
    public void setNamedDataOverride(java.lang.String p0, java.lang.Object p1) {}
    public void setNamedFloatOverride(java.lang.String p0, float p1) {}
    public void setNamedIntegerOverride(java.lang.String p0, int p1) {}
    public void setNamedLong(java.lang.String p0, long p1) {}
    public void setNamedStringOverride(java.lang.String p0, java.lang.String p1) {}
    public int updateOps() { return 0; }
    public void useCanvas(android.graphics.Canvas p0) {}

    public static interface EdgeEffectBuilder {
        public android.widget.EdgeEffect create();
    }

    static class VarName {
        int mId;
        java.lang.String mName;
        int mType;
        VarName(java.lang.String p0, int p1, int p2) {}
    }
}
