package com.android.internal.widget;

@android.widget.RemoteViews.RemoteView
public class NotificationRowIconView extends com.android.internal.widget.CachingIconView {
    public static final int ICON_TYPE_BRIDGED_ICON = 2;
    public static final int ICON_TYPE_INVALID = -1;
    public static final int ICON_TYPE_LAUNCHER_ICON = 1;
    public static final int ICON_TYPE_SMALL_ICON = 0;
    public static final int ICON_TYPE_TRANSPARENT_LAUNCHER_ICON = 3;
    private static final java.lang.String TAG = "NotificationRowIconView";
    private android.graphics.drawable.Drawable mAppIcon;
    private com.android.internal.widget.NotificationRowIconView.NotificationIconProvider mIconProvider;
    int mIconTypeOverride;
    private android.graphics.drawable.Drawable mOriginalBackground;
    private int mOriginalBackgroundColor;
    private int mOriginalIconColor;
    private android.graphics.Rect mOriginalPadding;
    public NotificationRowIconView(android.content.Context p0) { super((android.content.Context)null); }
    public NotificationRowIconView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public NotificationRowIconView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public NotificationRowIconView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private void adjustViewForIconStyle() {}
    private android.graphics.drawable.Drawable loadAppIcon() { return null; }
    private void removeBackground() {}
    private void removePadding() {}
    private void restoreBackground() {}
    private void restoreColors() {}
    private void restorePadding() {}
    @android.view.RemotableViewMethod
    public void setBackgroundColor(int p0) {}
    public void setIconProvider(com.android.internal.widget.NotificationRowIconView.NotificationIconProvider p0) {}
    @android.view.RemotableViewMethod
    public void setIconTypeOverride(int p0) {}
    @android.view.RemotableViewMethod(asyncImpl="setImageIconAsync")
    public void setImageIcon(android.graphics.drawable.Icon p0) {}
    @android.view.RemotableViewMethod
    public java.lang.Runnable setImageIconAsync(android.graphics.drawable.Icon p0) { return null; }
    @android.view.RemotableViewMethod
    public void setOriginalIconColor(int p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface IconType {
    }

    public static interface NotificationIconProvider {
        public android.graphics.drawable.Drawable getBridgedIcon();
        public int getIconType();
        public android.graphics.drawable.Drawable getLauncherIcon(boolean p0);
    }
}
