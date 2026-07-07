package android.view;

public interface Menu {
    public static final int CATEGORY_ALTERNATIVE = 262144;
    public static final int CATEGORY_CONTAINER = 65536;
    public static final int CATEGORY_MASK = -65536;
    public static final int CATEGORY_SECONDARY = 196608;
    public static final int CATEGORY_SHIFT = 16;
    public static final int CATEGORY_SYSTEM = 131072;
    public static final int FIRST = 1;
    public static final int FLAG_ALWAYS_PERFORM_CLOSE = 2;
    public static final int FLAG_APPEND_TO_GROUP = 1;
    public static final int FLAG_PERFORM_NO_CLOSE = 1;
    public static final int NONE = 0;
    public static final int SUPPORTED_MODIFIERS_MASK = 69647;
    public static final int USER_MASK = 65535;
    public static final int USER_SHIFT = 0;
    public android.view.MenuItem add(int p0);
    public android.view.MenuItem add(int p0, int p1, int p2, int p3);
    public android.view.MenuItem add(int p0, int p1, int p2, java.lang.CharSequence p3);
    public android.view.MenuItem add(java.lang.CharSequence p0);
    public int addIntentOptions(int p0, int p1, int p2, android.content.ComponentName p3, android.content.Intent[] p4, android.content.Intent p5, int p6, android.view.MenuItem[] p7);
    public android.view.SubMenu addSubMenu(int p0);
    public android.view.SubMenu addSubMenu(int p0, int p1, int p2, int p3);
    public android.view.SubMenu addSubMenu(int p0, int p1, int p2, java.lang.CharSequence p3);
    public android.view.SubMenu addSubMenu(java.lang.CharSequence p0);
    public void clear();
    public void close();
    public android.view.MenuItem findItem(int p0);
    public android.view.MenuItem getItem(int p0);
    public boolean hasVisibleItems();
    public boolean isShortcutKey(int p0, android.view.KeyEvent p1);
    public boolean performIdentifierAction(int p0, int p1);
    public boolean performShortcut(int p0, android.view.KeyEvent p1, int p2);
    public void removeGroup(int p0);
    public void removeItem(int p0);
    public void setGroupCheckable(int p0, boolean p1, boolean p2);
    default public void setGroupDividerEnabled(boolean p0) {}
    public void setGroupEnabled(int p0, boolean p1);
    public void setGroupVisible(int p0, boolean p1);
    default public void setOptionalIconsVisible(boolean p0) {}
    public void setQwertyMode(boolean p0);
    public int size();
}
