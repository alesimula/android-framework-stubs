package android.app.admin;

public class DevicePolicyResourcesManager {
    private static boolean DEFAULT_DISABLE_RESOURCES_UPDATABILITY;
    private static java.lang.String DISABLE_RESOURCES_UPDATABILITY_FLAG;
    private static java.lang.String TAG;
    private final android.content.Context mContext = null;
    private final android.app.admin.IDevicePolicyManager mService = null;
    protected DevicePolicyResourcesManager(android.content.Context p0, android.app.admin.IDevicePolicyManager p1) {}
    public android.graphics.drawable.Drawable getDrawable(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.util.function.Supplier<android.graphics.drawable.Drawable> p3) { return null; }
    public android.graphics.drawable.Drawable getDrawable(java.lang.String p0, java.lang.String p1, java.util.function.Supplier<android.graphics.drawable.Drawable> p2) { return null; }
    public android.graphics.drawable.Icon getDrawableAsIcon(java.lang.String p0, java.lang.String p1, android.graphics.drawable.Icon p2) { return null; }
    public android.graphics.drawable.Icon getDrawableAsIcon(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.graphics.drawable.Icon p3) { return null; }
    public android.graphics.drawable.Drawable getDrawableForDensity(java.lang.String p0, java.lang.String p1, int p2, java.util.function.Supplier<android.graphics.drawable.Drawable> p3) { return null; }
    public android.graphics.drawable.Drawable getDrawableForDensity(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, java.util.function.Supplier<android.graphics.drawable.Drawable> p4) { return null; }
    public java.lang.String getString(java.lang.String p0, java.util.function.Supplier<java.lang.String> p1) { return null; }
    public java.lang.String getString(java.lang.String p0, java.util.function.Supplier<java.lang.String> p1, java.lang.Object... p2) { return null; }
    @android.annotation.SystemApi
    public void resetDrawables(java.util.Set<java.lang.String> p0) {}
    @android.annotation.SystemApi
    public void resetStrings(java.util.Set<java.lang.String> p0) {}
    @android.annotation.SystemApi
    public void setDrawables(java.util.Set<android.app.admin.DevicePolicyDrawableResource> p0) {}
    @android.annotation.SystemApi
    public void setStrings(java.util.Set<android.app.admin.DevicePolicyStringResource> p0) {}
}
