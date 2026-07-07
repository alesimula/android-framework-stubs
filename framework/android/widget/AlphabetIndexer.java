package android.widget;

public class AlphabetIndexer extends android.database.DataSetObserver implements android.widget.SectionIndexer {
    private android.util.SparseIntArray mAlphaMap;
    protected java.lang.CharSequence mAlphabet;
    private java.lang.String[] mAlphabetArray;
    private int mAlphabetLength;
    private java.text.Collator mCollator;
    protected int mColumnIndex;
    protected android.database.Cursor mDataCursor;
    public AlphabetIndexer(android.database.Cursor p0, int p1, java.lang.CharSequence p2) { super(); }
    protected int compare(java.lang.String p0, java.lang.String p1) { return 0; }
    public int getPositionForSection(int p0) { return 0; }
    public int getSectionForPosition(int p0) { return 0; }
    public java.lang.Object[] getSections() { return null; }
    public void onChanged() {}
    public void onInvalidated() {}
    public void setCursor(android.database.Cursor p0) {}
}
