package com.android.internal.pm.split;

public class DefaultSplitAssetLoader implements com.android.internal.pm.split.SplitAssetLoader {
    private android.content.res.ApkAssets mBaseApkAssets;
    private final java.lang.String mBaseApkPath = null;
    private android.content.res.AssetManager mCachedAssetManager;
    private final int mFlags = 0;
    private final java.lang.String[] mSplitApkPaths = null;
    public DefaultSplitAssetLoader(android.content.pm.parsing.PackageLite p0, int p1) {}
    private static android.content.res.ApkAssets loadApkAssets(java.lang.String p0, int p1) throws java.lang.IllegalArgumentException { return null; }
    public void close() throws java.lang.Exception {}
    public android.content.res.ApkAssets getBaseApkAssets() { return null; }
    public android.content.res.AssetManager getBaseAssetManager() throws java.lang.IllegalArgumentException { return null; }
    public android.content.res.AssetManager getSplitAssetManager(int p0) throws java.lang.IllegalArgumentException { return null; }
}
