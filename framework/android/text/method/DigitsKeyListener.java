package android.text.method;

public class DigitsKeyListener extends android.text.method.NumberKeyListener {
    private static final char[][] COMPATIBILITY_CHARACTERS = null;
    private static final int DECIMAL = 2;
    private static final java.lang.String DEFAULT_DECIMAL_POINT_CHARS = ".";
    private static final java.lang.String DEFAULT_SIGN_CHARS = "-+";
    private static final char EN_DASH = (char)0x2013;
    private static final char HYPHEN_MINUS = '-';
    private static final char MINUS_SIGN = (char)0x2212;
    private static final int SIGN = 1;
    private static final java.lang.Object sLocaleCacheLock = null;
    private static final java.util.HashMap<java.util.Locale, android.text.method.DigitsKeyListener[]> sLocaleInstanceCache = null;
    private static final java.lang.Object sStringCacheLock = null;
    private static final java.util.HashMap<java.lang.String, android.text.method.DigitsKeyListener> sStringInstanceCache = null;
    private char[] mAccepted;
    private final boolean mDecimal = false;
    private java.lang.String mDecimalPointChars;
    private final java.util.Locale mLocale = null;
    private boolean mNeedsAdvancedInput;
    private final boolean mSign = false;
    private java.lang.String mSignChars;
    private final boolean mStringMode = false;
    @java.lang.Deprecated
    public DigitsKeyListener() { super(); }
    private DigitsKeyListener(java.lang.String p0) { super(); }
    public DigitsKeyListener(java.util.Locale p0) { super(); }
    public DigitsKeyListener(java.util.Locale p0, boolean p1, boolean p2) { super(); }
    @java.lang.Deprecated
    public DigitsKeyListener(boolean p0, boolean p1) { super(); }
    private void calculateNeedForAdvancedInput() {}
    @java.lang.Deprecated
    public static android.text.method.DigitsKeyListener getInstance() { return null; }
    public static android.text.method.DigitsKeyListener getInstance(java.lang.String p0) { return null; }
    public static android.text.method.DigitsKeyListener getInstance(java.util.Locale p0) { return null; }
    public static android.text.method.DigitsKeyListener getInstance(java.util.Locale p0, android.text.method.DigitsKeyListener p1) { return null; }
    public static android.text.method.DigitsKeyListener getInstance(java.util.Locale p0, boolean p1, boolean p2) { return null; }
    @java.lang.Deprecated
    public static android.text.method.DigitsKeyListener getInstance(boolean p0, boolean p1) { return null; }
    private boolean isDecimalPointChar(char p0) { return false; }
    private boolean isSignChar(char p0) { return false; }
    private void setToCompat() {}
    private static java.lang.String stripBidiControls(java.lang.String p0) { return null; }
    public java.lang.CharSequence filter(java.lang.CharSequence p0, int p1, int p2, android.text.Spanned p3, int p4, int p5) { return null; }
    protected char[] getAcceptedChars() { return null; }
    public int getInputType() { return 0; }
}
