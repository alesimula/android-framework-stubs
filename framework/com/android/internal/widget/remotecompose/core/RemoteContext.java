package com.android.internal.widget.remotecompose.core;

public abstract class RemoteContext {
    public static final float FLOAT_ACCELERATION_X = Float.valueOf(0.0f);
    public static final float FLOAT_ACCELERATION_Y = Float.valueOf(0.0f);
    public static final float FLOAT_ACCELERATION_Z = Float.valueOf(0.0f);
    public static final float FLOAT_ANIMATION_DELTA_TIME = Float.valueOf(0.0f);
    public static final float FLOAT_ANIMATION_TIME = Float.valueOf(0.0f);
    public static final float FLOAT_API_LEVEL = Float.valueOf(0.0f);
    public static final float FLOAT_CALENDAR_MONTH = Float.valueOf(0.0f);
    public static final float FLOAT_COMPONENT_HEIGHT = Float.valueOf(0.0f);
    public static final float FLOAT_COMPONENT_WIDTH = Float.valueOf(0.0f);
    public static final float FLOAT_CONTINUOUS_SEC = Float.valueOf(0.0f);
    public static final float FLOAT_DAY_OF_MONTH = Float.valueOf(0.0f);
    public static final float FLOAT_DAY_OF_YEAR = Float.valueOf(0.0f);
    public static final float FLOAT_DENSITY = Float.valueOf(0.0f);
    public static final float FLOAT_FONT_SIZE = Float.valueOf(0.0f);
    public static final float FLOAT_GYRO_ROT_X = Float.valueOf(0.0f);
    public static final float FLOAT_GYRO_ROT_Y = Float.valueOf(0.0f);
    public static final float FLOAT_GYRO_ROT_Z = Float.valueOf(0.0f);
    public static final float FLOAT_LIGHT = Float.valueOf(0.0f);
    public static final float FLOAT_MAGNETIC_X = Float.valueOf(0.0f);
    public static final float FLOAT_MAGNETIC_Y = Float.valueOf(0.0f);
    public static final float FLOAT_MAGNETIC_Z = Float.valueOf(0.0f);
    public static final float FLOAT_OFFSET_TO_UTC = Float.valueOf(0.0f);
    public static final float FLOAT_TIME_IN_HR = Float.valueOf(0.0f);
    public static final float FLOAT_TIME_IN_MIN = Float.valueOf(0.0f);
    public static final float FLOAT_TIME_IN_SEC = Float.valueOf(0.0f);
    public static final float FLOAT_TOUCH_EVENT_TIME = Float.valueOf(0.0f);
    public static final float FLOAT_TOUCH_POS_X = Float.valueOf(0.0f);
    public static final float FLOAT_TOUCH_POS_Y = Float.valueOf(0.0f);
    public static final float FLOAT_TOUCH_VEL_X = Float.valueOf(0.0f);
    public static final float FLOAT_TOUCH_VEL_Y = Float.valueOf(0.0f);
    public static final float FLOAT_WEEK_DAY = Float.valueOf(0.0f);
    public static final float FLOAT_WINDOW_HEIGHT = Float.valueOf(0.0f);
    public static final float FLOAT_WINDOW_WIDTH = Float.valueOf(0.0f);
    public static final float FLOAT_YEAR = Float.valueOf(0.0f);
    public static final int ID_ACCELERATION_X = 17;
    public static final int ID_ACCELERATION_Y = 18;
    public static final int ID_ACCELERATION_Z = 19;
    public static final int ID_ANIMATION_DELTA_TIME = 31;
    public static final int ID_ANIMATION_TIME = 30;
    public static final int ID_API_LEVEL = 28;
    public static final int ID_CALENDAR_MONTH = 9;
    public static final int ID_COMPONENT_HEIGHT = 8;
    public static final int ID_COMPONENT_WIDTH = 7;
    public static final int ID_CONTINUOUS_SEC = 1;
    public static final int ID_DAY_OF_MONTH = 12;
    public static final int ID_DAY_OF_YEAR = 34;
    public static final int ID_DENSITY = 27;
    public static final int ID_EPOCH_SECOND = 32;
    public static final int ID_FONT_SIZE = 33;
    public static final int ID_GYRO_ROT_X = 20;
    public static final int ID_GYRO_ROT_Y = 21;
    public static final int ID_GYRO_ROT_Z = 22;
    public static final int ID_LIGHT = 26;
    public static final int ID_MAGNETIC_X = 23;
    public static final int ID_MAGNETIC_Y = 24;
    public static final int ID_MAGNETIC_Z = 25;
    public static final int ID_OFFSET_TO_UTC = 10;
    public static final int ID_TIME_IN_HR = 4;
    public static final int ID_TIME_IN_MIN = 3;
    public static final int ID_TIME_IN_SEC = 2;
    public static final int ID_TOUCH_EVENT_TIME = 29;
    public static final int ID_TOUCH_POS_X = 13;
    public static final int ID_TOUCH_POS_Y = 14;
    public static final int ID_TOUCH_VEL_X = 15;
    public static final int ID_TOUCH_VEL_Y = 16;
    public static final int ID_WEEK_DAY = 11;
    public static final int ID_WINDOW_HEIGHT = 6;
    public static final int ID_WINDOW_WIDTH = 5;
    public static final int ID_YEAR = 35;
    public static final long INT_EPOCH_SECOND = 4294967328L;
    public long currentTime;
    private boolean mAnimate;
    private float mAnimationTime;
    private com.android.internal.widget.remotecompose.core.RemoteClock mClock;
    int mDebug;
    protected float mDensity;
    private long mDocLoadTime;
    protected com.android.internal.widget.remotecompose.core.CoreDocument mDocument;
    public float mHeight;
    public com.android.internal.widget.remotecompose.core.operations.layout.Component mLastComponent;
    com.android.internal.widget.remotecompose.core.RemoteContext.ContextMode mMode;
    private int mOpCount;
    protected com.android.internal.widget.remotecompose.core.PaintContext mPaintContext;
    private int mPaintTheme;
    public com.android.internal.widget.remotecompose.core.RemoteComposeState mRemoteComposeState;
    private int mTheme;
    private int mTouchVersion;
    private boolean mUseChoreographer;
    public float mViewportHeight;
    public float mViewportWidth;
    public float mWidth;
    public RemoteContext() {}
    public RemoteContext(com.android.internal.widget.remotecompose.core.RemoteClock p0) {}
    public static boolean isTime(float p0) { return false; }
    public abstract void addClickArea(int p0, int p1, float p2, float p3, float p4, float p5, int p6);
    public abstract void addCollection(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.ArrayAccess p1);
    public void addTouchListener(com.android.internal.widget.remotecompose.core.TouchListener p0) {}
    public void clearLastOpCount() {}
    public abstract void clearNamedBooleanOverride(java.lang.String p0);
    public abstract void clearNamedDataOverride(java.lang.String p0);
    public abstract void clearNamedFloatOverride(java.lang.String p0);
    public abstract void clearNamedIntegerOverride(java.lang.String p0);
    public abstract void clearNamedStringOverride(java.lang.String p0);
    public com.android.internal.widget.remotecompose.core.ScrollingEdgeEffect createEdgeEffect(int p0) { return null; }
    public float getAnimationTime() { return 0.0f; }
    public com.android.internal.widget.remotecompose.core.RemoteClock getClock() { return null; }
    public com.android.internal.widget.remotecompose.core.operations.utilities.CollectionsAccess getCollectionsAccess() { return null; }
    public abstract int getColor(int p0);
    public abstract com.android.internal.widget.remotecompose.core.operations.utilities.DataMap getDataMap(int p0);
    public float getDensity() { return 0.0f; }
    public int getDensityBehavior() { return 0; }
    public long getDocLoadTime() { return 0L; }
    public com.android.internal.widget.remotecompose.core.CoreDocument getDocument() { return null; }
    public abstract float getFloat(int p0);
    public abstract int getInteger(int p0);
    public int getLastOpCount() { return 0; }
    public java.util.ArrayList<com.android.internal.widget.remotecompose.core.VariableSupport> getListeners(int p0) { return null; }
    public abstract long getLong(int p0);
    public com.android.internal.widget.remotecompose.core.RemoteContext.ContextMode getMode() { return null; }
    public abstract java.lang.Object getObject(int p0);
    public com.android.internal.widget.remotecompose.core.PaintContext getPaintContext() { return null; }
    public int getPaintTheme() { return 0; }
    public abstract float[] getPathData(int p0);
    public abstract com.android.internal.widget.remotecompose.core.operations.ShaderData getShader(int p0);
    public abstract java.lang.String getText(int p0);
    public int getTheme() { return 0; }
    public int getTouchVersion() { return 0; }
    public boolean getUseChoreographer() { return false; }
    public abstract void hapticEffect(int p0);
    public void header(int p0, int p1, int p2, int p3, int p4, long p5, com.android.internal.widget.remotecompose.core.operations.utilities.IntMap<java.lang.Object> p6) {}
    public void incrementOpCount() {}
    public boolean isAnimationEnabled() { return false; }
    public boolean isBasicDebug() { return false; }
    public boolean isLayoutDebug() { return false; }
    public boolean isVisualDebug() { return false; }
    public abstract void listensTo(int p0, com.android.internal.widget.remotecompose.core.VariableSupport p1);
    public abstract void loadAnimatedFloat(int p0, com.android.internal.widget.remotecompose.core.operations.FloatExpression p1);
    public abstract void loadBitmap(int p0, short p1, short p2, int p3, int p4, byte[] p5);
    public abstract void loadColor(int p0, int p1);
    public abstract void loadFloat(int p0, float p1);
    public void loadFont(int p0, byte[] p1) {}
    public abstract void loadInteger(int p0, int p1);
    public abstract void loadPathData(int p0, int p1, float[] p2);
    public abstract void loadShader(int p0, com.android.internal.widget.remotecompose.core.operations.ShaderData p1);
    public abstract void loadText(int p0, java.lang.String p1);
    public abstract void loadVariableName(java.lang.String p0, int p1, int p2);
    public void markVariableDirty(int p0) {}
    public void needsRepaint() {}
    public abstract void overrideFloat(int p0, float p1);
    public abstract void overrideInteger(int p0, int p1);
    public abstract void overrideText(int p0, int p1);
    public abstract void putDataMap(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.DataMap p1);
    public abstract void putObject(int p0, java.lang.Object p1);
    public abstract void runAction(int p0, java.lang.String p1);
    public abstract void runNamedAction(int p0, java.lang.Object p1);
    public void setAnimationEnabled(boolean p0) {}
    public void setAnimationTime(float p0) {}
    public void setClock(com.android.internal.widget.remotecompose.core.RemoteClock p0) {}
    public void setDebug(int p0) {}
    public void setDensity(float p0) {}
    public void setDocLoadTime() {}
    public void setDocument(com.android.internal.widget.remotecompose.core.CoreDocument p0) {}
    public void setDocumentContentDescription(int p0) {}
    public void setMode(com.android.internal.widget.remotecompose.core.RemoteContext.ContextMode p0) {}
    public abstract void setNamedBooleanOverride(java.lang.String p0, boolean p1);
    public abstract void setNamedColorOverride(java.lang.String p0, int p1);
    public abstract void setNamedDataOverride(java.lang.String p0, java.lang.Object p1);
    public abstract void setNamedFloatOverride(java.lang.String p0, float p1);
    public abstract void setNamedIntegerOverride(java.lang.String p0, int p1);
    public abstract void setNamedLong(java.lang.String p0, long p1);
    public abstract void setNamedStringOverride(java.lang.String p0, java.lang.String p1);
    public void setPaintContext(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void setPaintTheme(int p0) {}
    public void setRootContentBehavior(int p0, int p1, int p2, int p3) {}
    public void setTheme(int p0) {}
    public void setTouchVersion(int p0) {}
    public void setUseChoreographer(boolean p0) {}
    public boolean supportsVersion(int p0, int p1, int p2) { return false; }
    public abstract int updateOps();
    public boolean useFeature(short p0) { return false; }

    public static enum ContextMode {
        DATA,
        PAINT,
        UNSET;
        private static final com.android.internal.widget.remotecompose.core.RemoteContext.ContextMode[] $VALUES = null;
        private ContextMode() {}
    }

    public static class FontInfo {
        public java.lang.Object fontBuilder;
        public final byte[] mFontData = null;
        public final int mFontId = 0;
        FontInfo(int p0, byte[] p1) {}
    }
}
