package android.text.method;

public class SingleLineTransformationMethod extends android.text.method.ReplacementTransformationMethod {
    private static char[] ORIGINAL;
    private static char[] REPLACEMENT;
    private static android.text.method.SingleLineTransformationMethod sInstance;
    public SingleLineTransformationMethod() { super(); }
    public static android.text.method.SingleLineTransformationMethod getInstance() { return null; }
    protected char[] getOriginal() { return null; }
    protected char[] getReplacement() { return null; }
}
