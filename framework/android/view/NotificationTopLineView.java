package android.view;

@android.widget.RemoteViews.RemoteView
public class NotificationTopLineView extends android.view.ViewGroup {
    private android.view.View mAltTitle;
    private android.view.View mAppName;
    private android.view.View mAppNameDivider;
    private final int mChildHideWidth = 0;
    private final int mChildMinWidth = 0;
    private android.view.View mExtraToplineContent;
    private final int mGravityY = 0;
    private android.view.View mHeaderText;
    private android.view.View mHeaderTextDivider;
    private int mHeaderTextMarginEnd;
    private int mMaxAscent;
    private int mMaxDescent;
    private final android.view.NotificationTopLineView.OverflowAdjuster mOverflowAdjuster = null;
    private android.view.View mSecondaryHeaderText;
    private android.view.View mSecondaryHeaderTextDivider;
    private android.view.View mTitle;
    private android.view.View mVerificationText;
    private java.util.Set<android.view.View> mViewsToDisappear;
    public NotificationTopLineView(android.content.Context p0) { super((android.content.Context)null); }
    public NotificationTopLineView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public NotificationTopLineView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public NotificationTopLineView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    public int getHeaderTextMarginEnd() { return 0; }
    public boolean hasOverlappingRendering() { return false; }
    public boolean isInTouchRect(float p0, float p1) { return false; }
    public boolean isTitlePresent() { return false; }
    protected void onFinishInflate() {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onMeasure(int p0, int p1) {}
    public boolean onTouchUp(float p0, float p1, float p2, float p3) { return false; }
    public void setHeaderTextMarginEnd(int p0) {}
    public void setPaddingStart(int p0) {}

    private final class OverflowAdjuster {
        private int mHeightSpec;
        private int mOverflow;
        private android.view.View mRegrowView;
        private OverflowAdjuster(android.view.NotificationTopLineView p0) {}
        private int getHorizontalMargins(android.view.View p0) { return 0; }
        android.view.NotificationTopLineView.OverflowAdjuster adjust(android.view.View p0, android.view.View p1, int p2) { return null; }
        void finish() {}
        android.view.NotificationTopLineView.OverflowAdjuster resetForOverflow(int p0, int p1) { return null; }
    }
}
