package android.credentials;

public final class CredentialProviderInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.credentials.CredentialProviderInfo> CREATOR = null;
    private final java.util.List<java.lang.String> mCapabilities = null;
    private final boolean mIsEnabled = false;
    private final boolean mIsPrimary = false;
    private final boolean mIsSystemProvider = false;
    private final java.lang.CharSequence mOverrideLabel = null;
    private final android.content.pm.ServiceInfo mServiceInfo = null;
    private java.lang.CharSequence mSettingsActivity;
    private java.lang.CharSequence mSettingsSubtitle;
    private CredentialProviderInfo(android.credentials.CredentialProviderInfo.Builder p0) {}
    private CredentialProviderInfo(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public java.util.List<java.lang.String> getCapabilities() { return null; }
    public android.content.ComponentName getComponentName() { return null; }
    public java.lang.CharSequence getLabel(android.content.Context p0) { return null; }
    public android.graphics.drawable.Drawable getServiceIcon(android.content.Context p0) { return null; }
    public android.content.pm.ServiceInfo getServiceInfo() { return null; }
    public java.lang.CharSequence getSettingsActivity() { return null; }
    public java.lang.CharSequence getSettingsSubtitle() { return null; }
    public boolean hasCapability(java.lang.String p0) { return false; }
    public boolean isEnabled() { return false; }
    public boolean isPrimary() { return false; }
    public boolean isSystemProvider() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private java.util.List<java.lang.String> mCapabilities;
        private boolean mIsEnabled;
        private boolean mIsPrimary;
        private boolean mIsSystemProvider;
        private java.lang.CharSequence mOverrideLabel;
        private android.content.pm.ServiceInfo mServiceInfo;
        private java.lang.CharSequence mSettingsActivity;
        private java.lang.CharSequence mSettingsSubtitle;
        public Builder(android.content.pm.ServiceInfo p0) {}
        public android.credentials.CredentialProviderInfo.Builder addCapabilities(java.util.List<java.lang.String> p0) { return null; }
        public android.credentials.CredentialProviderInfo build() { return null; }
        public android.credentials.CredentialProviderInfo.Builder setEnabled(boolean p0) { return null; }
        public android.credentials.CredentialProviderInfo.Builder setOverrideLabel(java.lang.CharSequence p0) { return null; }
        public android.credentials.CredentialProviderInfo.Builder setPrimary(boolean p0) { return null; }
        public android.credentials.CredentialProviderInfo.Builder setSettingsActivity(java.lang.CharSequence p0) { return null; }
        public android.credentials.CredentialProviderInfo.Builder setSettingsSubtitle(java.lang.CharSequence p0) { return null; }
        public android.credentials.CredentialProviderInfo.Builder setSystemProvider(boolean p0) { return null; }
    }
}
