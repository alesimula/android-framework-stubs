package com.android.internal.widget;

public class ViewClippingUtil {
    private static final int CLIP_CHILDREN_TAG = 16908986;
    private static final int CLIP_CLIPPING_SET = 16908985;
    private static final int CLIP_TO_PADDING = 16908988;
    public ViewClippingUtil() {}
    public static void setClippingDeactivated(android.view.View p0, boolean p1, com.android.internal.widget.ViewClippingUtil.ClippingParameters p2) {}

    public static interface ClippingParameters {
        default public boolean isClippingEnablingAllowed(android.view.View p0) { return false; }
        default public void onClippingStateChanged(android.view.View p0, boolean p1) {}
        public boolean shouldFinish(android.view.View p0);
    }
}
