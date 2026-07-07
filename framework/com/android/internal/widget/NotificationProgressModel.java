package com.android.internal.widget;

public final class NotificationProgressModel {
    public static final int INVALID_COLOR = 0;
    private static final java.lang.String KEY_INDETERMINATE_COLOR = "indeterminateColor";
    private static final java.lang.String KEY_IS_STYLED_BY_PROGRESS = "isStyledByProgress";
    private static final java.lang.String KEY_POINTS = "points";
    private static final java.lang.String KEY_PROGRESS = "progress";
    private static final java.lang.String KEY_SEGMENTS = "segments";
    private static final java.lang.String KEY_SEGMENTS_FALLBACK_COLOR = "segmentsFallColor";
    private final int mIndeterminateColor = 0;
    private final boolean mIsStyledByProgress = false;
    private final java.util.List<android.app.Notification.ProgressStyle.Point> mPoints = null;
    private final int mProgress = 0;
    private final java.util.List<android.app.Notification.ProgressStyle.Segment> mSegments = null;
    private final int mSegmentsFallbackColor = 0;
    public NotificationProgressModel(int p0) {}
    public NotificationProgressModel(java.util.List<android.app.Notification.ProgressStyle.Segment> p0, java.util.List<android.app.Notification.ProgressStyle.Point> p1, int p2, boolean p3, int p4) {}
    public static com.android.internal.widget.NotificationProgressModel fromBundle(android.os.Bundle p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getIndeterminateColor() { return 0; }
    public java.util.List<android.app.Notification.ProgressStyle.Point> getPoints() { return null; }
    public int getProgress() { return 0; }
    public int getProgressMax() { return 0; }
    public java.util.List<android.app.Notification.ProgressStyle.Segment> getSegments() { return null; }
    public int getSegmentsFallbackColor() { return 0; }
    public int hashCode() { return 0; }
    public boolean isIndeterminate() { return false; }
    public boolean isStyledByProgress() { return false; }
    public android.os.Bundle toBundle() { return null; }
    public java.lang.String toString() { return null; }
}
