package com.android.internal.widget.remotecompose.core;

public class RemoteComposeState implements com.android.internal.widget.remotecompose.core.operations.utilities.CollectionsAccess {
    public static final int BITMAP_TEXTURE_ID_OFFSET = 2000;
    public static final int START_ID = 42;
    java.util.ArrayList<com.android.internal.widget.remotecompose.core.VariableSupport> mAllVarListeners;
    private final com.android.internal.widget.remotecompose.core.operations.utilities.IntMap<com.android.internal.widget.remotecompose.core.operations.utilities.ArrayAccess> mCollectionMap = null;
    private final com.android.internal.widget.remotecompose.core.operations.utilities.IntIntMap mColorMap = null;
    private final com.android.internal.widget.remotecompose.core.operations.utilities.IntIntMap mColorOverride = null;
    private final java.util.HashMap<java.lang.Object, java.lang.Integer> mDataIntMap = null;
    private final com.android.internal.widget.remotecompose.core.operations.utilities.IntMap<com.android.internal.widget.remotecompose.core.operations.utilities.DataMap> mDataMapMap = null;
    private final boolean[] mDataOverride = null;
    private final com.android.internal.widget.remotecompose.core.operations.utilities.IntFloatMap mFloatMap = null;
    private final boolean[] mFloatOverride = null;
    private final int[] mIdMaps = null;
    private final com.android.internal.widget.remotecompose.core.operations.utilities.IntMap<java.lang.Object> mIntDataMap = null;
    private final com.android.internal.widget.remotecompose.core.operations.utilities.IntMap<java.lang.Boolean> mIntWrittenMap = null;
    private final com.android.internal.widget.remotecompose.core.operations.utilities.IntIntMap mIntegerMap = null;
    private final boolean[] mIntegerOverride = null;
    float mLastRepaint;
    private int mNextId;
    private final com.android.internal.widget.remotecompose.core.operations.utilities.IntMap<java.lang.Object> mObjectMap = null;
    private final com.android.internal.widget.remotecompose.core.operations.utilities.IntMap<float[]> mPathData = null;
    private final com.android.internal.widget.remotecompose.core.operations.utilities.IntMap<java.lang.Object> mPathMap = null;
    private final com.android.internal.widget.remotecompose.core.operations.utilities.IntIntMap mPathWinding = null;
    private com.android.internal.widget.remotecompose.core.RemoteContext mRemoteContext;
    float mRepaintSeconds;
    com.android.internal.widget.remotecompose.core.operations.utilities.IntMap<java.util.ArrayList<com.android.internal.widget.remotecompose.core.VariableSupport>> mVarListeners;
    public RemoteComposeState() {}
    private void add(int p0, com.android.internal.widget.remotecompose.core.VariableSupport p1) {}
    private void updateListeners(int p0) {}
    public void addCollection(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.ArrayAccess p1) {}
    public int cacheData(java.lang.Object p0) { return 0; }
    public int cacheData(java.lang.Object p0, int p1) { return 0; }
    public void cacheData(int p0, java.lang.Object p1) {}
    public int cacheFloat(float p0) { return 0; }
    public void cacheFloat(int p0, float p1) {}
    public int cacheInteger(int p0) { return 0; }
    public void clearColorOverride() {}
    public void clearDataOverride(int p0) {}
    public void clearFloatOverride(int p0) {}
    public void clearIntegerOverride(int p0) {}
    public boolean containsId(int p0) { return false; }
    public int createNextAvailableId() { return 0; }
    public int createNextAvailableId(int p0) { return 0; }
    public int dataGetId(java.lang.Object p0) { return 0; }
    public com.android.internal.widget.remotecompose.core.operations.utilities.ArrayAccess getArray(int p0) { return null; }
    public int getColor(int p0) { return 0; }
    public com.android.internal.widget.remotecompose.core.operations.utilities.DataMap getDataMap(int p0) { return null; }
    public float[] getDynamicFloats(int p0) { return null; }
    public float getFloat(int p0) { return 0.0f; }
    public float getFloatValue(int p0, int p1) { return 0.0f; }
    public float[] getFloats(int p0) { return null; }
    public java.lang.Object getFromId(int p0) { return null; }
    public int getId(int p0, int p1) { return 0; }
    public int getInteger(int p0) { return 0; }
    public int getListLength(int p0) { return 0; }
    public java.util.ArrayList<com.android.internal.widget.remotecompose.core.VariableSupport> getListeners(int p0) { return null; }
    public java.lang.Object getObject(int p0) { return null; }
    public int getOpsToUpdate(com.android.internal.widget.remotecompose.core.RemoteContext p0, long p1) { return 0; }
    public java.lang.Object getPath(int p0) { return null; }
    public float[] getPathData(int p0) { return null; }
    public int getPathWinding(int p0) { return 0; }
    public boolean hasListener(int p0) { return false; }
    public void listenToVar(int p0, com.android.internal.widget.remotecompose.core.VariableSupport p1) {}
    public void markVariableDirty(int p0) {}
    public void markWritten(int p0) {}
    public void overrideColor(int p0, int p1) {}
    public void overrideData(int p0, java.lang.Object p1) {}
    public void overrideFloat(int p0, float p1) {}
    public void overrideInteger(int p0, int p1) {}
    public void putDataMap(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.DataMap p1) {}
    public void putPath(int p0, java.lang.Object p1) {}
    public void putPathData(int p0, float[] p1) {}
    public void putPathWinding(int p0, int p1) {}
    public void reset() {}
    public void setContext(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void setNextId(int p0) {}
    public void setWindowHeight(float p0) {}
    public void setWindowWidth(float p0) {}
    public void updateColor(int p0, int p1) {}
    public void updateData(int p0, java.lang.Object p1) {}
    public void updateFloat(int p0, float p1) {}
    public void updateInteger(int p0, int p1) {}
    public void updateObject(int p0, java.lang.Object p1) {}
    public void wakeIn(float p0) {}
    public boolean wasNotWritten(int p0) { return false; }
}
