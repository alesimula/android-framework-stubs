package com.android.internal.view.menu;

public class ListMenuItemView extends android.widget.LinearLayout implements com.android.internal.view.menu.MenuView.ItemView, android.widget.AbsListView.SelectionBoundsAdjuster {
    private static final java.lang.String TAG = "ListMenuItemView";
    private android.graphics.drawable.Drawable mBackground;
    private android.widget.CheckBox mCheckBox;
    private android.widget.LinearLayout mContent;
    private boolean mForceShowIcon;
    private android.widget.ImageView mGroupDivider;
    private boolean mHasListDivider;
    private android.widget.ImageView mIconView;
    private android.view.LayoutInflater mInflater;
    private com.android.internal.view.menu.MenuItemImpl mItemData;
    private int mMenuType;
    private boolean mPreserveIconSpacing;
    private android.widget.RadioButton mRadioButton;
    private android.widget.TextView mShortcutView;
    private android.graphics.drawable.Drawable mSubMenuArrow;
    private android.widget.ImageView mSubMenuArrowView;
    private int mTextAppearance;
    private android.content.Context mTextAppearanceContext;
    private android.widget.TextView mTitleView;
    public ListMenuItemView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public ListMenuItemView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public ListMenuItemView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private void addContentView(android.view.View p0) {}
    private void addContentView(android.view.View p0, int p1) {}
    private android.view.LayoutInflater getInflater() { return null; }
    private void insertCheckBox() {}
    private void insertIconView() {}
    private void insertRadioButton() {}
    private void setSubMenuArrowVisible(boolean p0) {}
    public void adjustListItemSelectionBounds(android.graphics.Rect p0) {}
    public com.android.internal.view.menu.MenuItemImpl getItemData() { return null; }
    public void initialize(com.android.internal.view.menu.MenuItemImpl p0, int p1) {}
    protected void onFinishInflate() {}
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    protected void onMeasure(int p0, int p1) {}
    public boolean prefersCondensedTitle() { return false; }
    public void setCheckable(boolean p0) {}
    public void setChecked(boolean p0) {}
    public void setForceShowIcon(boolean p0) {}
    public void setGroupDividerEnabled(boolean p0) {}
    public void setIcon(android.graphics.drawable.Drawable p0) {}
    public void setShortcut(boolean p0, char p1) {}
    public void setTitle(java.lang.CharSequence p0) {}
    public boolean showsIcon() { return false; }
}
