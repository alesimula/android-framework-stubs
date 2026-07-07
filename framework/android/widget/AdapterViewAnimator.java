package android.widget;

public abstract class AdapterViewAnimator extends android.widget.AdapterView<android.widget.Adapter> implements android.widget.Advanceable {
    private static final int DEFAULT_ANIMATION_DURATION = 200;
    static final int TOUCH_MODE_DOWN_IN_CURRENT_VIEW = 1;
    static final int TOUCH_MODE_HANDLED = 2;
    static final int TOUCH_MODE_NONE = 0;
    int mActiveOffset;
    android.widget.Adapter mAdapter;
    boolean mAnimateFirstTime;
    int mCurrentWindowEnd;
    int mCurrentWindowStart;
    int mCurrentWindowStartUnbounded;
    android.widget.AdapterView<android.widget.Adapter>.AdapterDataSetObserver mDataSetObserver;
    boolean mDeferNotifyDataSetChanged;
    boolean mFirstTime;
    android.animation.ObjectAnimator mInAnimation;
    boolean mLoopViews;
    int mMaxNumActiveViews;
    android.animation.ObjectAnimator mOutAnimation;
    private java.lang.Runnable mPendingCheckForTap;
    java.util.ArrayList<java.lang.Integer> mPreviousViews;
    int mReferenceChildHeight;
    int mReferenceChildWidth;
    private int mRestoreWhichChild;
    private final int mTapTimeoutMillis = 0;
    private int mTouchMode;
    java.util.HashMap<java.lang.Integer, android.widget.AdapterViewAnimator.ViewAndMetaData> mViewsMap;
    int mWhichChild;
    public AdapterViewAnimator(android.content.Context p0) { super((android.content.Context)null); }
    public AdapterViewAnimator(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public AdapterViewAnimator(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public AdapterViewAnimator(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private void addChild(android.view.View p0) {}
    private android.widget.AdapterViewAnimator.ViewAndMetaData getMetaDataForChild(android.view.View p0) { return null; }
    private void initViewAnimator() {}
    private void measureChildren() {}
    private void setDisplayedChild(int p0, boolean p1) {}
    public void advance() {}
    void applyTransformForChildAtIndex(android.view.View p0, int p1) {}
    void cancelHandleClick() {}
    void checkForAndHandleDataChanged() {}
    void configureViewAnimator(int p0, int p1) {}
    android.view.ViewGroup.LayoutParams createOrReuseLayoutParams(android.view.View p0) { return null; }
    public void deferNotifyDataSetChanged() {}
    public void fyiWillBeAdvancedByHostKThx() {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public android.widget.Adapter getAdapter() { return null; }
    public int getBaseline() { return 0; }
    public android.view.View getCurrentView() { return null; }
    android.animation.ObjectAnimator getDefaultInAnimation() { return null; }
    android.animation.ObjectAnimator getDefaultOutAnimation() { return null; }
    public int getDisplayedChild() { return 0; }
    android.widget.FrameLayout getFrameForChild() { return null; }
    public android.animation.ObjectAnimator getInAnimation() { return null; }
    int getNumActiveViews() { return 0; }
    public android.animation.ObjectAnimator getOutAnimation() { return null; }
    public android.view.View getSelectedView() { return null; }
    android.view.View getViewAtRelativeIndex(int p0) { return null; }
    int getWindowSize() { return 0; }
    void hideTapFeedback(android.view.View p0) {}
    int modulo(int p0, int p1) { return 0; }
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onMeasure(int p0, int p1) {}
    public boolean onRemoteAdapterConnected() { return false; }
    public void onRemoteAdapterDisconnected() {}
    public void onRestoreInstanceState(android.os.Parcelable p0) {}
    public android.os.Parcelable onSaveInstanceState() { return null; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    void refreshChildren() {}
    public void setAdapter(android.widget.Adapter p0) {}
    public void setAnimateFirstView(boolean p0) {}
    @android.view.RemotableViewMethod
    public void setDisplayedChild(int p0) {}
    public void setInAnimation(android.animation.ObjectAnimator p0) {}
    public void setInAnimation(android.content.Context p0, int p1) {}
    public void setOutAnimation(android.animation.ObjectAnimator p0) {}
    public void setOutAnimation(android.content.Context p0, int p1) {}
    public void setRemoteViewsAdapter(android.content.Intent p0) {}
    public void setSelection(int p0) {}
    public void showNext() {}
    void showOnly(int p0, boolean p1) {}
    public void showPrevious() {}
    void showTapFeedback(android.view.View p0) {}
    void transformViewForTransition(int p0, int p1, android.view.View p2, boolean p3) {}

    final class CheckForTap implements java.lang.Runnable {
        CheckForTap(android.widget.AdapterViewAnimator p0) {}
        public void run() {}
    }

    static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<android.widget.AdapterViewAnimator.SavedState> CREATOR = null;
        int whichChild;
        private SavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
        SavedState(android.os.Parcelable p0, int p1) { super((android.os.Parcel)null); }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    class ViewAndMetaData {
        int adapterPosition;
        long itemId;
        int relativeIndex;
        android.view.View view;
        ViewAndMetaData(android.widget.AdapterViewAnimator p0, android.view.View p1, int p2, int p3, long p4) {}
    }
}
