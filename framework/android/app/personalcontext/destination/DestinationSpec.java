package android.app.personalcontext.destination;

public abstract class DestinationSpec {
    static final int DESTINATION_SPEC_TYPE_AUGMENTED_AUTOFILL = 16;
    static final int DESTINATION_SPEC_TYPE_EMBEDDED = 32;
    static final int DESTINATION_SPEC_TYPE_LEGACY_CATCH_ALL = -2147483648;
    static final int DESTINATION_SPEC_TYPE_LEGACY_RENDER_TOKEN = 1073741824;
    static final int DESTINATION_SPEC_TYPE_NOTIFICATION = 2;
    static final int DESTINATION_SPEC_TYPE_REMOTE_AUTOFILL = 8;
    static final int DESTINATION_SPEC_TYPE_SCREEN_WHISPER = 4;
    static final int DESTINATION_SPEC_TYPE_UNIVERSAL = 1;
    static final int DESTINATION_SPEC_TYPE_UNKNOWN = 0;
    private final int mType = 0;
    DestinationSpec(int p0) {}
    static android.app.personalcontext.destination.DestinationSpec.InsightRule isAllOf(android.app.personalcontext.destination.DestinationSpec.InsightRule... p0) { return null; }
    static android.app.personalcontext.destination.DestinationSpec.InsightRule isAnyOf(android.app.personalcontext.destination.DestinationSpec.InsightRule... p0) { return null; }
    static <T extends java.lang.Object> android.app.personalcontext.destination.DestinationSpec.InsightRule isBundleWith(java.lang.String p0, boolean p1, java.util.function.Function<T, java.lang.Boolean> p2) { return null; }
    static android.app.personalcontext.destination.DestinationSpec.InsightRule isBundleWithOptional(java.lang.String p0, java.lang.Class<?> p1) { return null; }
    static <T extends java.lang.Object> android.app.personalcontext.destination.DestinationSpec.InsightRule isBundleWithOptional(java.lang.String p0, java.util.function.Function<T, java.lang.Boolean> p1) { return null; }
    static android.app.personalcontext.destination.DestinationSpec.InsightRule isBundleWithRequired(java.lang.String p0, java.lang.Class<?> p1) { return null; }
    static <T extends java.lang.Object> android.app.personalcontext.destination.DestinationSpec.InsightRule isBundleWithRequired(java.lang.String p0, java.util.function.Function<T, java.lang.Boolean> p1) { return null; }
    static android.app.personalcontext.destination.DestinationSpec.InsightRule isClass(java.lang.Class<? extends android.app.personalcontext.insight.ContextInsight> p0) { return null; }
    static android.app.personalcontext.destination.DestinationSpec.InsightRule isListOf(android.app.personalcontext.destination.DestinationSpec.InsightRule p0) { return null; }
    static android.app.personalcontext.destination.DestinationSpec.InsightRule isListOfAllOf(android.app.personalcontext.destination.DestinationSpec.InsightRule... p0) { return null; }
    static android.app.personalcontext.destination.DestinationSpec.InsightRule isListOfAnyOf(android.app.personalcontext.destination.DestinationSpec.InsightRule... p0) { return null; }
    static android.app.personalcontext.destination.DestinationSpec.InsightRule isMapWith(java.lang.String p0, boolean p1, android.app.personalcontext.destination.DestinationSpec.InsightRule p2) { return null; }
    static android.app.personalcontext.destination.DestinationSpec.InsightRule isMapWithOptional(java.lang.String p0, android.app.personalcontext.destination.DestinationSpec.InsightRule p1) { return null; }
    static android.app.personalcontext.destination.DestinationSpec.InsightRule isMapWithRequired(java.lang.String p0, android.app.personalcontext.destination.DestinationSpec.InsightRule p1) { return null; }
    static android.app.personalcontext.destination.DestinationSpec readFromParcel(android.os.Parcel p0) { return null; }
    int getType() { return 0; }
    public abstract boolean validate(android.app.personalcontext.insight.ContextInsight p0);
    void writeToParcel(android.os.Parcel p0) {}

    static interface InsightRule {
        public boolean validate(android.app.personalcontext.insight.ContextInsight p0);
    }
}
