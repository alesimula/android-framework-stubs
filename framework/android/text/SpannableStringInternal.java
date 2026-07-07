package android.text;

abstract class SpannableStringInternal {
    private static final int COLUMNS = 3;
    static final java.lang.Object[] EMPTY = null;
    private static final int END = 1;
    private static final int FLAGS = 2;
    private static final int START = 0;
    private int mSpanCount;
    private int[] mSpanData;
    private java.lang.Object[] mSpans;
    private java.lang.String mText;
    SpannableStringInternal(java.lang.CharSequence p0, int p1, int p2) {}
    SpannableStringInternal(java.lang.CharSequence p0, int p1, int p2, boolean p3) {}
    private void checkRange(java.lang.String p0, int p1, int p2) {}
    private void copySpans(android.text.SpannableStringInternal p0, int p1, int p2) {}
    private void copySpans(android.text.Spanned p0, int p1, int p2) {}
    private void copySpansFromInternal(android.text.SpannableStringInternal p0, int p1, int p2, boolean p3) {}
    private void copySpansFromSpanned(android.text.Spanned p0, int p1, int p2, boolean p3) {}
    private boolean isIndexFollowsNextLine(int p0) { return false; }
    private final boolean isOutOfCopyRange(int p0, int p1, int p2, int p3) { return false; }
    private static java.lang.String region(int p0, int p1) { return null; }
    private void sendSpanAdded(java.lang.Object p0, int p1, int p2) {}
    private void sendSpanChanged(java.lang.Object p0, int p1, int p2, int p3, int p4) {}
    private void sendSpanRemoved(java.lang.Object p0, int p1, int p2) {}
    private void setSpan(java.lang.Object p0, int p1, int p2, int p3, boolean p4) {}
    public final char charAt(int p0) { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public final void getChars(int p0, int p1, char[] p2, int p3) {}
    public int getSpanEnd(java.lang.Object p0) { return 0; }
    public int getSpanFlags(java.lang.Object p0) { return 0; }
    public int getSpanStart(java.lang.Object p0) { return 0; }
    public <T extends java.lang.Object> T[] getSpans(int p0, int p1, java.lang.Class<T> p2) { return null; }
    public int hashCode() { return 0; }
    public final int length() { return 0; }
    public int nextSpanTransition(int p0, int p1, java.lang.Class p2) { return 0; }
    void removeSpan(java.lang.Object p0) {}
    public void removeSpan(java.lang.Object p0, int p1) {}
    void setSpan(java.lang.Object p0, int p1, int p2, int p3) {}
    public final java.lang.String toString() { return null; }
}
