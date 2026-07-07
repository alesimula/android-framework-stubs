package com.android.internal.view.menu;

public final class IconMenuView extends android.view.ViewGroup implements com.android.internal.view.menu.MenuBuilder.ItemInvoker, com.android.internal.view.menu.MenuView, java.lang.Runnable {
    private static final int ITEM_CAPTION_CYCLE_DELAY = 1000;
    private int mAnimations;
    private boolean mHasStaleChildren;
    private android.graphics.drawable.Drawable mHorizontalDivider;
    private int mHorizontalDividerHeight;
    private java.util.ArrayList<android.graphics.Rect> mHorizontalDividerRects;
    private android.graphics.drawable.Drawable mItemBackground;
    private boolean mLastChildrenCaptionMode;
    private int[] mLayout;
    private int mLayoutNumRows;
    private int mMaxItems;
    private int mMaxItemsPerRow;
    private int mMaxRows;
    private com.android.internal.view.menu.MenuBuilder mMenu;
    private boolean mMenuBeingLongpressed;
    private android.graphics.drawable.Drawable mMoreIcon;
    private int mNumActualItemsShown;
    private int mRowHeight;
    private android.graphics.drawable.Drawable mVerticalDivider;
    private java.util.ArrayList<android.graphics.Rect> mVerticalDividerRects;
    private int mVerticalDividerWidth;
    public IconMenuView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    private void calculateItemFittingMetadata(int p0) {}
    private boolean doItemsFit() { return false; }
    private void layoutItems(int p0) {}
    private void layoutItemsUsingGravity(int p0, int p1) {}
    private void positionChildren(int p0, int p1) {}
    private void setChildrenCaptionMode(boolean p0) {}
    private void setCycleShortcutCaptionMode(boolean p0) {}
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p0) { return false; }
    com.android.internal.view.menu.IconMenuItemView createMoreItemView() { return null; }
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public com.android.internal.view.menu.IconMenuView.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    android.graphics.drawable.Drawable getItemBackgroundDrawable() { return null; }
    public int[] getLayout() { return null; }
    public int getLayoutNumRows() { return 0; }
    int getMaxItems() { return 0; }
    int getNumActualItemsShown() { return 0; }
    public int getWindowAnimations() { return 0; }
    public void initialize(com.android.internal.view.menu.MenuBuilder p0) {}
    public boolean invokeItem(com.android.internal.view.menu.MenuItemImpl p0) { return false; }
    void markStaleChildren() {}
    protected void onAttachedToWindow() {}
    protected void onDetachedFromWindow() {}
    protected void onDraw(android.graphics.Canvas p0) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onMeasure(int p0, int p1) {}
    protected void onRestoreInstanceState(android.os.Parcelable p0) {}
    protected android.os.Parcelable onSaveInstanceState() { return null; }
    public void onWindowFocusChanged(boolean p0) {}
    public void run() {}
    void setNumActualItemsShown(int p0) {}

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        int bottom;
        int desiredWidth;
        int left;
        int maxNumItemsOnRow;
        int right;
        int top;
        public LayoutParams(int p0, int p1) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.content.Context p0, android.util.AttributeSet p1) { super((android.view.ViewGroup.LayoutParams)null); }
    }

    private static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<com.android.internal.view.menu.IconMenuView.SavedState> CREATOR = null;
        int focusedPosition;
        private SavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public SavedState(android.os.Parcelable p0, int p1) { super((android.os.Parcel)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
