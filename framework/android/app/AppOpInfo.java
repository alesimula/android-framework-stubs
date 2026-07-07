package android.app;

class AppOpInfo {
    public static final int LAST_DEFAULT_PCC_MODE_INHERIT_OP = 177;
    public static final int PCC_MODE_INHERIT = -1;
    public final android.app.AppOpsManager.RestrictionBypass allowSystemRestrictionBypass = null;
    public final int code = 0;
    public final int defaultMode = 0;
    public final boolean disableReset = false;
    public final boolean forceCollectNotes = false;
    public final java.lang.String name = null;
    public final int pccMode = 0;
    public final java.lang.String permission = null;
    public final boolean restrictRead = false;
    public final java.lang.String restriction = null;
    public final java.lang.String simpleName = null;
    public final int switchCode = 0;
    AppOpInfo(int p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, android.app.AppOpsManager.RestrictionBypass p6, int p7, boolean p8, boolean p9, boolean p10, int p11) {}

    static class Builder {
        private android.app.AppOpsManager.RestrictionBypass mAllowSystemRestrictionBypass;
        private int mCode;
        private int mDefaultMode;
        private boolean mDisableReset;
        private boolean mForceCollectNotes;
        private java.lang.String mName;
        private int mPccMode;
        private java.lang.String mPermission;
        private boolean mRestrictRead;
        private java.lang.String mRestriction;
        private java.lang.String mSimpleName;
        private int mSwitchCode;
        Builder(int p0, java.lang.String p1, java.lang.String p2) {}
        Builder(int p0, java.lang.String p1, java.lang.String p2, int p3) {}
        public android.app.AppOpInfo build() { return null; }
        public android.app.AppOpInfo.Builder setAllowSystemRestrictionBypass(android.app.AppOpsManager.RestrictionBypass p0) { return null; }
        public android.app.AppOpInfo.Builder setCode(int p0) { return null; }
        public android.app.AppOpInfo.Builder setDefaultMode(int p0) { return null; }
        public android.app.AppOpInfo.Builder setDisableReset(boolean p0) { return null; }
        public android.app.AppOpInfo.Builder setForceCollectNotes(boolean p0) { return null; }
        public android.app.AppOpInfo.Builder setName(java.lang.String p0) { return null; }
        public android.app.AppOpInfo.Builder setPermission(java.lang.String p0) { return null; }
        public android.app.AppOpInfo.Builder setRestrictRead(boolean p0) { return null; }
        public android.app.AppOpInfo.Builder setRestriction(java.lang.String p0) { return null; }
        public android.app.AppOpInfo.Builder setSimpleName(java.lang.String p0) { return null; }
        public android.app.AppOpInfo.Builder setSwitchCode(int p0) { return null; }
    }
}
