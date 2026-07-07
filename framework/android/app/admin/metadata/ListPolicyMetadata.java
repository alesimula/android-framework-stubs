package android.app.admin.metadata;

public class ListPolicyMetadata<T extends java.lang.Object> extends android.app.admin.metadata.PolicyMetadata<java.util.List<T>> {
    private final android.app.admin.metadata.PolicyMetadata<T> mElementMetadata = null;
    private final boolean mEmptyListAllowed = false;
    private final int mMaxListLength = 0;
    public ListPolicyMetadata(android.app.admin.PolicyIdentifier<java.util.List<T>> p0, android.app.admin.metadata.PolicyMetadata<T> p1, android.app.admin.metadata.ResolutionMechanismMetadata<java.util.List<T>> p2, boolean p3, int p4, java.lang.String p5) { super(null, null, 0, null, null, null, null, null); }
    public android.app.admin.metadata.PolicyMetadata<T> getElementMetadata() { return null; }
    public int getMaxListLength() { return 0; }
    public boolean isEmptyListAllowed() { return false; }
}
