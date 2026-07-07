package android.app;

@java.lang.Deprecated
public class FragmentBreadCrumbs extends android.view.ViewGroup implements android.app.FragmentManager.OnBackStackChangedListener {
    private static final int DEFAULT_GRAVITY = 8388627;
    android.app.Activity mActivity;
    android.widget.LinearLayout mContainer;
    private int mGravity;
    android.view.LayoutInflater mInflater;
    private int mLayoutResId;
    int mMaxVisible;
    private android.app.FragmentBreadCrumbs.OnBreadCrumbClickListener mOnBreadCrumbClickListener;
    private android.view.View.OnClickListener mOnClickListener;
    private android.view.View.OnClickListener mParentClickListener;
    android.app.BackStackRecord mParentEntry;
    private int mTextColor;
    android.app.BackStackRecord mTopEntry;
    public FragmentBreadCrumbs(android.content.Context p0) { super((android.content.Context)null); }
    public FragmentBreadCrumbs(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public FragmentBreadCrumbs(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public FragmentBreadCrumbs(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private android.app.BackStackRecord createBackStackEntry(java.lang.CharSequence p0, java.lang.CharSequence p1) { return null; }
    private android.app.FragmentManager.BackStackEntry getPreEntry(int p0) { return null; }
    private int getPreEntryCount() { return 0; }
    public void onBackStackChanged() {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onMeasure(int p0, int p1) {}
    public void setActivity(android.app.Activity p0) {}
    public void setMaxVisible(int p0) {}
    public void setOnBreadCrumbClickListener(android.app.FragmentBreadCrumbs.OnBreadCrumbClickListener p0) {}
    public void setParentTitle(java.lang.CharSequence p0, java.lang.CharSequence p1, android.view.View.OnClickListener p2) {}
    public void setTitle(java.lang.CharSequence p0, java.lang.CharSequence p1) {}
    void updateCrumbs() {}

    @java.lang.Deprecated
    public static interface OnBreadCrumbClickListener {
        public boolean onBreadCrumbClick(android.app.FragmentManager.BackStackEntry p0, int p1);
    }
}
