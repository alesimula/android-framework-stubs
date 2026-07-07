package com.android.internal.widget.remotecompose.player.platform;

public class RemoteComposeView extends android.widget.FrameLayout implements android.view.View.OnAttachStateChangeListener, com.android.internal.widget.remotecompose.core.LayoutCallback {
    static final float POST_TO_NEXT_FRAME_THRESHOLD = 60.0f;
    static final boolean USE_VIEW_AREA_CLICK = true;
    private static final float[] sScaleOutput = null;
    com.android.internal.widget.remotecompose.player.platform.AndroidRemoteContext mARContext;
    android.graphics.Point mActionCurrentPoint;
    android.graphics.Point mActionDownPoint;
    private android.view.Choreographer mChoreographer;
    com.android.internal.widget.remotecompose.core.RemoteClock mClock;
    private int mCount;
    int mDebug;
    float mDensity;
    private boolean mDisable;
    com.android.internal.widget.remotecompose.player.RemoteDocument mDocument;
    int mDoubleTapSlopSquare;
    long mDoubleTapTimeout;
    private long mDownTime;
    private float mDownX;
    private float mDownY;
    private long mDuration;
    private java.lang.String mErrorMessage;
    private boolean mEvalTime;
    private final android.view.Choreographer.FrameCallback mFrameCallback = null;
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener mGlobalLayoutListener = null;
    boolean mHasClickAreas;
    private boolean mHasMoved;
    boolean mInActionDown;
    private boolean mIsAttached;
    private boolean mIsDoubleTap;
    private boolean mIsLongPressPerformed;
    private float mLastAnimationTime;
    long mLastFrameCall;
    long mLastFrameDelay;
    private long mLastUpTime;
    private float mLastUpX;
    private float mLastUpY;
    int[] mLocationCache;
    long mLongPressTimeout;
    long mMaxFrameDelay;
    float mMaxFrameRate;
    private android.view.ViewTreeObserver mRegisteredObserver;
    java.util.Map<java.lang.Integer, java.lang.Object> mResolvedData;
    long mStart;
    int mTheme;
    private long mTime;
    int mTouchSlop;
    boolean mUseGestureDetector;
    private android.view.VelocityTracker mVelocityTracker;
    public RemoteComposeView(android.content.Context p0) { super((android.content.Context)null); }
    public RemoteComposeView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public RemoteComposeView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public RemoteComposeView(android.content.Context p0, android.util.AttributeSet p1, int p2, java.time.Clock p3) { super((android.content.Context)null); }
    private void drawDisable(android.graphics.Canvas p0, java.lang.String p1) {}
    private float getDefaultTextSize() { return 0.0f; }
    private void init(android.content.Context p0) {}
    private int measureDimension(int p0, int p1) { return 0; }
    private void setClock(com.android.internal.widget.remotecompose.core.RemoteClock p0) {}
    private void updateClickAreas() {}
    private void updateGlobalLayoutListener() {}
    private void updateOrigin() {}
    public void addIdActionListener(com.android.internal.widget.remotecompose.player.platform.RemoteComposeView.ClickCallbacks p0) {}
    public void applyUpdate(com.android.internal.widget.remotecompose.player.RemoteDocument p0) {}
    public void checkShaders(com.android.internal.widget.remotecompose.core.CoreDocument.ShaderControl p0) {}
    public void clearLocalBitmap(java.lang.String p0) {}
    public void clearLocalColor(java.lang.String p0) {}
    public void clearLocalFloat(java.lang.String p0) {}
    public void clearLocalInt(java.lang.String p0) {}
    public void clearLocalString(java.lang.String p0) {}
    int copySensorListeners(int[] p0) { return 0; }
    public float getAnimationTime() { return 0.0f; }
    public com.android.internal.widget.remotecompose.player.RemoteDocument getDocument() { return null; }
    public float getEvalTime() { return 0.0f; }
    public java.lang.String[] getNamedColors() { return null; }
    public java.lang.String[] getNamedVariables(int p0) { return null; }
    public com.android.internal.widget.remotecompose.core.RemoteContext getRemoteContext() { return null; }
    public int getTheme() { return 0; }
    public java.util.ArrayList<com.android.internal.widget.remotecompose.core.operations.ColorTheme> getThemedColors() { return null; }
    public boolean isDraggable() { return false; }
    protected void onDraw(android.graphics.Canvas p0) {}
    protected void onMeasure(int p0, int p1) {}
    public void onRequestLayout() {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public void onViewAttachedToWindow(android.view.View p0) {}
    public void onViewDetachedFromWindow(android.view.View p0) {}
    public boolean performClick() { return false; }
    public void setColor(java.lang.String p0, int p1) {}
    public void setDebug(int p0) {}
    public void setDocument(com.android.internal.widget.remotecompose.player.RemoteDocument p0) {}
    public void setExternalFloat(int p0, float p1) {}
    public void setHapticEngine(com.android.internal.widget.remotecompose.core.CoreDocument.HapticEngine p0) {}
    public void setLocalBitmap(java.lang.String p0, android.graphics.Bitmap p1) {}
    public void setLocalColor(java.lang.String p0, int p1) {}
    public void setLocalFloat(java.lang.String p0, java.lang.Float p1) {}
    public void setLocalInt(java.lang.String p0, int p1) {}
    public void setLocalString(java.lang.String p0, java.lang.String p1) {}
    public void setLong(java.lang.String p0, long p1) {}
    public void setResolvedData(java.util.Map<java.lang.Integer, java.lang.Object> p0) {}
    public void setTheme(int p0) {}
    public void setUseChoreographer(boolean p0) {}

    public static interface ClickCallbacks {
        public void click(int p0, java.lang.String p1);
    }
}
