package android.app.admin.dataleakprevention;

public final class DataLeakPreventionRule implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.admin.dataleakprevention.DataLeakPreventionRule> CREATOR = null;
    private final android.app.admin.dataleakprevention.DestinationMatcher mDestinationMatcher = null;
    private final android.app.admin.dataleakprevention.EnforcementAction mEnforcement = null;
    private final java.lang.String mRuleId = null;
    private final android.app.admin.dataleakprevention.SourceMatcher mSourceMatcher = null;
    private final android.app.admin.dataleakprevention.TransferActionMatcher mTransferActionMatcher = null;
    private DataLeakPreventionRule(android.app.admin.dataleakprevention.DataLeakPreventionRule.Builder p0) {}
    private DataLeakPreventionRule(android.os.Parcel p0) {}
    public static android.app.admin.dataleakprevention.DataLeakPreventionRule resolveMostRestrictive(android.app.admin.dataleakprevention.DataLeakPreventionRule p0, android.app.admin.dataleakprevention.DataLeakPreventionRule p1) { return null; }
    private void validateRedactActionApplicability() {}
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

    public static final class Builder {
        private android.app.admin.dataleakprevention.DestinationMatcher mDestinationMatcher;
        private final android.app.admin.dataleakprevention.EnforcementAction mEnforcementAction = null;
        private final java.lang.String mRuleId = null;
        private android.app.admin.dataleakprevention.SourceMatcher mSourceMatcher;
        private android.app.admin.dataleakprevention.TransferActionMatcher mTransferActionMatcher;
        public Builder(java.lang.String p0, android.app.admin.dataleakprevention.EnforcementAction p1) {}
        public android.app.admin.dataleakprevention.DataLeakPreventionRule build() { return null; }
        public android.app.admin.dataleakprevention.DataLeakPreventionRule.Builder setDestinationMatcher(android.app.admin.dataleakprevention.DestinationMatcher p0) { return null; }
        public android.app.admin.dataleakprevention.DataLeakPreventionRule.Builder setSourceMatcher(android.app.admin.dataleakprevention.SourceMatcher p0) { return null; }
        public android.app.admin.dataleakprevention.DataLeakPreventionRule.Builder setTransferActionMatcher(android.app.admin.dataleakprevention.TransferActionMatcher p0) { return null; }
    }
}
