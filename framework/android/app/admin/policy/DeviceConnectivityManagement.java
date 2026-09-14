package android.app.admin.policy;

public class DeviceConnectivityManagement {
    public static final android.app.admin.PolicyIdentifier<java.lang.Integer> BLUETOOTH_SHARING = null;
    public static final int BLUETOOTH_SHARING_ALLOWED = 2;
    public static final int BLUETOOTH_SHARING_DISALLOWED = 1;
    public static final android.app.admin.PolicyIdentifier<java.lang.Integer> NETWORK_RESET = null;
    public static final int NETWORK_RESET_ALLOWED = 1;
    public static final int NETWORK_RESET_DISALLOWED = 2;
    private DeviceConnectivityManagement() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BluetoothSharingValue {
    }

    public static final class MobileNetworks {
        public static final android.app.admin.PolicyIdentifier<java.lang.Integer> CELLULAR_DATA_USAGE = null;
        public static final int CELLULAR_DATA_USAGE_DISABLED = 2;
        public static final int CELLULAR_DATA_USAGE_USER_CHOICE = 1;
        public static final android.app.admin.PolicyIdentifier<java.lang.Integer> PHYSICAL_SIM = null;
        public static final int PHYSICAL_SIM_ALLOWED = 1;
        public static final int PHYSICAL_SIM_DISALLOWED = 2;
        private MobileNetworks() {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface CellularDataUsageValue {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface PhysicalSimValue {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NetworkResetValue {
    }

    public static final class Usb {
        public static final android.app.admin.PolicyIdentifier<java.lang.Integer> USB_DATA_SIGNALING = null;
        public static final int USB_DATA_SIGNALING_ALLOWED = 1;
        public static final int USB_DATA_SIGNALING_DISALLOWED = 2;
        public static final android.app.admin.PolicyIdentifier<java.lang.Integer> USB_FILE_TRANSFER = null;
        public static final int USB_FILE_TRANSFER_ALLOWED = 1;
        public static final int USB_FILE_TRANSFER_DISALLOWED = 2;
        private Usb() {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface UsbDataSignalingValue {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface UsbFileTransferValue {
        }
    }

    public static final class Vpn {
        public static final android.app.admin.PolicyIdentifier<java.lang.Integer> USER_CONFIGURED_VPN = null;
        public static final int USER_CONFIGURED_VPN_ALLOWED = 2;
        public static final int USER_CONFIGURED_VPN_DISALLOWED = 1;
        private Vpn() {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface UserConfiguredVpnValue {
        }
    }

    public static final class Wifi {
        public static final android.app.admin.PolicyIdentifier<java.lang.Integer> WIFI_LOCAL_ONLY_HOTSPOT = null;
        public static final int WIFI_LOCAL_ONLY_HOTSPOT_DISABLED = 2;
        public static final int WIFI_LOCAL_ONLY_HOTSPOT_ENABLED = 1;
        public static final android.app.admin.PolicyIdentifier<java.lang.Integer> WIFI_NETWORK_SELECTION = null;
        public static final int WIFI_NETWORK_SELECTION_MANAGED_ONLY = 3;
        public static final int WIFI_NETWORK_SELECTION_MANAGED_WHEN_AVAILABLE = 2;
        public static final int WIFI_NETWORK_SELECTION_NO_RESTRICTION = 1;
        public static final android.app.admin.PolicyIdentifier<java.lang.Integer> WIFI_TETHERING_MINIMUM_SECURITY_LEVEL = null;
        public static final int WIFI_TETHERING_MINIMUM_SECURITY_LEVEL_ANY = 1;
        public static final int WIFI_TETHERING_MINIMUM_SECURITY_LEVEL_WPA2_PERSONAL = 2;
        public static final int WIFI_TETHERING_MINIMUM_SECURITY_LEVEL_WPA2_WPA3_PERSONAL = 3;
        public static final int WIFI_TETHERING_MINIMUM_SECURITY_LEVEL_WPA3_PERSONAL = 4;
        private Wifi() {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface WifiLocalOnlyHotspotValue {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface WifiNetworkSelectionValue {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface WifiTetheringSecurityLevel {
        }
    }
}
