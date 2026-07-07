package android.database;

public final class CursorJoiner implements java.util.Iterator<android.database.CursorJoiner.Result>, java.lang.Iterable<android.database.CursorJoiner.Result> {
    static final boolean $assertionsDisabled = false;
    private int[] mColumnsLeft;
    private int[] mColumnsRight;
    private android.database.CursorJoiner.Result mCompareResult;
    private boolean mCompareResultIsValid;
    private android.database.Cursor mCursorLeft;
    private android.database.Cursor mCursorRight;
    private java.lang.String[] mValues;
    public CursorJoiner(android.database.Cursor p0, java.lang.String[] p1, android.database.Cursor p2, java.lang.String[] p3) {}
    private int[] buildColumnIndiciesArray(android.database.Cursor p0, java.lang.String[] p1) { return null; }
    private static int compareStrings(java.lang.String... p0) { return 0; }
    private void incrementCursors() {}
    private static void populateValues(java.lang.String[] p0, android.database.Cursor p1, int[] p2, int p3) {}
    public boolean hasNext() { return false; }
    public java.util.Iterator<android.database.CursorJoiner.Result> iterator() { return null; }
    public android.database.CursorJoiner.Result next() { return null; }
    public void remove() {}

    public static enum Result {
        BOTH,
        LEFT,
        RIGHT;
        private static final android.database.CursorJoiner.Result[] $VALUES = null;
        private Result() {}
    }
}
