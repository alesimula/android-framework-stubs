package android.content;

@java.lang.Deprecated
public class CursorLoader extends android.content.AsyncTaskLoader<android.database.Cursor> {
    android.os.CancellationSignal mCancellationSignal;
    android.database.Cursor mCursor;
    final android.content.Loader<android.database.Cursor>.ForceLoadContentObserver mObserver = null;
    java.lang.String[] mProjection;
    java.lang.String mSelection;
    java.lang.String[] mSelectionArgs;
    java.lang.String mSortOrder;
    android.net.Uri mUri;
    public CursorLoader(android.content.Context p0) { super((android.content.Context)null); }
    public CursorLoader(android.content.Context p0, android.net.Uri p1, java.lang.String[] p2, java.lang.String p3, java.lang.String[] p4, java.lang.String p5) { super((android.content.Context)null); }
    public void cancelLoadInBackground() {}
    public void deliverResult(android.database.Cursor p0) {}
    public void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
    public java.lang.String[] getProjection() { return null; }
    public java.lang.String getSelection() { return null; }
    public java.lang.String[] getSelectionArgs() { return null; }
    public java.lang.String getSortOrder() { return null; }
    public android.net.Uri getUri() { return null; }
    public android.database.Cursor loadInBackground() { return null; }
    public void onCanceled(android.database.Cursor p0) {}
    protected void onReset() {}
    protected void onStartLoading() {}
    protected void onStopLoading() {}
    public void setProjection(java.lang.String[] p0) {}
    public void setSelection(java.lang.String p0) {}
    public void setSelectionArgs(java.lang.String[] p0) {}
    public void setSortOrder(java.lang.String p0) {}
    public void setUri(android.net.Uri p0) {}
}
