package com.android.internal.widget;

@android.widget.RemoteViews.RemoteView
public final class NotificationProgressBar extends android.widget.ProgressBar implements com.android.internal.widget.NotificationProgressDrawable.BoundsChangeListener {
    private static final boolean DEBUG = false;
    private static final float FADED_OPACITY = 0.5f;
    private static final java.lang.String TAG = "NotificationProgressBar";
    private float mAdjustedProgressFraction;
    private boolean mHasTrackerIcon;
    private android.graphics.drawable.Animatable2.AnimationCallback mIndeterminateAnimationCallback;
    private final android.graphics.Matrix mMatrix = null;
    private com.android.internal.widget.NotificationProgressDrawable mNotificationProgressDrawable;
    private java.util.List<com.android.internal.widget.NotificationProgressBar.Part> mParts;
    private final android.graphics.Rect mProgressDrawableBounds = null;
    private java.util.List<com.android.internal.widget.NotificationProgressDrawable.DrawablePart> mProgressDrawableParts;
    private float mProgressFraction;
    private com.android.internal.widget.NotificationProgressModel mProgressModel;
    private final float mSegMinWidth = 0.0f;
    private final float mSegPointGap = 0.0f;
    private final float mSegSegGap = 0.0f;
    private android.graphics.drawable.Drawable mTracker;
    private android.graphics.Matrix mTrackerDrawMatrix;
    private int mTrackerDrawWidth;
    private final int mTrackerHeight = 0;
    private int mTrackerPos;
    private boolean mTrackerPosIsDirty;
    public NotificationProgressBar(android.content.Context p0) { super((android.content.Context)null); }
    public NotificationProgressBar(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public NotificationProgressBar(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public NotificationProgressBar(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private void configureTrackerBounds() {}
    private static java.util.List<com.android.internal.widget.NotificationProgressBar.Part> convertToViewParts(java.util.Map<java.lang.Integer, android.app.Notification.ProgressStyle.Segment> p0, java.util.Map<java.lang.Integer, android.app.Notification.ProgressStyle.Point> p1, java.util.SortedSet<java.lang.Integer> p2, int p3) { return null; }
    private void drawTracker(android.graphics.Canvas p0) {}
    private static java.util.Map<java.lang.Integer, android.app.Notification.ProgressStyle.Point> generatePositionToPointMap(java.util.List<android.app.Notification.ProgressStyle.Point> p0) { return null; }
    private static java.util.SortedSet<java.lang.Integer> generateSortedPositionSet(java.util.Map<java.lang.Integer, android.app.Notification.ProgressStyle.Segment> p0, java.util.Map<java.lang.Integer, android.app.Notification.ProgressStyle.Point> p1) { return null; }
    private static java.util.Map<java.lang.Integer, android.app.Notification.ProgressStyle.Segment> generateStartToSegmentMap(java.util.List<android.app.Notification.ProgressStyle.Segment> p0) { return null; }
    private int getEndDotColor(java.util.List<android.app.Notification.ProgressStyle.Segment> p0) { return 0; }
    static int getFadedColor(int p0) { return 0; }
    private float getProgressFraction() { return 0.0f; }
    private static float getProgressFraction(int p0, int p1) { return 0.0f; }
    private static float getSegEndOffset(com.android.internal.widget.NotificationProgressBar.Segment p0, com.android.internal.widget.NotificationProgressBar.Part p1, float p2, float p3, float p4, boolean p5) { return 0.0f; }
    private static float getSegStartOffset(com.android.internal.widget.NotificationProgressBar.Part p0, float p1, float p2) { return 0.0f; }
    private static int maybeGetFadedColor(int p0, boolean p1) { return 0; }
    private static android.util.Pair<java.util.List<com.android.internal.widget.NotificationProgressDrawable.DrawablePart>, java.lang.Float> maybeSplitDrawableSegmentsByProgress(java.util.List<com.android.internal.widget.NotificationProgressBar.Part> p0, java.util.List<com.android.internal.widget.NotificationProgressDrawable.DrawablePart> p1, float p2, boolean p3, float p4) { return null; }
    public static android.util.Pair<java.util.List<com.android.internal.widget.NotificationProgressDrawable.DrawablePart>, java.lang.Float> maybeStretchAndRescaleSegments(java.util.List<com.android.internal.widget.NotificationProgressBar.Part> p0, java.util.List<com.android.internal.widget.NotificationProgressDrawable.DrawablePart> p1, float p2, float p3, float p4, boolean p5, float p6) throws com.android.internal.widget.NotificationProgressBar.NotEnoughWidthToFitAllPartsException { return null; }
    private void onMaybeVisualProgressChanged() {}
    public static android.util.Pair<java.util.List<com.android.internal.widget.NotificationProgressDrawable.DrawablePart>, java.lang.Float> processModelAndConvertToFinalDrawableParts(java.util.List<android.app.Notification.ProgressStyle.Segment> p0, java.util.List<android.app.Notification.ProgressStyle.Point> p1, int p2, int p3, float p4, float p5, float p6, float p7, boolean p8, float p9, boolean p10, int p11) throws com.android.internal.widget.NotificationProgressBar.NotEnoughWidthToFitAllPartsException { return null; }
    public static java.util.List<com.android.internal.widget.NotificationProgressBar.Part> processModelAndConvertToViewParts(java.util.List<android.app.Notification.ProgressStyle.Segment> p0, java.util.List<android.app.Notification.ProgressStyle.Point> p1, int p2, int p3) { return null; }
    public static java.util.List<com.android.internal.widget.NotificationProgressDrawable.DrawablePart> processPartsAndConvertToDrawableParts(java.util.List<com.android.internal.widget.NotificationProgressBar.Part> p0, float p1, float p2, float p3, float p4, boolean p5, int p6) { return null; }
    private void setTracker(android.graphics.drawable.Drawable p0) {}
    private void setTrackerPos(int p0, android.graphics.drawable.Drawable p1, float p2, int p3) {}
    private boolean shouldLoopIndeterminateAnimation() { return false; }
    private static java.util.Map<java.lang.Integer, android.app.Notification.ProgressStyle.Segment> splitSegmentsByPoints(java.util.Map<java.lang.Integer, android.app.Notification.ProgressStyle.Segment> p0, java.util.SortedSet<java.lang.Integer> p1, int p2) { return null; }
    private static boolean trackerSizeChanged(android.graphics.drawable.Drawable p0, android.graphics.drawable.Drawable p1) { return false; }
    private void updateDrawableParts() {}
    private void updateTrackerAndBarPos(int p0, int p1) {}
    public void drawableHotspotChanged(float p0, float p1) {}
    protected void drawableStateChanged() {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public com.android.internal.widget.NotificationProgressDrawable getNotificationProgressDrawable() { return null; }
    public void jumpDrawablesToCurrentState() {}
    protected void onDraw(android.graphics.Canvas p0) {}
    public void onDrawableBoundsChanged() {}
    protected void onMeasure(int p0, int p1) {}
    public void onResolveDrawables(int p0) {}
    public void onRtlPropertiesChanged(int p0) {}
    protected void onSizeChanged(int p0, int p1, int p2, int p3) {}
    public void setIndeterminateDrawable(android.graphics.drawable.Drawable p0) {}
    public void setMax(int p0) {}
    public void setMin(int p0) {}
    public void setProgress(int p0) {}
    public void setProgress(int p0, boolean p1) {}
    @android.view.RemotableViewMethod
    public void setProgressModel(android.os.Bundle p0) {}
    @android.view.RemotableViewMethod(asyncImpl="setProgressTrackerIconAsync")
    public void setProgressTrackerIcon(android.graphics.drawable.Icon p0) {}
    public java.lang.Runnable setProgressTrackerIconAsync(android.graphics.drawable.Icon p0) { return null; }
    protected boolean verifyDrawable(android.graphics.drawable.Drawable p0) { return false; }

    public static class NotEnoughWidthToFitAllPartsException extends java.lang.Exception {
        public NotEnoughWidthToFitAllPartsException(java.lang.String p0) { super(); }
    }

    public static interface Part {
    }

    public static final class Point implements com.android.internal.widget.NotificationProgressBar.Part {
        private final int mColor = 0;
        public Point(int p0) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static final class Segment implements com.android.internal.widget.NotificationProgressBar.Part {
        private final int mColor = 0;
        private float mEnd;
        private final boolean mFaded = false;
        private final float mFraction = 0.0f;
        private float mStart;
        public Segment(float p0, int p1) {}
        public Segment(float p0, int p1, boolean p2) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public float getWidth() { return 0.0f; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }
}
