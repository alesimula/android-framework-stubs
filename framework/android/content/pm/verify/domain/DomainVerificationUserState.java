package android.content.pm.verify.domain;

public final class DomainVerificationUserState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.verify.domain.DomainVerificationUserState> CREATOR = null;
    public static final int DOMAIN_STATE_NONE = 0;
    public static final int DOMAIN_STATE_SELECTED = 1;
    public static final int DOMAIN_STATE_VERIFIED = 2;
    static com.android.internal.util.Parcelling<java.util.UUID> sParcellingForIdentifier;
    private final java.util.Map<java.lang.String, java.lang.Integer> mHostToStateMap = null;
    private final java.util.UUID mIdentifier = null;
    private final boolean mLinkHandlingAllowed = false;
    private final java.lang.String mPackageName = null;
    private final android.os.UserHandle mUser = null;
    DomainVerificationUserState(android.os.Parcel p0) {}
    public DomainVerificationUserState(java.util.UUID p0, java.lang.String p1, android.os.UserHandle p2, boolean p3, java.util.Map<java.lang.String, java.lang.Integer> p4) {}
    @java.lang.Deprecated
    private void __metadata() {}
    public static java.lang.String domainStateToString(int p0) { return null; }
    private void parcelHostToStateMap(android.os.Parcel p0, int p1) {}
    private java.util.Map<java.lang.String, java.lang.Integer> unparcelHostToStateMap(android.os.Parcel p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.Map<java.lang.String, java.lang.Integer> getHostToStateMap() { return null; }
    @android.annotation.SystemApi
    public java.util.UUID getIdentifier() { return null; }
    public java.lang.String getPackageName() { return null; }
    public android.os.UserHandle getUser() { return null; }
    public int hashCode() { return 0; }
    public boolean isLinkHandlingAllowed() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DomainState {
    }
}
