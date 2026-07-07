package android.service.quickaccesswallet;

class QuickAccessWalletServiceInfo {
    private static final java.lang.String TAG = "QAWalletSInfo";
    private static final java.lang.String TAG_WALLET_SERVICE = "quickaccesswallet-service";
    private final android.content.pm.ServiceInfo mServiceInfo = null;
    private final android.service.quickaccesswallet.QuickAccessWalletServiceInfo.ServiceMetadata mServiceMetadata = null;
    private final android.service.quickaccesswallet.QuickAccessWalletServiceInfo.TileServiceMetadata mTileServiceMetadata = null;
    private final int mUserId = 0;
    private QuickAccessWalletServiceInfo(android.content.pm.ServiceInfo p0, android.service.quickaccesswallet.QuickAccessWalletServiceInfo.ServiceMetadata p1, android.service.quickaccesswallet.QuickAccessWalletServiceInfo.TileServiceMetadata p2, int p3) {}
    private static android.content.ComponentName getDefaultPaymentApp(android.content.Context p0) { return null; }
    private static android.util.Pair<java.lang.String, java.lang.Integer> getDefaultWalletApp(android.content.Context p0) { return null; }
    private static android.content.pm.ServiceInfo getWalletServiceInfo(android.content.Context p0, java.lang.String p1, int p2) { return null; }
    private static boolean isWalletRoleAvailable(android.content.Context p0) { return false; }
    static android.service.quickaccesswallet.QuickAccessWalletServiceInfo.ServiceMetadata parseServiceMetadata(android.content.Context p0, android.content.pm.ServiceInfo p1) { return null; }
    private static android.graphics.drawable.Drawable parseTileServiceMetadata(android.content.Context p0, android.content.pm.ServiceInfo p1) { return null; }
    static android.service.quickaccesswallet.QuickAccessWalletServiceInfo tryCreate(android.content.Context p0) { return null; }
    android.content.ComponentName getComponentName() { return null; }
    java.lang.CharSequence getServiceLabel(android.content.Context p0) { return null; }
    java.lang.String getSettingsActivity() { return null; }
    java.lang.CharSequence getShortcutLongLabel(android.content.Context p0) { return null; }
    java.lang.CharSequence getShortcutShortLabel(android.content.Context p0) { return null; }
    android.graphics.drawable.Drawable getTileIcon() { return null; }
    int getUserId() { return 0; }
    java.lang.String getWalletActivity() { return null; }
    android.graphics.drawable.Drawable getWalletLogo(android.content.Context p0) { return null; }

    static class ServiceMetadata {
        private final java.lang.String mSettingsActivity = null;
        private final java.lang.CharSequence mShortcutLongLabel = null;
        private final java.lang.CharSequence mShortcutShortLabel = null;
        private final java.lang.String mTargetActivity = null;
        private ServiceMetadata(java.lang.String p0, java.lang.String p1, java.lang.CharSequence p2, java.lang.CharSequence p3) {}
        private static android.service.quickaccesswallet.QuickAccessWalletServiceInfo.ServiceMetadata empty() { return null; }
    }

    private static class TileServiceMetadata {
        private final android.graphics.drawable.Drawable mTileIcon = null;
        private TileServiceMetadata(android.graphics.drawable.Drawable p0) {}
    }
}
