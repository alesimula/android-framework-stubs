package android.view.input;

public class LetterboxScrollProcessor extends android.view.InputEventCompatProcessor {
    private final android.content.Context mContext = null;
    private final java.util.Set<java.lang.Integer> mGeneratedEventIds = null;
    private final java.util.List<android.view.InputEvent> mProcessedEvents = null;
    private final android.view.GestureDetector mScrollDetector = null;
    private android.view.input.LetterboxScrollProcessor.LetterboxScrollState mState;
    public LetterboxScrollProcessor(android.content.Context p0, android.os.Handler p1) { super((android.content.Context)null); }
    private static boolean appInFreeform(android.content.Context p0) { return false; }
    private void applyOffset(android.view.MotionEvent p0, android.graphics.Rect p1) {}
    private float calculateOffset(float p0, int p1) { return 0.0f; }
    private android.graphics.Rect getAppBounds() { return null; }
    public static boolean isCompatibilityNeeded(android.content.Context p0) { return false; }
    private boolean isOutsideAppBounds(android.view.MotionEvent p0, android.graphics.Rect p1) { return false; }
    private boolean isTheSameDisplay(android.view.InputEvent p0) { return false; }
    private java.util.List<android.view.InputEvent> processMotionEvent(android.view.MotionEvent p0) { return null; }
    public android.view.InputEvent processInputEventBeforeFinish(android.view.InputEvent p0) { return null; }
    public java.util.List<android.view.InputEvent> processInputEventForCompatibility(android.view.InputEvent p0) { return null; }

    private static enum LetterboxScrollState {
        AWAITING_GESTURE_START,
        GESTURE_STARTED_IN_APP,
        GESTURE_STARTED_OUTSIDE_APP,
        SCROLLING_STARTED_OUTSIDE_APP;
        private static final android.view.input.LetterboxScrollProcessor.LetterboxScrollState[] $VALUES = null;
        private LetterboxScrollState() {}
    }

    private class ScrollListener extends android.view.GestureDetector.SimpleOnGestureListener {
        private ScrollListener(android.view.input.LetterboxScrollProcessor p0) { super(); }
        public boolean onScroll(android.view.MotionEvent p0, android.view.MotionEvent p1, float p2, float p3) { return false; }
    }
}
