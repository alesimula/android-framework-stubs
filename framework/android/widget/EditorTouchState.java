package android.widget;

public class EditorTouchState {
    private float mInitialDragDirectionXYRatio;
    private boolean mIsOnHandle;
    private long mLastDownMillis;
    private float mLastDownX;
    private float mLastDownY;
    private long mLastUpMillis;
    private float mLastUpX;
    private float mLastUpY;
    private boolean mMovedEnoughForDrag;
    private boolean mMultiTapInSameArea;
    private int mMultiTapStatus;
    public EditorTouchState() {}
    public static float getXYRatio(int p0) { return 0.0f; }
    public static boolean isDistanceWithin(float p0, float p1, float p2, float p3, int p4) { return false; }
    public float getInitialDragDirectionXYRatio() { return 0.0f; }
    public float getLastDownX() { return 0.0f; }
    public float getLastDownY() { return 0.0f; }
    public float getLastUpX() { return 0.0f; }
    public float getLastUpY() { return 0.0f; }
    public boolean isDoubleTap() { return false; }
    public boolean isMovedEnoughForDrag() { return false; }
    public boolean isMultiTap() { return false; }
    public boolean isMultiTapInSameArea() { return false; }
    public boolean isOnHandle() { return false; }
    public boolean isTripleClick() { return false; }
    public void setIsOnHandle(boolean p0) {}
    public void update(android.view.MotionEvent p0, android.view.ViewConfiguration p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MultiTapStatus {
        public static final int DOUBLE_TAP = 2;
        public static final int FIRST_TAP = 1;
        public static final int NONE = 0;
        public static final int TRIPLE_CLICK = 3;
    }
}
