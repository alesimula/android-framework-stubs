package android.view;

public interface MenuItem {
    public static final int SHOW_AS_ACTION_ALWAYS = 2;
    public static final int SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW = 8;
    public static final int SHOW_AS_ACTION_IF_ROOM = 1;
    public static final int SHOW_AS_ACTION_NEVER = 0;
    public static final int SHOW_AS_ACTION_WITH_TEXT = 4;
    public boolean collapseActionView();
    public boolean expandActionView();
    public android.view.ActionProvider getActionProvider();
    public android.view.View getActionView();
    default public int getAlphabeticModifiers() { return 0; }
    public char getAlphabeticShortcut();
    default public java.lang.CharSequence getContentDescription() { return null; }
    public int getGroupId();
    public android.graphics.drawable.Drawable getIcon();
    default public android.graphics.BlendMode getIconTintBlendMode() { return null; }
    default public android.content.res.ColorStateList getIconTintList() { return null; }
    default public android.graphics.PorterDuff.Mode getIconTintMode() { return null; }
    public android.content.Intent getIntent();
    public int getItemId();
    public android.view.ContextMenu.ContextMenuInfo getMenuInfo();
    default public int getNumericModifiers() { return 0; }
    public char getNumericShortcut();
    public int getOrder();
    public android.view.SubMenu getSubMenu();
    public java.lang.CharSequence getTitle();
    public java.lang.CharSequence getTitleCondensed();
    default public java.lang.CharSequence getTooltipText() { return null; }
    public boolean hasSubMenu();
    public boolean isActionViewExpanded();
    public boolean isCheckable();
    public boolean isChecked();
    public boolean isEnabled();
    public boolean isVisible();
    default public boolean requiresActionButton() { return false; }
    default public boolean requiresOverflow() { return false; }
    public android.view.MenuItem setActionProvider(android.view.ActionProvider p0);
    public android.view.MenuItem setActionView(int p0);
    public android.view.MenuItem setActionView(android.view.View p0);
    public android.view.MenuItem setAlphabeticShortcut(char p0);
    default public android.view.MenuItem setAlphabeticShortcut(char p0, int p1) { return null; }
    public android.view.MenuItem setCheckable(boolean p0);
    public android.view.MenuItem setChecked(boolean p0);
    default public android.view.MenuItem setContentDescription(java.lang.CharSequence p0) { return null; }
    public android.view.MenuItem setEnabled(boolean p0);
    public android.view.MenuItem setIcon(int p0);
    public android.view.MenuItem setIcon(android.graphics.drawable.Drawable p0);
    default public android.view.MenuItem setIconTintBlendMode(android.graphics.BlendMode p0) { return null; }
    default public android.view.MenuItem setIconTintList(android.content.res.ColorStateList p0) { return null; }
    default public android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode p0) { return null; }
    public android.view.MenuItem setIntent(android.content.Intent p0);
    public android.view.MenuItem setNumericShortcut(char p0);
    default public android.view.MenuItem setNumericShortcut(char p0, int p1) { return null; }
    public android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener p0);
    public android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener p0);
    public android.view.MenuItem setShortcut(char p0, char p1);
    default public android.view.MenuItem setShortcut(char p0, char p1, int p2, int p3) { return null; }
    public void setShowAsAction(int p0);
    public android.view.MenuItem setShowAsActionFlags(int p0);
    public android.view.MenuItem setTitle(int p0);
    public android.view.MenuItem setTitle(java.lang.CharSequence p0);
    public android.view.MenuItem setTitleCondensed(java.lang.CharSequence p0);
    default public android.view.MenuItem setTooltipText(java.lang.CharSequence p0) { return null; }
    public android.view.MenuItem setVisible(boolean p0);

    public static interface OnActionExpandListener {
        public boolean onMenuItemActionCollapse(android.view.MenuItem p0);
        public boolean onMenuItemActionExpand(android.view.MenuItem p0);
    }

    public static interface OnMenuItemClickListener {
        public boolean onMenuItemClick(android.view.MenuItem p0);
    }
}
