package android.view;

public final class ScrollCaptureSearchResults {
    private static final int AFTER = 1;
    private static final int BEFORE = -1;
    private static final int EQUAL = 0;
    static final java.util.Comparator<android.view.ScrollCaptureTarget> PRIORITY_ORDER = null;
    private final android.os.CancellationSignal mCancel = null;
    private boolean mComplete;
    private int mCompleted;
    private final java.util.concurrent.Executor mExecutor = null;
    private java.lang.Runnable mOnCompleteListener;
    private final java.util.List<android.view.ScrollCaptureTarget> mTargets = null;
    public ScrollCaptureSearchResults(java.util.concurrent.Executor p0) {}
    private static int area(android.graphics.Rect p0) { return 0; }
    private android.graphics.Rect getScrollBoundsInWindow(android.view.ScrollCaptureTarget p0) { return null; }
    private static boolean hasIncludeHint(android.view.ScrollCaptureTarget p0) { return false; }
    private static boolean hasIncludeHint(android.view.View p0) { return false; }
    private static boolean isDescendant(android.view.View p0, android.view.View p1) { return false; }
    private static boolean nullOrEmpty(android.graphics.Rect p0) { return false; }
    private void signalComplete() {}
    public void addTarget(android.view.ScrollCaptureTarget p0) {}
    void dump(android.util.IndentingPrintWriter p0) {}
    public void finish() {}
    public java.util.List<android.view.ScrollCaptureTarget> getTargets() { return null; }
    public android.view.ScrollCaptureTarget getTopResult() { return null; }
    public boolean isComplete() { return false; }
    public boolean isEmpty() { return false; }
    public void setOnCompleteListener(java.lang.Runnable p0) {}

    private class SearchRequest implements java.util.function.Consumer<android.graphics.Rect> {
        private android.view.ScrollCaptureTarget mTarget;
        SearchRequest(android.view.ScrollCaptureSearchResults p0, android.view.ScrollCaptureTarget p1) {}
        private void consume(android.graphics.Rect p0) {}
        public void accept(android.graphics.Rect p0) {}
    }
}
