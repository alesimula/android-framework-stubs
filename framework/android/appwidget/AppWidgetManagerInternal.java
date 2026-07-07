package android.appwidget;

public abstract class AppWidgetManagerInternal {
    public AppWidgetManagerInternal() {}
    public abstract void applyResourceOverlaysToWidgets(java.util.Set<java.lang.String> p0, int p1, boolean p2);
    public abstract android.util.ArraySet<java.lang.String> getHostedWidgetPackages(int p0);
    public abstract void saveWidgetEvents();
    public abstract void unlockUser(int p0);
}
