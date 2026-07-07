package com.android.internal.widget;

@android.widget.RemoteViews.RemoteView
public class BigPictureNotificationImageView extends android.widget.ImageView implements com.android.internal.widget.NotificationDrawableConsumer {
    private static final java.lang.String TAG = null;
    private com.android.internal.widget.NotificationIconManager mIconManager;
    private final int mMaximumDrawableHeight = 0;
    private final int mMaximumDrawableWidth = 0;
    public BigPictureNotificationImageView(android.content.Context p0) { super((android.content.Context)null); }
    public BigPictureNotificationImageView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public BigPictureNotificationImageView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public BigPictureNotificationImageView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private android.graphics.drawable.Drawable loadImage(android.graphics.drawable.Icon p0) { return null; }
    private android.graphics.drawable.Drawable loadImage(android.net.Uri p0) { return null; }
    public void setIconManager(com.android.internal.widget.NotificationIconManager p0) {}
    public void setImageDrawable(android.graphics.drawable.Drawable p0) {}
    @android.view.RemotableViewMethod(asyncImpl="setImageIconAsync")
    public void setImageIcon(android.graphics.drawable.Icon p0) {}
    public java.lang.Runnable setImageIconAsync(android.graphics.drawable.Icon p0) { return null; }
    @android.view.RemotableViewMethod(asyncImpl="setImageURIAsync")
    public void setImageURI(android.net.Uri p0) {}
    public java.lang.Runnable setImageURIAsync(android.net.Uri p0) { return null; }
}
