package com.android.internal.widget;

public class ViewGroupFader {
    private static final float ALPHA_LOWER_BOUND = 0.5f;
    private static final float CHAINED_BOUNDS_BOTTOM_FRACTION = 0.20000000298023224f;
    private static final float CHAINED_BOUNDS_TOP_FRACTION = 0.6000000238418579f;
    private static final float CHAINED_LOWER_REGION_FRACTION = 0.3499999940395355f;
    private static final float CHAINED_UPPER_REGION_FRACTION = 0.550000011920929f;
    private static final float SCALE_LOWER_BOUND = 0.699999988079071f;
    private float mAlphaLowerBound;
    private float mBottomBoundPixels;
    private android.view.animation.BaseInterpolator mBottomInterpolator;
    private final com.android.internal.widget.ViewGroupFader.AnimationCallback mCallback = null;
    private float mChainedBoundsBottom;
    private float mChainedBoundsTop;
    private float mChainedLowerRegion;
    private float mChainedUpperRegion;
    private final com.android.internal.widget.ViewGroupFader.ChildViewBoundsProvider mChildViewBoundsProvider = null;
    private final android.graphics.Rect mContainerBounds = null;
    private com.android.internal.widget.ViewGroupFader.ContainerBoundsProvider mContainerBoundsProvider;
    private final android.graphics.Rect mOffsetViewBounds = null;
    protected final android.view.ViewGroup mParent = null;
    private float mScaleLowerBound;
    private float mTopBoundPixels;
    private android.view.animation.BaseInterpolator mTopInterpolator;
    public ViewGroupFader(android.view.ViewGroup p0, com.android.internal.widget.ViewGroupFader.AnimationCallback p1, com.android.internal.widget.ViewGroupFader.ChildViewBoundsProvider p2) {}
    private void fadeElement(android.view.ViewGroup p0, android.view.View p1) {}
    private static float lerp(float p0, float p1, float p2) { return 0.0f; }
    private void scaleAndFadeByRelativeOffsetFraction(android.view.View p0, float p1) {}
    private void setDefaultSizeAndAlphaForView(android.view.View p0) {}
    private void setViewPropertiesByPosition(android.view.View p0, android.graphics.Rect p1, float p2, float p3) {}
    com.android.internal.widget.ViewGroupFader.AnimationCallback getAnimationCallback() { return null; }
    void setAlphaLowerBound(float p0) {}
    void setBottomInterpolator(android.view.animation.BaseInterpolator p0) {}
    void setContainerBoundsProvider(com.android.internal.widget.ViewGroupFader.ContainerBoundsProvider p0) {}
    void setScaleLowerBound(float p0) {}
    void setTopInterpolator(android.view.animation.BaseInterpolator p0) {}
    public void updateFade() {}
    public void updateListElementFades(android.view.ViewGroup p0, boolean p1) {}

    public static interface AnimationCallback {
        public boolean shouldFadeFromBottom(android.view.View p0);
        public boolean shouldFadeFromTop(android.view.View p0);
        public void viewHasBecomeFullSize(android.view.View p0);
    }

    public static interface ChildViewBoundsProvider {
        public void provideBounds(android.view.ViewGroup p0, android.view.View p1, android.graphics.Rect p2);
    }

    static interface ContainerBoundsProvider {
        public void provideBounds(android.view.ViewGroup p0, android.graphics.Rect p1);
    }

    static final class DefaultViewBoundsProvider implements com.android.internal.widget.ViewGroupFader.ChildViewBoundsProvider {
        DefaultViewBoundsProvider() {}
        public void provideBounds(android.view.ViewGroup p0, android.view.View p1, android.graphics.Rect p2) {}
    }

    static final class GlobalVisibleViewBoundsProvider implements com.android.internal.widget.ViewGroupFader.ChildViewBoundsProvider {
        GlobalVisibleViewBoundsProvider() {}
        public void provideBounds(android.view.ViewGroup p0, android.view.View p1, android.graphics.Rect p2) {}
    }

    static final class ParentContainerBoundsProvider implements com.android.internal.widget.ViewGroupFader.ContainerBoundsProvider {
        ParentContainerBoundsProvider() {}
        public void provideBounds(android.view.ViewGroup p0, android.graphics.Rect p1) {}
    }

    static final class ScreenContainerBoundsProvider implements com.android.internal.widget.ViewGroupFader.ContainerBoundsProvider {
        ScreenContainerBoundsProvider() {}
        public void provideBounds(android.view.ViewGroup p0, android.graphics.Rect p1) {}
    }
}
