package android.service.quickaccesswallet;

public interface QuickAccessWalletClient extends java.io.Closeable {
    public static android.service.quickaccesswallet.QuickAccessWalletClient create(android.content.Context p0) { return null; }
    public static android.service.quickaccesswallet.QuickAccessWalletClient create(android.content.Context p0, java.util.concurrent.Executor p1) { return null; }
    public void addWalletServiceEventListener(android.service.quickaccesswallet.QuickAccessWalletClient.WalletServiceEventListener p0);
    public void addWalletServiceEventListener(java.util.concurrent.Executor p0, android.service.quickaccesswallet.QuickAccessWalletClient.WalletServiceEventListener p1);
    public android.content.Intent createWalletIntent();
    public android.content.Intent createWalletSettingsIntent();
    public void disconnect();
    public void getGestureTargetActivityPendingIntent(java.util.concurrent.Executor p0, android.service.quickaccesswallet.QuickAccessWalletClient.GesturePendingIntentCallback p1);
    public android.graphics.drawable.Drawable getLogo();
    public java.lang.CharSequence getServiceLabel();
    public java.lang.CharSequence getShortcutLongLabel();
    public java.lang.CharSequence getShortcutShortLabel();
    public android.graphics.drawable.Drawable getTileIcon();
    public android.os.UserHandle getUser();
    public void getWalletCards(android.service.quickaccesswallet.GetWalletCardsRequest p0, android.service.quickaccesswallet.QuickAccessWalletClient.OnWalletCardsRetrievedCallback p1);
    public void getWalletCards(java.util.concurrent.Executor p0, android.service.quickaccesswallet.GetWalletCardsRequest p1, android.service.quickaccesswallet.QuickAccessWalletClient.OnWalletCardsRetrievedCallback p2);
    public void getWalletPendingIntent(java.util.concurrent.Executor p0, android.service.quickaccesswallet.QuickAccessWalletClient.WalletPendingIntentCallback p1);
    public boolean isWalletFeatureAvailable();
    public boolean isWalletFeatureAvailableWhenDeviceLocked();
    public boolean isWalletServiceAvailable();
    public void notifyWalletDismissed();
    public void removeWalletServiceEventListener(android.service.quickaccesswallet.QuickAccessWalletClient.WalletServiceEventListener p0);
    public void selectWalletCard(android.service.quickaccesswallet.SelectWalletCardRequest p0);

    public static interface GesturePendingIntentCallback {
        public void onGesturePendingIntentRetrieved(android.app.PendingIntent p0);
    }

    public static interface OnWalletCardsRetrievedCallback {
        public void onWalletCardRetrievalError(android.service.quickaccesswallet.GetWalletCardsError p0);
        public void onWalletCardsRetrieved(android.service.quickaccesswallet.GetWalletCardsResponse p0);
    }

    public static interface WalletPendingIntentCallback {
        public void onWalletPendingIntentRetrieved(android.app.PendingIntent p0);
    }

    public static interface WalletServiceEventListener {
        public void onWalletServiceEvent(android.service.quickaccesswallet.WalletServiceEvent p0);
    }
}
