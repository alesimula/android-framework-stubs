package android.content.pm.verify.domain;

@android.annotation.RestrictedForEnvironment(environments="SDK Runtime", from=34)
public final class DomainVerificationManager {
    @android.annotation.SystemApi
    public static final int ERROR_DOMAIN_SET_ID_INVALID = 1;
    @android.annotation.SystemApi
    public static final int ERROR_UNABLE_TO_APPROVE = 3;
    @android.annotation.SystemApi
    public static final int ERROR_UNKNOWN_DOMAIN = 2;
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_VERIFICATION_REQUEST = "android.content.pm.verify.domain.extra.VERIFICATION_REQUEST";
    public static final int INTERNAL_ERROR_NAME_NOT_FOUND = 1;
    @android.annotation.SystemApi
    public static final int STATUS_OK = 0;
    private final android.content.Context mContext = null;
    private final android.content.pm.verify.domain.IDomainVerificationManager mDomainVerificationManager = null;
    public DomainVerificationManager(android.content.Context p0, android.content.pm.verify.domain.IDomainVerificationManager p1) {}
    private java.lang.Exception rethrow(java.lang.Exception p0, java.lang.String p1) { return null; }
    private void validateInput(java.util.UUID p0, java.util.Set<java.lang.String> p1) {}
    @android.annotation.SystemApi
    public android.content.pm.verify.domain.DomainVerificationInfo getDomainVerificationInfo(java.lang.String p0) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public android.content.pm.verify.domain.DomainVerificationUserState getDomainVerificationUserState(java.lang.String p0) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    @android.annotation.SystemApi
    public java.util.SortedSet<android.content.pm.verify.domain.DomainOwner> getOwnersForDomain(java.lang.String p0) { return null; }
    @android.annotation.SystemApi
    public java.util.Map<java.lang.String, java.util.List<android.content.UriRelativeFilterGroup>> getUriRelativeFilterGroups(java.lang.String p0, java.util.List<java.lang.String> p1) { return null; }
    @android.annotation.SystemApi
    public java.util.SortedSet<android.content.pm.verify.domain.DomainOwner> getVerifiedOwnersForDomain(java.lang.String p0) { return null; }
    @android.annotation.SystemApi
    public java.util.List<java.lang.String> queryValidVerificationPackageNames() { return null; }
    @android.annotation.SystemApi
    public void setDomainVerificationLinkHandlingAllowed(java.lang.String p0, boolean p1) throws android.content.pm.PackageManager.NameNotFoundException {}
    @android.annotation.SystemApi
    public int setDomainVerificationStatus(java.util.UUID p0, java.util.Set<java.lang.String> p1, int p2) throws android.content.pm.PackageManager.NameNotFoundException { return 0; }
    @android.annotation.SystemApi
    public int setDomainVerificationUserSelection(java.util.UUID p0, java.util.Set<java.lang.String> p1, boolean p2) throws android.content.pm.PackageManager.NameNotFoundException { return 0; }
    @android.annotation.SystemApi
    public void setUriRelativeFilterGroups(java.lang.String p0, java.util.Map<java.lang.String, java.util.List<android.content.UriRelativeFilterGroup>> p1) {}

    public static @interface Error {
    }
}
