package android.widget;

public class MultiAutoCompleteTextView extends android.widget.AutoCompleteTextView {
    private android.widget.MultiAutoCompleteTextView.Tokenizer mTokenizer;
    public MultiAutoCompleteTextView(android.content.Context p0) { super((android.content.Context)null); }
    public MultiAutoCompleteTextView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public MultiAutoCompleteTextView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public MultiAutoCompleteTextView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public boolean enoughToFilter() { return false; }
    void finishInit() {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    protected void performFiltering(java.lang.CharSequence p0, int p1) {}
    protected void performFiltering(java.lang.CharSequence p0, int p1, int p2, int p3) {}
    public void performValidation() {}
    protected void replaceText(java.lang.CharSequence p0) {}
    public void setTokenizer(android.widget.MultiAutoCompleteTextView.Tokenizer p0) {}

    public static class CommaTokenizer implements android.widget.MultiAutoCompleteTextView.Tokenizer {
        public CommaTokenizer() {}
        public int findTokenEnd(java.lang.CharSequence p0, int p1) { return 0; }
        public int findTokenStart(java.lang.CharSequence p0, int p1) { return 0; }
        public java.lang.CharSequence terminateToken(java.lang.CharSequence p0) { return null; }
    }

    public static interface Tokenizer {
        public int findTokenEnd(java.lang.CharSequence p0, int p1);
        public int findTokenStart(java.lang.CharSequence p0, int p1);
        public java.lang.CharSequence terminateToken(java.lang.CharSequence p0);
    }
}
