package android.app;

@java.lang.Deprecated
public abstract class LauncherActivity extends android.app.ListActivity {
    android.app.LauncherActivity.IconResizer mIconResizer;
    android.content.Intent mIntent;
    android.content.pm.PackageManager mPackageManager;
    public LauncherActivity() { super(); }
    private void updateAlertTitle() {}
    private void updateButtonText() {}
    protected android.content.Intent getTargetIntent() { return null; }
    protected android.content.Intent intentForPosition(int p0) { return null; }
    protected android.app.LauncherActivity.ListItem itemForPosition(int p0) { return null; }
    public java.util.List<android.app.LauncherActivity.ListItem> makeListItems() { return null; }
    protected void onCreate(android.os.Bundle p0) {}
    protected boolean onEvaluateShowIcons() { return false; }
    protected void onListItemClick(android.widget.ListView p0, android.view.View p1, int p2, long p3) {}
    protected java.util.List<android.content.pm.ResolveInfo> onQueryPackageManager(android.content.Intent p0) { return null; }
    protected void onSetContentView() {}
    protected void onSortResultList(java.util.List<android.content.pm.ResolveInfo> p0) {}
    public void setTitle(int p0) {}
    public void setTitle(java.lang.CharSequence p0) {}

    private class ActivityAdapter extends android.widget.BaseAdapter implements android.widget.Filterable {
        private final java.lang.Object lock = null;
        protected java.util.List<android.app.LauncherActivity.ListItem> mActivitiesList;
        private android.widget.Filter mFilter;
        protected final android.app.LauncherActivity.IconResizer mIconResizer = null;
        protected final android.view.LayoutInflater mInflater = null;
        private java.util.ArrayList<android.app.LauncherActivity.ListItem> mOriginalValues;
        private final boolean mShowIcons = false;
        public ActivityAdapter(android.app.LauncherActivity p0, android.app.LauncherActivity.IconResizer p1) { super(); }
        private void bindView(android.view.View p0, android.app.LauncherActivity.ListItem p1) {}
        public int getCount() { return 0; }
        public android.widget.Filter getFilter() { return null; }
        public java.lang.Object getItem(int p0) { return null; }
        public long getItemId(int p0) { return 0L; }
        public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
        public android.content.Intent intentForPosition(int p0) { return null; }
        public android.app.LauncherActivity.ListItem itemForPosition(int p0) { return null; }

        private class ArrayFilter extends android.widget.Filter {
            private ArrayFilter(android.app.LauncherActivity.ActivityAdapter p0) { super(); }
            protected android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence p0) { return null; }
            protected void publishResults(java.lang.CharSequence p0, android.widget.Filter.FilterResults p1) {}
        }
    }

    public class IconResizer {
        private android.graphics.Canvas mCanvas;
        private int mIconHeight;
        private int mIconWidth;
        private final android.graphics.Rect mOldBounds = null;
        public IconResizer(android.app.LauncherActivity p0) {}
        public android.graphics.drawable.Drawable createIconThumbnail(android.graphics.drawable.Drawable p0) { return null; }
    }

    public static class ListItem {
        public java.lang.String className;
        public android.os.Bundle extras;
        public android.graphics.drawable.Drawable icon;
        public java.lang.CharSequence label;
        public java.lang.String packageName;
        public android.content.pm.ResolveInfo resolveInfo;
        public ListItem() {}
        ListItem(android.content.pm.PackageManager p0, android.content.pm.ResolveInfo p1, android.app.LauncherActivity.IconResizer p2) {}
    }
}
