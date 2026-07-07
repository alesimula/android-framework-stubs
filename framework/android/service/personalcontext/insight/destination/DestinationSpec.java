package android.service.personalcontext.insight.destination;

public abstract class DestinationSpec {
    static final int DESTINATION_SPEC_TYPE_CATCH_ALL = 3;
    static final int DESTINATION_SPEC_TYPE_LEGACY_CATCH_ALL = 2;
    static final int DESTINATION_SPEC_TYPE_LEGACY_RENDER_TOKEN = 1;
    static final int DESTINATION_SPEC_TYPE_NOTIFICATION = 4;
    static final int DESTINATION_SPEC_TYPE_UNKNOWN = -1;
    private final int mType = 0;
    DestinationSpec(int p0) {}
    static android.service.personalcontext.insight.destination.DestinationSpec.InsightRule isAllOf(android.service.personalcontext.insight.destination.DestinationSpec.InsightRule... p0) { return null; }
    static android.service.personalcontext.insight.destination.DestinationSpec.InsightRule isAnyOf(android.service.personalcontext.insight.destination.DestinationSpec.InsightRule... p0) { return null; }
    static <T extends java.lang.Object> android.service.personalcontext.insight.destination.DestinationSpec.InsightRule isBundleWith(java.lang.String p0, boolean p1, java.util.function.Function<T, java.lang.Boolean> p2) { return null; }
    static android.service.personalcontext.insight.destination.DestinationSpec.InsightRule isBundleWithOptional(java.lang.String p0, java.lang.Class<?> p1) { return null; }
    static <T extends java.lang.Object> android.service.personalcontext.insight.destination.DestinationSpec.InsightRule isBundleWithOptional(java.lang.String p0, java.util.function.Function<T, java.lang.Boolean> p1) { return null; }
    static android.service.personalcontext.insight.destination.DestinationSpec.InsightRule isBundleWithRequired(java.lang.String p0, java.lang.Class<?> p1) { return null; }
    static <T extends java.lang.Object> android.service.personalcontext.insight.destination.DestinationSpec.InsightRule isBundleWithRequired(java.lang.String p0, java.util.function.Function<T, java.lang.Boolean> p1) { return null; }
    static android.service.personalcontext.insight.destination.DestinationSpec.InsightRule isClass(java.lang.Class<? extends android.service.personalcontext.insight.ContextInsight> p0) { return null; }
    static android.service.personalcontext.insight.destination.DestinationSpec.InsightRule isListOf(android.service.personalcontext.insight.destination.DestinationSpec.InsightRule p0) { return null; }
    static android.service.personalcontext.insight.destination.DestinationSpec.InsightRule isListOfAllOf(android.service.personalcontext.insight.destination.DestinationSpec.InsightRule... p0) { return null; }
    static android.service.personalcontext.insight.destination.DestinationSpec.InsightRule isListOfAnyOf(android.service.personalcontext.insight.destination.DestinationSpec.InsightRule... p0) { return null; }
    static android.service.personalcontext.insight.destination.DestinationSpec.InsightRule isMapWith(java.lang.String p0, boolean p1, android.service.personalcontext.insight.destination.DestinationSpec.InsightRule p2) { return null; }
    static android.service.personalcontext.insight.destination.DestinationSpec.InsightRule isMapWithOptional(java.lang.String p0, android.service.personalcontext.insight.destination.DestinationSpec.InsightRule p1) { return null; }
    static android.service.personalcontext.insight.destination.DestinationSpec.InsightRule isMapWithRequired(java.lang.String p0, android.service.personalcontext.insight.destination.DestinationSpec.InsightRule p1) { return null; }
    static android.service.personalcontext.insight.destination.DestinationSpec readFromParcel(android.os.Parcel p0) { return null; }
    public abstract boolean validate(android.service.personalcontext.insight.ContextInsight p0);
    void writeToParcel(android.os.Parcel p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DestinationSpecType {
    }

    static interface InsightRule {
        public boolean validate(android.service.personalcontext.insight.ContextInsight p0);
    }
}
