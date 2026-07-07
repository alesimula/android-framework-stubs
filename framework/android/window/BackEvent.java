package android.window;

public final class BackEvent {
    public static final int EDGE_LEFT = 0;
    public static final int EDGE_NONE = 2;
    public static final int EDGE_RIGHT = 1;
    private final long mFrameTimeMillis = 0L;
    private final float mProgress = 0.0f;
    private final int mSwipeEdge = 0;
    private final float mTouchX = 0.0f;
    private final float mTouchY = 0.0f;
    public BackEvent(float p0, float p1, float p2, int p3) {}
    public BackEvent(float p0, float p1, float p2, int p3, long p4) {}
    public static android.window.BackEvent fromBackMotionEvent(android.window.BackMotionEvent p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public long getFrameTimeMillis() { return 0L; }
    public float getProgress() { return 0.0f; }
    public int getSwipeEdge() { return 0; }
    public float getTouchX() { return 0.0f; }
    public float getTouchY() { return 0.0f; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SwipeEdge {
    }
}
