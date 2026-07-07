package android.service.quickaccesswallet;

public interface GetWalletCardsCallback {
    public void onFailure(android.service.quickaccesswallet.GetWalletCardsError p0);
    public void onSuccess(android.service.quickaccesswallet.GetWalletCardsResponse p0);
}
