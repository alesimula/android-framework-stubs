package android.app.admin;

public final class PolicyIdentifier<T extends java.lang.Object> {
    public static final android.app.admin.PolicyIdentifier<java.lang.Integer> APP_INSTALL = null;
    public static final int APP_INSTALL_ALLOWED = 1;
    public static final int APP_INSTALL_DISALLOWED = 2;
    public static final android.app.admin.PolicyIdentifier<java.lang.Integer> APP_UNINSTALL = null;
    public static final int APP_UNINSTALL_ALLOWED = 1;
    public static final int APP_UNINSTALL_DISALLOWED = 2;
    public static final android.app.admin.PolicyIdentifier<java.lang.Integer> ASSIST_CONTENT = null;
    public static final int ASSIST_CONTENT_ALLOWED = 2;
    public static final int ASSIST_CONTENT_DISALLOWED = 1;
    public static final android.app.admin.PolicyIdentifier<java.lang.Integer> BLUETOOTH_SHARING = null;
    public static final int BLUETOOTH_SHARING_ALLOWED = 2;
    public static final int BLUETOOTH_SHARING_DISALLOWED = 1;
    @android.annotation.SystemApi
    public static final android.app.admin.PolicyIdentifier<java.util.List<android.app.admin.PackageIdentifier>> CONTENT_SAFETY_APPS = null;
    public static final android.app.admin.PolicyIdentifier<java.lang.Integer> EASTER_EGGS = null;
    public static final int EASTER_EGGS_ALLOWED = 2;
    public static final int EASTER_EGGS_DISALLOWED = 1;
    public static final android.app.admin.PolicyIdentifier<java.lang.Integer> FACTORY_RESET = null;
    public static final int FACTORY_RESET_ALLOWED = 2;
    public static final int FACTORY_RESET_DISALLOWED = 1;
    public static final android.app.admin.PolicyIdentifier<java.lang.String> LOCKSCREEN_MESSAGE = null;
    public static final android.app.admin.PolicyIdentifier<java.lang.Integer> MANAGED_ESIM_OUTGOING_TRANSFER = null;
    public static final int MANAGED_ESIM_OUTGOING_TRANSFER_ALLOWED = 1;
    public static final int MANAGED_ESIM_OUTGOING_TRANSFER_DISALLOWED = 2;
    public static final android.app.admin.PolicyIdentifier<java.lang.Integer> SAFE_BOOT = null;
    public static final int SAFE_BOOT_ALLOWED = 2;
    public static final int SAFE_BOOT_DISALLOWED = 1;
    public static final android.app.admin.PolicyIdentifier<java.lang.Integer> SCREEN_CAPTURE = null;
    public static final int SCREEN_CAPTURE_ALLOWED = 2;
    public static final int SCREEN_CAPTURE_DISALLOWED = 1;
    public static final android.app.admin.PolicyIdentifier<java.lang.Integer> UNIVERSAL_CLIPBOARD = null;
    public static final int UNIVERSAL_CLIPBOARD_ALLOWED = 2;
    public static final int UNIVERSAL_CLIPBOARD_DISALLOWED = 1;
    public static final android.app.admin.PolicyIdentifier<java.lang.Integer> USER_CONFIGURED_VPN = null;
    public static final int USER_CONFIGURED_VPN_ALLOWED = 2;
    public static final int USER_CONFIGURED_VPN_DISALLOWED = 1;
    public static final android.app.admin.PolicyIdentifier<java.lang.Integer> VERIFY_APPS = null;
    public static final int VERIFY_APPS_ENFORCED = 1;
    public static final int VERIFY_APPS_USER_CHOICE = 2;
    public static final android.app.admin.PolicyIdentifier<java.lang.Integer> WIFI_NETWORK_SELECTION = null;
    public static final int WIFI_NETWORK_SELECTION_MANAGED_ONLY = 3;
    public static final int WIFI_NETWORK_SELECTION_MANAGED_WHEN_AVAILABLE = 2;
    public static final int WIFI_NETWORK_SELECTION_NO_RESTRICTION = 1;
    private final java.lang.String mId = null;
    public PolicyIdentifier(java.lang.String p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getId() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AppInstallValue {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AppUninstallValue {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AssistContentValue {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BluetoothSharingValue {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EasterEggsValue {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FactoryResetValue {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ManagedEsimOutgoingTransfer {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SafeBootValue {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ScreenCaptureValue {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UniversalClipboardValue {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UserConfiguredVpnValue {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VerifyAppsValue {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface WifiNetworkSelectionValue {
    }
}
