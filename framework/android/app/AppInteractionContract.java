package android.app;

public final class AppInteractionContract implements android.provider.BaseColumns {
    public static final java.lang.String AUTHORITY = "com.android.appinteraction.history";
    @android.annotation.SystemApi
    public static final java.lang.String COLUMN_ACCESS_TIME = "access_time";
    @android.annotation.SystemApi
    public static final java.lang.String COLUMN_AGENT_PACKAGE_NAME = "agent_package_name";
    @android.annotation.SystemApi
    public static final java.lang.String COLUMN_CUSTOM_INTERACTION_TYPE = "custom_interaction_type";
    @android.annotation.SystemApi
    public static final java.lang.String COLUMN_INTERACTION_TYPE = "interaction_type";
    @android.annotation.SystemApi
    public static final java.lang.String COLUMN_INTERACTION_URI = "interaction_uri";
    @android.annotation.SystemApi
    public static final java.lang.String COLUMN_TARGET_PACKAGE_NAME = "target_package_name";
    private AppInteractionContract() {}
    public static java.util.List<java.lang.String> getDeviceAssistancePackageNames(android.content.Context p0) { return null; }
    @android.annotation.SystemApi
    public static android.net.Uri getInteractionHistoryUriAsUser(android.os.UserHandle p0) { return null; }
}
