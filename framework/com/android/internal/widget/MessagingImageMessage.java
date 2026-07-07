package com.android.internal.widget;

@android.widget.RemoteViews.RemoteView
public abstract class MessagingImageMessage extends android.widget.ImageView implements com.android.internal.widget.MessagingMessage {
    private static final java.lang.String TAG = "MessagingImageMessage";
    private static final com.android.internal.widget.MessagingPool<com.android.internal.widget.MessagingImageMessage> sInstancePool = null;
    private int mActualHeight;
    private int mActualWidth;
    private float mAspectRatio;
    private android.graphics.drawable.Drawable mDrawable;
    private final int mExtraSpacing = 0;
    private com.android.internal.widget.ImageResolver mImageResolver;
    private final int mImageRounding = 0;
    private boolean mIsIsolated;
    private final int mIsolatedSize = 0;
    private final int mMaxImageHeight = 0;
    private final int mMinImageHeight = 0;
    private final android.graphics.Path mPath = null;
    private final com.android.internal.widget.MessagingMessageState mState = null;
    public MessagingImageMessage(android.content.Context p0) { super((android.content.Context)null); }
    public MessagingImageMessage(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public MessagingImageMessage(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public MessagingImageMessage(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    static com.android.internal.widget.MessagingMessage createMessage(com.android.internal.widget.IMessagingLayout p0, android.app.Notification.MessagingStyle.Message p1, com.android.internal.widget.ImageResolver p2, boolean p3) { return null; }
    public static void dropCache() {}
    private void setImageResolver(com.android.internal.widget.ImageResolver p0) {}
    public void finalizeInflate() {}
    public int getActualHeight() { return 0; }
    public int getActualWidth() { return 0; }
    public int getConsumedLines() { return 0; }
    public int getExtraSpacing() { return 0; }
    public int getMeasuredType() { return 0; }
    public android.graphics.Path getRoundedRectPath() { return null; }
    public com.android.internal.widget.MessagingMessageState getState() { return null; }
    protected void onDraw(android.graphics.Canvas p0) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onMeasure(int p0, int p1) {}
    public void recycle() {}
    public void setActualHeight(int p0) {}
    public void setActualWidth(int p0) {}
    public void setIsolated(boolean p0) {}
    public void setMaxDisplayedLines(int p0) {}
    public boolean setMessage(android.app.Notification.MessagingStyle.Message p0, boolean p1) { return false; }
}
