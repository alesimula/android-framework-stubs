package android.widget;

public abstract class AbsSeekBar extends android.widget.ProgressBar {
    private static final int NO_ALPHA = 255;
    private float mDisabledAlpha;
    private final java.util.List<android.graphics.Rect> mGestureExclusionRects = null;
    private boolean mHasThumbBlendMode;
    private boolean mHasThumbTint;
    private boolean mHasTickMarkBlendMode;
    private boolean mHasTickMarkTint;
    private boolean mIsDragging;
    boolean mIsUserSeekable;
    private int mKeyProgressIncrement;
    private int mScaledTouchSlop;
    private boolean mSplitTrack;
    private final android.graphics.Rect mTempRect = null;
    private android.graphics.drawable.Drawable mThumb;
    private android.graphics.BlendMode mThumbBlendMode;
    private int mThumbExclusionMaxSize;
    private int mThumbOffset;
    private final android.graphics.Rect mThumbRect = null;
    private android.content.res.ColorStateList mThumbTintList;
    private android.graphics.drawable.Drawable mTickMark;
    private android.graphics.BlendMode mTickMarkBlendMode;
    private android.content.res.ColorStateList mTickMarkTintList;
    private float mTouchDownX;
    float mTouchProgressOffset;
    private float mTouchThumbOffset;
    private java.util.List<android.graphics.Rect> mUserGestureExclusionRects;
    public AbsSeekBar(android.content.Context p0) { super((android.content.Context)null); }
    public AbsSeekBar(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public AbsSeekBar(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public AbsSeekBar(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private void applyThumbTint() {}
    private void applyTickMarkTint() {}
    private void attemptClaimDrag() {}
    private float getScale() { return 0.0f; }
    private void setHotspot(float p0, float p1) {}
    private void setThumbPos(int p0, android.graphics.drawable.Drawable p1, float p2, int p3) {}
    private void startDrag(android.view.MotionEvent p0) {}
    private void trackTouchEvent(android.view.MotionEvent p0) {}
    private void updateGestureExclusionRects() {}
    private void updateThumbAndTrackPos(int p0, int p1) {}
    boolean canUserSetProgress() { return false; }
    void drawThumb(android.graphics.Canvas p0) {}
    protected void drawTickMarks(android.graphics.Canvas p0) {}
    void drawTrack(android.graphics.Canvas p0) {}
    public void drawableHotspotChanged(float p0, float p1) {}
    protected void drawableStateChanged() {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public int getKeyProgressIncrement() { return 0; }
    public boolean getSplitTrack() { return false; }
    public android.graphics.drawable.Drawable getThumb() { return null; }
    public int getThumbOffset() { return 0; }
    public android.graphics.BlendMode getThumbTintBlendMode() { return null; }
    public android.content.res.ColorStateList getThumbTintList() { return null; }
    public android.graphics.PorterDuff.Mode getThumbTintMode() { return null; }
    public android.graphics.drawable.Drawable getTickMark() { return null; }
    public android.graphics.BlendMode getTickMarkTintBlendMode() { return null; }
    public android.content.res.ColorStateList getTickMarkTintList() { return null; }
    public android.graphics.PorterDuff.Mode getTickMarkTintMode() { return null; }
    public void growRectTo(android.graphics.Rect p0, int p1) {}
    public void jumpDrawablesToCurrentState() {}
    protected void onDraw(android.graphics.Canvas p0) {}
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    void onKeyChange() {}
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    protected void onMeasure(int p0, int p1) {}
    public void onResolveDrawables(int p0) {}
    public void onRtlPropertiesChanged(int p0) {}
    protected void onSizeChanged(int p0, int p1, int p2, int p3) {}
    void onStartTrackingTouch() {}
    void onStopTrackingTouch() {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    void onVisualProgressChanged(int p0, float p1) {}
    public boolean performAccessibilityActionInternal(int p0, android.os.Bundle p1) { return false; }
    public void setKeyProgressIncrement(int p0) {}
    public void setMax(int p0) {}
    public void setMin(int p0) {}
    public void setSplitTrack(boolean p0) {}
    public void setSystemGestureExclusionRects(java.util.List<android.graphics.Rect> p0) {}
    public void setThumb(android.graphics.drawable.Drawable p0) {}
    public void setThumbOffset(int p0) {}
    public void setThumbTintBlendMode(android.graphics.BlendMode p0) {}
    public void setThumbTintList(android.content.res.ColorStateList p0) {}
    public void setThumbTintMode(android.graphics.PorterDuff.Mode p0) {}
    public void setTickMark(android.graphics.drawable.Drawable p0) {}
    public void setTickMarkTintBlendMode(android.graphics.BlendMode p0) {}
    public void setTickMarkTintList(android.content.res.ColorStateList p0) {}
    public void setTickMarkTintMode(android.graphics.PorterDuff.Mode p0) {}
    protected boolean verifyDrawable(android.graphics.drawable.Drawable p0) { return false; }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.AbsSeekBar> {
        private boolean mPropertiesMapped;
        private int mThumbTintId;
        private int mThumbTintModeId;
        private int mTickMarkTintBlendModeId;
        private int mTickMarkTintId;
        private int mTickMarkTintModeId;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.AbsSeekBar p0, android.view.inspector.PropertyReader p1) {}
    }
}
