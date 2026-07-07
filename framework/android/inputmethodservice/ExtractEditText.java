package android.inputmethodservice;

public class ExtractEditText extends android.widget.EditText {
    private android.inputmethodservice.InputMethodService mIME;
    private int mSettingExtractedText;
    public ExtractEditText(android.content.Context p0) { super((android.content.Context)null); }
    public ExtractEditText(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public ExtractEditText(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public ExtractEditText(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    protected void deleteText_internal(int p0, int p1) {}
    public void finishInternalChanges() {}
    public boolean hasFocus() { return false; }
    public boolean hasVerticalScrollBar() { return false; }
    public boolean hasWindowFocus() { return false; }
    public boolean isFocused() { return false; }
    public boolean isInExtractedMode() { return false; }
    public boolean isInputMethodTarget() { return false; }
    protected void onSelectionChanged(int p0, int p1) {}
    public boolean onTextContextMenuItem(int p0) { return false; }
    public boolean performClick() { return false; }
    protected void replaceText_internal(int p0, int p1, java.lang.CharSequence p2) {}
    protected void setCursorPosition_internal(int p0, int p1) {}
    public void setExtractedText(android.view.inputmethod.ExtractedText p0) {}
    void setIME(android.inputmethodservice.InputMethodService p0) {}
    protected void setSpan_internal(java.lang.Object p0, int p1, int p2, int p3) {}
    public void startInternalChanges() {}
    protected void viewClicked(android.view.inputmethod.InputMethodManager p0) {}
}
