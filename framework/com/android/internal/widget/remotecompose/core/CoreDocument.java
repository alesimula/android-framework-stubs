package com.android.internal.widget.remotecompose.core;

public class CoreDocument implements com.android.internal.widget.remotecompose.core.serialize.Serializable {
    static final boolean $assertionsDisabled = false;
    static final float BUILD = 0.699999988079071f;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_DENSITY_BEHAVIOR = 0;
    private static final int DEFAULT_FEATURE_ARRAY_LISTENERS = 1;
    private static final int DEFAULT_FEATURE_LT_RESIZE = 1;
    private static final int DEFAULT_FEATURE_MEASURE_VERSION = 3;
    private static final int DEFAULT_FEATURE_PAINT_MEASURE = 1;
    private static final int DEFAULT_FEATURE_PRIORITY_FIX = 1;
    private static final int DEFAULT_FEATURE_TOUCH_VERSION = 1;
    public static final int DENSITY_BEHAVIOR_DP = 2;
    public static final int DENSITY_BEHAVIOR_LEGACY = 0;
    public static final int DENSITY_BEHAVIOR_PIXELS = 1;
    public static final int DOCUMENT_API_LEVEL = 9;
    public static final int MAJOR_VERSION = 1;
    public static final int MINOR_VERSION = 3;
    public static final int PATCH_VERSION = 0;
    public static final int PROFILE = 512;
    static final int PROFILE_ANDROIDX = 512;
    static final int PROFILE_WIDGETS = 256;
    private static final boolean UPDATE_VARIABLES_BEFORE_LAYOUT = false;
    java.util.HashSet<com.android.internal.widget.remotecompose.core.CoreDocument.ActionCallback> mActionListeners;
    private final java.util.HashSet<com.android.internal.widget.remotecompose.core.operations.layout.Component> mAppliedTouchOperations = null;
    private int mBitmapMemory;
    com.android.internal.widget.remotecompose.core.RemoteComposeBuffer mBuffer;
    java.util.HashSet<com.android.internal.widget.remotecompose.core.CoreDocument.ClickAreaRepresentation> mClickAreas;
    private final com.android.internal.widget.remotecompose.core.RemoteClock mClock = null;
    private final java.util.HashMap<java.lang.Integer, com.android.internal.widget.remotecompose.core.operations.layout.Component> mComponentMap = null;
    int mContentAlignment;
    java.lang.String mContentDescription;
    int mContentMode;
    int mContentScroll;
    int mContentSizing;
    int mDensityBehavior;
    private com.android.internal.widget.remotecompose.core.operations.utilities.IntMap<java.lang.Object> mDocProperties;
    boolean mFirstPaint;
    private final java.util.HashMap<java.lang.Integer, com.android.internal.widget.remotecompose.core.operations.FloatExpression> mFloatExpressions = null;
    com.android.internal.widget.remotecompose.core.CoreDocument.HapticEngine mHapticEngine;
    com.android.internal.widget.remotecompose.core.operations.Header mHeader;
    int mHeight;
    private int mHostExceptionID;
    java.util.HashSet<com.android.internal.widget.remotecompose.core.CoreDocument.IdActionCallback> mIdActionListeners;
    private final java.util.HashMap<java.lang.Long, com.android.internal.widget.remotecompose.core.operations.IntegerExpression> mIntegerExpressions = null;
    private boolean mIsUpdateDoc;
    private int mLastId;
    private int mLastOpCount;
    private com.android.internal.widget.remotecompose.core.LayoutCallback mLayoutCallback;
    private final java.util.HashSet<com.android.internal.widget.remotecompose.core.LayoutCompute> mLayoutComputeOperations = null;
    int mMeasureVersion;
    boolean mNeedsInitialMeasure;
    java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> mOperations;
    float mOriginX;
    float mOriginY;
    com.android.internal.widget.remotecompose.core.RemoteComposeState mRemoteComposeState;
    private int mRepaintNext;
    long mRequiredCapabilities;
    com.android.internal.widget.remotecompose.core.operations.layout.RootLayoutComponent mRootLayoutComponent;
    private final float[] mScaleOutput = null;
    private java.util.ArrayList<com.android.internal.widget.remotecompose.core.operations.ColorTheme> mThemeColors;
    public com.android.internal.widget.remotecompose.core.TimeVariables mTimeVariables;
    java.util.HashSet<com.android.internal.widget.remotecompose.core.TouchListener> mTouchListeners;
    int mTouchVersion;
    private final float[] mTranslateOutput = null;
    boolean mUseFeatureLTResize;
    boolean mUseFeaturePaintMeasure;
    boolean mUseFeaturePriorityFix;
    com.android.internal.widget.remotecompose.core.CoreDocument.Version mVersion;
    int mWidth;
    public CoreDocument() {}
    public CoreDocument(com.android.internal.widget.remotecompose.core.RemoteClock p0) {}
    private int addChildren(com.android.internal.widget.remotecompose.core.operations.layout.Container p0, java.util.HashMap<java.lang.String, int[]> p1, com.android.internal.widget.remotecompose.core.WireBuffer p2) { return 0; }
    private void applyOperations(com.android.internal.widget.remotecompose.core.RemoteContext p0, java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    private void checkShaders(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument.ShaderControl p1, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p2) {}
    private void computeTranslate(float p0, float p1, float p2, float p3, float[] p4) {}
    private void getBitmapDataSet(java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> p0, java.util.ArrayList<com.android.internal.widget.remotecompose.core.operations.BitmapData> p1) {}
    private int getChildOps(com.android.internal.widget.remotecompose.core.operations.layout.Container p0) { return 0; }
    private void getColorThemes(java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> p0, java.util.List<com.android.internal.widget.remotecompose.core.operations.ColorTheme> p1, com.android.internal.widget.remotecompose.core.operations.utilities.IntMap<java.lang.String> p2) {}
    private void getDocInfo(java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> p0, com.android.internal.widget.remotecompose.core.CoreDocument.DocInfo p1) {}
    public static int getDocumentApiLevel() { return 0; }
    private void getNamedVars(int p0, java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> p1, java.util.ArrayList<java.lang.String> p2) {}
    private java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> inflateComponents(java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> p0) { return null; }
    private void recursiveTraverse(java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> p0, com.android.internal.widget.remotecompose.core.CoreDocument.Visitor p1) {}
    private void registerLayoutCompute(com.android.internal.widget.remotecompose.core.LayoutCompute p0) {}
    private void registerVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0, java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    private int sizeOfComponent(com.android.internal.widget.remotecompose.core.Operation p0, com.android.internal.widget.remotecompose.core.WireBuffer p1) { return 0; }
    private void toNestedString(com.android.internal.widget.remotecompose.core.operations.layout.Container p0, java.lang.StringBuilder p1, java.lang.String p2) {}
    private void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0, int p1, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p2) {}
    private void warnClickListeners(com.android.internal.widget.remotecompose.core.CoreDocument.ClickAreaRepresentation p0) {}
    public void addActionCallback(com.android.internal.widget.remotecompose.core.CoreDocument.ActionCallback p0) {}
    public void addClickArea(int p0, java.lang.String p1, float p2, float p3, float p4, float p5, java.lang.String p6) {}
    public void addIdActionListener(com.android.internal.widget.remotecompose.core.CoreDocument.IdActionCallback p0) {}
    public void addTouchListener(com.android.internal.widget.remotecompose.core.TouchListener p0) {}
    public void appliedTouchOperation(com.android.internal.widget.remotecompose.core.operations.layout.Component p0) {}
    public void applyDataOperations(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void applyUpdate(com.android.internal.widget.remotecompose.core.CoreDocument p0) {}
    public int bitmapMemory() { return 0; }
    public boolean canBeDisplayed(int p0, int p1, long p2) { return false; }
    public void checkShaders(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument.ShaderControl p1) {}
    public void clearActionCallbacks() {}
    public void computeScale(float p0, float p1, float[] p2) {}
    public java.lang.String displayHierarchy() { return null; }
    public void evaluateFloatExpression(int p0, int p1, com.android.internal.widget.remotecompose.core.RemoteContext p2) {}
    public void evaluateIntExpression(long p0, int p1, com.android.internal.widget.remotecompose.core.RemoteContext p2) {}
    public int featureIntValue(short p0) { return 0; }
    public com.android.internal.widget.remotecompose.core.operations.BitmapData[] getBitmapDataSet() { return null; }
    public com.android.internal.widget.remotecompose.core.RemoteComposeBuffer getBuffer() { return null; }
    public java.util.Set<com.android.internal.widget.remotecompose.core.CoreDocument.ClickAreaRepresentation> getClickAreas() { return null; }
    public com.android.internal.widget.remotecompose.core.RemoteClock getClock() { return null; }
    public com.android.internal.widget.remotecompose.core.operations.layout.Component getComponent(int p0) { return null; }
    public java.lang.String getContentDescription() { return null; }
    public int getContentMode() { return 0; }
    public int getContentScroll() { return 0; }
    public int getContentSizing() { return 0; }
    public float getDensity() { return 0.0f; }
    public int getDensityBehavior() { return 0; }
    public com.android.internal.widget.remotecompose.core.CoreDocument.DocInfo getDocInfo() { return null; }
    public int getHeight() { return 0; }
    public int getHostExceptionID() { return 0; }
    public java.util.HashSet<com.android.internal.widget.remotecompose.core.CoreDocument.IdActionCallback> getIdActionListeners() { return null; }
    public java.lang.String[] getNamedColors() { return null; }
    public java.lang.String[] getNamedVariables(int p0) { return null; }
    public int getNumberOfOps() { return 0; }
    public java.util.List<com.android.internal.widget.remotecompose.core.Operation> getOperations() { return null; }
    public int getOpsPerFrame() { return 0; }
    public float getOriginX() { return 0.0f; }
    public float getOriginY() { return 0.0f; }
    public java.lang.Object getProperty(short p0) { return null; }
    public com.android.internal.widget.remotecompose.core.RemoteComposeState getRemoteComposeState() { return null; }
    public long getRequiredCapabilities() { return 0L; }
    public com.android.internal.widget.remotecompose.core.operations.layout.RootLayoutComponent getRootLayoutComponent() { return null; }
    public java.lang.String[] getStats() { return null; }
    public java.util.ArrayList<com.android.internal.widget.remotecompose.core.operations.ColorTheme> getThemedColors() { return null; }
    public int getWidth() { return 0; }
    public void haptic(int p0) {}
    public boolean hasTouchListener() { return false; }
    public void initFromBuffer(com.android.internal.widget.remotecompose.core.RemoteComposeBuffer p0) {}
    public void initializeContext(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void initializeContext(com.android.internal.widget.remotecompose.core.RemoteContext p0, java.util.Map<java.lang.Integer, java.lang.Object> p1) {}
    public void invalidateMeasure() {}
    public boolean isUpdateDoc() { return false; }
    public void measure(com.android.internal.widget.remotecompose.core.RemoteContext p0, float p1, float p2, float p3, float p4) {}
    public boolean needsMeasure() { return false; }
    public int needsRepaint() { return 0; }
    public void notifyOfException(int p0, java.lang.String p1) {}
    public boolean onClick(com.android.internal.widget.remotecompose.core.RemoteContext p0, float p1, float p2) { return false; }
    public boolean onDoubleClick(com.android.internal.widget.remotecompose.core.RemoteContext p0, float p1, float p2) { return false; }
    public boolean onLongPress(com.android.internal.widget.remotecompose.core.RemoteContext p0, float p1, float p2) { return false; }
    public void paint(com.android.internal.widget.remotecompose.core.RemoteContext p0, int p1) {}
    public boolean performClick(com.android.internal.widget.remotecompose.core.RemoteContext p0, int p1, java.lang.String p2) { return false; }
    public void runNamedAction(java.lang.String p0, java.lang.Object p1) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public void setBuffer(com.android.internal.widget.remotecompose.core.RemoteComposeBuffer p0) {}
    public void setContentDescription(java.lang.String p0) {}
    public void setDensityBehavior(int p0) {}
    public void setHapticEngine(com.android.internal.widget.remotecompose.core.CoreDocument.HapticEngine p0) {}
    public void setHeight(int p0) {}
    public void setHostExceptionID(int p0) {}
    public void setLayoutCallback(com.android.internal.widget.remotecompose.core.LayoutCallback p0) {}
    public void setOrigin(float p0, float p1) {}
    public void setProperties(com.android.internal.widget.remotecompose.core.operations.utilities.IntMap<java.lang.Object> p0) {}
    public void setRemoteComposeState(com.android.internal.widget.remotecompose.core.RemoteComposeState p0) {}
    public void setRequiredCapabilities(long p0) {}
    public void setRootContentBehavior(int p0, int p1, int p2, int p3) {}
    public void setUpdateDoc(boolean p0) {}
    public void setVersion(int p0, int p1, int p2) {}
    public void setWidth(int p0) {}
    public java.lang.String toNestedString() { return null; }
    public java.lang.String toString() { return null; }
    public boolean touchCancel(com.android.internal.widget.remotecompose.core.RemoteContext p0, float p1, float p2, float p3, float p4) { return false; }
    public boolean touchDown(com.android.internal.widget.remotecompose.core.RemoteContext p0, float p1, float p2) { return false; }
    public boolean touchDrag(com.android.internal.widget.remotecompose.core.RemoteContext p0, float p1, float p2) { return false; }
    public boolean touchUp(com.android.internal.widget.remotecompose.core.RemoteContext p0, float p1, float p2, float p3, float p4) { return false; }
    public boolean useFeature(short p0) { return false; }
    public boolean useFeature(short p0, int p1) { return false; }

    public static interface ActionCallback {
        public void onAction(java.lang.String p0, java.lang.Object p1);
    }

    public static class ClickAreaRepresentation {
        float mBottom;
        final java.lang.String mContentDescription = null;
        int mId;
        float mLeft;
        final java.lang.String mMetadata = null;
        float mRight;
        float mTop;
        public ClickAreaRepresentation(int p0, java.lang.String p1, float p2, float p3, float p4, float p5, java.lang.String p6) {}
        public boolean contains(float p0, float p1) { return false; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String getContentDescription() { return null; }
        public int getId() { return 0; }
        public float getLeft() { return 0.0f; }
        public java.lang.String getMetadata() { return null; }
        public float getTop() { return 0.0f; }
        public int hashCode() { return 0; }
        public float height() { return 0.0f; }
        public float width() { return 0.0f; }
    }

    public static class DocInfo {
        public int mNumberOfImages;
        public int mNumberOfOps;
        public int mSizeOfImages;
        public DocInfo() {}
        public int getNumberOfImages() { return 0; }
        public int getNumberOfOps() { return 0; }
        public int getSizeOfImages() { return 0; }
    }

    public static interface HapticEngine {
        public void haptic(int p0);
    }

    public static interface IdActionCallback {
        public void onAction(int p0, java.lang.String p1);
    }

    public static interface ShaderControl {
        public boolean isShaderValid(java.lang.String p0);
    }

    static class Version {
        public final int major = 0;
        public final int minor = 0;
        public final int patchLevel = 0;
        Version(int p0, int p1, int p2) {}
        public boolean supportsVersion(int p0, int p1, int p2) { return false; }
    }

    private static interface Visitor {
        public void visit(com.android.internal.widget.remotecompose.core.Operation p0);
    }
}
