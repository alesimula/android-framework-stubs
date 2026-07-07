package android.app.permissionui;

public interface LocationButtonClient {
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_REQUEST_LOCATION_BUTTON_PERMISSIONS = "android.app.permissionui.action.REQUEST_LOCATION_BUTTON_PERMISSIONS";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_PERMISSION_RESULT = "android.app.permissionui.extra.PERMISSION_RESULT";
    public void onPermissionResult(boolean p0);
    public void onSessionError(java.lang.Throwable p0);
    public void onSessionOpened(android.app.permissionui.LocationButtonSession p0);
}
