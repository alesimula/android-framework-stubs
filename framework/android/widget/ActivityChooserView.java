package android.widget;

public class ActivityChooserView extends android.view.ViewGroup implements android.widget.ActivityChooserModel.ActivityChooserModelClient {
    private static final java.lang.String LOG_TAG = "ActivityChooserView";
    private final android.widget.LinearLayout mActivityChooserContent = null;
    private final android.graphics.drawable.Drawable mActivityChooserContentBackground = null;
    private final android.widget.ActivityChooserView.ActivityChooserViewAdapter mAdapter = null;
    private final android.widget.ActivityChooserView.Callbacks mCallbacks = null;
    private int mDefaultActionButtonContentDescription;
    private final android.widget.FrameLayout mDefaultActivityButton = null;
    private final android.widget.ImageView mDefaultActivityButtonImage = null;
    private final android.widget.FrameLayout mExpandActivityOverflowButton = null;
    private final android.widget.ImageView mExpandActivityOverflowButtonImage = null;
    private int mInitialActivityCount;
    private boolean mIsAttachedToWindow;
    private boolean mIsSelectingDefaultActivity;
    private final int mListPopupMaxWidth = 0;
    private android.widget.ListPopupWindow mListPopupWindow;
    private final android.database.DataSetObserver mModelDataSetOberver = null;
    private android.widget.PopupWindow.OnDismissListener mOnDismissListener;
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener mOnGlobalLayoutListener = null;
    android.view.ActionProvider mProvider;
    public ActivityChooserView(android.content.Context p0) { super((android.content.Context)null); }
    public ActivityChooserView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public ActivityChooserView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public ActivityChooserView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private android.widget.ListPopupWindow getListPopupWindow() { return null; }
    private void showPopupUnchecked(int p0) {}
    private void updateAppearance() {}
    public boolean dismissPopup() { return false; }
    public android.widget.ActivityChooserModel getDataModel() { return null; }
    public boolean isShowingPopup() { return false; }
    protected void onAttachedToWindow() {}
    protected void onDetachedFromWindow() {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onMeasure(int p0, int p1) {}
    public void setActivityChooserModel(android.widget.ActivityChooserModel p0) {}
    public void setDefaultActionButtonContentDescription(int p0) {}
    public void setExpandActivityOverflowButtonContentDescription(int p0) {}
    public void setExpandActivityOverflowButtonDrawable(android.graphics.drawable.Drawable p0) {}
    public void setInitialActivityCount(int p0) {}
    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener p0) {}
    public void setProvider(android.view.ActionProvider p0) {}
    public boolean showPopup() { return false; }

    private class ActivityChooserViewAdapter extends android.widget.BaseAdapter {
        private static final int ITEM_VIEW_TYPE_ACTIVITY = 0;
        private static final int ITEM_VIEW_TYPE_COUNT = 3;
        private static final int ITEM_VIEW_TYPE_FOOTER = 1;
        public static final int MAX_ACTIVITY_COUNT_DEFAULT = 4;
        public static final int MAX_ACTIVITY_COUNT_UNLIMITED = 2147483647;
        private android.widget.ActivityChooserModel mDataModel;
        private boolean mHighlightDefaultActivity;
        private int mMaxActivityCount;
        private boolean mShowDefaultActivity;
        private boolean mShowFooterView;
        private ActivityChooserViewAdapter(android.widget.ActivityChooserView p0) { super(); }
        public int getActivityCount() { return 0; }
        public int getCount() { return 0; }
        public android.widget.ActivityChooserModel getDataModel() { return null; }
        public android.content.pm.ResolveInfo getDefaultActivity() { return null; }
        public int getHistorySize() { return 0; }
        public java.lang.Object getItem(int p0) { return null; }
        public long getItemId(int p0) { return 0L; }
        public int getItemViewType(int p0) { return 0; }
        public boolean getShowDefaultActivity() { return false; }
        public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
        public int getViewTypeCount() { return 0; }
        public int measureContentWidth() { return 0; }
        public void setDataModel(android.widget.ActivityChooserModel p0) {}
        public void setMaxActivityCount(int p0) {}
        public void setShowDefaultActivity(boolean p0, boolean p1) {}
        public void setShowFooterView(boolean p0) {}
    }

    private class Callbacks implements android.widget.AdapterView.OnItemClickListener, android.view.View.OnClickListener, android.view.View.OnLongClickListener, android.widget.PopupWindow.OnDismissListener {
        private Callbacks(android.widget.ActivityChooserView p0) {}
        private void notifyOnDismissListener() {}
        private void startActivity(android.content.Intent p0, android.content.pm.ResolveInfo p1) {}
        public void onClick(android.view.View p0) {}
        public void onDismiss() {}
        public void onItemClick(android.widget.AdapterView<?> p0, android.view.View p1, int p2, long p3) {}
        public boolean onLongClick(android.view.View p0) { return false; }
    }
}
