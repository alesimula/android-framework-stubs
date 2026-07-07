package com.android.internal.widget;

@android.widget.RemoteViews.RemoteView
public abstract class MessagingTextMessage extends com.android.internal.widget.ImageFloatingTextView implements com.android.internal.widget.MessagingMessage {
    private static final java.lang.String TAG = "MessagingTextMessage";
    private static final com.android.internal.widget.MessagingPool<com.android.internal.widget.MessagingTextMessage> sInstancePool = null;
    private android.text.PrecomputedText mPrecomputedText;
    private final com.android.internal.widget.MessagingMessageState mState = null;
    public MessagingTextMessage(android.content.Context p0) { super((android.content.Context)null); }
    public MessagingTextMessage(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public MessagingTextMessage(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public MessagingTextMessage(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    static com.android.internal.widget.MessagingMessage createMessage(com.android.internal.widget.IMessagingLayout p0, android.app.Notification.MessagingStyle.Message p1, boolean p2, boolean p3) { return null; }
    public static void dropCache() {}
    public void finalizeInflate() {}
    public int getConsumedLines() { return 0; }
    public int getLayoutHeight() { return 0; }
    public int getMeasuredType() { return 0; }
    public com.android.internal.widget.MessagingMessageState getState() { return null; }
    public void recycle() {}
    public void setColor(int p0) {}
    public void setMaxDisplayedLines(int p0) {}
    public boolean setMessage(android.app.Notification.MessagingStyle.Message p0, boolean p1) { return false; }
    public void updateViewForSummarization(boolean p0) {}
}
