package android.widget;

class FastScroller {
    private static android.util.Property<android.view.View, java.lang.Integer> BOTTOM;
    private static final int DURATION_CROSS_FADE = 50;
    private static final int DURATION_FADE_IN = 150;
    private static final int DURATION_FADE_OUT = 300;
    private static final int DURATION_RESIZE = 100;
    private static final long FADE_TIMEOUT = 1500L;
    private static android.util.Property<android.view.View, java.lang.Integer> LEFT;
    private static final int MIN_PAGES = 4;
    private static final int OVERLAY_ABOVE_THUMB = 2;
    private static final int OVERLAY_AT_THUMB = 1;
    private static final int OVERLAY_FLOATING = 0;
    private static final int PREVIEW_LEFT = 0;
    private static final int PREVIEW_RIGHT = 1;
    private static android.util.Property<android.view.View, java.lang.Integer> RIGHT;
    private static final int STATE_DRAGGING = 2;
    private static final int STATE_NONE = 0;
    private static final int STATE_VISIBLE = 1;
    private static final int THUMB_POSITION_INSIDE = 1;
    private static final int THUMB_POSITION_MIDPOINT = 0;
    private static android.util.Property<android.view.View, java.lang.Integer> TOP;
    private boolean mAlwaysShow;
    private final android.graphics.Rect mContainerRect = null;
    private int mCurrentSection;
    private android.animation.AnimatorSet mDecorAnimation;
    private final java.lang.Runnable mDeferHide = null;
    private boolean mEnabled;
    private int mFirstVisibleItem;
    private int mHeaderCount;
    private float mInitialTouchY;
    private boolean mLayoutFromRight;
    private final android.widget.AbsListView mList = null;
    private android.widget.Adapter mListAdapter;
    private boolean mLongList;
    private boolean mMatchDragPosition;
    private final int mMinimumTouchTarget = 0;
    private int mOldChildCount;
    private int mOldItemCount;
    private final android.view.ViewGroupOverlay mOverlay = null;
    private int mOverlayPosition;
    private long mPendingDrag;
    private android.animation.AnimatorSet mPreviewAnimation;
    private final android.view.View mPreviewImage = null;
    private int mPreviewMinHeight;
    private int mPreviewMinWidth;
    private int mPreviewPadding;
    private final int[] mPreviewResId = null;
    private final android.widget.TextView mPrimaryText = null;
    private final int mScaledTouchSlop = 0;
    private int mScrollBarStyle;
    private boolean mScrollCompleted;
    private int mScrollbarPosition;
    private final android.widget.TextView mSecondaryText = null;
    private android.widget.SectionIndexer mSectionIndexer;
    private java.lang.Object[] mSections;
    private boolean mShowingPreview;
    private boolean mShowingPrimary;
    private int mState;
    private final android.animation.Animator.AnimatorListener mSwitchPrimaryListener = null;
    private final int mTapTimeoutMillis = 0;
    private final android.graphics.Rect mTempBounds = null;
    private final android.graphics.Rect mTempMargins = null;
    private int mTextAppearance;
    private android.content.res.ColorStateList mTextColor;
    private float mTextSize;
    private android.graphics.drawable.Drawable mThumbDrawable;
    private final android.widget.ImageView mThumbImage = null;
    private int mThumbMinHeight;
    private int mThumbMinWidth;
    private float mThumbOffset;
    private int mThumbPosition;
    private float mThumbRange;
    private android.graphics.drawable.Drawable mTrackDrawable;
    private final android.widget.ImageView mTrackImage = null;
    private boolean mUpdatingLayout;
    private int mWidth;
    public FastScroller(android.widget.AbsListView p0, int p1) {}
    private static android.animation.Animator animateAlpha(android.view.View p0, float p1) { return null; }
    private static android.animation.Animator animateBounds(android.view.View p0, android.graphics.Rect p1) { return null; }
    private static android.animation.Animator animateScaleX(android.view.View p0, float p1) { return null; }
    private void applyLayout(android.view.View p0, android.graphics.Rect p1) {}
    private void beginDrag() {}
    private void cancelFling() {}
    private void cancelPendingDrag() {}
    private android.widget.TextView createPreviewTextView(android.content.Context p0) { return null; }
    private float getPosFromItemCount(int p0, int p1, int p2) { return 0.0f; }
    private float getPosFromMotionEvent(float p0) { return 0.0f; }
    private void getSectionsFromIndexer() {}
    private static android.animation.Animator groupAnimatorOfFloat(android.util.Property<android.view.View, java.lang.Float> p0, float p1, android.view.View... p2) { return null; }
    private boolean isPointInside(float p0, float p1) { return false; }
    private boolean isPointInsideX(float p0) { return false; }
    private boolean isPointInsideY(float p0) { return false; }
    private void layoutThumb() {}
    private void layoutTrack() {}
    private void measureFloating(android.view.View p0, android.graphics.Rect p1, android.graphics.Rect p2) {}
    private void measurePreview(android.view.View p0, android.graphics.Rect p1) {}
    private void measureViewToSide(android.view.View p0, android.view.View p1, android.graphics.Rect p2, android.graphics.Rect p3) {}
    private void onStateDependencyChanged(boolean p0) {}
    private void postAutoHide() {}
    private void refreshDrawablePressedState() {}
    private void scrollTo(float p0) {}
    private void setState(int p0) {}
    private void setThumbPos(float p0) {}
    private void startPendingDrag() {}
    private boolean transitionPreviewLayout(int p0) { return false; }
    private void transitionToDragging() {}
    private void transitionToHidden() {}
    private void transitionToVisible() {}
    private void updateAppearance() {}
    private void updateContainerRect() {}
    private void updateLongList(int p0, int p1) {}
    private void updateOffsetAndRange() {}
    public int getWidth() { return 0; }
    public boolean isAlwaysShowEnabled() { return false; }
    public boolean isEnabled() { return false; }
    public boolean onInterceptHoverEvent(android.view.MotionEvent p0) { return false; }
    public boolean onInterceptTouchEvent(android.view.MotionEvent p0) { return false; }
    public void onItemCountChanged(int p0, int p1) {}
    public android.view.PointerIcon onResolvePointerIcon(android.view.MotionEvent p0, int p1) { return null; }
    public void onScroll(int p0, int p1, int p2) {}
    public void onSectionsChanged() {}
    public void onSizeChanged(int p0, int p1, int p2, int p3) {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public void remove() {}
    public void setAlwaysShow(boolean p0) {}
    public void setEnabled(boolean p0) {}
    public void setScrollBarStyle(int p0) {}
    public void setScrollbarPosition(int p0) {}
    public void setStyle(int p0) {}
    public void stop() {}
    public void updateLayout() {}
}
