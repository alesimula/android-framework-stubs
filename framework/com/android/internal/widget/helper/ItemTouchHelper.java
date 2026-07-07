package com.android.internal.widget.helper;

public class ItemTouchHelper extends com.android.internal.widget.RecyclerView.ItemDecoration implements com.android.internal.widget.RecyclerView.OnChildAttachStateChangeListener {
    static final int ACTION_MODE_DRAG_MASK = 16711680;
    private static final int ACTION_MODE_IDLE_MASK = 255;
    static final int ACTION_MODE_SWIPE_MASK = 65280;
    public static final int ACTION_STATE_DRAG = 2;
    public static final int ACTION_STATE_IDLE = 0;
    public static final int ACTION_STATE_SWIPE = 1;
    static final int ACTIVE_POINTER_ID_NONE = -1;
    public static final int ANIMATION_TYPE_DRAG = 8;
    public static final int ANIMATION_TYPE_SWIPE_CANCEL = 4;
    public static final int ANIMATION_TYPE_SWIPE_SUCCESS = 2;
    static final boolean DEBUG = false;
    static final int DIRECTION_FLAG_COUNT = 8;
    public static final int DOWN = 2;
    public static final int END = 32;
    public static final int LEFT = 4;
    private static final int PIXELS_PER_SECOND = 1000;
    public static final int RIGHT = 8;
    public static final int START = 16;
    static final java.lang.String TAG = "ItemTouchHelper";
    public static final int UP = 1;
    int mActionState;
    int mActivePointerId;
    com.android.internal.widget.helper.ItemTouchHelper.Callback mCallback;
    private com.android.internal.widget.RecyclerView.ChildDrawingOrderCallback mChildDrawingOrderCallback;
    private java.util.List<java.lang.Integer> mDistances;
    private long mDragScrollStartTimeInMs;
    float mDx;
    float mDy;
    android.view.GestureDetector mGestureDetector;
    float mInitialTouchX;
    float mInitialTouchY;
    float mMaxSwipeVelocity;
    private final com.android.internal.widget.RecyclerView.OnItemTouchListener mOnItemTouchListener = null;
    android.view.View mOverdrawChild;
    int mOverdrawChildPosition;
    final java.util.List<android.view.View> mPendingCleanup = null;
    java.util.List<com.android.internal.widget.helper.ItemTouchHelper.RecoverAnimation> mRecoverAnimations;
    com.android.internal.widget.RecyclerView mRecyclerView;
    final java.lang.Runnable mScrollRunnable = null;
    com.android.internal.widget.RecyclerView.ViewHolder mSelected;
    int mSelectedFlags;
    float mSelectedStartX;
    float mSelectedStartY;
    private int mSlop;
    private java.util.List<com.android.internal.widget.RecyclerView.ViewHolder> mSwapTargets;
    float mSwipeEscapeVelocity;
    private final float[] mTmpPosition = null;
    private android.graphics.Rect mTmpRect;
    android.view.VelocityTracker mVelocityTracker;
    public ItemTouchHelper(com.android.internal.widget.helper.ItemTouchHelper.Callback p0) { super(); }
    private void addChildDrawingOrderCallback() {}
    private int checkHorizontalSwipe(com.android.internal.widget.RecyclerView.ViewHolder p0, int p1) { return 0; }
    private int checkVerticalSwipe(com.android.internal.widget.RecyclerView.ViewHolder p0, int p1) { return 0; }
    private void destroyCallbacks() {}
    private java.util.List<com.android.internal.widget.RecyclerView.ViewHolder> findSwapTargets(com.android.internal.widget.RecyclerView.ViewHolder p0) { return null; }
    private com.android.internal.widget.RecyclerView.ViewHolder findSwipedView(android.view.MotionEvent p0) { return null; }
    private void getSelectedDxDy(float[] p0) {}
    private static boolean hitTest(android.view.View p0, float p1, float p2, float p3, float p4) { return false; }
    private void initGestureDetector() {}
    private void releaseVelocityTracker() {}
    private void setupCallbacks() {}
    private int swipeIfNecessary(com.android.internal.widget.RecyclerView.ViewHolder p0) { return 0; }
    public void attachToRecyclerView(com.android.internal.widget.RecyclerView p0) {}
    boolean checkSelectForSwipe(int p0, android.view.MotionEvent p1, int p2) { return false; }
    int endRecoverAnimation(com.android.internal.widget.RecyclerView.ViewHolder p0, boolean p1) { return 0; }
    com.android.internal.widget.helper.ItemTouchHelper.RecoverAnimation findAnimation(android.view.MotionEvent p0) { return null; }
    android.view.View findChildView(android.view.MotionEvent p0) { return null; }
    public void getItemOffsets(android.graphics.Rect p0, android.view.View p1, com.android.internal.widget.RecyclerView p2, com.android.internal.widget.RecyclerView.State p3) {}
    boolean hasRunningRecoverAnim() { return false; }
    void moveIfNecessary(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
    void obtainVelocityTracker() {}
    public void onChildViewAttachedToWindow(android.view.View p0) {}
    public void onChildViewDetachedFromWindow(android.view.View p0) {}
    public void onDraw(android.graphics.Canvas p0, com.android.internal.widget.RecyclerView p1, com.android.internal.widget.RecyclerView.State p2) {}
    public void onDrawOver(android.graphics.Canvas p0, com.android.internal.widget.RecyclerView p1, com.android.internal.widget.RecyclerView.State p2) {}
    void postDispatchSwipe(com.android.internal.widget.helper.ItemTouchHelper.RecoverAnimation p0, int p1) {}
    void removeChildDrawingOrderCallbackIfNecessary(android.view.View p0) {}
    boolean scrollIfNecessary() { return false; }
    void select(com.android.internal.widget.RecyclerView.ViewHolder p0, int p1) {}
    public void startDrag(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
    public void startSwipe(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
    void updateDxDy(android.view.MotionEvent p0, int p1, int p2) {}

    public static abstract class Callback {
        private static final int ABS_HORIZONTAL_DIR_FLAGS = 789516;
        public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
        public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
        private static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000L;
        static final int RELATIVE_DIR_FLAGS = 3158064;
        private static final android.view.animation.Interpolator sDragScrollInterpolator = null;
        private static final android.view.animation.Interpolator sDragViewScrollCapInterpolator = null;
        private static final com.android.internal.widget.helper.ItemTouchUIUtil sUICallback = null;
        private int mCachedMaxScrollSpeed;
        public Callback() {}
        public static int convertToRelativeDirection(int p0, int p1) { return 0; }
        public static com.android.internal.widget.helper.ItemTouchUIUtil getDefaultUIUtil() { return null; }
        private int getMaxDragScroll(com.android.internal.widget.RecyclerView p0) { return 0; }
        public static int makeFlag(int p0, int p1) { return 0; }
        public static int makeMovementFlags(int p0, int p1) { return 0; }
        public boolean canDropOver(com.android.internal.widget.RecyclerView p0, com.android.internal.widget.RecyclerView.ViewHolder p1, com.android.internal.widget.RecyclerView.ViewHolder p2) { return false; }
        public com.android.internal.widget.RecyclerView.ViewHolder chooseDropTarget(com.android.internal.widget.RecyclerView.ViewHolder p0, java.util.List<com.android.internal.widget.RecyclerView.ViewHolder> p1, int p2, int p3) { return null; }
        public void clearView(com.android.internal.widget.RecyclerView p0, com.android.internal.widget.RecyclerView.ViewHolder p1) {}
        public int convertToAbsoluteDirection(int p0, int p1) { return 0; }
        final int getAbsoluteMovementFlags(com.android.internal.widget.RecyclerView p0, com.android.internal.widget.RecyclerView.ViewHolder p1) { return 0; }
        public long getAnimationDuration(com.android.internal.widget.RecyclerView p0, int p1, float p2, float p3) { return 0L; }
        public int getBoundingBoxMargin() { return 0; }
        public float getMoveThreshold(com.android.internal.widget.RecyclerView.ViewHolder p0) { return 0.0f; }
        public abstract int getMovementFlags(com.android.internal.widget.RecyclerView p0, com.android.internal.widget.RecyclerView.ViewHolder p1);
        public float getSwipeEscapeVelocity(float p0) { return 0.0f; }
        public float getSwipeThreshold(com.android.internal.widget.RecyclerView.ViewHolder p0) { return 0.0f; }
        public float getSwipeVelocityThreshold(float p0) { return 0.0f; }
        boolean hasDragFlag(com.android.internal.widget.RecyclerView p0, com.android.internal.widget.RecyclerView.ViewHolder p1) { return false; }
        boolean hasSwipeFlag(com.android.internal.widget.RecyclerView p0, com.android.internal.widget.RecyclerView.ViewHolder p1) { return false; }
        public int interpolateOutOfBoundsScroll(com.android.internal.widget.RecyclerView p0, int p1, int p2, int p3, long p4) { return 0; }
        public boolean isItemViewSwipeEnabled() { return false; }
        public boolean isLongPressDragEnabled() { return false; }
        public void onChildDraw(android.graphics.Canvas p0, com.android.internal.widget.RecyclerView p1, com.android.internal.widget.RecyclerView.ViewHolder p2, float p3, float p4, int p5, boolean p6) {}
        public void onChildDrawOver(android.graphics.Canvas p0, com.android.internal.widget.RecyclerView p1, com.android.internal.widget.RecyclerView.ViewHolder p2, float p3, float p4, int p5, boolean p6) {}
        void onDraw(android.graphics.Canvas p0, com.android.internal.widget.RecyclerView p1, com.android.internal.widget.RecyclerView.ViewHolder p2, java.util.List<com.android.internal.widget.helper.ItemTouchHelper.RecoverAnimation> p3, int p4, float p5, float p6) {}
        void onDrawOver(android.graphics.Canvas p0, com.android.internal.widget.RecyclerView p1, com.android.internal.widget.RecyclerView.ViewHolder p2, java.util.List<com.android.internal.widget.helper.ItemTouchHelper.RecoverAnimation> p3, int p4, float p5, float p6) {}
        public abstract boolean onMove(com.android.internal.widget.RecyclerView p0, com.android.internal.widget.RecyclerView.ViewHolder p1, com.android.internal.widget.RecyclerView.ViewHolder p2);
        public void onMoved(com.android.internal.widget.RecyclerView p0, com.android.internal.widget.RecyclerView.ViewHolder p1, int p2, com.android.internal.widget.RecyclerView.ViewHolder p3, int p4, int p5, int p6) {}
        public void onSelectedChanged(com.android.internal.widget.RecyclerView.ViewHolder p0, int p1) {}
        public abstract void onSwiped(com.android.internal.widget.RecyclerView.ViewHolder p0, int p1);
    }

    private class ItemTouchHelperGestureListener extends android.view.GestureDetector.SimpleOnGestureListener {
        ItemTouchHelperGestureListener(com.android.internal.widget.helper.ItemTouchHelper p0) { super(); }
        public boolean onDown(android.view.MotionEvent p0) { return false; }
        public void onLongPress(android.view.MotionEvent p0) {}
    }

    private class RecoverAnimation implements android.animation.Animator.AnimatorListener {
        final int mActionState = 0;
        final int mAnimationType = 0;
        boolean mEnded;
        private float mFraction;
        public boolean mIsPendingCleanup;
        boolean mOverridden;
        final float mStartDx = 0.0f;
        final float mStartDy = 0.0f;
        final float mTargetX = 0.0f;
        final float mTargetY = 0.0f;
        private final android.animation.ValueAnimator mValueAnimator = null;
        final com.android.internal.widget.RecyclerView.ViewHolder mViewHolder = null;
        float mX;
        float mY;
        RecoverAnimation(com.android.internal.widget.helper.ItemTouchHelper p0, com.android.internal.widget.RecyclerView.ViewHolder p1, int p2, int p3, float p4, float p5, float p6, float p7) {}
        public void cancel() {}
        public void onAnimationCancel(android.animation.Animator p0) {}
        public void onAnimationEnd(android.animation.Animator p0) {}
        public void onAnimationRepeat(android.animation.Animator p0) {}
        public void onAnimationStart(android.animation.Animator p0) {}
        public void setDuration(long p0) {}
        public void setFraction(float p0) {}
        public void start() {}
        public void update() {}
    }

    public static abstract class SimpleCallback extends com.android.internal.widget.helper.ItemTouchHelper.Callback {
        private int mDefaultDragDirs;
        private int mDefaultSwipeDirs;
        public SimpleCallback(int p0, int p1) { super(); }
        public int getDragDirs(com.android.internal.widget.RecyclerView p0, com.android.internal.widget.RecyclerView.ViewHolder p1) { return 0; }
        public int getMovementFlags(com.android.internal.widget.RecyclerView p0, com.android.internal.widget.RecyclerView.ViewHolder p1) { return 0; }
        public int getSwipeDirs(com.android.internal.widget.RecyclerView p0, com.android.internal.widget.RecyclerView.ViewHolder p1) { return 0; }
        public void setDefaultDragDirs(int p0) {}
        public void setDefaultSwipeDirs(int p0) {}
    }

    public static interface ViewDropHandler {
        public void prepareForDrop(android.view.View p0, android.view.View p1, int p2, int p3);
    }
}
