package android.app.admin.dataleakprevention;

public final class DataLeakPreventionRule implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.admin.dataleakprevention.DataLeakPreventionRule> CREATOR = null;
    private final android.app.admin.dataleakprevention.DestinationMatcher mDestinationMatcher = null;
    private final android.app.admin.dataleakprevention.EnforcementAction mEnforcement = null;
    private final java.lang.String mRuleId = null;
    private final android.app.admin.dataleakprevention.SourceMatcher mSourceMatcher = null;
    private final android.app.admin.dataleakprevention.TransferActionMatcher mTransferActionMatcher = null;
    private DataLeakPreventionRule(android.os.Parcel p0) {}
    public DataLeakPreventionRule(java.lang.String p0, android.app.admin.dataleakprevention.SourceMatcher p1, android.app.admin.dataleakprevention.DestinationMatcher p2, android.app.admin.dataleakprevention.TransferActionMatcher p3, android.app.admin.dataleakprevention.EnforcementAction p4) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.app.admin.dataleakprevention.DestinationMatcher getDestinationMatcher() { return null; }
    public android.app.admin.dataleakprevention.EnforcementAction getEnforcementAction() { return null; }
    public java.lang.String getRuleId() { return null; }
    public android.app.admin.dataleakprevention.SourceMatcher getSourceMatcher() { return null; }
    public android.app.admin.dataleakprevention.TransferActionMatcher getTransferActionMatcher() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
