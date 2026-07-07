package android.content.res;

public class ResourcesImpl {
    private static final boolean DEBUG_CONFIG = false;
    private static final boolean DEBUG_LOAD = false;
    private static final int ID_OTHER = 16777220;
    static final java.lang.String TAG = "Resources";
    private static final boolean TRACE_FOR_MISS_PRELOAD = false;
    private static final boolean TRACE_FOR_PRELOAD = false;
    private static final int XML_BLOCK_CACHE_SIZE = 4;
    private static final android.app.LocaleConfig sEmptyLocaleConfig = null;
    private static boolean sPreloaded;
    private static final android.util.LongSparseArray<android.graphics.drawable.Drawable.ConstantState> sPreloadedColorDrawables = null;
    private static final android.util.LongSparseArray<android.content.res.ConstantState<android.content.res.ComplexColor>> sPreloadedComplexColors = null;
    private static final android.util.LongSparseArray<android.graphics.drawable.Drawable.ConstantState>[] sPreloadedDrawables = null;
    private static final java.lang.Object sSync = null;
    private final java.lang.Object mAccessLock = null;
    private final android.content.res.ConfigurationBoundResourceCache<android.animation.Animator> mAnimatorCache = null;
    private final int mAppliedSharedLibsHash = 0;
    final android.content.res.AssetManager mAssets = null;
    private final int[] mCachedXmlBlockCookies = null;
    private final java.lang.String[] mCachedXmlBlockFiles = null;
    private final android.content.res.XmlBlock[] mCachedXmlBlocks = null;
    private final android.content.res.DrawableCache mColorDrawableCache = null;
    private final android.content.res.ConfigurationBoundResourceCache<android.content.res.ComplexColor> mComplexColorCache = null;
    private final android.content.res.Configuration mConfiguration = null;
    private final android.view.DisplayAdjustments mDisplayAdjustments = null;
    private final android.content.res.DrawableCache mDrawableCache = null;
    private int mLastCachedXmlBlockIndex;
    private android.app.LocaleConfig mLocaleConfig;
    private final java.lang.ThreadLocal<android.content.res.ResourcesImpl.LookupStack> mLookupStack = null;
    private final android.util.DisplayMetrics mMetrics = null;
    private boolean mPreloading;
    private final android.content.res.ConfigurationBoundResourceCache<android.animation.StateListAnimator> mStateListAnimatorCache = null;
    private final android.content.res.Configuration mTmpConfig = null;
    public ResourcesImpl(android.content.res.AssetManager p0, android.util.DisplayMetrics p1, android.content.res.Configuration p2, android.view.DisplayAdjustments p3) {}
    public ResourcesImpl(android.content.res.AssetManager p0, android.util.DisplayMetrics p1, android.content.res.Configuration p2, android.view.DisplayAdjustments p3, boolean p4) {}
    public ResourcesImpl(android.content.res.ResourcesImpl p0) {}
    private static java.lang.String adjustLanguageTag(java.lang.String p0) { return null; }
    private static int attrForQuantityCode(java.lang.String p0) { return 0; }
    private void cacheDrawable(android.util.TypedValue p0, boolean p1, android.content.res.DrawableCache p2, android.content.res.Resources.Theme p3, boolean p4, long p5, android.graphics.drawable.Drawable p6, int p7) {}
    private android.graphics.drawable.Drawable decodeImageDrawable(android.content.res.AssetManager.AssetInputStream p0, android.content.res.Resources p1, android.util.TypedValue p2) { return null; }
    private android.graphics.drawable.Drawable decodeImageDrawable(java.io.FileInputStream p0, android.content.res.Resources p1) { return null; }
    static int getAttributeSetSourceResId(android.util.AttributeSet p0) { return 0; }
    private android.content.res.ColorStateList getColorStateListFromInt(android.util.TypedValue p0, long p1) { return null; }
    private android.icu.text.PluralRules getPluralRule() { return null; }
    private static boolean isIntLike(java.lang.String p0) { return false; }
    private android.graphics.drawable.Drawable loadColorOrXmlDrawable(android.content.res.Resources p0, android.util.TypedValue p1, int p2, int p3, java.lang.String p4) { return null; }
    private android.content.res.ComplexColor loadComplexColorForCookie(android.content.res.Resources p0, android.util.TypedValue p1, int p2, android.content.res.Resources.Theme p3) { return null; }
    private android.content.res.ComplexColor loadComplexColorFromName(android.content.res.Resources p0, android.content.res.Resources.Theme p1, android.util.TypedValue p2, int p3) { return null; }
    private android.graphics.drawable.Drawable loadDrawableForCookie(android.content.res.Resources p0, android.util.TypedValue p1, int p2, int p3) { return null; }
    private android.graphics.drawable.Drawable loadXmlDrawable(android.content.res.Resources p0, android.util.TypedValue p1, int p2, int p3, java.lang.String p4) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    static void resetDrawableStateCache() {}
    private void updateConfigurationImpl(android.content.res.Configuration p0, android.util.DisplayMetrics p1, android.content.res.CompatibilityInfo p2, boolean p3, int p4) {}
    private boolean verifyPreloadConfig(int p0, int p1, int p2, java.lang.String p3) { return false; }
    public int applyConfigChanges(android.content.res.Configuration p0) { return 0; }
    public void clearAllCaches() {}
    void dump(java.io.PrintWriter p0, java.lang.String p1) {}
    void finishPreloading() {}
    public void flushLayoutCache() {}
    android.content.res.ConfigurationBoundResourceCache<android.animation.Animator> getAnimatorCache() { return null; }
    public int getAppliedSharedLibsHash() { return 0; }
    public android.content.res.AssetManager getAssets() { return null; }
    android.content.res.CompatibilityInfo getCompatibilityInfo() { return null; }
    public android.content.res.Configuration getConfiguration() { return null; }
    public android.view.DisplayAdjustments getDisplayAdjustments() { return null; }
    android.util.DisplayMetrics getDisplayMetrics() { return null; }
    int getIdentifier(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return 0; }
    java.lang.String getLastResourceResolution() throws android.content.res.Resources.NotFoundException { return null; }
    android.app.LocaleConfig getLocaleConfig() { return null; }
    public android.util.DisplayMetrics getMetrics() { return null; }
    android.util.LongSparseArray<android.graphics.drawable.Drawable.ConstantState> getPreloadedDrawables() { return null; }
    java.lang.CharSequence getQuantityText(int p0, int p1) throws android.content.res.Resources.NotFoundException { return null; }
    android.content.res.Configuration[] getResourceConfigurations() { return null; }
    java.lang.String getResourceEntryName(int p0) throws android.content.res.Resources.NotFoundException { return null; }
    java.lang.String getResourceName(int p0) throws android.content.res.Resources.NotFoundException { return null; }
    java.lang.String getResourcePackageName(int p0) throws android.content.res.Resources.NotFoundException { return null; }
    java.lang.String getResourceTypeName(int p0) throws android.content.res.Resources.NotFoundException { return null; }
    android.content.res.ConfigurationBoundResourceCache<android.animation.StateListAnimator> getStateListAnimatorCache() { return null; }
    public void getValue(int p0, android.util.TypedValue p1, boolean p2) throws android.content.res.Resources.NotFoundException {}
    void getValue(java.lang.String p0, android.util.TypedValue p1, boolean p2) throws android.content.res.Resources.NotFoundException {}
    void getValueForDensity(int p0, int p1, android.util.TypedValue p2, boolean p3) throws android.content.res.Resources.NotFoundException {}
    android.content.res.ColorStateList loadColorStateList(android.content.res.Resources p0, android.util.TypedValue p1, int p2, android.content.res.Resources.Theme p3) throws android.content.res.Resources.NotFoundException { return null; }
    android.content.res.ComplexColor loadComplexColor(android.content.res.Resources p0, android.util.TypedValue p1, int p2, android.content.res.Resources.Theme p3) { return null; }
    android.graphics.drawable.Drawable loadDrawable(android.content.res.Resources p0, android.util.TypedValue p1, int p2, int p3, android.content.res.Resources.Theme p4) throws android.content.res.Resources.NotFoundException { return null; }
    public android.graphics.Typeface loadFont(android.content.res.Resources p0, android.util.TypedValue p1, int p2) { return null; }
    android.content.res.XmlResourceParser loadXmlResourceParser(java.lang.String p0, int p1, int p2, java.lang.String p3, boolean p4) throws android.content.res.Resources.NotFoundException { return null; }
    android.content.res.ResourcesImpl.ThemeImpl newThemeImpl() { return null; }
    java.io.InputStream openRawResource(int p0, android.util.TypedValue p1) throws android.content.res.Resources.NotFoundException { return null; }
    android.content.res.AssetFileDescriptor openRawResourceFd(int p0, android.util.TypedValue p1) throws android.content.res.Resources.NotFoundException { return null; }
    void setLocaleConfig(android.app.LocaleConfig p0) {}
    public final void startPreloading() {}
    public void updateConfiguration(android.content.res.Configuration p0, android.util.DisplayMetrics p1, android.content.res.CompatibilityInfo p2) {}
    public void updateResourcesSdkVersion(int p0) {}

