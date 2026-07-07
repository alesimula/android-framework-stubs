package android.webkit;

public class GeolocationPermissions {
    @android.annotation.SystemApi
    public GeolocationPermissions() {}
    public static android.webkit.GeolocationPermissions getInstance() { return null; }
    public void allow(java.lang.String p0) {}
    public void clear(java.lang.String p0) {}
    public void clearAll() {}
    public void getAllowed(java.lang.String p0, android.webkit.ValueCallback<java.lang.Boolean> p1) {}
    public void getOrigins(android.webkit.ValueCallback<java.util.Set<java.lang.String>> p0) {}

    public static interface Callback {
        public void invoke(java.lang.String p0, boolean p1, boolean p2);
    }
}
