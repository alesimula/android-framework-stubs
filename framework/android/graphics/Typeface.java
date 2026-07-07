package android.graphics;

public class Typeface {
    public static final int BOLD = 1;
    public static final int BOLD_ITALIC = 3;
    public static final android.graphics.Typeface DEFAULT = null;
    public static final android.graphics.Typeface DEFAULT_BOLD = null;
    public static final java.lang.String DEFAULT_FAMILY = "sans-serif";
    private static final int[] EMPTY_AXES = null;
    public static final boolean ENABLE_LAZY_TYPEFACE_INITIALIZATION = true;
    public static final int ITALIC = 2;
    public static final android.graphics.Typeface MONOSPACE = null;
    public static final int NORMAL = 0;
    public static final int RESOLVE_BY_FONT_TABLE = -1;
    public static final android.graphics.Typeface SANS_SERIF = null;
    public static final android.graphics.Typeface SERIF = null;
    private static final int STYLE_ITALIC = 1;
    public static final int STYLE_MASK = 3;
    private static final int STYLE_NORMAL = 0;
    private static final java.lang.Object SYSTEM_FONT_MAP_LOCK = null;
    private static java.lang.String TAG;
    static android.graphics.Typeface sDefaultTypeface;
    static android.graphics.Typeface[] sDefaults;
    private static final java.lang.Object sDynamicCacheLock = null;
    private static final android.util.LruCache<java.lang.String, android.graphics.Typeface> sDynamicTypefaceCache = null;
    private static final java.lang.Object sStyledCacheLock = null;
    private static final android.util.LongSparseArray<android.util.SparseArray<android.graphics.Typeface>> sStyledTypefaceCache = null;
    @java.lang.Deprecated
    static final java.util.Map<java.lang.String, android.graphics.FontFamily[]> sSystemFallbackMap = null;
    static final java.util.Map<java.lang.String, android.graphics.Typeface> sSystemFontMap = null;
    static java.nio.ByteBuffer sSystemFontMapBuffer;
    static android.os.SharedMemory sSystemFontMapSharedMemory;
    private static final android.util.LruCache<java.lang.Long, android.util.LruCache<java.lang.String, android.graphics.Typeface>> sVariableCache = null;
    private static final java.lang.Object sVariableCacheLock = null;
    private static final java.lang.Object sWeightCacheLock = null;
    private static final android.util.LongSparseArray<android.util.SparseArray<android.graphics.Typeface>> sWeightTypefaceCache = null;
    private final java.lang.Runnable mCleaner = null;
    private final android.graphics.Typeface mDerivedFrom = null;
    private final java.util.concurrent.atomic.AtomicReference<android.graphics.Typeface> mPendingTypeface = null;
    private final int mStyle = 0;
    private int[] mSupportedAxes;
    private final java.lang.String mSystemFontFamilyName = null;
    private final int mWeight = 0;
    public final long native_instance = 0L;
    public Typeface(int p0, int p1, java.lang.String p2) {}
    private Typeface(long p0) {}
    private Typeface(long p0, java.lang.String p1) {}
    private Typeface(long p0, java.lang.String p1, android.graphics.Typeface p2) {}
    private static java.lang.String axesToVarKey(java.util.List<android.graphics.fonts.FontVariationAxis> p0) { return null; }
    public static android.util.Pair<java.util.List<android.graphics.Typeface>, java.util.List<android.graphics.Typeface>> changeDefaultFontForTest(java.util.List<android.graphics.Typeface> p0, java.util.List<android.graphics.Typeface> p1) { return null; }
    public static void clearTypefaceCachesForTestingPurpose() {}
    private void completeTypefaceInitialization(android.graphics.Typeface p0) {}
    public static android.graphics.Typeface create(android.graphics.Typeface p0, int p1) { return null; }
    public static android.graphics.Typeface create(android.graphics.Typeface p0, int p1, boolean p2) { return null; }
    public static android.graphics.Typeface create(java.lang.String p0, int p1) { return null; }
    public static android.graphics.Typeface createFromAsset(android.content.res.AssetManager p0, java.lang.String p1) { return null; }
    private static android.graphics.Typeface createFromFamilies(java.lang.String p0, android.graphics.fonts.FontFamily[] p1) { return null; }
    @java.lang.Deprecated
    private static android.graphics.Typeface createFromFamilies(android.graphics.FontFamily[] p0) { return null; }
    @java.lang.Deprecated
    private static android.graphics.Typeface createFromFamiliesWithDefault(android.graphics.FontFamily[] p0, int p1, int p2) { return null; }
    @java.lang.Deprecated
    private static android.graphics.Typeface createFromFamiliesWithDefault(android.graphics.FontFamily[] p0, java.lang.String p1, int p2, int p3) { return null; }
    public static android.graphics.Typeface createFromFile(java.io.File p0) { return null; }
    public static android.graphics.Typeface createFromFile(java.lang.String p0) { return null; }
    public static android.graphics.Typeface createFromResources(android.content.res.FontResourcesParser.FamilyResourceEntry p0, android.content.res.AssetManager p1, java.lang.String p2) { return null; }
    public static android.graphics.Typeface createFromTypefaceWithVariation(android.graphics.Typeface p0, java.util.List<android.graphics.fonts.FontVariationAxis> p1) { return null; }
    private static java.lang.String createProviderUid(java.lang.String p0, java.lang.String p1) { return null; }
    private static android.graphics.Typeface createWeightStyle(android.graphics.Typeface p0, int p1, boolean p2) { return null; }
    public static android.graphics.Typeface defaultFromStyle(int p0) { return null; }
    public static long[] deserializeFontMap(java.nio.ByteBuffer p0, java.util.Map<java.lang.String, android.graphics.Typeface> p1) throws java.io.IOException { return null; }
    public static void destroySystemFontMap() {}
    private static void destroyTypefaceCacheLocked(android.util.LongSparseArray<android.util.SparseArray<android.graphics.Typeface>> p0) {}
    public static android.graphics.Typeface findFromCache(android.content.res.AssetManager p0, java.lang.String p1) { return null; }
    private static android.graphics.Typeface getDefault() { return null; }
    private static android.graphics.Typeface getSystemDefaultTypeface(java.lang.String p0) { return null; }
    public static java.util.Map<java.lang.String, android.graphics.Typeface> getSystemFontMap() { return null; }
    public static android.os.SharedMemory getSystemFontMapSharedMemory() { return null; }
    private static boolean hasFontFamily(java.lang.String p0) { return false; }
    public static void init() {}
    public static void initSystemDefaultTypefaces(java.util.Map<java.lang.String, android.graphics.fonts.FontFamily[]> p0, java.util.List<android.text.FontConfig.Alias> p1, java.util.Map<java.lang.String, android.graphics.Typeface> p2) {}
    public static void initializePendingTypefaceLocked(android.graphics.Typeface p0, java.lang.String p1, java.util.Map<java.lang.String, android.graphics.Typeface> p2) {}
    public static void loadNativeSystemFonts() {}
    public static void loadPreinstalledSystemFontMap() {}
    private static native void nativeAddFontCollections(long p0);
    private static native long nativeCreateFromArray(long[] p0, long p1, int p2, int p3);
    private static native long nativeCreateFromTypeface(long p0, int p1);
    private static native long nativeCreateFromTypefaceWithExactStyle(long p0, int p1, boolean p2);
    private static native long nativeCreateFromTypefaceWithVariation(long p0, java.util.List<android.graphics.fonts.FontVariationAxis> p1);
    private static native long nativeCreateWeightAlias(long p0, int p1);
    private static native void nativeForceSetStaticFinalField(java.lang.String p0, android.graphics.Typeface p1);
    private static native long nativeGetReleaseFunc();
    private static native int nativeGetStyle(long p0);
    private static native int[] nativeGetSupportedAxes(long p0);
    private static native int nativeGetWeight(long p0);
    private static native long[] nativeReadTypefaces(java.nio.ByteBuffer p0, int p1);
    private static native void nativeRegisterGenericFamily(java.lang.String p0, long p1);
    private static native void nativeRegisterLocaleList(java.lang.String p0);
    private static native void nativeSetDefault(long p0);
    private static native boolean nativeSetFontRenderingBackend(int p0);
    private static native void nativeWarmUpCache(java.lang.String p0);
    private static native int nativeWriteTypefaces(java.nio.ByteBuffer p0, int p1, long[] p2);
    private static void preloadFontFile(java.lang.String p0) {}
    private static java.lang.String readString(java.nio.ByteBuffer p0) { return null; }
    private static void registerGenericFamilyNative(java.lang.String p0, android.graphics.Typeface p1) {}
    public static android.os.SharedMemory serializeFontMap(java.util.Map<java.lang.String, android.graphics.Typeface> p0) throws java.io.IOException, android.system.ErrnoException { return null; }
    private static void setDefault(android.graphics.Typeface p0) {}
    public static boolean setFontRenderingBackend(int p0) { return false; }
    public static void setSystemFontMap(android.os.SharedMemory p0) throws java.io.IOException, android.system.ErrnoException {}
    public static void setSystemFontMap(java.util.Map<java.lang.String, android.graphics.Typeface> p0) {}
    private static void staticInitializer() {}
    private static void staticInitializer$ravenwood() {}
    private static void writeInt(java.io.ByteArrayOutputStream p0, int p1) {}
    private static void writeString(java.io.ByteArrayOutputStream p0, java.lang.String p1) throws java.io.IOException {}
    public boolean equals(java.lang.Object p0) { return false; }
    public final android.graphics.Typeface getDerivedFrom() { return null; }
    public long getNativeInstance() { return 0L; }
    public int getStyle() { return 0; }
    public final java.lang.String getSystemFontFamilyName() { return null; }
    public int getWeight() { return 0; }
    public int hashCode() { return 0; }
    public final boolean isBold() { return false; }
    public final boolean isItalic() { return false; }
    public boolean isSupportedAxes(int p0) { return false; }
    public void releaseNativeObjectForTest() {}

