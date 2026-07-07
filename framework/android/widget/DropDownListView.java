package android.widget;

public class DropDownListView extends android.widget.ListView {
    private boolean mDrawsInPressedState;
    private boolean mHijackFocus;
    private boolean mListSelectionHidden;
    private android.widget.DropDownListView.ResolveHoverRunnable mResolveHoverRunnable;
    private com.android.internal.widget.AutoScrollHelper.AbsListViewAutoScroller mScrollHelper;
    public DropDownListView(android.content.Context p0, boolean p1) { super((android.content.Context)null); }
    public DropDownListView(android.content.Context p0, boolean p1, int p2) { super((android.content.Context)null); }
    private void clearPressedItem() {}
    private void setPressedItem(android.view.View p0, int p1, float p2, float p3) {}
    protected void drawableStateChanged() {}
    public boolean hasFocus() { return false; }
    public boolean hasWindowFocus() { return false; }
    public boolean isFocused() { return false; }
    public boolean isInTouchMode() { return false; }
    android.view.View obtainView(int p0, boolean[] p1) { return null; }
    public boolean onForwardedEvent(android.view.MotionEvent p0, int p1) { return false; }
    public boolean onHoverEvent(android.view.MotionEvent p0) { return false; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public void setListSelectionHidden(boolean p0) {}
    boolean shouldShowSelector() { return false; }
    boolean touchModeDrawsInPressedState() { return false; }

    private class ResolveHoverRunnable implements java.lang.Runnable {
        private ResolveHoverRunnable(android.widget.DropDownListView p0) {}
        public void cancel() {}
        public void post() {}
        public void run() {}
    }
}
