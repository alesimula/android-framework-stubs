package android.service.quickaccesswallet;

final class GetWalletCardsCallbackImpl implements android.service.quickaccesswallet.GetWalletCardsCallback {
    private static final java.lang.String TAG = "QAWalletCallback";
    private final android.service.quickaccesswallet.IQuickAccessWalletServiceCallbacks mCallback = null;
    private boolean mCalled;
    private final android.content.Context mContext = null;
    private final android.os.Handler mHandler = null;
    private final android.service.quickaccesswallet.GetWalletCardsRequest mRequest = null;
    GetWalletCardsCallbackImpl(android.service.quickaccesswallet.GetWalletCardsRequest p0, android.service.quickaccesswallet.IQuickAccessWalletServiceCallbacks p1, android.os.Handler p2, android.content.Context p3) {}
    private boolean isValidResponse(android.service.quickaccesswallet.GetWalletCardsResponse p0) { return false; }
    private void onFailureInternal(android.service.quickaccesswallet.GetWalletCardsError p0) {}
    private void onSuccessInternal(android.service.quickaccesswallet.GetWalletCardsResponse p0) {}
    private void removeLocationsFromResponse(android.service.quickaccesswallet.GetWalletCardsResponse p0) {}
    public void onFailure(android.service.quickaccesswallet.GetWalletCardsError p0) {}
    public void onSuccess(android.service.quickaccesswallet.GetWalletCardsResponse p0) {}
}
