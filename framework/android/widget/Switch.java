package android.widget;

@android.widget.RemoteViews.RemoteView
public class Switch extends android.widget.CompoundButton {
    private static final int[] CHECKED_STATE_SET = null;
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    private static final int THUMB_ANIMATION_DURATION = 250;
    private static final android.util.FloatProperty<android.widget.Switch> THUMB_POS = null;
    private static final int TOUCH_MODE_DOWN = 1;
    private static final int TOUCH_MODE_DRAGGING = 2;
    private static final int TOUCH_MODE_IDLE = 0;
    private boolean mHasThumbTint;
    private boolean mHasThumbTintMode;
    private boolean mHasTrackTint;
    private boolean mHasTrackTintMode;
    private int mMinFlingVelocity;
    private android.text.Layout mOffLayout;
    private android.text.Layout mOnLayout;
    private android.animation.ObjectAnimator mPositionAnimator;
    private boolean mShowText;
    private boolean mSplitTrack;
    private int mSwitchBottom;
    private int mSwitchHeight;
    private int mSwitchLeft;
    private int mSwitchMinWidth;
    private int mSwitchPadding;
    private int mSwitchRight;
    private int mSwitchTop;
    private android.text.method.TransformationMethod2 mSwitchTransformationMethod;
    private int mSwitchWidth;
    private final android.graphics.Rect mTempRect = null;
    private android.content.res.ColorStateList mTextColors;
    private java.lang.CharSequence mTextOff;
    private java.lang.CharSequence mTextOn;
    private android.text.TextPaint mTextPaint;
    private android.graphics.BlendMode mThumbBlendMode;
    private android.graphics.drawable.Drawable mThumbDrawable;
    private float mThumbPosition;
    private int mThumbTextPadding;
    private android.content.res.ColorStateList mThumbTintList;
    private int mThumbWidth;
    private int mTouchMode;
    private int mTouchSlop;
    private float mTouchX;
    private float mTouchY;
    private android.graphics.BlendMode mTrackBlendMode;
    private android.graphics.drawable.Drawable mTrackDrawable;
    private android.content.res.ColorStateList mTrackTintList;
    private boolean mUseFallbackLineSpacing;
    private android.view.VelocityTracker mVelocityTracker;
    public Switch(android.content.Context p0) { super((android.content.Context)null); }
    public Switch(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public Switch(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public Switch(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private void animateThumbToCheckedState(boolean p0) {}
    private void applyThumbTint() {}
    private void applyTrackTint() {}
    private void cancelPositionAnimator() {}
    private void cancelSuperTouch(android.view.MotionEvent p0) {}
    private boolean getTargetCheckedState() { return false; }
    private int getThumbOffset() { return 0; }
    private int getThumbScrollRange() { return 0; }
    private boolean hitThumb(float p0, float p1) { return false; }
    private android.text.Layout makeLayout(java.lang.CharSequence p0) { return null; }
    private void setSwitchTypefaceByIndex(int p0, int p1) {}
    private void setThumbPosition(float p0) {}
    private void stopDrag(android.view.MotionEvent p0) {}
    public void draw(android.graphics.Canvas p0) {}
    public void drawableHotspotChanged(float p0, float p1) {}
    protected void drawableStateChanged() {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    protected java.lang.CharSequence getButtonStateDescription() { return null; }
    public int getCompoundPaddingLeft() { return 0; }
    public int getCompoundPaddingRight() { return 0; }
    public boolean getShowText() { return false; }
    public boolean getSplitTrack() { return false; }
    public int getSwitchMinWidth() { return 0; }
    public int getSwitchPadding() { return 0; }
    public java.lang.CharSequence getTextOff() { return null; }
    public java.lang.CharSequence getTextOn() { return null; }
    public android.graphics.drawable.Drawable getThumbDrawable() { return null; }
    public int getThumbTextPadding() { return 0; }
    public android.graphics.BlendMode getThumbTintBlendMode() { return null; }
    public android.content.res.ColorStateList getThumbTintList() { return null; }
    public android.graphics.PorterDuff.Mode getThumbTintMode() { return null; }
    public android.graphics.drawable.Drawable getTrackDrawable() { return null; }
    public android.graphics.BlendMode getTrackTintBlendMode() { return null; }
    public android.content.res.ColorStateList getTrackTintList() { return null; }
    public android.graphics.PorterDuff.Mode getTrackTintMode() { return null; }
    public void jumpDrawablesToCurrentState() {}
    protected int[] onCreateDrawableState(int p0) { return null; }
    protected void onDraw(android.graphics.Canvas p0) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public void onMeasure(int p0, int p1) {}
    public void onPopulateAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) {}
    protected void onProvideStructure(android.view.ViewStructure p0, int p1, int p2) {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public void setChecked(boolean p0) {}
    @android.view.RemotableViewMethod
    public void setShowText(boolean p0) {}
    @android.view.RemotableViewMethod
    public void setSplitTrack(boolean p0) {}
    @android.view.RemotableViewMethod
    public void setSwitchMinWidth(int p0) {}
    @android.view.RemotableViewMethod
    public void setSwitchPadding(int p0) {}
    public void setSwitchTextAppearance(android.content.Context p0, int p1) {}
    public void setSwitchTypeface(android.graphics.Typeface p0) {}
    public void setSwitchTypeface(android.graphics.Typeface p0, int p1) {}
    @android.view.RemotableViewMethod
    public void setTextOff(java.lang.CharSequence p0) {}
    @android.view.RemotableViewMethod
    public void setTextOn(java.lang.CharSequence p0) {}
    public void setThumbDrawable(android.graphics.drawable.Drawable p0) {}
    @android.view.RemotableViewMethod(asyncImpl="setThumbIconAsync")
    public void setThumbIcon(android.graphics.drawable.Icon p0) {}
    public java.lang.Runnable setThumbIconAsync(android.graphics.drawable.Icon p0) { return null; }
    @android.view.RemotableViewMethod(asyncImpl="setThumbResourceAsync")
    public void setThumbResource(int p0) {}
    public java.lang.Runnable setThumbResourceAsync(int p0) { return null; }
    @android.view.RemotableViewMethod
    public void setThumbTextPadding(int p0) {}
    @android.view.RemotableViewMethod
    public void setThumbTintBlendMode(android.graphics.BlendMode p0) {}
    @android.view.RemotableViewMethod
    public void setThumbTintList(android.content.res.ColorStateList p0) {}
    public void setThumbTintMode(android.graphics.PorterDuff.Mode p0) {}
    public void setTrackDrawable(android.graphics.drawable.Drawable p0) {}
    @android.view.RemotableViewMethod(asyncImpl="setTrackIconAsync")
    public void setTrackIcon(android.graphics.drawable.Icon p0) {}
    public java.lang.Runnable setTrackIconAsync(android.graphics.drawable.Icon p0) { return null; }
    @android.view.RemotableViewMethod(asyncImpl="setTrackResourceAsync")
    public void setTrackResource(int p0) {}
    public java.lang.Runnable setTrackResourceAsync(int p0) { return null; }
    @android.view.RemotableViewMethod
    public void setTrackTintBlendMode(android.graphics.BlendMode p0) {}
    @android.view.RemotableViewMethod
    public void setTrackTintList(android.content.res.ColorStateList p0) {}
    public void setTrackTintMode(android.graphics.PorterDuff.Mode p0) {}
    public void toggle() {}
    protected boolean verifyDrawable(android.graphics.drawable.Drawable p0) { return false; }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.Switch> {
        private boolean mPropertiesMapped;
        private int mShowTextId;
        private int mSplitTrackId;
        private int mSwitchMinWidthId;
        private int mSwitchPaddingId;
        private int mTextOffId;
        private int mTextOnId;
        private int mThumbId;
        private int mThumbTextPaddingId;
        private int mThumbTintBlendModeId;
        private int mThumbTintId;
        private int mThumbTintModeId;
        private int mTrackId;
        private int mTrackTintBlendModeId;
        private int mTrackTintId;
        private int mTrackTintModeId;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.Switch p0, android.view.inspector.PropertyReader p1) {}
    }
}
