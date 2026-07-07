package android.content.integrity;

@android.annotation.SystemApi
public class RuleSet {
    private final java.util.List<android.content.integrity.Rule> mRules = null;
    private final java.lang.String mVersion = null;
    private RuleSet(java.lang.String p0, java.util.List<android.content.integrity.Rule> p1) {}
    public java.util.List<android.content.integrity.Rule> getRules() { return null; }
    public java.lang.String getVersion() { return null; }

    public static class Builder {
        private java.util.List<android.content.integrity.Rule> mRules;
        private java.lang.String mVersion;
        public Builder() {}
        public android.content.integrity.RuleSet.Builder addRules(java.util.List<android.content.integrity.Rule> p0) { return null; }
        public android.content.integrity.RuleSet build() { return null; }
        public android.content.integrity.RuleSet.Builder setVersion(java.lang.String p0) { return null; }
    }
}