    public static final class Builder {
        public static final int BOLD_WEIGHT = 700;
        public static final int NORMAL_WEIGHT = 400;
        private final android.content.res.AssetManager mAssetManager = null;
        private java.lang.String mFallbackFamilyName;
        private final android.graphics.fonts.Font.Builder mFontBuilder = null;
        private int mItalic;
        private final java.lang.String mPath = null;
        private int mWeight;
        public Builder(android.content.res.AssetManager p0, java.lang.String p1) {}
        public Builder(android.content.res.AssetManager p0, java.lang.String p1, boolean p2, int p3) {}
        public Builder(java.io.File p0) {}
        public Builder(java.io.FileDescriptor p0) {}
        public Builder(java.lang.String p0) {}
        private static java.lang.String createAssetUid(android.content.res.AssetManager p0, java.lang.String p1, int p2, android.graphics.fonts.FontVariationAxis[] p3, int p4, int p5, java.lang.String p6) { return null; }
        private android.graphics.Typeface resolveFallbackTypeface() { return null; }
        public android.graphics.Typeface build() { return null; }
        public android.graphics.Typeface.Builder setFallback(java.lang.String p0) { return null; }
        public android.graphics.Typeface.Builder setFontVariationSettings(java.lang.String p0) { return null; }
        public android.graphics.Typeface.Builder setFontVariationSettings(android.graphics.fonts.FontVariationAxis[] p0) { return null; }
        public android.graphics.Typeface.Builder setItalic(boolean p0) { return null; }
        public android.graphics.Typeface.Builder setTtcIndex(int p0) { return null; }
        public android.graphics.Typeface.Builder setWeight(int p0) { return null; }
    }

    public static final class CustomFallbackBuilder {
        private static final int MAX_CUSTOM_FALLBACK = 64;
        private java.lang.String mFallbackName;
        private final java.util.ArrayList<android.graphics.fonts.FontFamily> mFamilies = null;
        private android.graphics.fonts.FontStyle mStyle;
        public CustomFallbackBuilder(android.graphics.fonts.FontFamily p0) {}
        public static int getMaxCustomFallbackCount() { return 0; }
        public android.graphics.Typeface.CustomFallbackBuilder addCustomFallback(android.graphics.fonts.FontFamily p0) { return null; }
        public android.graphics.Typeface build() { return null; }
        public android.graphics.Typeface.CustomFallbackBuilder setStyle(android.graphics.fonts.FontStyle p0) { return null; }
        public android.graphics.Typeface.CustomFallbackBuilder setSystemFallback(java.lang.String p0) { return null; }
    }

    private static class NoImagePreloadHolder {
        private NoImagePreloadHolder() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Style {
    }
}
