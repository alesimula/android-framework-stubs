package android.text.method;

public class LinkMovementMethod extends android.text.method.ScrollingMovementMethod {
    private static final int CLICK = 1;
    private static final int DOWN = 3;
    private static java.lang.Object FROM_BELOW;
    private static final int HIDE_FLOATING_TOOLBAR_DELAY_MS = 200;
    private static final int UP = 2;
    private static android.text.method.LinkMovementMethod sInstance;
    public LinkMovementMethod() { super(); }
    private boolean action(int p0, android.widget.TextView p1, android.text.Spannable p2) { return false; }
    public static android.text.method.MovementMethod getInstance() { return null; }
    public boolean canSelectArbitrarily() { return false; }
    protected boolean down(android.widget.TextView p0, android.text.Spannable p1) { return false; }
    protected boolean handleMovementKey(android.widget.TextView p0, android.text.Spannable p1, int p2, int p3, android.view.KeyEvent p4) { return false; }
    public void initialize(android.widget.TextView p0, android.text.Spannable p1) {}
    protected boolean left(android.widget.TextView p0, android.text.Spannable p1) { return false; }
    public void onTakeFocus(android.widget.TextView p0, android.text.Spannable p1, int p2) {}
    public boolean onTouchEvent(android.widget.TextView p0, android.text.Spannable p1, android.view.MotionEvent p2) { return false; }
    protected boolean right(android.widget.TextView p0, android.text.Spannable p1) { return false; }
    protected boolean up(android.widget.TextView p0, android.text.Spannable p1) { return false; }
}
