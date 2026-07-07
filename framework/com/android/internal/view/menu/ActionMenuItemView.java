package com.android.internal.view.menu;

public class ActionMenuItemView extends android.widget.TextView implements com.android.internal.view.menu.MenuView.ItemView, android.view.View.OnClickListener, android.widget.ActionMenuView.ActionMenuChildView {
    private static final int MAX_ICON_SIZE = 32;
    private static final java.lang.String TAG = "ActionMenuItemView";
    private boolean mAllowTextWithIcon;
    private boolean mExpandedFormat;
    private android.widget.ForwardingListener mForwardingListener;
    private android.graphics.drawable.Drawable mIcon;
    private com.android.internal.view.menu.MenuItemImpl mItemData;
    private com.android.internal.view.menu.MenuBuilder.ItemInvoker mItemInvoker;
    private int mMaxIconSize;
    private int mMinWidth;
    private com.android.internal.view.menu.ActionMenuItemView.PopupCallback mPopupCallback;
    private int mSavedPaddingLeft;
    private java.lang.CharSequence mTitle;
    public ActionMenuItemView(android.content.Context p0) { super((android.content.Context)null); }
    public ActionMenuItemView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public ActionMenuItemView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public ActionMenuItemView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private boolean shouldAllowTextWithIcon() { return false; }
    private void updateTextButtonVisibility() {}
    public boolean dispatchHoverEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchPopulateAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) { return false; }
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public com.android.internal.view.menu.MenuItemImpl getItemData() { return null; }
    public boolean hasText() { return false; }
    public void initialize(com.android.internal.view.menu.MenuItemImpl p0, int p1) {}
    public boolean needsDividerAfter() { return false; }
    public boolean needsDividerBefore() { return false; }
    public void onClick(android.view.View p0) {}
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    protected void onMeasure(int p0, int p1) {}
    public void onPopulateAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) {}
    public void onRestoreInstanceState(android.os.Parcelable p0) {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean prefersCondensedTitle() { return false; }
    public void setCheckable(boolean p0) {}
    public void setChecked(boolean p0) {}
    public void setExpandedFormat(boolean p0) {}
    public void setIcon(android.graphics.drawable.Drawable p0) {}
    public void setItemInvoker(com.android.internal.view.menu.MenuBuilder.ItemInvoker p0) {}
    public void setPadding(int p0, int p1, int p2, int p3) {}
    public void setPopupCallback(com.android.internal.view.menu.ActionMenuItemView.PopupCallback p0) {}
    public void setShortcut(boolean p0, char p1) {}
    public void setTitle(java.lang.CharSequence p0) {}
    public boolean showsIcon() { return false; }

    private class ActionMenuItemForwardingListener extends android.widget.ForwardingListener {
        public ActionMenuItemForwardingListener(com.android.internal.view.menu.ActionMenuItemView p0) { super(null); }
        public com.android.internal.view.menu.ShowableListMenu getPopup() { return null; }
        protected boolean onForwardingStarted() { return false; }
    }

    public static abstract class PopupCallback {
        public PopupCallback() {}
        public abstract com.android.internal.view.menu.ShowableListMenu getPopup();
    }
}
