package android.view;

public final class ViewTreeObserver {
    private static boolean sIllegalOnDrawModificationIsFatal;
    private boolean mAlive;
    private android.view.ViewTreeObserver.CopyOnWriteArray<java.util.function.Consumer<java.util.List<android.graphics.Rect>>> mGestureExclusionListeners;
    private boolean mInDispatchOnDraw;
    private java.lang.StringBuilder mLastDispatchOnPreDrawCanceledReason;
    private android.view.ViewTreeObserver.CopyOnWriteArray<android.view.ViewTreeObserver.OnComputeInternalInsetsListener> mOnComputeInternalInsetsListeners;
    private java.util.ArrayList<android.view.ViewTreeObserver.OnDrawListener> mOnDrawListeners;
    private java.util.concurrent.CopyOnWriteArrayList<android.view.ViewTreeObserver.OnEnterAnimationCompleteListener> mOnEnterAnimationCompleteListeners;
    private java.util.ArrayList<java.lang.Runnable> mOnFrameCommitListeners;
    private java.util.concurrent.CopyOnWriteArrayList<android.view.ViewTreeObserver.OnGlobalFocusChangeListener> mOnGlobalFocusListeners;
    private android.view.ViewTreeObserver.CopyOnWriteArray<android.view.ViewTreeObserver.OnGlobalLayoutListener> mOnGlobalLayoutListeners;
    private android.view.ViewTreeObserver.CopyOnWriteArray<android.view.ViewTreeObserver.OnPreDrawListener> mOnPreDrawListeners;
    private android.view.ViewTreeObserver.CopyOnWriteArray<android.view.ViewTreeObserver.OnScrollChangedListener> mOnScrollChangedListeners;
    private java.util.concurrent.CopyOnWriteArrayList<android.view.ViewTreeObserver.OnTouchModeChangeListener> mOnTouchModeChangeListeners;
    private java.util.concurrent.CopyOnWriteArrayList<android.view.ViewTreeObserver.OnWindowAttachListener> mOnWindowAttachListeners;
    private java.util.concurrent.CopyOnWriteArrayList<android.view.ViewTreeObserver.OnWindowFocusChangeListener> mOnWindowFocusListeners;
    private java.util.concurrent.CopyOnWriteArrayList<android.view.ViewTreeObserver.OnWindowVisibilityChangeListener> mOnWindowVisibilityListeners;
    ViewTreeObserver(android.content.Context p0) {}
    private void checkIsAlive() {}
    private void kill() {}
    public void addOnComputeInternalInsetsListener(android.view.ViewTreeObserver.OnComputeInternalInsetsListener p0) {}
    public void addOnDrawListener(android.view.ViewTreeObserver.OnDrawListener p0) {}
    public void addOnEnterAnimationCompleteListener(android.view.ViewTreeObserver.OnEnterAnimationCompleteListener p0) {}
    public void addOnGlobalFocusChangeListener(android.view.ViewTreeObserver.OnGlobalFocusChangeListener p0) {}
    public void addOnGlobalLayoutListener(android.view.ViewTreeObserver.OnGlobalLayoutListener p0) {}
    public void addOnPreDrawListener(android.view.ViewTreeObserver.OnPreDrawListener p0) {}
    public void addOnScrollChangedListener(android.view.ViewTreeObserver.OnScrollChangedListener p0) {}
    public void addOnSystemGestureExclusionRectsChangedListener(java.util.function.Consumer<java.util.List<android.graphics.Rect>> p0) {}
    public void addOnTouchModeChangeListener(android.view.ViewTreeObserver.OnTouchModeChangeListener p0) {}
    public void addOnWindowAttachListener(android.view.ViewTreeObserver.OnWindowAttachListener p0) {}
    public void addOnWindowFocusChangeListener(android.view.ViewTreeObserver.OnWindowFocusChangeListener p0) {}
    public void addOnWindowVisibilityChangeListener(android.view.ViewTreeObserver.OnWindowVisibilityChangeListener p0) {}
    java.util.ArrayList<java.lang.Runnable> captureFrameCommitCallbacks() { return null; }
    final void dispatchOnComputeInternalInsets(android.view.ViewTreeObserver.InternalInsetsInfo p0) {}
    public final void dispatchOnDraw() {}
    public final void dispatchOnEnterAnimationComplete() {}
    final void dispatchOnGlobalFocusChange(android.view.View p0, android.view.View p1) {}
    public final void dispatchOnGlobalLayout() {}
    public final boolean dispatchOnPreDraw() { return false; }
    public final void dispatchOnScrollChanged() {}
    void dispatchOnSystemGestureExclusionRectsChanged(java.util.List<android.graphics.Rect> p0) {}
    final void dispatchOnTouchModeChanged(boolean p0) {}
    final void dispatchOnWindowAttachedChange(boolean p0) {}
    final void dispatchOnWindowFocusChange(boolean p0) {}
    void dispatchOnWindowVisibilityChange(int p0) {}
    final java.lang.String getLastDispatchOnPreDrawCanceledReason() { return null; }
    final boolean hasComputeInternalInsetsListeners() { return false; }
    final boolean hasOnPreDrawListeners() { return false; }
    public boolean isAlive() { return false; }
    void merge(android.view.ViewTreeObserver p0) {}
    public void registerFrameCommitCallback(java.lang.Runnable p0) {}
    @java.lang.Deprecated
    public void removeGlobalOnLayoutListener(android.view.ViewTreeObserver.OnGlobalLayoutListener p0) {}
    public void removeOnComputeInternalInsetsListener(android.view.ViewTreeObserver.OnComputeInternalInsetsListener p0) {}
    public void removeOnDrawListener(android.view.ViewTreeObserver.OnDrawListener p0) {}
    public void removeOnEnterAnimationCompleteListener(android.view.ViewTreeObserver.OnEnterAnimationCompleteListener p0) {}
    public void removeOnGlobalFocusChangeListener(android.view.ViewTreeObserver.OnGlobalFocusChangeListener p0) {}
    public void removeOnGlobalLayoutListener(android.view.ViewTreeObserver.OnGlobalLayoutListener p0) {}
    public void removeOnPreDrawListener(android.view.ViewTreeObserver.OnPreDrawListener p0) {}
    public void removeOnScrollChangedListener(android.view.ViewTreeObserver.OnScrollChangedListener p0) {}
    public void removeOnSystemGestureExclusionRectsChangedListener(java.util.function.Consumer<java.util.List<android.graphics.Rect>> p0) {}
    public void removeOnTouchModeChangeListener(android.view.ViewTreeObserver.OnTouchModeChangeListener p0) {}
    public void removeOnWindowAttachListener(android.view.ViewTreeObserver.OnWindowAttachListener p0) {}
    public void removeOnWindowFocusChangeListener(android.view.ViewTreeObserver.OnWindowFocusChangeListener p0) {}
    public void removeOnWindowVisibilityChangeListener(android.view.ViewTreeObserver.OnWindowVisibilityChangeListener p0) {}
    public boolean unregisterFrameCommitCallback(java.lang.Runnable p0) { return false; }

