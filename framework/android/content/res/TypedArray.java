package android.content.res;

public class TypedArray implements java.lang.AutoCloseable {
    static final int STYLE_ASSET_COOKIE = 2;
    static final int STYLE_CHANGING_CONFIGURATIONS = 4;
    static final int STYLE_DATA = 1;
    static final int STYLE_DENSITY = 5;
    static final int STYLE_NUM_ENTRIES = 7;
    static final int STYLE_RESOURCE_ID = 3;
    static final int STYLE_SOURCE_RESOURCE_ID = 6;
    static final int STYLE_TYPE = 0;
    private android.content.res.AssetManager mAssets;
    int[] mData;
    long mDataAddress;
    int[] mIndices;
    long mIndicesAddress;
    int mLength;
    private android.util.DisplayMetrics mMetrics;
    private boolean mRecycled;
    private final android.content.res.Resources mResources = null;
    android.content.res.Resources.Theme mTheme;
    android.util.TypedValue mValue;
    android.content.res.XmlBlock.Parser mXml;
    protected TypedArray(android.content.res.Resources p0) {}
    private boolean getValueAt(int p0, android.util.TypedValue p1) { return false; }
    private java.lang.CharSequence loadStringValueAt(int p0) { return null; }
    static android.content.res.TypedArray obtain(android.content.res.Resources p0, int p1) { return null; }
    private void releaseToPool() {}
    private void resize(int p0) {}
    public void close() {}
    public int[] extractThemeAttrs() { return null; }
    public int[] extractThemeAttrs(int[] p0) { return null; }
    public boolean getBoolean(int p0, boolean p1) { return false; }
    public int getChangingConfigurations() { return 0; }
    public int getColor(int p0, int p1) { return 0; }
    public android.content.res.ColorStateList getColorStateList(int p0) { return null; }
    public android.content.res.ComplexColor getComplexColor(int p0) { return null; }
    public float getDimension(int p0, float p1) { return 0.0f; }
    public int getDimensionPixelOffset(int p0, int p1) { return 0; }
    public int getDimensionPixelSize(int p0, int p1) { return 0; }
    public android.graphics.drawable.Drawable getDrawable(int p0) { return null; }
    public android.graphics.drawable.Drawable getDrawableForDensity(int p0, int p1) { return null; }
    public float getFloat(int p0, float p1) { return 0.0f; }
    public android.graphics.Typeface getFont(int p0) { return null; }
    public float getFraction(int p0, int p1, int p2, float p3) { return 0.0f; }
    public int getIndex(int p0) { return 0; }
    public int getIndexCount() { return 0; }
    public int getInt(int p0, int p1) { return 0; }
    public int getInteger(int p0, int p1) { return 0; }
    public int getLayoutDimension(int p0, int p1) { return 0; }
    public int getLayoutDimension(int p0, java.lang.String p1) { return 0; }
    public java.lang.String getNonConfigurationString(int p0, int p1) { return null; }
    public java.lang.String getNonResourceString(int p0) { return null; }
    public java.lang.String getPositionDescription() { return null; }
    public int getResourceId(int p0, int p1) { return 0; }
    public android.content.res.Resources getResources() { return null; }
    public int getSourceResourceId(int p0, int p1) { return 0; }
    public java.lang.String getString(int p0) { return null; }
    public java.lang.CharSequence getText(int p0) { return null; }
    public java.lang.CharSequence[] getTextArray(int p0) { return null; }
    public int getThemeAttributeId(int p0, int p1) { return 0; }
    public int getType(int p0) { return 0; }
    public boolean getValue(int p0, android.util.TypedValue p1) { return false; }
    public boolean hasValue(int p0) { return false; }
    public boolean hasValueOrEmpty(int p0) { return false; }
    public int length() { return 0; }
    public android.util.TypedValue peekValue(int p0) { return null; }
    public void recycle() {}
    public java.lang.String toString() { return null; }
}
