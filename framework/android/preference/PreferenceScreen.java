package android.preference;

@java.lang.Deprecated
public final class PreferenceScreen extends android.preference.PreferenceGroup implements android.widget.AdapterView.OnItemClickListener, android.content.DialogInterface.OnDismissListener {
    private android.app.Dialog mDialog;
    private boolean mDialogFitsSystemWindows;
    private android.graphics.drawable.Drawable mDividerDrawable;
    private boolean mDividerSpecified;
    private int mLayoutResId;
    private android.widget.ListView mListView;
    private android.widget.ListAdapter mRootAdapter;
    public PreferenceScreen(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null, (android.util.AttributeSet)null); }
    private void showDialog(android.os.Bundle p0) {}
    public void bind(android.widget.ListView p0) {}
    public android.app.Dialog getDialog() { return null; }
    public android.widget.ListAdapter getRootAdapter() { return null; }
    protected boolean isOnSameScreenAsChildren() { return false; }
    protected void onClick() {}
    protected android.widget.ListAdapter onCreateRootAdapter() { return null; }
    public void onDismiss(android.content.DialogInterface p0) {}
    public void onItemClick(android.widget.AdapterView p0, android.view.View p1, int p2, long p3) {}
    protected void onRestoreInstanceState(android.os.Parcelable p0) {}
    protected android.os.Parcelable onSaveInstanceState() { return null; }
    public void setDialogFitsSystemWindows(boolean p0) {}

    private static class SavedState extends android.preference.Preference.BaseSavedState {
        public static final android.os.Parcelable.Creator<android.preference.PreferenceScreen.SavedState> CREATOR = null;
        android.os.Bundle dialogBundle;
        boolean isDialogShowing;
        public SavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public SavedState(android.os.Parcelable p0) { super((android.os.Parcel)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
