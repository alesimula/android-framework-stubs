package android.security;

public interface KeyChainAliasCallback {
    public void alias(java.lang.String p0);
    default public void onError(int p0) {}
}
