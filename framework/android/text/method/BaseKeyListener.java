package android.text.method;

public abstract class BaseKeyListener extends android.text.method.MetaKeyKeyListener implements android.text.method.KeyListener {
    private static final int CARRIAGE_RETURN = 13;
    private static final int LINE_FEED = 10;
    static final java.lang.Object OLD_SEL_START = null;
    static android.graphics.Paint sCachedPaint;
    private final java.lang.Object mLock = null;
    public BaseKeyListener() { super(); }
    private static int adjustReplacementSpan(java.lang.CharSequence p0, int p1, boolean p2) { return 0; }
    private boolean backspaceOrForwardDelete(android.view.View p0, android.text.Editable p1, int p2, android.view.KeyEvent p3, boolean p4) { return false; }
    private boolean deleteLineFromCursor(android.view.View p0, android.text.Editable p1, boolean p2) { return false; }
    private boolean deleteSelection(android.view.View p0, android.text.Editable p1) { return false; }
    private boolean deleteUntilWordBoundary(android.view.View p0, android.text.Editable p1, boolean p2) { return false; }
    private static int getOffsetForBackspaceKey(java.lang.CharSequence p0, int p1) { return 0; }
    private static int getOffsetForForwardDeleteKey(java.lang.CharSequence p0, int p1, android.graphics.Paint p2) { return 0; }
    private static boolean isVariationSelector(int p0) { return false; }
    static int makeTextContentType(android.text.method.TextKeyListener.Capitalize p0, boolean p1) { return 0; }
    public static void replaceText(android.text.Editable p0, int p1, int p2, java.lang.CharSequence p3, int p4, int p5, android.view.KeyEvent p6) {}
    protected static void replaceText(android.text.Editable p0, int p1, int p2, java.lang.CharSequence p3, android.view.KeyEvent p4) {}
    public boolean backspace(android.view.View p0, android.text.Editable p1, int p2, android.view.KeyEvent p3) { return false; }
    public boolean forwardDelete(android.view.View p0, android.text.Editable p1, int p2, android.view.KeyEvent p3) { return false; }
    public boolean onKeyDown(android.view.View p0, android.text.Editable p1, int p2, android.view.KeyEvent p3) { return false; }
    public boolean onKeyOther(android.view.View p0, android.text.Editable p1, android.view.KeyEvent p2) { return false; }

    public static class PhysicalInputSpan {
        public PhysicalInputSpan() {}
    }
}
