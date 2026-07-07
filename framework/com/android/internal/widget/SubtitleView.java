package com.android.internal.widget;

public class SubtitleView extends android.view.View {
    private static final int COLOR_BEVEL_DARK = -2147483648;
    private static final int COLOR_BEVEL_LIGHT = -2130706433;
    private static final float INNER_PADDING_RATIO = 0.125f;
    private android.text.Layout.Alignment mAlignment;
    private int mBackgroundColor;
    private final float mCornerRadius = 0.0f;
    private int mEdgeColor;
    private int mEdgeType;
    private int mForegroundColor;
    private boolean mHasMeasurements;
    private int mInnerPaddingX;
    private int mLastMeasuredWidth;
    private android.text.StaticLayout mLayout;
    private final android.graphics.RectF mLineBounds = null;
    private final float mOutlineWidth = 0.0f;
    private android.graphics.Paint mPaint;
    private final float mShadowOffsetX = 0.0f;
    private final float mShadowOffsetY = 0.0f;
    private final float mShadowRadius = 0.0f;
    private float mSpacingAdd;
    private float mSpacingMult;
    private final android.text.SpannableStringBuilder mText = null;
    private android.text.TextPaint mTextPaint;
    public SubtitleView(android.content.Context p0) { super((android.content.Context)null); }
    public SubtitleView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public SubtitleView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public SubtitleView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private boolean computeMeasurements(int p0) { return false; }
    protected void onDraw(android.graphics.Canvas p0) {}
    public void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onMeasure(int p0, int p1) {}
    public void setAlignment(android.text.Layout.Alignment p0) {}
    public void setBackgroundColor(int p0) {}
    public void setEdgeColor(int p0) {}
    public void setEdgeType(int p0) {}
    public void setForegroundColor(int p0) {}
    public void setStyle(int p0) {}
    public void setText(int p0) {}
    public void setText(java.lang.CharSequence p0) {}
    public void setTextSize(float p0) {}
    public void setTypeface(android.graphics.Typeface p0) {}
}
