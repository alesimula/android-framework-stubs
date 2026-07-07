package android.telephony.ims;

@android.annotation.SystemApi
public final class ImsCallProfile implements android.os.Parcelable {
    public static final int CALL_RESTRICT_CAUSE_DISABLED = 2;
    public static final int CALL_RESTRICT_CAUSE_HD = 3;
    public static final int CALL_RESTRICT_CAUSE_NONE = 0;
    public static final int CALL_RESTRICT_CAUSE_RAT = 1;
    public static final int CALL_TYPE_NONE = 0;
    public static final int CALL_TYPE_VIDEO_N_VOICE = 3;
    public static final int CALL_TYPE_VOICE = 2;
    public static final int CALL_TYPE_VOICE_N_VIDEO = 1;
    public static final int CALL_TYPE_VS = 8;
    public static final int CALL_TYPE_VS_RX = 10;
    public static final int CALL_TYPE_VS_TX = 9;
    public static final int CALL_TYPE_VT = 4;
    public static final int CALL_TYPE_VT_NODIR = 7;
    public static final int CALL_TYPE_VT_RX = 6;
    public static final int CALL_TYPE_VT_TX = 5;
    public static final android.os.Parcelable.Creator<android.telephony.ims.ImsCallProfile> CREATOR = null;
    public static final int DIALSTRING_NORMAL = 0;
    public static final int DIALSTRING_SS_CONF = 1;
    public static final int DIALSTRING_USSD = 2;
    public static final java.lang.String EXTRA_ADDITIONAL_CALL_INFO = "AdditionalCallInfo";
    public static final java.lang.String EXTRA_ADDITIONAL_SIP_INVITE_FIELDS = "android.telephony.ims.extra.ADDITIONAL_SIP_INVITE_FIELDS";
    public static final java.lang.String EXTRA_ASSERTED_DISPLAY_NAME = "android.telephony.ims.extra.ASSERTED_DISPLAY_NAME";
    public static final java.lang.String EXTRA_CALL_DISCONNECT_CAUSE = "android.telephony.ims.extra.CALL_DISCONNECT_CAUSE";
    public static final java.lang.String EXTRA_CALL_MODE_CHANGEABLE = "call_mode_changeable";
    public static final java.lang.String EXTRA_CALL_NETWORK_TYPE = "android.telephony.ims.extra.CALL_NETWORK_TYPE";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_CALL_RAT_TYPE = "CallRadioTech";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_CALL_RAT_TYPE_ALT = "callRadioTech";
    public static final java.lang.String EXTRA_CALL_SUBJECT = "android.telephony.ims.extra.CALL_SUBJECT";
    public static final java.lang.String EXTRA_CHILD_NUMBER = "ChildNum";
    public static final java.lang.String EXTRA_CNA = "cna";
    public static final java.lang.String EXTRA_CNAP = "cnap";
    public static final java.lang.String EXTRA_CODEC = "Codec";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_CONFERENCE = "android.telephony.ims.extra.CONFERENCE";
    public static final java.lang.String EXTRA_CONFERENCE_AVAIL = "conference_avail";
    public static final java.lang.String EXTRA_CONFERENCE_DEPRECATED = "conference";
    public static final java.lang.String EXTRA_CRS_AUDIO_MODE = "android.telephony.ims.extra.CRS_AUDIO_MODE";
    public static final java.lang.String EXTRA_CRS_MEDIA_TYPE = "android.telephony.ims.extra.CRS_MEDIA_TYPE";
    public static final java.lang.String EXTRA_DIALSTRING = "dialstring";
    public static final java.lang.String EXTRA_DISPLAY_TEXT = "DisplayText";
    public static final java.lang.String EXTRA_EMERGENCY_CALL = "e_call";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_EXTENDING_TO_CONFERENCE_SUPPORTED = "android.telephony.ims.extra.EXTENDING_TO_CONFERENCE_SUPPORTED";
    public static final java.lang.String EXTRA_FORWARDED_NUMBER = "android.telephony.ims.extra.FORWARDED_NUMBER";
    public static final java.lang.String EXTRA_IS_BUSINESS_CALL = "android.telephony.ims.extra.IS_BUSINESS_CALL";
    public static final java.lang.String EXTRA_IS_CALL_PULL = "CallPull";
    public static final java.lang.String EXTRA_IS_CROSS_SIM_CALL = "android.telephony.ims.extra.IS_CROSS_SIM_CALL";
    public static final java.lang.String EXTRA_IS_USING_UNIDIRECTIONAL_VIDEO_SERVICE = "android.telephony.ims.extra.IS_USING_UNIDIRECTIONAL_VIDEO_SERVICE";
    public static final java.lang.String EXTRA_IS_USING_VIDEO_RINGBACK = "android.telephony.ims.extra.IS_USING_VIDEO_RINGBACK";
    public static final java.lang.String EXTRA_LOCATION = "android.telephony.ims.extra.LOCATION";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_LOW_BATTERY = "android.telephony.ims.extra.LOW_BATTERY";
    public static final java.lang.String EXTRA_OEM_EXTRAS = "android.telephony.ims.extra.OEM_EXTRAS";
    public static final java.lang.String EXTRA_OI = "oi";
    public static final java.lang.String EXTRA_OIR = "oir";
    public static final java.lang.String EXTRA_PICTURE_URL = "android.telephony.ims.extra.PICTURE_URL";
    public static final java.lang.String EXTRA_PRIORITY = "android.telephony.ims.extra.PRIORITY";
    public static final java.lang.String EXTRA_REMOTE_URI = "remote_uri";
    public static final java.lang.String EXTRA_RETRY_CALL_FAIL_NETWORKTYPE = "android.telephony.ims.extra.RETRY_CALL_FAIL_NETWORKTYPE";
    public static final java.lang.String EXTRA_RETRY_CALL_FAIL_REASON = "android.telephony.ims.extra.RETRY_CALL_FAIL_REASON";
    public static final java.lang.String EXTRA_USSD = "ussd";
    public static final java.lang.String EXTRA_VMS = "vms";
    public static final int OIR_DEFAULT = 0;
    public static final int OIR_PRESENTATION_NOT_RESTRICTED = 2;
    public static final int OIR_PRESENTATION_PAYPHONE = 4;
    public static final int OIR_PRESENTATION_RESTRICTED = 1;
    public static final int OIR_PRESENTATION_UNAVAILABLE = 5;
    public static final int OIR_PRESENTATION_UNKNOWN = 3;
    public static final int PRIORITY_NORMAL = 0;
    public static final int PRIORITY_URGENT = 1;
    public static final int SERVICE_TYPE_EMERGENCY = 2;
    public static final int SERVICE_TYPE_NONE = 0;
    public static final int SERVICE_TYPE_NORMAL = 1;
    private static final java.lang.String TAG = "ImsCallProfile";
    public static final int VERIFICATION_STATUS_FAILED = 2;
    public static final int VERIFICATION_STATUS_NOT_VERIFIED = 0;
    public static final int VERIFICATION_STATUS_PASSED = 1;
    private java.util.Set<android.telephony.ims.RtpHeaderExtensionType> mAcceptedRtpHeaderExtensionTypes;
    public android.os.Bundle mCallExtras;
    public int mCallType;
    private int mCallerNumberVerificationStatus;
    private int mEmergencyCallRouting;
    private boolean mEmergencyCallTesting;
    private int mEmergencyServiceCategories;
    private java.util.List<java.lang.String> mEmergencyUrns;
    private boolean mHasKnownUserIntentEmergency;
    public android.telephony.ims.ImsStreamMediaProfile mMediaProfile;
    public int mRestrictCause;
    public int mServiceType;
    public ImsCallProfile() {}
    public ImsCallProfile(int p0, int p1) {}
    public ImsCallProfile(int p0, int p1, android.os.Bundle p2, android.telephony.ims.ImsStreamMediaProfile p3) {}
    public ImsCallProfile(android.os.Parcel p0) {}
    public static int OIRToPresentation(int p0) { return 0; }
    public static int getCallTypeFromVideoState(int p0) { return 0; }
    public static int getVideoStateFromCallType(int p0) { return 0; }
    public static int getVideoStateFromImsCallProfile(android.telephony.ims.ImsCallProfile p0) { return 0; }
    private static boolean isVideoStateSet(int p0, int p1) { return false; }
    private android.os.Bundle maybeCleanseExtras(android.os.Bundle p0) { return null; }
    public static int presentationToOIR(int p0) { return 0; }
    public static int presentationToOir(int p0) { return 0; }
    private void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public java.util.Set<android.telephony.ims.RtpHeaderExtensionType> getAcceptedRtpHeaderExtensionTypes() { return null; }
    public java.lang.String getCallExtra(java.lang.String p0) { return null; }
    public java.lang.String getCallExtra(java.lang.String p0, java.lang.String p1) { return null; }
    public boolean getCallExtraBoolean(java.lang.String p0) { return false; }
    public boolean getCallExtraBoolean(java.lang.String p0, boolean p1) { return false; }
    public int getCallExtraInt(java.lang.String p0) { return 0; }
    public int getCallExtraInt(java.lang.String p0, int p1) { return 0; }
    public <T extends android.os.Parcelable> T getCallExtraParcelable(java.lang.String p0) { return null; }
    public android.os.Bundle getCallExtras() { return null; }
    public int getCallType() { return 0; }
    public int getCallerNumberVerificationStatus() { return 0; }
    public int getEmergencyCallRouting() { return 0; }
    public int getEmergencyServiceCategories() { return 0; }
    public java.util.List<java.lang.String> getEmergencyUrns() { return null; }
    public android.telephony.ims.ImsStreamMediaProfile getMediaProfile() { return null; }
    public android.os.Bundle getProprietaryCallExtras() { return null; }
    public int getRestrictCause() { return 0; }
    public int getServiceType() { return 0; }
    public boolean hasKnownUserIntentEmergency() { return false; }
    public boolean isEmergencyCallTesting() { return false; }
    public boolean isVideoCall() { return false; }
    public boolean isVideoPaused() { return false; }
    public void setAcceptedRtpHeaderExtensionTypes(java.util.Set<android.telephony.ims.RtpHeaderExtensionType> p0) {}
    public void setCallExtra(java.lang.String p0, java.lang.String p1) {}
    public void setCallExtraBoolean(java.lang.String p0, boolean p1) {}
    public void setCallExtraInt(java.lang.String p0, int p1) {}
    public void setCallExtraParcelable(java.lang.String p0, android.os.Parcelable p1) {}
    public void setCallRestrictCause(int p0) {}
    public void setCallerNumberVerificationStatus(int p0) {}
    public void setEmergencyCallInfo(android.telephony.emergency.EmergencyNumber p0, boolean p1) {}
    public void setEmergencyCallRouting(int p0) {}
    public void setEmergencyCallTesting(boolean p0) {}
    public void setEmergencyServiceCategories(int p0) {}
    public void setEmergencyUrns(java.util.List<java.lang.String> p0) {}
    public void setHasKnownUserIntentEmergency(boolean p0) {}
    public java.lang.String toString() { return null; }
    public void updateCallExtras(android.telephony.ims.ImsCallProfile p0) {}
    public void updateCallType(android.telephony.ims.ImsCallProfile p0) {}
    public void updateMediaProfile(android.telephony.ims.ImsCallProfile p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CallRestrictCause {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VerificationStatus {
    }
}
