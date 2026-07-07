package android.media.tv.interactive;

public final class OperatorAppServiceInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.tv.interactive.OperatorAppServiceInfo> CREATOR = null;
    public static final int OPERATOR_APP_PACKAGE_STATUS_CANCEL_FAIL = 10;
    public static final int OPERATOR_APP_PACKAGE_STATUS_CANCEL_SUCCESS = 9;
    public static final int OPERATOR_APP_PACKAGE_STATUS_DISCOVERY_FAIL = 2;
    public static final int OPERATOR_APP_PACKAGE_STATUS_DISCOVERY_SUCCESS = 1;
    public static final int OPERATOR_APP_PACKAGE_STATUS_DOWNLOAD_FAIL = 4;
    public static final int OPERATOR_APP_PACKAGE_STATUS_DOWNLOAD_SUCCESS = 3;
    public static final int OPERATOR_APP_PACKAGE_STATUS_INSTALL_FAIL = 6;
    public static final int OPERATOR_APP_PACKAGE_STATUS_INSTALL_SUCCESS = 5;
    public static final int OPERATOR_APP_PACKAGE_STATUS_UNINSTALL_FAIL = 8;
    public static final int OPERATOR_APP_PACKAGE_STATUS_UNINSTALL_SUCCESS = 7;
    public static final int OPERATOR_APP_PACKAGE_STATUS_UPDATE_FAIL = 12;
    public static final int OPERATOR_APP_PACKAGE_STATUS_UPDATE_SUCCESS = 11;
    public static final int OPERATOR_APP_SEARCH_METHOD_AIT_BROADCAST = 2;
    public static final int OPERATOR_APP_SEARCH_METHOD_AIT_CICAM = 3;
    public static final int OPERATOR_APP_SEARCH_METHOD_AIT_HARDWIRED = 5;
    public static final int OPERATOR_APP_SEARCH_METHOD_DNS_SRV_LOOKUP = 6;
    public static final int OPERATOR_APP_SEARCH_METHOD_FQDN_BROADCAST = 1;
    public static final int OPERATOR_APP_SEARCH_METHOD_FQDN_HARDWIRED = 4;
    public static final int OPERATOR_APP_STATE_BACKGROUND = 1;
    public static final int OPERATOR_APP_STATE_FOREGROUND = 2;
    public static final int OPERATOR_APP_STATE_OVERLAID_FOREGROUND = 4;
    public static final int OPERATOR_APP_STATE_OVERLAID_TRANSIENT = 5;
    public static final int OPERATOR_APP_STATE_TRANSIENT = 3;
    public static final int OPERATOR_APP_STATUS_ABNORMAL_EXIT = 3;
    public static final int OPERATOR_APP_STATUS_NOT_STARTED = 4;
    public static final int OPERATOR_APP_STATUS_RUNNING = 1;
    public static final int OPERATOR_APP_STATUS_TERMINATED = 2;
    public static final int OPERATOR_APP_UNINSTALL_METHOD_WITHOUT_USER_INTERACTION = 2;
    public static final int OPERATOR_APP_UNINSTALL_METHOD_WITH_USER_INTERACTION = 1;
    private final android.media.tv.interactive.TvInteractiveAppServiceInfo mBaseInfo = null;
    public final android.os.Bundle mExtra = null;
    public final java.lang.String mGroupName = null;
    public final java.lang.String mOperatorName = null;
    public final int mSubtype = 0;
    private OperatorAppServiceInfo(android.media.tv.interactive.OperatorAppServiceInfo.Builder p0) {}
    private OperatorAppServiceInfo(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public android.media.tv.interactive.TvInteractiveAppServiceInfo getBaseInfo() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.os.Bundle mExtra;
        private final java.util.List<java.lang.String> mExtraTypes = null;
        private java.lang.String mGroupName;
        private java.lang.String mId;
        private java.lang.String mOperatorName;
        private android.content.pm.ResolveInfo mService;
        private int mSubtype;
        private int mTypes;
        public Builder() {}
        public android.media.tv.interactive.OperatorAppServiceInfo build() { return null; }
        public android.media.tv.interactive.OperatorAppServiceInfo.Builder setCustomSupportedTypes(java.util.List<java.lang.String> p0) { return null; }
        public android.media.tv.interactive.OperatorAppServiceInfo.Builder setExtra(android.os.Bundle p0) { return null; }
        public android.media.tv.interactive.OperatorAppServiceInfo.Builder setGroupName(java.lang.String p0) { return null; }
        public android.media.tv.interactive.OperatorAppServiceInfo.Builder setId(java.lang.String p0) { return null; }
        public android.media.tv.interactive.OperatorAppServiceInfo.Builder setOperatorName(java.lang.String p0) { return null; }
        public android.media.tv.interactive.OperatorAppServiceInfo.Builder setService(android.content.pm.ResolveInfo p0) { return null; }
        public android.media.tv.interactive.OperatorAppServiceInfo.Builder setSubtype(int p0) { return null; }
        public android.media.tv.interactive.OperatorAppServiceInfo.Builder setSupportedTypes(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface OperatorAppPackageStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface OperatorAppSearchMethod {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface OperatorAppState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface OperatorAppStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface OperatorAppUninstallMethod {
    }
}
