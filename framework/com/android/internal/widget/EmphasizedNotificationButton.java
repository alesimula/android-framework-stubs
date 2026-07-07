package com.android.internal.widget;

@android.widget.RemoteViews.RemoteView
public class EmphasizedNotificationButton extends android.widget.Button {
    private static final java.lang.String FIRST_STRONG_ISOLATE = "⁨";
    private static final java.lang.String IMAGE_SPAN_TEXT = "�";
    private static final java.lang.String LEFT_TO_RIGHT_ISOLATE = "⁦";
    private static final java.lang.String POP_DIRECTIONAL_ISOLATE = "⁩";
    private static final java.lang.String RIGHT_TO_LEFT_ISOLATE = "⁧";
    private static final java.lang.String SPACER_SPAN_TEXT = " ";
    private static final java.lang.String TAG = "EmphasizedNotificationButton";
    private final android.graphics.drawable.GradientDrawable mBackground = null;
    private boolean mGluePending;
    private int mGluedLayoutDirection;
    private int mIconSize;
    private android.graphics.drawable.Drawable mIconToGlue;
    private int mInitialDrawablePadding;
    private java.lang.CharSequence mLabelToGlue;
    private boolean mPriority;
    private final android.graphics.drawable.RippleDrawable mRipple = null;
    public EmphasizedNotificationButton(android.content.Context p0) { super((android.content.Context)null); }
    public EmphasizedNotificationButton(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public EmphasizedNotificationButton(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public EmphasizedNotificationButton(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private void appendSpan(android.text.SpannableStringBuilder p0, java.lang.CharSequence p1, java.lang.Object p2) {}
    private void glueIconAndLabel(int p0) {}
    private void glueIconAndLabelIfNeeded() {}
    private void logIfTextDirectionNotFirstStrong() {}
    private void prepareIcon(android.graphics.drawable.Drawable p0) {}
    private void setIconToGlue(android.graphics.drawable.Drawable p0) {}
    private void setImageDrawable(android.graphics.drawable.Drawable p0) {}
    private void setLabelToGlue(java.lang.CharSequence p0) {}
    public android.content.res.ColorStateList getButtonBackground() { return null; }
    @android.view.RemotableViewMethod(asyncImpl="glueIconAsync")
    public void glueIcon(android.graphics.drawable.Icon p0) {}
    @android.view.RemotableViewMethod
    public java.lang.Runnable glueIconAsync(android.graphics.drawable.Icon p0) { return null; }
    @android.view.RemotableViewMethod(asyncImpl="glueLabelAsync")
    public void glueLabel(java.lang.CharSequence p0) {}
    @android.view.RemotableViewMethod
    public java.lang.Runnable glueLabelAsync(java.lang.CharSequence p0) { return null; }
    public boolean isPriority() { return false; }
    public void onRtlPropertiesChanged(int p0) {}
    @android.view.RemotableViewMethod
    public void setButtonBackground(android.content.res.ColorStateList p0) {}
    @android.view.RemotableViewMethod
    public void setButtonBorder(android.content.res.ColorStateList p0) {}
    @android.view.RemotableViewMethod(asyncImpl="setImageIconAsync")
    public void setImageIcon(android.graphics.drawable.Icon p0) {}
    @android.view.RemotableViewMethod
    public java.lang.Runnable setImageIconAsync(android.graphics.drawable.Icon p0) { return null; }
    @android.view.RemotableViewMethod
    public void setIsPriority(boolean p0) {}
    @android.view.RemotableViewMethod
    public void setRippleColor(android.content.res.ColorStateList p0) {}

    private static class CenterBesideImageSpan extends android.text.style.MetricAffectingSpan {
        private static final java.lang.String TAG = "CenterBesideImageSpan";
        private int mBaselineShiftOffset;
        private int mImageHeight;
        private boolean mMeasured;
        CenterBesideImageSpan(int p0) { super(); }
        public void updateDrawState(android.text.TextPaint p0) {}
        public void updateMeasureState(android.text.TextPaint p0) {}
    }

    private static class SpacerSpan extends android.text.style.ReplacementSpan {
        private static final java.lang.String TAG = "SpacerSpan";
        private int mWidth;
        SpacerSpan(int p0) { super(); }
        public void draw(android.graphics.Canvas p0, java.lang.CharSequence p1, int p2, int p3, float p4, int p5, int p6, int p7, android.graphics.Paint p8) {}
        public int getSize(android.graphics.Paint p0, java.lang.CharSequence p1, int p2, int p3, android.graphics.Paint.FontMetricsInt p4) { return 0; }
    }
}
