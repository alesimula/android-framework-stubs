package android.telephony;

@android.annotation.SystemApi
public final class CarrierRestrictionRules implements android.os.Parcelable {
    public static final int CARRIER_RESTRICTION_DEFAULT_ALLOWED = 1;
    public static final int CARRIER_RESTRICTION_DEFAULT_NOT_ALLOWED = 0;
    public static final android.os.Parcelable.Creator<android.telephony.CarrierRestrictionRules> CREATOR = null;
    public static final int MULTISIM_POLICY_ACTIVE_SERVICE_ON_ANY_SLOT_TO_UNBLOCK_OTHER_SLOTS = 6;
    public static final int MULTISIM_POLICY_ACTIVE_SERVICE_ON_SLOT_1_TO_UNBLOCK_OTHER_SLOTS = 5;
    public static final int MULTISIM_POLICY_ALL_SIMS_MUST_BE_VALID = 7;
    public static final int MULTISIM_POLICY_APPLY_TO_ALL_SLOTS = 2;
    public static final int MULTISIM_POLICY_APPLY_TO_ONLY_SLOT_1 = 3;
    public static final int MULTISIM_POLICY_NONE = 0;
    public static final int MULTISIM_POLICY_ONE_VALID_SIM_MUST_BE_PRESENT = 1;
    public static final int MULTISIM_POLICY_SLOT_POLICY_OTHER = 8;
    public static final int MULTISIM_POLICY_VALID_SIM_MUST_PRESENT_ON_SLOT_1 = 4;
    private static final char WILD_CHARACTER = '?';
    private java.util.List<android.telephony.CarrierInfo> mAllowedCarrierInfo;
    private java.util.List<android.service.carrier.CarrierIdentifier> mAllowedCarriers;
    private int mCarrierRestrictionDefault;
    private int mCarrierRestrictionStatus;
    private java.util.List<android.telephony.CarrierInfo> mExcludedCarrierInfo;
    private java.util.List<android.service.carrier.CarrierIdentifier> mExcludedCarriers;
    private int mMultiSimPolicy;
    private boolean mUseCarrierLockInfo;
    private CarrierRestrictionRules() {}
    private CarrierRestrictionRules(android.os.Parcel p0) {}
    private static java.lang.String convertNullToEmpty(java.lang.String p0) { return null; }
    private java.lang.String getCarrierInfoList() { return null; }
    private java.lang.String getCarrierRestrictionStatusToLog() { return null; }
    private static boolean isCarrierIdInList(android.service.carrier.CarrierIdentifier p0, java.util.List<android.service.carrier.CarrierIdentifier> p1) { return false; }
    public static android.telephony.CarrierRestrictionRules.Builder newBuilder() { return null; }
    private static boolean patternMatch(java.lang.String p0, java.lang.String p1) { return false; }
    public java.util.List<java.lang.Boolean> areCarrierIdentifiersAllowed(java.util.List<android.service.carrier.CarrierIdentifier> p0) { return null; }
    public int describeContents() { return 0; }
    public java.util.List<android.service.carrier.CarrierIdentifier> getAllowedCarriers() { return null; }
    public java.util.List<android.telephony.CarrierInfo> getAllowedCarriersInfoList() { return null; }
    public int getCarrierRestrictionStatus() { return 0; }
    public int getDefaultCarrierRestriction() { return 0; }
    public java.util.List<android.service.carrier.CarrierIdentifier> getExcludedCarriers() { return null; }
    public java.util.List<android.telephony.CarrierInfo> getExcludedCarriersInfoList() { return null; }
    public int getMultiSimPolicy() { return 0; }
    public boolean isAllCarriersAllowed() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private final android.telephony.CarrierRestrictionRules mRules = null;
        public Builder() {}
        public android.telephony.CarrierRestrictionRules build() { return null; }
        public android.telephony.CarrierRestrictionRules.Builder setAllCarriersAllowed() { return null; }
        public android.telephony.CarrierRestrictionRules.Builder setAllowedCarrierInfo(java.util.List<android.telephony.CarrierInfo> p0) { return null; }
        public android.telephony.CarrierRestrictionRules.Builder setAllowedCarriers(java.util.List<android.service.carrier.CarrierIdentifier> p0) { return null; }
        public android.telephony.CarrierRestrictionRules.Builder setCarrierLockInfoFeature(boolean p0) { return null; }
        public android.telephony.CarrierRestrictionRules.Builder setCarrierRestrictionStatus(int p0) { return null; }
        public android.telephony.CarrierRestrictionRules.Builder setDefaultCarrierRestriction(int p0) { return null; }
        public android.telephony.CarrierRestrictionRules.Builder setExcludedCarrierInfo(java.util.List<android.telephony.CarrierInfo> p0) { return null; }
        public android.telephony.CarrierRestrictionRules.Builder setExcludedCarriers(java.util.List<android.service.carrier.CarrierIdentifier> p0) { return null; }
        public android.telephony.CarrierRestrictionRules.Builder setMultiSimPolicy(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CarrierRestrictionDefault {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MultiSimPolicy {
    }
}
