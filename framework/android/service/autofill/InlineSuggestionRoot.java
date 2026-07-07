package android.service.autofill;

public class InlineSuggestionRoot extends android.widget.FrameLayout {
    private static final java.lang.String TAG = "InlineSuggestionRoot";
    private final android.service.autofill.IInlineSuggestionUiCallback mCallback = null;
    private float mDownX;
    private float mDownY;
    private final int mTouchSlop = 0;
    public InlineSuggestionRoot(android.content.Context p0, android.service.autofill.IInlineSuggestionUiCallback p1) { super((android.content.Context)null); }
    public boolean dispatchTouchEvent(android.view.MotionEvent p0) { return false; }
}
