package com.android.internal.pm.split;

public class SplitAssetDependencyLoader extends android.content.pm.split.SplitDependencyLoader<java.lang.IllegalArgumentException> implements com.android.internal.pm.split.SplitAssetLoader {
    private final android.content.res.AssetManager[] mCachedAssetManagers = null;
    private final android.content.res.ApkAssets[][] mCachedSplitApks = null;
    private final int mFlags = 0;
    private final java.lang.String[] mSplitPaths = null;
    public SplitAssetDependencyLoader(android.content.pm.parsing.PackageLite p0, android.util.SparseArray<int[]> p1, int p2) { super(null); }
    private static android.content.res.AssetManager createAssetManagerWithAssets(android.content.res.ApkAssets[] p0) { return null; }
    private static android.content.res.ApkAssets loadApkAssets(java.lang.String p0, int p1) throws java.lang.IllegalArgumentException { return null; }
    public void close() throws java.lang.Exception {}
    protected void constructSplit(int p0, int[] p1, int p2) throws java.lang.IllegalArgumentException {}
    public android.content.res.ApkAssets getBaseApkAssets() { return null; }
    public android.content.res.AssetManager getBaseAssetManager() throws java.lang.IllegalArgumentException { return null; }
    public android.content.res.AssetManager getSplitAssetManager(int p0) throws java.lang.IllegalArgumentException { return null; }
    protected boolean isSplitCached(int p0) { return false; }
}
