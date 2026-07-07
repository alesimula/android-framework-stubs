package android.os.allowlist;

public interface AllowlistManagerInternal {
    public java.util.Set<java.lang.String> getAllowlistProviderPackageNames(int p0);
    public void registerTestProviderChangeListener(android.os.allowlist.AllowlistManagerInternal.TestProviderChangeListener p0);
    public void unregisterTestProviderChangeListener(android.os.allowlist.AllowlistManagerInternal.TestProviderChangeListener p0);

    public static interface TestProviderChangeListener {
        public void onTestProviderChanged();
    }
}
