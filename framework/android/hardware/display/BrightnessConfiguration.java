package android.hardware.display;

@android.annotation.SystemApi
public final class BrightnessConfiguration implements android.os.Parcelable {
    private static final java.lang.String ATTR_CATEGORY = "category";
    private static final java.lang.String ATTR_COLLECT_COLOR = "collect-color";
    private static final java.lang.String ATTR_DESCRIPTION = "description";
    private static final java.lang.String ATTR_LUX = "lux";
    private static final java.lang.String ATTR_MODEL_LOWER_BOUND = "model-lower-bound";
    private static final java.lang.String ATTR_MODEL_TIMEOUT = "model-timeout";
    private static final java.lang.String ATTR_MODEL_UPPER_BOUND = "model-upper-bound";
    private static final java.lang.String ATTR_NITS = "nits";
    private static final java.lang.String ATTR_PACKAGE_NAME = "package-name";
    public static final android.os.Parcelable.Creator<android.hardware.display.BrightnessConfiguration> CREATOR = null;
    public static final long SHORT_TERM_TIMEOUT_UNSET = -1L;
    private static final java.lang.String TAG_BRIGHTNESS_CORRECTION = "brightness-correction";
    private static final java.lang.String TAG_BRIGHTNESS_CORRECTIONS = "brightness-corrections";
    private static final java.lang.String TAG_BRIGHTNESS_CURVE = "brightness-curve";
    private static final java.lang.String TAG_BRIGHTNESS_PARAMS = "brightness-params";
    private static final java.lang.String TAG_BRIGHTNESS_POINT = "brightness-point";
    private final java.util.Map<java.lang.Integer, android.hardware.display.BrightnessCorrection> mCorrectionsByCategory = null;
    private final java.util.Map<java.lang.String, android.hardware.display.BrightnessCorrection> mCorrectionsByPackageName = null;
    private final java.lang.String mDescription = null;
    private final float[] mLux = null;
    private final float[] mNits = null;
    private final float mShortTermModelLowerLuxMultiplier = 0.0f;
    private final long mShortTermModelTimeout = 0L;
    private final float mShortTermModelUpperLuxMultiplier = 0.0f;
    private final boolean mShouldCollectColorSamples = false;
    private BrightnessConfiguration(float[] p0, float[] p1, java.util.Map<java.lang.String, android.hardware.display.BrightnessCorrection> p2, java.util.Map<java.lang.Integer, android.hardware.display.BrightnessCorrection> p3, java.lang.String p4, boolean p5, long p6, float p7, float p8) {}
    private boolean checkFloatEquals(float p0, float p1) { return false; }
    private static float loadFloatFromXml(com.android.modules.utils.TypedXmlPullParser p0, java.lang.String p1) { return 0.0f; }
    public static android.hardware.display.BrightnessConfiguration loadFromXml(com.android.modules.utils.TypedXmlPullParser p0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    private static java.lang.Long loadLongFromXml(com.android.modules.utils.TypedXmlPullParser p0, java.lang.String p1) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.hardware.display.BrightnessCorrection getCorrectionByCategory(int p0) { return null; }
    public android.hardware.display.BrightnessCorrection getCorrectionByPackageName(java.lang.String p0) { return null; }
    public android.util.Pair<float[], float[]> getCurve() { return null; }
    public java.lang.String getDescription() { return null; }
    public float getShortTermModelLowerLuxMultiplier() { return 0.0f; }
    public long getShortTermModelTimeoutMillis() { return 0L; }
    public float getShortTermModelUpperLuxMultiplier() { return 0.0f; }
    public int hashCode() { return 0; }
    public void saveToXml(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}
    public boolean shouldCollectColorSamples() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder {
        private static final int MAX_CORRECTIONS_BY_CATEGORY = 20;
        private static final int MAX_CORRECTIONS_BY_PACKAGE_NAME = 20;
        private java.util.Map<java.lang.Integer, android.hardware.display.BrightnessCorrection> mCorrectionsByCategory;
        private java.util.Map<java.lang.String, android.hardware.display.BrightnessCorrection> mCorrectionsByPackageName;
        private float[] mCurveLux;
        private float[] mCurveNits;
        private java.lang.String mDescription;
        private float mShortTermModelLowerLuxMultiplier;
        private long mShortTermModelTimeout;
        private float mShortTermModelUpperLuxMultiplier;
        private boolean mShouldCollectColorSamples;
        public Builder(float[] p0, float[] p1) {}
        private static void checkMonotonic(float[] p0, boolean p1, java.lang.String p2) {}
        public android.hardware.display.BrightnessConfiguration.Builder addCorrectionByCategory(int p0, android.hardware.display.BrightnessCorrection p1) { return null; }
        public android.hardware.display.BrightnessConfiguration.Builder addCorrectionByPackageName(java.lang.String p0, android.hardware.display.BrightnessCorrection p1) { return null; }
        public android.hardware.display.BrightnessConfiguration build() { return null; }
        public int getMaxCorrectionsByCategory() { return 0; }
        public int getMaxCorrectionsByPackageName() { return 0; }
        public android.hardware.display.BrightnessConfiguration.Builder setDescription(java.lang.String p0) { return null; }
        public android.hardware.display.BrightnessConfiguration.Builder setShortTermModelLowerLuxMultiplier(float p0) { return null; }
        public android.hardware.display.BrightnessConfiguration.Builder setShortTermModelTimeoutMillis(long p0) { return null; }
        public android.hardware.display.BrightnessConfiguration.Builder setShortTermModelUpperLuxMultiplier(float p0) { return null; }
        public android.hardware.display.BrightnessConfiguration.Builder setShouldCollectColorSamples(boolean p0) { return null; }
    }
}
