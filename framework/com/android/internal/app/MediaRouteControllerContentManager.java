package com.android.internal.app;

public class MediaRouteControllerContentManager {
    private static final int VOLUME_UPDATE_DELAY_MILLIS = 250;
    private boolean mAttachedToWindow;
    private final com.android.internal.app.MediaRouteControllerContentManager.MediaRouterCallback mCallback = null;
    private final android.content.Context mContext = null;
    private android.graphics.drawable.Drawable mCurrentIconDrawable;
    private final com.android.internal.app.MediaRouteControllerContentManager.Delegate mDelegate = null;
    private android.graphics.drawable.Drawable mMediaRouteButtonDrawable;
    private final int[] mMediaRouteConnectingState = null;
    private final int[] mMediaRouteOnState = null;
    private final android.media.MediaRouter.RouteInfo mRoute = null;
    private final android.media.MediaRouter mRouter = null;
    private android.widget.LinearLayout mVolumeLayout;
    private android.widget.SeekBar mVolumeSlider;
    private boolean mVolumeSliderTouched;
    public MediaRouteControllerContentManager(android.content.Context p0, com.android.internal.app.MediaRouteControllerContentManager.Delegate p1) {}
    private android.graphics.drawable.Drawable getIconDrawable() { return null; }
    private boolean isVolumeControlAvailable() { return false; }
    private android.graphics.drawable.Drawable obtainMediaRouteButtonDrawable() { return null; }
    private void updateVolume() {}
    public void bindViews(android.view.View p0) {}
    public void onAttachedToWindow() {}
    public void onDetachedFromWindow() {}
    public void onDisconnectButtonClick() {}
    public void requestUpdateRouteVolume(int p0) {}
    public void update() {}

    public static interface Delegate {
        public void dismissView();
        public void setMediaRouteDeviceIcon(android.graphics.drawable.Drawable p0);
        public void setMediaRouteDeviceTitle(java.lang.CharSequence p0);
    }

    private final class MediaRouterCallback extends android.media.MediaRouter.SimpleCallback {
        private MediaRouterCallback(com.android.internal.app.MediaRouteControllerContentManager p0) { super(); }
        public void onRouteChanged(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1) {}
        public void onRouteGrouped(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1, android.media.MediaRouter.RouteGroup p2, int p3) {}
        public void onRouteUngrouped(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1, android.media.MediaRouter.RouteGroup p2) {}
        public void onRouteUnselected(android.media.MediaRouter p0, int p1, android.media.MediaRouter.RouteInfo p2) {}
        public void onRouteVolumeChanged(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1) {}
    }
}
