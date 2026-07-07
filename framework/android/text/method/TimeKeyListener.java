package android.text.method;

public class TimeKeyListener extends android.text.method.NumberKeyListener {
    public static final char[] CHARACTERS = null;
    private static final java.lang.String SKELETON_12HOUR = "hms";
    private static final java.lang.String SKELETON_24HOUR = "Hms";
    private static final java.lang.String SYMBOLS_TO_IGNORE = "ahHKkms";
    private static final java.util.HashMap<java.util.Locale, android.text.method.TimeKeyListener> sInstanceCache = null;
    private static final java.lang.Object sLock = null;
    private final char[] mCharacters = null;
    private final boolean mNeedsAdvancedInput = false;
    @java.lang.Deprecated
    public TimeKeyListener() { super(); }
    public TimeKeyListener(java.util.Locale p0) { super(); }
    @java.lang.Deprecated
    public static android.text.method.TimeKeyListener getInstance() { return null; }
    public static android.text.method.TimeKeyListener getInstance(java.util.Locale p0) { return null; }
    protected char[] getAcceptedChars() { return null; }
    public int getInputType() { return 0; }
}
