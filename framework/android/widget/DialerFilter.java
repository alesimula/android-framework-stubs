package android.widget;

@java.lang.Deprecated
public class DialerFilter extends android.widget.RelativeLayout {
    public static final int DIGITS_AND_LETTERS = 1;
    public static final int DIGITS_AND_LETTERS_NO_DIGITS = 2;
    public static final int DIGITS_AND_LETTERS_NO_LETTERS = 3;
    public static final int DIGITS_ONLY = 4;
    public static final int LETTERS_ONLY = 5;
    android.widget.EditText mDigits;
    android.widget.EditText mHint;
    android.widget.ImageView mIcon;
    android.text.InputFilter[] mInputFilters;
    private boolean mIsQwerty;
    android.widget.EditText mLetters;
    int mMode;
    android.widget.EditText mPrimary;
    public DialerFilter(android.content.Context p0) { super((android.content.Context)null); }
    public DialerFilter(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    private void makeDigitsPrimary() {}
    private void makeLettersPrimary() {}
    private void swapPrimaryAndHint(boolean p0) {}
    public void append(java.lang.String p0) {}
    public void clearText() {}
    public java.lang.CharSequence getDigits() { return null; }
    public java.lang.CharSequence getFilterText() { return null; }
    public java.lang.CharSequence getLetters() { return null; }
    public int getMode() { return 0; }
    public boolean isQwertyKeyboard() { return false; }
    protected void onFinishInflate() {}
    protected void onFocusChanged(boolean p0, int p1, android.graphics.Rect p2) {}
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
    protected void onModeChange(int p0, int p1) {}
    public void removeFilterWatcher(android.text.TextWatcher p0) {}
    public void setDigitsWatcher(android.text.TextWatcher p0) {}
    public void setFilterWatcher(android.text.TextWatcher p0) {}
    public void setLettersWatcher(android.text.TextWatcher p0) {}
    public void setMode(int p0) {}
}
