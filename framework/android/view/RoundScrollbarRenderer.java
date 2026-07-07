package android.view;

public class RoundScrollbarRenderer {
    public static final java.lang.String BLUECHIP_ENABLED_SYSPROP = "persist.cw_build.bluechip.enabled";
    private static final int DEFAULT_THUMB_COLOR = -3750201;
    private static final int DEFAULT_TRACK_COLOR = -13684431;
    private static final float GAP_BETWEEN_TRACK_AND_THUMB_DP = 3.0f;
    private static final float MAX_SCROLLBAR_ANGLE_SWIPE = 20.15999984741211f;
    private static final float MIN_SCROLLBAR_ANGLE_SWIPE = 8.640000343322754f;
    private static final float OUTER_PADDING_DP = 2.0f;
    private static final float RESIZING_RATE = 0.800000011920929f;
    private static final int RESIZING_THRESHOLD_PX = 20;
    private static final float SCROLLBAR_ANGLE_RANGE = 28.799999237060547f;
    private float mCurrentScrollDiff;
    private boolean mDrawToLeft;
    private final float mGapBetweenThumbAndTrackPx = 0.0f;
    private float mGapBetweenTrackAndThumbAsDegrees;
    private final float mInset = 0.0f;
    private float mMaxScrollDiff;
    private final android.view.View mParent = null;
    private float mPreviousCurrentScroll;
    private float mPreviousMaxScroll;
    private final android.graphics.RectF mRect = null;
    private final android.graphics.Paint mThumbPaint = null;
    private float mThumbStrokeWidthAsDegrees;
    private final android.graphics.Paint mTrackPaint = null;
    private final boolean mUseRefactoredRoundScrollbar = false;
    public RoundScrollbarRenderer(android.view.View p0) {}
    private static int applyAlpha(int p0, float p1) { return 0; }
    private void applyThumbColor(float p0) {}
    private void applyTrackColor(float p0) {}
    private static float clamp(float p0, float p1, float p2) { return 0.0f; }
    private float computeScrollExtent(float p0, float p1) { return 0.0f; }
    private float computeStartAngle(float p0, float p1, float p2, float p3) { return 0.0f; }
    private float computeSweepAngle(float p0, float p1) { return 0.0f; }
    private float dpToPx(float p0) { return 0.0f; }
    private void draw(android.graphics.Canvas p0, float p1, float p2, float p3) {}
    private void drawArc(android.graphics.Canvas p0, float p1, float p2, android.graphics.Paint p3) {}
    private void drawRoundScrollbars(android.graphics.Canvas p0, float p1, float p2, float p3) {}
    private void drawTrack(android.graphics.Canvas p0, float p1, float p2, float p3) {}
    private static float getKiteEdge(float p0, float p1) { return 0.0f; }
    private static float getVertexAngle(float p0, float p1) { return 0.0f; }
    private void resizeGradually(float p0, float p1) {}
    private void updateBounds(android.graphics.Rect p0) {}
    public void drawRoundScrollbars(android.graphics.Canvas p0, float p1, android.graphics.Rect p2, boolean p3) {}
    void getRoundVerticalScrollBarBounds(android.graphics.Rect p0) {}
}
