package android.view;

public class ViewOverlay {
    android.view.ViewOverlay.OverlayViewGroup mOverlayViewGroup;
    ViewOverlay(android.content.Context p0, android.view.View p1) {}
    public void add(android.graphics.drawable.Drawable p0) {}
    public void clear() {}
    android.view.ViewGroup getOverlayView() { return null; }
    boolean isEmpty() { return false; }
    public void remove(android.graphics.drawable.Drawable p0) {}

    static class OverlayViewGroup extends android.view.ViewGroup {
        java.util.ArrayList<android.graphics.drawable.Drawable> mDrawables;
        final android.view.View mHostView = null;
        OverlayViewGroup(android.content.Context p0, android.view.View p1) { super((android.content.Context)null); }
        public void add(android.graphics.drawable.Drawable p0) {}
        public void add(android.view.View p0) {}
        public void clear() {}
        protected void dispatchDraw(android.graphics.Canvas p0) {}
        public float getFrameContentVelocity() { return 0.0f; }
        public void invalidate() {}
        public void invalidate(int p0, int p1, int p2, int p3) {}
        public void invalidate(android.graphics.Rect p0) {}
        public void invalidate(boolean p0) {}
        public android.view.ViewParent invalidateChildInParent(int[] p0, android.graphics.Rect p1) { return null; }
        public void invalidateDrawable(android.graphics.drawable.Drawable p0) {}
        protected void invalidateParentCaches() {}
        protected void invalidateParentIfNeeded() {}
        void invalidateViewProperty(boolean p0, boolean p1) {}
        boolean isEmpty() { return false; }
        public void onDescendantInvalidated(android.view.View p0, android.view.View p1) {}
        protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
        public void remove(android.graphics.drawable.Drawable p0) {}
        public void remove(android.view.View p0) {}
        protected boolean verifyDrawable(android.graphics.drawable.Drawable p0) { return false; }
    }
}
