package android.app;

@java.lang.Deprecated
public class TabActivity extends android.app.ActivityGroup {
    private java.lang.String mDefaultTab;
    private int mDefaultTabIndex;
    private android.widget.TabHost mTabHost;
    public TabActivity() { super(); }
    private void ensureTabHost() {}
    public android.widget.TabHost getTabHost() { return null; }
    public android.widget.TabWidget getTabWidget() { return null; }
    protected void onChildTitleChanged(android.app.Activity p0, java.lang.CharSequence p1) {}
    public void onContentChanged() {}
    protected void onPostCreate(android.os.Bundle p0) {}
    protected void onRestoreInstanceState(android.os.Bundle p0) {}
    protected void onSaveInstanceState(android.os.Bundle p0) {}
    public void setDefaultTab(int p0) {}
    public void setDefaultTab(java.lang.String p0) {}
}
