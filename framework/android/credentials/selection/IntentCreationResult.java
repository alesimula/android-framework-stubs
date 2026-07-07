package android.credentials.selection;

public final class IntentCreationResult {
    private final java.lang.String mFallbackUiPackageName = null;
    private final android.content.Intent mIntent = null;
    private final java.lang.String mOemUiPackageName = null;
    private final android.credentials.selection.IntentCreationResult.OemUiUsageStatus mOemUiUsageStatus = null;
    private IntentCreationResult(android.content.Intent p0, java.lang.String p1, java.lang.String p2, android.credentials.selection.IntentCreationResult.OemUiUsageStatus p3) {}
    public java.lang.String getFallbackUiPackageName() { return null; }
    public android.content.Intent getIntent() { return null; }
    public java.lang.String getOemUiPackageName() { return null; }
    public android.credentials.selection.IntentCreationResult.OemUiUsageStatus getOemUiUsageStatus() { return null; }

    public static final class Builder {
        private java.lang.String mFallbackUiPackageName;
        private android.content.Intent mIntent;
        private java.lang.String mOemUiPackageName;
        private android.credentials.selection.IntentCreationResult.OemUiUsageStatus mOemUiUsageStatus;
        public Builder(android.content.Intent p0) {}
        public android.credentials.selection.IntentCreationResult build() { return null; }
        public android.credentials.selection.IntentCreationResult.Builder setFallbackUiPackageName(java.lang.String p0) { return null; }
        public android.credentials.selection.IntentCreationResult.Builder setOemUiPackageName(java.lang.String p0) { return null; }
        public android.credentials.selection.IntentCreationResult.Builder setOemUiUsageStatus(android.credentials.selection.IntentCreationResult.OemUiUsageStatus p0) { return null; }
    }

    public static enum OemUiUsageStatus {
        OEM_UI_CONFIG_NOT_SPECIFIED,
        OEM_UI_CONFIG_SPECIFIED_BUT_NOT_FOUND,
        OEM_UI_CONFIG_SPECIFIED_FOUND_BUT_NOT_ENABLED,
        SUCCESS,
        UNKNOWN;
        private static final android.credentials.selection.IntentCreationResult.OemUiUsageStatus[] $VALUES = null;
        private OemUiUsageStatus() {}
    }
}
