package android.view;

@android.widget.RemoteViews.RemoteView
public class NotificationHeaderView extends android.widget.RelativeLayout {
    private boolean mAcceptAllTouches;
    private android.view.View mAltExpandTarget;
    private android.graphics.drawable.Drawable mBackground;
    private boolean mEntireHeaderClickable;
    private com.android.internal.widget.NotificationExpandButton mExpandButton;
    private float mExpandButtonTranslation;
    private android.view.View.OnClickListener mExpandClickListener;
    private boolean mExpandOnlyOnButton;
    private com.android.internal.widget.CachingIconView mIcon;
    android.view.ViewOutlineProvider mProvider;
    private float mTopLineTranslation;
    private android.view.NotificationTopLineView mTopLineView;
    private android.view.NotificationHeaderView.HeaderTouchListener mTouchListener;
    private final int mTouchableHeight = 0;
    public NotificationHeaderView(android.content.Context p0) { super((android.content.Context)null); }
    public NotificationHeaderView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public NotificationHeaderView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public NotificationHeaderView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private void centerExpandButton(boolean p0) {}
    private android.view.View getFirstChildNotGone() { return null; }
    private float measureCenterTranslation(android.view.View p0) { return 0.0f; }
    private void updateTouchListener() {}
    @android.view.RemotableViewMethod
    public void centerTopLine(boolean p0) {}
    protected void drawableStateChanged() {}
    public com.android.internal.widget.NotificationExpandButton getExpandButton() { return null; }
    public float getExpandButtonTranslation() { return 0.0f; }
    public float getTopLineTranslation() { return 0.0f; }
    public android.view.NotificationTopLineView getTopLineView() { return null; }
    public boolean hasOverlappingRendering() { return false; }
    public boolean isInTouchRect(float p0, float p1) { return false; }
    protected void onDraw(android.graphics.Canvas p0) {}
    protected void onFinishInflate() {}
    protected void onMeasure(int p0, int p1) {}
    @android.view.RemotableViewMethod
    public void setAcceptAllTouches(boolean p0) {}
    @android.view.RemotableViewMethod
    public void setExpandOnlyOnButton(boolean p0) {}
    public void setHeaderBackgroundDrawable(android.graphics.drawable.Drawable p0) {}
    public void setOnClickListener(android.view.View.OnClickListener p0) {}
    public void setTopLineExtraMarginEnd(int p0) {}
    @android.view.RemotableViewMethod
    public void setTopLineExtraMarginEndDp(float p0) {}
    @android.view.RemotableViewMethod
    public void styleTextAsTitle(boolean p0) {}
    protected boolean verifyDrawable(android.graphics.drawable.Drawable p0) { return false; }

    public class HeaderTouchListener implements android.view.View.OnTouchListener {
        private android.graphics.Rect mAltExpandTargetRect;
        private float mDownX;
        private float mDownY;
        private android.graphics.Rect mExpandButtonRect;
        private final java.util.ArrayList<android.graphics.Rect> mTouchRects = null;
        private int mTouchSlop;
        private boolean mTrackGesture;
        public HeaderTouchListener(android.view.NotificationHeaderView p0) {}
        private android.graphics.Rect addRectAroundView(android.view.View p0) { return null; }
        private void addWidthRect() {}
        private android.graphics.Rect getRectAroundView(android.view.View p0) { return null; }
        private boolean isInside(float p0, float p1) { return false; }
        public void bindTouchRects() {}
        public boolean onTouch(android.view.View p0, android.view.MotionEvent p1) { return false; }
    }
}
