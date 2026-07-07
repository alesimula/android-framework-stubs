package android.content;

public class UriMatcher {
    private static final int EXACT = 0;
    public static final int NO_MATCH = -1;
    private static final int NUMBER = 1;
    private static final int TEXT = 2;
    private java.util.ArrayList<android.content.UriMatcher> mChildren;
    private int mCode;
    private final java.lang.String mText = null;
    private final int mWhich = 0;
    public UriMatcher(int p0) {}
    private UriMatcher(int p0, java.lang.String p1) {}
    private static android.content.UriMatcher createChild(java.lang.String p0) { return null; }
    public void addURI(java.lang.String p0, java.lang.String p1, int p2) {}
    public int match(android.net.Uri p0) { return 0; }
}
