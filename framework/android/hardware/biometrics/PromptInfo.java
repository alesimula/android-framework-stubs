package android.hardware.biometrics;

public class PromptInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.PromptInfo> CREATOR = null;
    private boolean mAllowBackgroundAuthentication;
    private java.util.List<java.lang.Integer> mAllowedSensorIds;
    private int mAuthenticators;
    private java.lang.String mClassNameIfItIsConfirmDeviceCredentialActivity;
    private boolean mConfirmationRequested;
    private android.hardware.biometrics.PromptContentViewParcelable mContentView;
    private java.lang.CharSequence mDescription;
    private boolean mDeviceCredentialAllowed;
    private java.lang.CharSequence mDeviceCredentialDescription;
    private java.lang.CharSequence mDeviceCredentialSubtitle;
    private java.lang.CharSequence mDeviceCredentialTitle;
    private boolean mDisallowBiometricsIfPolicyExists;
    private int mDisplayId;
    private java.util.List<android.hardware.biometrics.FallbackOption> mFallbackOptions;
    private android.hardware.biometrics.IdentityCheckInfo mIdentityCheckInfo;
    private boolean mIgnoreEnrollmentState;
    private boolean mIsForLegacyFingerprintManager;
    private boolean mIsSystemCaller;
    private android.graphics.Bitmap mLogoBitmap;
    private java.lang.String mLogoDescription;
    private int mLogoRes;
    private java.lang.CharSequence mNegativeButtonText;
    private boolean mNotifyVdmAuthenticationRequested;
    private android.content.ComponentName mRealCallerForConfirmDeviceCredentialActivity;
    private boolean mReceiveSystemEvents;
    private boolean mShowEmergencyCallButton;
    private java.lang.CharSequence mSubtitle;
    private java.lang.CharSequence mTitle;
    private boolean mUseDefaultSubtitle;
    private boolean mUseDefaultTitle;
    private boolean mUseParentProfileForDeviceCredential;
    public PromptInfo() {}
    PromptInfo(android.os.Parcel p0) {}
    public void addFallbackOption(android.hardware.biometrics.FallbackOption p0) {}
    public void clearIdentityCheckFallbackOption() {}
    public int describeContents() { return 0; }
    public java.util.List<java.lang.Integer> getAllowedSensorIds() { return null; }
    public int getAuthenticators() { return 0; }
    public java.lang.String getClassNameIfItIsConfirmDeviceCredentialActivity() { return null; }
    public android.hardware.biometrics.PromptContentView getContentView() { return null; }
    public java.lang.CharSequence getDescription() { return null; }
    public java.lang.CharSequence getDeviceCredentialDescription() { return null; }
    public java.lang.CharSequence getDeviceCredentialSubtitle() { return null; }
    public java.lang.CharSequence getDeviceCredentialTitle() { return null; }
    public int getDisplayId() { return 0; }
    public java.util.List<android.hardware.biometrics.FallbackOption> getFallbackOptions() { return null; }
    public int getIdentityCheckInactiveReason() { return 0; }
    public android.graphics.Bitmap getLogo() { return null; }
    public android.graphics.Bitmap getLogoBitmap() { return null; }
    public java.lang.String getLogoDescription() { return null; }
    public int getLogoRes() { return 0; }
    public java.lang.CharSequence getNegativeButtonText() { return null; }
    public android.content.ComponentName getRealCallerForConfirmDeviceCredentialActivity() { return null; }
    public java.lang.CharSequence getSubtitle() { return null; }
    public java.lang.CharSequence getTitle() { return null; }
    public boolean isAllowBackgroundAuthentication() { return false; }
    public boolean isClearIdentityCheckFallbackOption() { return false; }
    public boolean isConfirmationRequested() { return false; }
    public boolean isContentViewMoreOptionsButtonUsed() { return false; }
    @java.lang.Deprecated
    public boolean isDeviceCredentialAllowed() { return false; }
    public boolean isDeviceCredentialAndIdentityCheckRequested() { return false; }
    public boolean isDisallowBiometricsIfPolicyExists() { return false; }
    public boolean isForLegacyFingerprintManager() { return false; }
    public boolean isIdentityCheckActive() { return false; }
    public boolean isIgnoreEnrollmentState() { return false; }
    public boolean isReceiveSystemEvents() { return false; }
    public boolean isShowEmergencyCallButton() { return false; }
    public boolean isSystemCaller() { return false; }
    public boolean isUseDefaultSubtitle() { return false; }
    public boolean isUseDefaultTitle() { return false; }
    public void notifyVdmAuthenticationRequested() {}
    public boolean requiresAdvancedPermission() { return false; }
    public boolean requiresInternalPermission() { return false; }
    public boolean requiresTestOrInternalPermission() { return false; }
    public void setAllowBackgroundAuthentication(boolean p0) {}
    public void setAllowedSensorIds(java.util.List<java.lang.Integer> p0) {}
    public void setAuthenticators(int p0) {}
    void setClassNameIfItIsConfirmDeviceCredentialActivity(java.lang.String p0) {}
    public void setConfirmationRequested(boolean p0) {}
    public void setContentView(android.hardware.biometrics.PromptContentView p0) {}
    public void setDescription(java.lang.CharSequence p0) {}
    public void setDeviceCredentialAllowed(boolean p0) {}
    public void setDeviceCredentialDescription(java.lang.CharSequence p0) {}
    public void setDeviceCredentialSubtitle(java.lang.CharSequence p0) {}
    public void setDeviceCredentialTitle(java.lang.CharSequence p0) {}
    public void setDisallowBiometricsIfPolicyExists(boolean p0) {}
    public void setDisplayId(int p0) {}
    public void setIdentityCheckActive(boolean p0) {}
    public void setIdentityCheckInactiveReason(int p0) {}
    public void setIgnoreEnrollmentState(boolean p0) {}
    public void setIsForLegacyFingerprintManager(int p0) {}
    public void setIsSystemCaller(boolean p0) {}
    public void setLogo(int p0, android.graphics.Bitmap p1) {}
    public void setLogoDescription(java.lang.String p0) {}
    public void setNegativeButtonText(java.lang.CharSequence p0) {}
    public void setRealCallerForConfirmDeviceCredentialActivity(android.content.ComponentName p0) {}
    public void setReceiveSystemEvents(boolean p0) {}
    public void setShowEmergencyCallButton(boolean p0) {}
    public void setSubtitle(java.lang.CharSequence p0) {}
    public void setTitle(java.lang.CharSequence p0) {}
    public void setUseDefaultSubtitle(boolean p0) {}
    public void setUseDefaultTitle(boolean p0) {}
    public void setUseParentProfileForDeviceCredential(boolean p0) {}
    public boolean shouldNotifyVdmAuthenticationRequested() { return false; }
    public boolean shouldUseParentProfileForDeviceCredential() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
