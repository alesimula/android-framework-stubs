package android.widget;

public abstract class ResourceCursorAdapter extends android.widget.CursorAdapter {
    private android.view.LayoutInflater mDropDownInflater;
    private int mDropDownLayout;
    private android.view.LayoutInflater mInflater;
    private int mLayout;
    @java.lang.Deprecated
    public ResourceCursorAdapter(android.content.Context p0, int p1, android.database.Cursor p2) { super((android.content.Context)null, (android.database.Cursor)null); }
    public ResourceCursorAdapter(android.content.Context p0, int p1, android.database.Cursor p2, int p3) { super((android.content.Context)null, (android.database.Cursor)null); }
    public ResourceCursorAdapter(android.content.Context p0, int p1, android.database.Cursor p2, boolean p3) { super((android.content.Context)null, (android.database.Cursor)null); }
    public android.view.View newDropDownView(android.content.Context p0, android.database.Cursor p1, android.view.ViewGroup p2) { return null; }
    public android.view.View newView(android.content.Context p0, android.database.Cursor p1, android.view.ViewGroup p2) { return null; }
    public void setDropDownViewResource(int p0) {}
    public void setDropDownViewTheme(android.content.res.Resources.Theme p0) {}
    public void setViewResource(int p0) {}
}
