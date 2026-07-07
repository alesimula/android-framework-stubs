package com.android.internal.app;

public abstract class AbstractMultiProfilePagerAdapter extends com.android.internal.widget.PagerAdapter {
    static final int PROFILE_PERSONAL = 0;
    static final int PROFILE_WORK = 1;
    private static final java.lang.String TAG = "AbstractMultiProfilePagerAdapter";
    private final android.os.UserHandle mCloneUserHandle = null;
    private final android.content.Context mContext = null;
    private int mCurrentPage;
    private final com.android.internal.app.AbstractMultiProfilePagerAdapter.EmptyStateProvider mEmptyStateProvider = null;
    private java.util.Set<java.lang.Integer> mLoadedPages;
    private com.android.internal.app.AbstractMultiProfilePagerAdapter.OnProfileSelectedListener mOnProfileSelectedListener;
    private final com.android.internal.app.AbstractMultiProfilePagerAdapter.QuietModeManager mQuietModeManager = null;
    private final android.os.UserHandle mWorkProfileUserHandle = null;
    AbstractMultiProfilePagerAdapter(android.content.Context p0, int p1, com.android.internal.app.AbstractMultiProfilePagerAdapter.EmptyStateProvider p2, com.android.internal.app.AbstractMultiProfilePagerAdapter.QuietModeManager p3, android.os.UserHandle p4, android.os.UserHandle p5) { super(); }
    private boolean isQuietModeEnabled(android.os.UserHandle p0) { return false; }
    private boolean rebuildTab(com.android.internal.app.ResolverListAdapter p0, boolean p1) { return false; }
    private void resetViewVisibilitiesForEmptyState(android.view.View p0) {}
    private boolean shouldSkipRebuild(com.android.internal.app.ResolverListAdapter p0) { return false; }
    private void showSpinner(android.view.View p0) {}
    private int userHandleToPageIndex(android.os.UserHandle p0) { return 0; }
    void clearInactiveProfileCache() {}
    public void destroyItem(android.view.ViewGroup p0, int p1, java.lang.Object p2) {}
    abstract android.view.ViewGroup getActiveAdapterView();
    public abstract com.android.internal.app.ResolverListAdapter getActiveListAdapter();
    public abstract java.lang.Object getAdapterForIndex(int p0);
    public android.os.UserHandle getCloneUserHandle() { return null; }
    android.content.Context getContext() { return null; }
    public int getCount() { return 0; }
    protected int getCurrentPage() { return 0; }
    abstract java.lang.Object getCurrentRootAdapter();
    public android.os.UserHandle getCurrentUserHandle() { return null; }
    abstract android.view.ViewGroup getInactiveAdapterView();
    public abstract com.android.internal.app.ResolverListAdapter getInactiveListAdapter();
    public abstract com.android.internal.app.AbstractMultiProfilePagerAdapter.ProfileDescriptor getItem(int p0);
    abstract int getItemCount();
    abstract com.android.internal.app.ResolverListAdapter getListAdapterForUserHandle(android.os.UserHandle p0);
    public java.lang.CharSequence getPageTitle(int p0) { return null; }
    public abstract com.android.internal.app.ResolverListAdapter getPersonalListAdapter();
    public abstract com.android.internal.app.ResolverListAdapter getWorkListAdapter();
    public android.view.ViewGroup instantiateItem(android.view.ViewGroup p0, int p1) { return null; }
    public boolean isViewFromObject(android.view.View p0, java.lang.Object p1) { return false; }
    boolean rebuildActiveTab(boolean p0) { return false; }
    boolean rebuildInactiveTab(boolean p0) { return false; }
    void setOnProfileSelectedListener(com.android.internal.app.AbstractMultiProfilePagerAdapter.OnProfileSelectedListener p0) {}
    protected void setupContainerPadding(android.view.View p0) {}
    abstract void setupListAdapter(int p0);
    void setupViewPager(com.android.internal.widget.ViewPager p0) {}
    boolean shouldShowEmptyStateScreen(com.android.internal.app.ResolverListAdapter p0) { return false; }
    void showEmptyResolverListEmptyState(com.android.internal.app.ResolverListAdapter p0) {}
    protected void showEmptyState(com.android.internal.app.ResolverListAdapter p0, com.android.internal.app.AbstractMultiProfilePagerAdapter.EmptyState p1, android.view.View.OnClickListener p2) {}
    protected void showListView(com.android.internal.app.ResolverListAdapter p0) {}

    public static class CompositeEmptyStateProvider implements com.android.internal.app.AbstractMultiProfilePagerAdapter.EmptyStateProvider {
        private final com.android.internal.app.AbstractMultiProfilePagerAdapter.EmptyStateProvider[] mProviders = null;
        public CompositeEmptyStateProvider(com.android.internal.app.AbstractMultiProfilePagerAdapter.EmptyStateProvider... p0) {}
        public com.android.internal.app.AbstractMultiProfilePagerAdapter.EmptyState getEmptyState(com.android.internal.app.ResolverListAdapter p0) { return null; }
    }

    public static class CrossProfileIntentsChecker {
        private final android.content.ContentResolver mContentResolver = null;
        public CrossProfileIntentsChecker(android.content.ContentResolver p0) {}
        public boolean hasCrossProfileIntents(java.util.List<android.content.Intent> p0, int p1, int p2) { return false; }
    }

    public static interface EmptyState {
        default public com.android.internal.app.AbstractMultiProfilePagerAdapter.EmptyState.ClickListener getButtonClickListener() { return null; }
        default public java.lang.String getSubtitle() { return null; }
        default public java.lang.String getTitle() { return null; }
        default public void onEmptyStateShown() {}
        default public boolean shouldSkipDataRebuild() { return false; }
        default public boolean useDefaultEmptyView() { return false; }

        public static interface ClickListener {
            public void onClick(com.android.internal.app.AbstractMultiProfilePagerAdapter.EmptyState.TabControl p0);
        }

        public static interface TabControl {
            public void showSpinner();
        }
    }

    public static interface EmptyStateProvider {
        default public com.android.internal.app.AbstractMultiProfilePagerAdapter.EmptyState getEmptyState(com.android.internal.app.ResolverListAdapter p0) { return null; }
    }

    public static class MyUserIdProvider {
        public MyUserIdProvider() {}
        public int getMyUserId() { return 0; }
    }

    public static interface OnProfileSelectedListener {
        public void onProfilePageStateChanged(int p0);
        public void onProfileSelected(int p0);
    }

    static interface OnSwitchOnWorkSelectedListener {
        public void onSwitchOnWorkSelected();
    }

    static @interface Profile {
    }

    public static class ProfileDescriptor {
        private final android.view.ViewGroup mEmptyStateView = null;
        public final android.view.ViewGroup rootView = null;
        ProfileDescriptor(android.view.ViewGroup p0) {}
        protected android.view.ViewGroup getEmptyStateView() { return null; }
    }

    public static interface QuietModeManager {
        public boolean isQuietModeEnabled(android.os.UserHandle p0);
        public boolean isWaitingToEnableWorkProfile();
        public void markWorkProfileEnabledBroadcastReceived();
        public void requestQuietModeEnabled(boolean p0, android.os.UserHandle p1);
    }
}
