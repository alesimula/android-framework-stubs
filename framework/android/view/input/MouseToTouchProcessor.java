package android.view.input;

public class MouseToTouchProcessor extends android.view.InputEventCompatProcessor {
    private static final int STATE_AWAITING = 0;
    private static final int STATE_CONVERTING = 1;
    private static final int STATE_NON_PRIMARY_CLICK = 2;
    private static final java.lang.String TAG = null;
    private final android.util.SparseArray<android.view.InputEvent> mModifiedEventMap = null;
    private int mState;
    public MouseToTouchProcessor(android.content.Context p0, android.os.Handler p1) { super((android.content.Context)null); }
    private static boolean isActionButtonEvent(int p0) { return false; }
    public static boolean isCompatibilityNeeded(android.content.Context p0) { return false; }
    private static android.view.MotionEvent obtainRewrittenEventAsTouch(android.view.MotionEvent p0) { return null; }
    private java.util.List<android.view.InputEvent> processEventInAwaitingState(android.view.MotionEvent p0) { return null; }
    private java.util.List<android.view.InputEvent> processEventInConvertingState(android.view.MotionEvent p0) { return null; }
    private java.util.List<android.view.InputEvent> processEventInNonPrimaryClickState(android.view.MotionEvent p0) { return null; }
    private java.util.List<android.view.InputEvent> processMotionEvent(android.view.MotionEvent p0) { return null; }
    public android.view.InputEvent processInputEventBeforeFinish(android.view.InputEvent p0) { return null; }
    public java.util.List<android.view.InputEvent> processInputEventForCompatibility(android.view.InputEvent p0) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface State {
    }
}
