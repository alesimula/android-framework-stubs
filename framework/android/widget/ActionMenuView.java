package android.widget;

public class ActionMenuView extends android.widget.LinearLayout implements com.android.internal.view.menu.MenuBuilder.ItemInvoker, com.android.internal.view.menu.MenuView {
    static final int GENERATED_ITEM_PADDING = 4;
    static final int MIN_CELL_SIZE = 56;
    private static final java.lang.String TAG = "ActionMenuView";
    private com.android.internal.view.menu.MenuPresenter.Callback mActionMenuPresenterCallback;
    private boolean mFormatItems;
    private int mFormatItemsWidth;
    private int mGeneratedItemPadding;
    private com.android.internal.view.menu.MenuBuilder mMenu;
    private com.android.internal.view.menu.MenuBuilder.Callback mMenuBuilderCallback;
    private int mMinCellSize;
    private android.widget.ActionMenuView.OnMenuItemClickListener mOnMenuItemClickListener;
    private android.content.Context mPopupContext;
    private int mPopupTheme;
    private android.widget.ActionMenuPresenter mPresenter;
    private boolean mReserveOverflow;
    public ActionMenuView(android.content.Context p0) { super((android.content.Context)null); }
    public ActionMenuView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    static int measureChildForCells(android.view.View p0, int p1, int p2, int p3, int p4) { return 0; }
    private void onMeasureExactFormat(int p0, int p1) {}
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p0) { return false; }
    public void dismissPopupMenus() {}
    public boolean dispatchPopulateAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) { return false; }
    protected android.widget.ActionMenuView.LayoutParams generateDefaultLayoutParams() { return null; }
    public android.widget.ActionMenuView.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    protected android.widget.ActionMenuView.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p0) { return null; }
    public android.widget.ActionMenuView.LayoutParams generateOverflowButtonLayoutParams() { return null; }
    public android.view.Menu getMenu() { return null; }
    public android.graphics.drawable.Drawable getOverflowIcon() { return null; }
    public int getPopupTheme() { return 0; }
    public int getWindowAnimations() { return 0; }
    protected boolean hasDividerBeforeChildAt(int p0) { return false; }
    public boolean hideOverflowMenu() { return false; }
    public void initialize(com.android.internal.view.menu.MenuBuilder p0) {}
    public boolean invokeItem(com.android.internal.view.menu.MenuItemImpl p0) { return false; }
    public boolean isOverflowMenuShowPending() { return false; }
    public boolean isOverflowMenuShowing() { return false; }
    public boolean isOverflowReserved() { return false; }
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    public void onDetachedFromWindow() {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onMeasure(int p0, int p1) {}
    public com.android.internal.view.menu.MenuBuilder peekMenu() { return null; }
    public void setExpandedActionViewsExclusive(boolean p0) {}
    public void setMenuCallbacks(com.android.internal.view.menu.MenuPresenter.Callback p0, com.android.internal.view.menu.MenuBuilder.Callback p1) {}
    public void setOnMenuItemClickListener(android.widget.ActionMenuView.OnMenuItemClickListener p0) {}
    public void setOverflowIcon(android.graphics.drawable.Drawable p0) {}
    public void setOverflowReserved(boolean p0) {}
    public void setPopupTheme(int p0) {}
    public void setPresenter(android.widget.ActionMenuPresenter p0) {}
    public boolean showOverflowMenu() { return false; }

    public static interface ActionMenuChildView {
        public boolean needsDividerAfter();
        public boolean needsDividerBefore();
    }

    private class ActionMenuPresenterCallback implements com.android.internal.view.menu.MenuPresenter.Callback {
        private ActionMenuPresenterCallback(android.widget.ActionMenuView p0) {}
        public void onCloseMenu(com.android.internal.view.menu.MenuBuilder p0, boolean p1) {}
        public boolean onOpenSubMenu(com.android.internal.view.menu.MenuBuilder p0) { return false; }
    }

    public static class LayoutParams extends android.widget.LinearLayout.LayoutParams {
        @android.view.ViewDebug.ExportedProperty(category="layout")
        public int cellsUsed;
        @android.view.ViewDebug.ExportedProperty(category="layout")
        public boolean expandable;
        public boolean expanded;
        @android.view.ViewDebug.ExportedProperty(category="layout")
        public int extraPixels;
        @android.view.ViewDebug.ExportedProperty(category="layout")
        public boolean isOverflowButton;
        @android.view.ViewDebug.ExportedProperty(category="layout")
        public boolean preventEdgeOffset;
        public LayoutParams(int p0, int p1) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(int p0, int p1, boolean p2) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.content.Context p0, android.util.AttributeSet p1) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.LayoutParams p0) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.widget.ActionMenuView.LayoutParams p0) { super((android.view.ViewGroup.LayoutParams)null); }
        protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}
    }

    private class MenuBuilderCallback implements com.android.internal.view.menu.MenuBuilder.Callback {
        private MenuBuilderCallback(android.widget.ActionMenuView p0) {}
        public boolean onMenuItemSelected(com.android.internal.view.menu.MenuBuilder p0, android.view.MenuItem p1) { return false; }
        public void onMenuModeChange(com.android.internal.view.menu.MenuBuilder p0) {}
    }

    public static interface OnMenuItemClickListener {
        public boolean onMenuItemClick(android.view.MenuItem p0);
    }
}
