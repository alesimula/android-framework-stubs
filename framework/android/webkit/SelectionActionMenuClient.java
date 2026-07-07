package android.webkit;

@android.annotation.SystemApi
public class SelectionActionMenuClient {
    @android.annotation.SystemApi
    public static final int DEFAULT_ITEM_COPY = 2;
    @android.annotation.SystemApi
    public static final int DEFAULT_ITEM_CUT = 1;
    @android.annotation.SystemApi
    public static final int DEFAULT_ITEM_PASTE = 3;
    @android.annotation.SystemApi
    public static final int DEFAULT_ITEM_PASTE_AS_PLAIN_TEXT = 4;
    @android.annotation.SystemApi
    public static final int DEFAULT_ITEM_SELECT_ALL = 6;
    @android.annotation.SystemApi
    public static final int DEFAULT_ITEM_SHARE = 5;
    @android.annotation.SystemApi
    public static final int DEFAULT_ITEM_WEB_SEARCH = 7;
    @android.annotation.SystemApi
    public static final int MENU_TYPE_DROPDOWN = 1;
    @android.annotation.SystemApi
    public static final int MENU_TYPE_FLOATING = 0;
    public SelectionActionMenuClient() {}
    public java.util.List<android.content.pm.ResolveInfo> filterTextProcessingActivities(android.content.Context p0, int p1, java.util.List<android.content.pm.ResolveInfo> p2) { return null; }
    public java.util.List<android.view.MenuItem> getAdditionalMenuItems(android.content.Context p0, int p1, boolean p2, boolean p3, java.lang.String p4) { return null; }
    public int[] getDefaultMenuItemOrder(int p0) { return null; }
    public boolean handleMenuItemClick(android.content.Context p0, android.view.MenuItem p1) { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE_USE)
    public static @interface DefaultItem {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MenuType {
    }
}
