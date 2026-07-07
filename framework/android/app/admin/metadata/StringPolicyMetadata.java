package android.app.admin.metadata;

public class StringPolicyMetadata extends android.app.admin.metadata.PolicyMetadata<java.lang.String> {
    private final boolean mEmptyStringAllowed = false;
    private final int mMaxLength = 0;
    private final boolean mPureWhitespaceAllowed = false;
    private final boolean mUnprintableCharactersAllowed = false;
    private final boolean mUnstrippedStringAllowed = false;
    public StringPolicyMetadata(android.app.admin.PolicyIdentifier<java.lang.String> p0, java.util.Set<java.lang.Integer> p1, int p2, java.lang.String p3, java.lang.String p4, java.util.Set<java.lang.Integer> p5, java.lang.String p6, android.app.admin.metadata.ResolutionMechanismMetadata<java.lang.String> p7, boolean p8, boolean p9, boolean p10, boolean p11, int p12) { super(null, null, 0, null, null, null, null, null); }
    public int getMaxLength() { return 0; }
    public boolean isEmptyStringAllowed() { return false; }
    public boolean isPureWhitespaceAllowed() { return false; }
    public boolean isUnprintableCharactersAllowed() { return false; }
    public boolean isUnstrippedStringAllowed() { return false; }
}
