package android.view;

public class MenuInflater {
    private static final java.lang.Class<?>[] ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE = null;
    private static final java.lang.Class<?>[] ACTION_VIEW_CONSTRUCTOR_SIGNATURE = null;
    private static final java.lang.String LOG_TAG = "MenuInflater";
    private static final int NO_ID = 0;
    private static final java.lang.String XML_GROUP = "group";
    private static final java.lang.String XML_ITEM = "item";
    private static final java.lang.String XML_MENU = "menu";
    private final java.lang.Object[] mActionProviderConstructorArguments = null;
    private final java.lang.Object[] mActionViewConstructorArguments = null;
    private android.content.Context mContext;
    private java.lang.Object mRealOwner;
    public MenuInflater(android.content.Context p0) {}
    public MenuInflater(android.content.Context p0, java.lang.Object p1) {}
    private java.lang.Object findRealOwner(java.lang.Object p0) { return null; }
    private java.lang.Object getRealOwner() { return null; }
    private void parseMenu(org.xmlpull.v1.XmlPullParser p0, android.util.AttributeSet p1, android.view.Menu p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    private void registerMenu(android.view.MenuItem p0, android.util.AttributeSet p1) {}
    private void registerMenu(android.view.SubMenu p0, android.util.AttributeSet p1) {}
    android.content.Context getContext() { return null; }
    public void inflate(int p0, android.view.Menu p1) {}

    private static class InflatedOnMenuItemClickListener implements android.view.MenuItem.OnMenuItemClickListener {
        private static final java.lang.Class<?>[] PARAM_TYPES = null;
        private java.lang.reflect.Method mMethod;
        private java.lang.Object mRealOwner;
        public InflatedOnMenuItemClickListener(java.lang.Object p0, java.lang.String p1) {}
        public boolean onMenuItemClick(android.view.MenuItem p0) { return false; }
    }

    private class MenuState {
        private static final int defaultGroupId = 0;
        private static final int defaultItemCategory = 0;
        private static final int defaultItemCheckable = 0;
        private static final boolean defaultItemChecked = false;
        private static final boolean defaultItemEnabled = true;
        private static final int defaultItemId = 0;
        private static final int defaultItemOrder = 0;
        private static final boolean defaultItemVisible = true;
        private int groupCategory;
        private int groupCheckable;
        private boolean groupEnabled;
        private int groupId;
        private int groupOrder;
        private boolean groupVisible;
        private android.view.ActionProvider itemActionProvider;
        private java.lang.String itemActionProviderClassName;
        private java.lang.String itemActionViewClassName;
        private int itemActionViewLayout;
        private boolean itemAdded;
        private int itemAlphabeticModifiers;
        private char itemAlphabeticShortcut;
        private int itemCategoryOrder;
        private int itemCheckable;
        private boolean itemChecked;
        private java.lang.CharSequence itemContentDescription;
        private boolean itemEnabled;
        private int itemIconResId;
        private android.content.res.ColorStateList itemIconTintList;
        private int itemId;
        private java.lang.String itemListenerMethodName;
        private int itemNumericModifiers;
        private char itemNumericShortcut;
        private int itemShowAsAction;
        private java.lang.CharSequence itemTitle;
        private java.lang.CharSequence itemTitleCondensed;
        private java.lang.CharSequence itemTooltipText;
        private boolean itemVisible;
        private android.graphics.BlendMode mItemIconBlendMode;
        private android.view.Menu menu;
        public MenuState(android.view.MenuInflater p0, android.view.Menu p1) {}
        private char getShortcut(java.lang.String p0) { return 0; }
        private <T extends java.lang.Object> T newInstance(java.lang.String p0, java.lang.Class<?>[] p1, java.lang.Object[] p2) { return null; }
        private void setItem(android.view.MenuItem p0) {}
        public android.view.MenuItem addItem() { return null; }
        public android.view.SubMenu addSubMenuItem() { return null; }
        public boolean hasAddedItem() { return false; }
        public void readGroup(android.util.AttributeSet p0) {}
        public void readItem(android.util.AttributeSet p0) {}
        public void resetGroup() {}
    }
}
