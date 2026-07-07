package android.widget;

public class Toolbar extends android.view.ViewGroup {
    private static final java.lang.String TAG = "Toolbar";
    private com.android.internal.view.menu.MenuPresenter.Callback mActionMenuPresenterCallback;
    private int mButtonGravity;
    private android.widget.ImageButton mCollapseButtonView;
    private java.lang.CharSequence mCollapseDescription;
    private android.graphics.drawable.Drawable mCollapseIcon;
    private int mCollapseIconResId;
    private boolean mCollapsible;
    private int mContentInsetEndWithActions;
    private int mContentInsetStartWithNavigation;
    private android.widget.RtlSpacingHelper mContentInsets;
    private boolean mEatingTouch;
    android.view.View mExpandedActionView;
    private android.widget.Toolbar.ExpandedActionViewMenuPresenter mExpandedMenuPresenter;
    private int mGravity;
    private final java.util.ArrayList<android.view.View> mHiddenViews = null;
    private android.widget.ImageView mLogoView;
    private int mMaxButtonHeight;
    private com.android.internal.view.menu.MenuBuilder.Callback mMenuBuilderCallback;
    private android.widget.ActionMenuView mMenuView;
    private final android.widget.ActionMenuView.OnMenuItemClickListener mMenuViewItemClickListener = null;
    private int mNavButtonStyle;
    private android.widget.ImageButton mNavButtonView;
    private android.widget.Toolbar.OnMenuItemClickListener mOnMenuItemClickListener;
    private android.widget.ActionMenuPresenter mOuterActionMenuPresenter;
    private android.content.Context mPopupContext;
    private int mPopupTheme;
    private final java.lang.Runnable mShowOverflowMenuRunnable = null;
    private java.lang.CharSequence mSubtitleText;
    private int mSubtitleTextAppearance;
    private int mSubtitleTextColor;
    private android.widget.TextView mSubtitleTextView;
    private final int[] mTempMargins = null;
    private final java.util.ArrayList<android.view.View> mTempViews = null;
    private int mTitleMarginBottom;
    private int mTitleMarginEnd;
    private int mTitleMarginStart;
    private int mTitleMarginTop;
    private java.lang.CharSequence mTitleText;
    private int mTitleTextAppearance;
    private int mTitleTextColor;
    private android.widget.TextView mTitleTextView;
    private com.android.internal.widget.ToolbarWidgetWrapper mWrapper;
    public Toolbar(android.content.Context p0) { super((android.content.Context)null); }
    public Toolbar(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public Toolbar(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public Toolbar(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private void addCustomViewsWithGravity(java.util.List<android.view.View> p0, int p1) {}
    private void addSystemView(android.view.View p0, boolean p1) {}
    private void ensureCollapseButtonView() {}
    private void ensureCollapseButtonView(android.graphics.drawable.Drawable p0) {}
    private void ensureContentInsets() {}
    private void ensureLogoView() {}
    private void ensureMenu() {}
    private void ensureMenuView() {}
    private void ensureNavButtonView() {}
    private int getChildHorizontalGravity(int p0) { return 0; }
    private int getChildTop(android.view.View p0, int p1) { return 0; }
    private int getChildVerticalGravity(int p0) { return 0; }
    private android.graphics.drawable.Drawable getDefaultCollapseIcon() { return null; }
    private int getHorizontalMargins(android.view.View p0) { return 0; }
    private android.view.MenuInflater getMenuInflater() { return null; }
    private int getVerticalMargins(android.view.View p0) { return 0; }
    private int getViewListMeasuredWidth(java.util.List<android.view.View> p0, int[] p1) { return 0; }
    private boolean isChildOrHidden(android.view.View p0) { return false; }
    private static boolean isCustomView(android.view.View p0) { return false; }
    private int layoutChildLeft(android.view.View p0, int p1, int[] p2, int p3) { return 0; }
    private int layoutChildRight(android.view.View p0, int p1, int[] p2, int p3) { return 0; }
    private int measureChildCollapseMargins(android.view.View p0, int p1, int p2, int p3, int p4, int[] p5) { return 0; }
    private void measureChildConstrained(android.view.View p0, int p1, int p2, int p3, int p4, int p5) {}
    private void postShowOverflowMenu() {}
    private boolean shouldCollapse() { return false; }
    private boolean shouldLayout(android.view.View p0) { return false; }
    void addChildrenForExpandedActionView() {}
    public boolean canShowOverflowMenu() { return false; }
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p0) { return false; }
    public void collapseActionView() {}
    public void dismissPopupMenus() {}
    protected android.widget.Toolbar.LayoutParams generateDefaultLayoutParams() { return null; }
    public android.widget.Toolbar.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    protected android.widget.Toolbar.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p0) { return null; }
    public java.lang.CharSequence getCollapseContentDescription() { return null; }
    public android.graphics.drawable.Drawable getCollapseIcon() { return null; }
    public int getContentInsetEnd() { return 0; }
    public int getContentInsetEndWithActions() { return 0; }
    public int getContentInsetLeft() { return 0; }
    public int getContentInsetRight() { return 0; }
    public int getContentInsetStart() { return 0; }
    public int getContentInsetStartWithNavigation() { return 0; }
    public int getCurrentContentInsetEnd() { return 0; }
    public int getCurrentContentInsetLeft() { return 0; }
    public int getCurrentContentInsetRight() { return 0; }
    public int getCurrentContentInsetStart() { return 0; }
    public android.graphics.drawable.Drawable getLogo() { return null; }
    public java.lang.CharSequence getLogoDescription() { return null; }
    public android.view.Menu getMenu() { return null; }
    public java.lang.CharSequence getNavigationContentDescription() { return null; }
    public android.graphics.drawable.Drawable getNavigationIcon() { return null; }
    public android.view.View getNavigationView() { return null; }
    android.widget.ActionMenuPresenter getOuterActionMenuPresenter() { return null; }
    public android.graphics.drawable.Drawable getOverflowIcon() { return null; }
    android.content.Context getPopupContext() { return null; }
    public int getPopupTheme() { return 0; }
    public java.lang.CharSequence getSubtitle() { return null; }
    public java.lang.CharSequence getTitle() { return null; }
    public int getTitleMarginBottom() { return 0; }
    public int getTitleMarginEnd() { return 0; }
    public int getTitleMarginStart() { return 0; }
    public int getTitleMarginTop() { return 0; }
    public com.android.internal.widget.DecorToolbar getWrapper() { return null; }
    public boolean hasExpandedActionView() { return false; }
    public boolean hideOverflowMenu() { return false; }
    public void inflateMenu(int p0) {}
    public boolean isOverflowMenuShowPending() { return false; }
    public boolean isOverflowMenuShowing() { return false; }
    public boolean isTitleTruncated() { return false; }
    protected void onAttachedToWindow() {}
    protected void onDetachedFromWindow() {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onMeasure(int p0, int p1) {}
    protected void onRestoreInstanceState(android.os.Parcelable p0) {}
    public void onRtlPropertiesChanged(int p0) {}
    protected android.os.Parcelable onSaveInstanceState() { return null; }
    protected void onSetLayoutParams(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    void removeChildrenForExpandedActionView() {}
    public void setCollapseContentDescription(int p0) {}
    public void setCollapseContentDescription(java.lang.CharSequence p0) {}
    public void setCollapseIcon(int p0) {}
    public void setCollapseIcon(android.graphics.drawable.Drawable p0) {}
    public void setCollapsible(boolean p0) {}
    public void setContentInsetEndWithActions(int p0) {}
    public void setContentInsetStartWithNavigation(int p0) {}
    public void setContentInsetsAbsolute(int p0, int p1) {}
    public void setContentInsetsRelative(int p0, int p1) {}
    public void setLogo(int p0) {}
    public void setLogo(android.graphics.drawable.Drawable p0) {}
    public void setLogoDescription(int p0) {}
    public void setLogoDescription(java.lang.CharSequence p0) {}
    public void setMenu(com.android.internal.view.menu.MenuBuilder p0, android.widget.ActionMenuPresenter p1) {}
    public void setMenuCallbacks(com.android.internal.view.menu.MenuPresenter.Callback p0, com.android.internal.view.menu.MenuBuilder.Callback p1) {}
    public void setNavigationContentDescription(int p0) {}
    public void setNavigationContentDescription(java.lang.CharSequence p0) {}
    public void setNavigationIcon(int p0) {}
    public void setNavigationIcon(android.graphics.drawable.Drawable p0) {}
    public void setNavigationOnClickListener(android.view.View.OnClickListener p0) {}
    public void setOnMenuItemClickListener(android.widget.Toolbar.OnMenuItemClickListener p0) {}
    public void setOverflowIcon(android.graphics.drawable.Drawable p0) {}
    public void setPopupTheme(int p0) {}
    public void setSubtitle(int p0) {}
    public void setSubtitle(java.lang.CharSequence p0) {}
    public void setSubtitleTextAppearance(android.content.Context p0, int p1) {}
    public void setSubtitleTextColor(int p0) {}
    public void setTitle(int p0) {}
    public void setTitle(java.lang.CharSequence p0) {}
    public void setTitleMargin(int p0, int p1, int p2, int p3) {}
    public void setTitleMarginBottom(int p0) {}
    public void setTitleMarginEnd(int p0) {}
    public void setTitleMarginStart(int p0) {}
    public void setTitleMarginTop(int p0) {}
    public void setTitleTextAppearance(android.content.Context p0, int p1) {}
    public void setTitleTextColor(int p0) {}
    public boolean showOverflowMenu() { return false; }

    private class ExpandedActionViewMenuPresenter implements com.android.internal.view.menu.MenuPresenter {
        com.android.internal.view.menu.MenuItemImpl mCurrentExpandedItem;
        com.android.internal.view.menu.MenuBuilder mMenu;
        private ExpandedActionViewMenuPresenter(android.widget.Toolbar p0) {}
        public boolean collapseItemActionView(com.android.internal.view.menu.MenuBuilder p0, com.android.internal.view.menu.MenuItemImpl p1) { return false; }
        public boolean expandItemActionView(com.android.internal.view.menu.MenuBuilder p0, com.android.internal.view.menu.MenuItemImpl p1) { return false; }
        public boolean flagActionItems() { return false; }
        public int getId() { return 0; }
        public com.android.internal.view.menu.MenuView getMenuView(android.view.ViewGroup p0) { return null; }
        public void initForMenu(android.content.Context p0, com.android.internal.view.menu.MenuBuilder p1) {}
        public void onCloseMenu(com.android.internal.view.menu.MenuBuilder p0, boolean p1) {}
        public void onRestoreInstanceState(android.os.Parcelable p0) {}
        public android.os.Parcelable onSaveInstanceState() { return null; }
        public boolean onSubMenuSelected(com.android.internal.view.menu.SubMenuBuilder p0) { return false; }
        public void setCallback(com.android.internal.view.menu.MenuPresenter.Callback p0) {}
        public void updateMenuView(boolean p0) {}
    }

    public static class LayoutParams extends android.app.ActionBar.LayoutParams {
        static final int CUSTOM = 0;
        static final int EXPANDED = 2;
        static final int SYSTEM = 1;
        int mViewType;
        public LayoutParams(int p0) { super(0); }
        public LayoutParams(int p0, int p1) { super(0); }
        public LayoutParams(int p0, int p1, int p2) { super(0); }
        public LayoutParams(android.app.ActionBar.LayoutParams p0) { super(0); }
        public LayoutParams(android.content.Context p0, android.util.AttributeSet p1) { super(0); }
        public LayoutParams(android.view.ViewGroup.LayoutParams p0) { super(0); }
        public LayoutParams(android.view.ViewGroup.MarginLayoutParams p0) { super(0); }
        public LayoutParams(android.widget.Toolbar.LayoutParams p0) { super(0); }
    }

    public static interface OnMenuItemClickListener {
        public boolean onMenuItemClick(android.view.MenuItem p0);
    }

    static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<android.widget.Toolbar.SavedState> CREATOR = null;
        public int expandedMenuItemId;
        public boolean isOverflowOpen;
        public SavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public SavedState(android.os.Parcelable p0) { super((android.os.Parcel)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.Toolbar> {
        private int mCollapseContentDescriptionId;
        private int mCollapseIconId;
        private int mContentInsetEndId;
        private int mContentInsetEndWithActionsId;
        private int mContentInsetLeftId;
        private int mContentInsetRightId;
        private int mContentInsetStartId;
        private int mContentInsetStartWithNavigationId;
        private int mLogoDescriptionId;
        private int mLogoId;
        private int mNavigationContentDescriptionId;
        private int mNavigationIconId;
        private int mPopupThemeId;
        private boolean mPropertiesMapped;
        private int mSubtitleId;
        private int mTitleId;
        private int mTitleMarginBottomId;
        private int mTitleMarginEndId;
        private int mTitleMarginStartId;
        private int mTitleMarginTopId;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.Toolbar p0, android.view.inspector.PropertyReader p1) {}
    }
}
