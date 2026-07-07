package android.content.res;

public class FontScaleConverterFactory {
    private static final java.lang.Object LOOKUP_TABLES_WRITE_LOCK = null;
    private static final float SCALE_KEY_MULTIPLIER = 100.0f;
    public static volatile android.util.SparseArray<android.content.res.FontScaleConverter> sLookupTables;
    private static float sMinScaleBeforeCurvesApplied;
    private FontScaleConverterFactory() {}
    private static android.content.res.FontScaleConverter createInterpolatedTableBetween(android.content.res.FontScaleConverter p0, android.content.res.FontScaleConverter p1, float p2) { return null; }
    public static android.content.res.FontScaleConverter forScale(float p0) { return null; }
    private static android.content.res.FontScaleConverter get(float p0) { return null; }
    private static int getKey(float p0) { return 0; }
    private static float getScaleFromKey(int p0) { return 0.0f; }
    public static boolean isNonLinearFontScalingActive(float p0) { return false; }
    private static void put(float p0, android.content.res.FontScaleConverter p1) {}
    private static void putInto(android.util.SparseArray<android.content.res.FontScaleConverter> p0, float p1, android.content.res.FontScaleConverter p2) {}
}