    static class CopyOnWriteArray<T extends java.lang.Object> {
        private final android.view.ViewTreeObserver.CopyOnWriteArray.Access<T> mAccess = null;
        private java.util.ArrayList<T> mData;
        private java.util.ArrayList<T> mDataCopy;
        private boolean mStart;
        CopyOnWriteArray() {}
        private java.util.ArrayList<T> getArray() { return null; }
        void add(T p0) {}
        void addAll(android.view.ViewTreeObserver.CopyOnWriteArray<T> p0) {}
        void clear() {}
        void end() {}
        void remove(T p0) {}
        int size() { return 0; }
        android.view.ViewTreeObserver.CopyOnWriteArray.Access<T> start() { return null; }

        static class Access<T extends java.lang.Object> {
            private java.util.ArrayList<T> mData;
            private int mSize;
            Access() {}
            T get(int p0) { return null; }
            int size() { return 0; }
        }
    }

    public static final class InternalInsetsInfo {
        public static final int TOUCHABLE_INSETS_CONTENT = 1;
        public static final int TOUCHABLE_INSETS_FRAME = 0;
        public static final int TOUCHABLE_INSETS_REGION = 3;
        public static final int TOUCHABLE_INSETS_VISIBLE = 2;
        public final android.graphics.Rect contentInsets = null;
        int mTouchableInsets;
        public final android.graphics.Region touchableRegion = null;
        public final android.graphics.Rect visibleInsets = null;
        public InternalInsetsInfo() {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        boolean isEmpty() { return false; }
        void reset() {}
        void set(android.view.ViewTreeObserver.InternalInsetsInfo p0) {}
        public void setTouchableInsets(int p0) {}
    }

    public static interface OnComputeInternalInsetsListener {
        public void onComputeInternalInsets(android.view.ViewTreeObserver.InternalInsetsInfo p0);
    }

    public static interface OnDrawListener {
        public void onDraw();
    }

    public static interface OnEnterAnimationCompleteListener {
        public void onEnterAnimationComplete();
    }

    public static interface OnGlobalFocusChangeListener {
        public void onGlobalFocusChanged(android.view.View p0, android.view.View p1);
    }

    public static interface OnGlobalLayoutListener {
        public void onGlobalLayout();
    }

    public static interface OnPreDrawListener {
        public boolean onPreDraw();
    }

    public static interface OnScrollChangedListener {
        public void onScrollChanged();
    }

    public static interface OnTouchModeChangeListener {
        public void onTouchModeChanged(boolean p0);
    }

    public static interface OnWindowAttachListener {
        public void onWindowAttached();
        public void onWindowDetached();
    }

    public static interface OnWindowFocusChangeListener {
        public void onWindowFocusChanged(boolean p0);
    }

    public static interface OnWindowVisibilityChangeListener {
        public void onWindowVisibilityChanged(int p0);
    }
}