    private static class LookupStack {
        private int[] mIds;
        private int mSize;
        private LookupStack() {}
        public boolean contains(int p0) { return false; }
        public void pop() {}
        public void push(int p0) {}
    }

    public class ThemeImpl {
        private android.content.res.AssetManager mAssets;
        private final android.content.res.Resources.ThemeKey mKey = null;
        private final long mTheme = 0L;
        private int mThemeResId;
        ThemeImpl(android.content.res.ResourcesImpl p0) {}
        void applyStyle(int p0, boolean p1) {}
        public void dump(int p0, java.lang.String p1, java.lang.String p2) {}
        protected void finalize() throws java.lang.Throwable {}
        int[] getAllAttributes() { return null; }
        int getAppliedStyleResId() { return 0; }
        public int[] getAttributeResolutionStack(int p0, int p1, int p2) { return null; }
        int getChangingConfigurations() { return 0; }
        android.content.res.Resources.ThemeKey getKey() { return null; }
        long getNativeTheme() { return 0L; }
        int getParentThemeIdentifier(int p0) { return 0; }
        java.lang.String[] getTheme() { return null; }
        android.content.res.TypedArray obtainStyledAttributes(android.content.res.Resources.Theme p0, android.util.AttributeSet p1, int[] p2, int p3, int p4) { return null; }
        void rebase() {}
        void rebase(android.content.res.AssetManager p0) {}
        boolean resolveAttribute(int p0, android.util.TypedValue p1, boolean p2) { return false; }
        android.content.res.TypedArray resolveAttributes(android.content.res.Resources.Theme p0, int[] p1, int[] p2) { return null; }
        void setTo(android.content.res.ResourcesImpl.ThemeImpl p0) {}
    }
}
