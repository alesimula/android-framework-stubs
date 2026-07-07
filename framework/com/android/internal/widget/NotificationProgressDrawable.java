package com.android.internal.widget;

public final class NotificationProgressDrawable extends android.graphics.drawable.Drawable {
    private static final java.lang.String TAG = "NotifProgressDrawable";
    private int mAlpha;
    private com.android.internal.widget.NotificationProgressDrawable.BoundsChangeListener mBoundsChangeListener;
    private int mEndDotColor;
    private final android.graphics.Paint mFillPaint = null;
    private boolean mMutated;
    private final java.util.ArrayList<com.android.internal.widget.NotificationProgressDrawable.DrawablePart> mParts = null;
    private final android.graphics.RectF mPointRectF = null;
    private final android.graphics.RectF mSegRectF = null;
    private com.android.internal.widget.NotificationProgressDrawable.State mState;
    public NotificationProgressDrawable() { super(); }
    private NotificationProgressDrawable(com.android.internal.widget.NotificationProgressDrawable.State p0, android.content.res.Resources p1) { super(); }
    private void applyThemeChildElements(android.content.res.Resources.Theme p0) {}
    private void inflateChildElements(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    static int resolveDensity(android.content.res.Resources p0, int p1) { return 0; }
    private static float scaleFromDensity(float p0, int p1, int p2) { return 0.0f; }
    private static int scaleFromDensity(int p0, int p1, int p2, boolean p3) { return 0; }
    private void updateLocalState() {}
    private void updatePointsFromTypedArray(android.content.res.TypedArray p0) {}
    private void updateSegmentsFromTypedArray(android.content.res.TypedArray p0) {}
    public void applyTheme(android.content.res.Resources.Theme p0) {}
    public boolean canApplyTheme() { return false; }
    public void clearMutated() {}
    public void draw(android.graphics.Canvas p0) {}
    public int getAlpha() { return 0; }
    public int getChangingConfigurations() { return 0; }
    public android.graphics.drawable.Drawable.ConstantState getConstantState() { return null; }
    public int getOpacity() { return 0; }
    public float getPointRadius() { return 0.0f; }
    public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public android.graphics.drawable.Drawable mutate() { return null; }
    protected void onBoundsChange(android.graphics.Rect p0) {}
    public void setAlpha(int p0) {}
    public void setBoundsChangeListener(com.android.internal.widget.NotificationProgressDrawable.BoundsChangeListener p0) {}
    public void setColorFilter(android.graphics.ColorFilter p0) {}
    public void setFadedSegmentHeight(float p0) {}
    public void setParts(java.util.List<com.android.internal.widget.NotificationProgressDrawable.DrawablePart> p0) {}
    public void setParts(com.android.internal.widget.NotificationProgressDrawable.DrawablePart... p0) {}
    public void setSegmentHeight(float p0) {}
    public void updateEndDotColor(int p0) {}

    public static interface BoundsChangeListener {
        public void onDrawableBoundsChanged();
    }

    public static abstract class DrawablePart {
        protected final int mColor = 0;
        protected float mEnd;
        protected float mStart;
        protected DrawablePart(float p0, float p1, int p2) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int getColor() { return 0; }
        public float getEnd() { return 0.0f; }
        public float getStart() { return 0.0f; }
        public float getWidth() { return 0.0f; }
        public int hashCode() { return 0; }
        public void setEnd(float p0) {}
        public void setStart(float p0) {}
    }

    public static final class DrawablePoint extends com.android.internal.widget.NotificationProgressDrawable.DrawablePart {
        public DrawablePoint(float p0, float p1, int p2) { super(0.0f, 0.0f, 0); }
        public java.lang.String toString() { return null; }
    }

    public static final class DrawableSegment extends com.android.internal.widget.NotificationProgressDrawable.DrawablePart {
        private final boolean mFaded = false;
        public DrawableSegment(float p0, float p1, int p2) { super(0.0f, 0.0f, 0); }
        public DrawableSegment(float p0, float p1, int p2, boolean p3) { super(0.0f, 0.0f, 0); }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    static final class State extends android.graphics.drawable.Drawable.ConstantState {
        int mChangingConfigurations;
        int mDensity;
        float mFadedSegmentHeight;
        float mPointRadius;
        float mPointRectCornerRadius;
        float mPointRectInset;
        float mSegmentCornerRadius;
        float mSegmentHeight;
        int[] mThemeAttrs;
        int[] mThemeAttrsPoints;
        int[] mThemeAttrsSegments;
        State() { super(); }
        State(com.android.internal.widget.NotificationProgressDrawable.State p0, android.content.res.Resources p1) { super(); }
        private void applyDensityScaling(int p0, int p1) {}
        public boolean canApplyTheme() { return false; }
        public int getChangingConfigurations() { return 0; }
        public android.graphics.drawable.Drawable newDrawable() { return null; }
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p0) { return null; }
        public void setDensity(int p0) {}
    }
}
