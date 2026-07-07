package android.widget;

public class ShareActionProvider extends android.view.ActionProvider {
    private static final int DEFAULT_INITIAL_ACTIVITY_COUNT = 4;
    public static final java.lang.String DEFAULT_SHARE_HISTORY_FILE_NAME = "share_history.xml";
    private final android.content.Context mContext = null;
    private int mMaxShownActivityCount;
    private android.widget.ActivityChooserModel.OnChooseActivityListener mOnChooseActivityListener;
    private final android.widget.ShareActionProvider.ShareMenuItemOnMenuItemClickListener mOnMenuItemClickListener = null;
    private android.widget.ShareActionProvider.OnShareTargetSelectedListener mOnShareTargetSelectedListener;
    private java.lang.String mShareHistoryFileName;
    public ShareActionProvider(android.content.Context p0) { super(null); }
    private void setActivityChooserPolicyIfNeeded() {}
    public boolean hasSubMenu() { return false; }
    public android.view.View onCreateActionView() { return null; }
    public void onPrepareSubMenu(android.view.SubMenu p0) {}
    public void setOnShareTargetSelectedListener(android.widget.ShareActionProvider.OnShareTargetSelectedListener p0) {}
    public void setShareHistoryFileName(java.lang.String p0) {}
    public void setShareIntent(android.content.Intent p0) {}

    public static interface OnShareTargetSelectedListener {
        public boolean onShareTargetSelected(android.widget.ShareActionProvider p0, android.content.Intent p1);
    }

    private class ShareActivityChooserModelPolicy implements android.widget.ActivityChooserModel.OnChooseActivityListener {
        private ShareActivityChooserModelPolicy(android.widget.ShareActionProvider p0) {}
        public boolean onChooseActivity(android.widget.ActivityChooserModel p0, android.content.Intent p1) { return false; }
    }

    private class ShareMenuItemOnMenuItemClickListener implements android.view.MenuItem.OnMenuItemClickListener {
        private ShareMenuItemOnMenuItemClickListener(android.widget.ShareActionProvider p0) {}
        public boolean onMenuItemClick(android.view.MenuItem p0) { return false; }
    }
}
