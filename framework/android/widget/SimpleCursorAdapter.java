package android.widget;

public class SimpleCursorAdapter extends android.widget.ResourceCursorAdapter {
    private android.widget.SimpleCursorAdapter.CursorToStringConverter mCursorToStringConverter;
    protected int[] mFrom;
    java.lang.String[] mOriginalFrom;
    private int mStringConversionColumn;
    protected int[] mTo;
    private android.widget.SimpleCursorAdapter.ViewBinder mViewBinder;
    @java.lang.Deprecated
    public SimpleCursorAdapter(android.content.Context p0, int p1, android.database.Cursor p2, java.lang.String[] p3, int[] p4) { super((android.content.Context)null, 0, (android.database.Cursor)null); }
    public SimpleCursorAdapter(android.content.Context p0, int p1, android.database.Cursor p2, java.lang.String[] p3, int[] p4, int p5) { super((android.content.Context)null, 0, (android.database.Cursor)null); }
    private void findColumns(android.database.Cursor p0, java.lang.String[] p1) {}
    public void bindView(android.view.View p0, android.content.Context p1, android.database.Cursor p2) {}
    public void changeCursorAndColumns(android.database.Cursor p0, java.lang.String[] p1, int[] p2) {}
    public java.lang.CharSequence convertToString(android.database.Cursor p0) { return null; }
    public android.widget.SimpleCursorAdapter.CursorToStringConverter getCursorToStringConverter() { return null; }
    public int getStringConversionColumn() { return 0; }
    public android.widget.SimpleCursorAdapter.ViewBinder getViewBinder() { return null; }
    public void setCursorToStringConverter(android.widget.SimpleCursorAdapter.CursorToStringConverter p0) {}
    public void setStringConversionColumn(int p0) {}
    public void setViewBinder(android.widget.SimpleCursorAdapter.ViewBinder p0) {}
    public void setViewImage(android.widget.ImageView p0, java.lang.String p1) {}
    public void setViewText(android.widget.TextView p0, java.lang.String p1) {}
    public android.database.Cursor swapCursor(android.database.Cursor p0) { return null; }

    public static interface CursorToStringConverter {
        public java.lang.CharSequence convertToString(android.database.Cursor p0);
    }

    public static interface ViewBinder {
        public boolean setViewValue(android.view.View p0, android.database.Cursor p1, int p2);
    }
}
