package android.app.permissionui;

final class LocationButtonSessionWrapper implements android.app.permissionui.LocationButtonSession, android.os.IBinder.DeathRecipient {
    private final android.app.permissionui.LocationButtonClient mLocationButtonClient = null;
    private final android.app.permissionui.LocationButtonClientWrapper mLocationButtonClientWrapper = null;
    private final android.app.permissionui.LocationButtonProviderFactory.LocationButtonProviderImpl mProvider = null;
    private final android.app.permissionui.LocationButtonSessionResponse mSessionResponse = null;
    LocationButtonSessionWrapper(android.app.permissionui.LocationButtonProviderFactory.LocationButtonProviderImpl p0, android.app.permissionui.LocationButtonSessionResponse p1, android.app.permissionui.LocationButtonClient p2, android.app.permissionui.LocationButtonClientWrapper p3) {}
    private void linkDeathRecipient() {}
    public void binderDied() {}
    public void changeConfiguration(android.content.res.Configuration p0) {}
    public void close() {}
    public android.view.SurfaceControlViewHost.SurfacePackage getSurfacePackage() { return null; }
    public void resize(int p0, int p1) {}
    public void setBackgroundColor(int p0) {}
    public void setCornerRadius(float p0) {}
    public void setIconTint(int p0) {}
    public void setPadding(int p0, int p1, int p2, int p3) {}
    public void setPressedCornerRadius(float p0) {}
    public void setStrokeColor(int p0) {}
    public void setStrokeWidth(int p0) {}
    public void setTextColor(int p0) {}
    public void setTextType(int p0) {}
}
