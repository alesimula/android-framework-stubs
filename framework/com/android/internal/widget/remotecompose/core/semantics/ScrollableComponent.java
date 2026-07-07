package com.android.internal.widget.remotecompose.core.semantics;

public interface ScrollableComponent extends com.android.internal.widget.remotecompose.core.semantics.AccessibilitySemantics {
    public static final int SCROLL_HORIZONTAL = 1;
    public static final int SCROLL_NONE = 0;
    public static final int SCROLL_VERTICAL = 2;
    default public com.android.internal.widget.remotecompose.core.semantics.ScrollableComponent.ScrollAxisRange getScrollAxisRange() { return null; }
    default public int scrollByOffset(com.android.internal.widget.remotecompose.core.RemoteContext p0, int p1) { return 0; }
    public int scrollDirection();
    default public boolean scrollDirection(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.semantics.ScrollableComponent.ScrollDirection p1) { return false; }
    default public boolean showOnScreen(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.operations.layout.Component p1) { return false; }
    default public boolean supportsScrollByOffset() { return false; }

    public static class ScrollAxisRange {
        private boolean mCanScrollBackwards;
        private boolean mCanScrollForward;
        private float mMaxValue;
        private float mValue;
        public ScrollAxisRange(float p0, float p1, boolean p2, boolean p3) {}
        public boolean canScrollBackwards() { return false; }
        public boolean canScrollForward() { return false; }
        public float getMaxValue() { return 0.0f; }
        public float getmValue() { return 0.0f; }
    }

    public static enum ScrollDirection {
        BACKWARD,
        DOWN,
        FORWARD,
        LEFT,
        RIGHT,
        UP;
        private static final com.android.internal.widget.remotecompose.core.semantics.ScrollableComponent.ScrollDirection[] $VALUES = null;
        private ScrollDirection() {}
    }
}
