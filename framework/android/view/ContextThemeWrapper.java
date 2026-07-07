package android.view;

public class ContextThemeWrapper extends android.content.ContextWrapper {
    private android.view.LayoutInflater mInflater;
    private android.content.res.Configuration mOverrideConfiguration;
    private android.content.res.Resources mResources;
    private android.content.res.Resources.Theme mTheme;
    private int mThemeResource;
    public ContextThemeWrapper() { super(null); }
    public ContextThemeWrapper(android.content.Context p0, int p1) { super(null); }
    public ContextThemeWrapper(android.content.Context p0, android.content.res.Resources.Theme p1) { super(null); }
    private android.content.res.Resources getResourcesInternal() { return null; }
    private int getTargetSdk() { return 0; }
    private int getTargetSdk$ravenwood() { return 0; }
    private void initializeTheme() {}
    public void applyOverrideConfiguration(android.content.res.Configuration p0) {}
    protected void attachBaseContext(android.content.Context p0) {}
    public android.content.res.AssetManager getAssets() { return null; }
    public android.content.res.Configuration getOverrideConfiguration() { return null; }
    public android.content.res.Resources getResources() { return null; }
    public java.lang.Object getSystemService(java.lang.String p0) { return null; }
    public android.content.res.Resources.Theme getTheme() { return null; }
    public int getThemeResId() { return 0; }
    protected void onApplyThemeResource(android.content.res.Resources.Theme p0, int p1, boolean p2) {}
    public void setTheme(int p0) {}
    public void setTheme(android.content.res.Resources.Theme p0) {}
}
