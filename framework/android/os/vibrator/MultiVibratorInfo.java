package android.os.vibrator;

public final class MultiVibratorInfo extends android.os.VibratorInfo {
    private static final float EPSILON = 9.999999747378752e-06f;
    private static final java.lang.String TAG = "MultiVibratorInfo";
    public MultiVibratorInfo(int p0, android.os.VibratorInfo[] p1) { super(0, (android.os.VibratorInfo)null); }
    private MultiVibratorInfo(int p0, android.os.VibratorInfo[] p1, android.os.VibratorInfo.FrequencyProfileLegacy p2, android.os.VibratorInfo.FrequencyProfile p3) { super(0, (android.os.VibratorInfo)null); }
    private static int capabilitiesIntersection(android.os.VibratorInfo[] p0, boolean p1) { return 0; }
    private static float floatPropertyIntersection(android.os.VibratorInfo[] p0, java.util.function.Function<android.os.VibratorInfo, java.lang.Float> p1) { return 0.0f; }
    private static android.os.VibratorInfo.FrequencyProfile frequencyProfileIntersection(android.os.VibratorInfo[] p0) { return null; }
    private static android.os.VibratorInfo.FrequencyProfileLegacy frequencyProfileLegacyIntersection(android.os.VibratorInfo[] p0) { return null; }
    private static android.util.Range<java.lang.Float> frequencyRangeIntersection(android.os.VibratorInfo[] p0, float p1) { return null; }
    private static int integerLimitIntersection(android.os.VibratorInfo[] p0, java.util.function.Function<android.os.VibratorInfo, java.lang.Integer> p1) { return 0; }
    private static android.util.SparseBooleanArray supportedEffectsIntersection(android.os.VibratorInfo[] p0) { return null; }
    private static android.util.SparseIntArray supportedPrimitivesAndDurationsIntersection(android.os.VibratorInfo[] p0) { return null; }
}
