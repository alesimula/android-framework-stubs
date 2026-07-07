package android.widget;

public class EditText extends android.widget.TextView {
    private static final int ID_BOLD = 16908379;
    private static final int ID_ITALIC = 16908380;
    private static final int ID_UNDERLINE = 16908381;
    public static final long LINE_HEIGHT_FOR_LOCALE = 303326708L;
    private boolean mStyleShortcutsEnabled;
    public EditText(android.content.Context p0) { super((android.content.Context)null); }
    public EditText(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public EditText(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public EditText(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private boolean performStylingAction(int p0) { return false; }
    public void extendSelection(int p0) {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    protected boolean getDefaultEditable() { return false; }
    protected android.text.method.MovementMethod getDefaultMovementMethod() { return null; }
    public boolean getFreezesText() { return false; }
    public android.text.Editable getText() { return null; }
    public boolean isStyleShortcutEnabled() { return false; }
    public boolean onKeyShortcut(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onTextContextMenuItem(int p0) { return false; }
    public void selectAll() {}
    public void setEllipsize(android.text.TextUtils.TruncateAt p0) {}
    public void setSelection(int p0) {}
    public void setSelection(int p0, int p1) {}
    public void setStyleShortcutsEnabled(boolean p0) {}
    public void setText(java.lang.CharSequence p0, android.widget.TextView.BufferType p1) {}
    protected final boolean supportsAutoSizeText() { return false; }
}
