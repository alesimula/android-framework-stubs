package android.app.admin.metadata;

public abstract class PolicyTransportValueConvertor<T extends java.lang.Object> {
    private static final android.app.admin.metadata.PolicyTransportValueConvertor<java.lang.Boolean> BOOLEAN_CONVERTOR = null;
    private static final android.app.admin.metadata.PolicyTransportValueConvertor<java.lang.Integer> INTEGER_CONVERTOR = null;
    private static final android.app.admin.metadata.PolicyTransportValueConvertor<java.util.List<android.app.admin.PackageIdentifier>> LIST_OF_PACKAGE_CONVERTOR = null;
    private static final android.app.admin.metadata.PolicyTransportValueConvertor<java.util.List<java.lang.String>> LIST_OF_STRING_CONVERTOR = null;
    private static final android.app.admin.metadata.PolicyTransportValueConvertor<java.lang.Long> LONG_CONVERTOR = null;
    private static final android.app.admin.metadata.PolicyTransportValueConvertor<android.app.admin.PackageIdentifier> PACKAGE_CONVERTOR = null;
    private static final android.app.admin.metadata.PolicyTransportValueConvertor<java.lang.String> STRING_CONVERTOR = null;
    protected PolicyTransportValueConvertor() {}
    public static <T extends java.lang.Object> android.app.admin.metadata.PolicyTransportValueConvertor<T> getInstance(android.app.admin.PolicyIdentifier<T> p0) { return null; }
    public static <T extends java.lang.Object> android.app.admin.metadata.PolicyTransportValueConvertor<T> getInstance(android.app.admin.metadata.PolicyMetadata<T> p0) { return null; }
    private static <T extends java.lang.Object> android.app.admin.metadata.PolicyTransportValueConvertor<java.util.List<T>> getListInstance(android.app.admin.metadata.ListPolicyMetadata<T> p0) { return null; }
    public abstract T fromTransport(android.app.admin.PolicyValueTransport p0);
    public abstract android.app.admin.PolicyValueTransport toTransport(T p0);
}
