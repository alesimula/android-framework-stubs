package android.text.method;

public class Touch {
    private Touch() {}
    public static int getInitialScrollX(android.widget.TextView p0, android.text.Spannable p1) { return 0; }
    public static int getInitialScrollY(android.widget.TextView p0, android.text.Spannable p1) { return 0; }
    public static boolean onTouchEvent(android.widget.TextView p0, android.text.Spannable p1, android.view.MotionEvent p2) { return false; }
    public static void scrollTo(android.widget.TextView p0, android.text.Layout p1, int p2, int p3) {}

    private static class DragState implements android.text.NoCopySpan {
        public boolean mFarEnough;
        public int mScrollX;
        public int mScrollY;
        public boolean mUsed;
        public float mX;
        public float mY;
        public DragState(float p0, float p1, int p2, int p3) {}
    }
}
