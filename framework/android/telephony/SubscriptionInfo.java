package android.telephony;

public class SubscriptionInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.SubscriptionInfo> CREATOR = null;
    private static final int TEXT_SIZE = 16;
    private final boolean mAreUiccApplicationsEnabled = false;
    private final int mCardId = 0;
    private final java.lang.String mCardString = null;
    private final android.telephony.UiccAccessRule[] mCarrierConfigAccessRules = null;
    private final int mCarrierId = 0;
    private final java.lang.CharSequence mCarrierName = null;
    private final java.lang.String mCountryIso = null;
    private final int mDataRoaming = 0;
    private final java.lang.CharSequence mDisplayName = null;
    private final int mDisplayNameSource = 0;
    private final java.lang.String[] mEhplmns = null;
    private final java.lang.String mGroupOwner = null;
    private final android.os.ParcelUuid mGroupUuid = null;
    private final java.lang.String[] mHplmns = null;
    private final java.lang.String mIccId = null;
    private android.graphics.Bitmap mIconBitmap;
    private final int mIconTint = 0;
    private final int mId = 0;
    private final boolean mIsEmbedded = false;
    private final boolean mIsGroupDisabled = false;
    private final boolean mIsOnlyNonTerrestrialNetwork = false;
    private final boolean mIsOpportunistic = false;
    private final boolean mIsPrivateNetwork = false;
    private final boolean mIsSatelliteESOSSupported = false;
    private final java.lang.String mMcc = null;
    private final java.lang.String mMnc = null;
    private final android.telephony.UiccAccessRule[] mNativeAccessRules = null;
    private final java.lang.String mNumber = null;
    private final int mPortIndex = 0;
    private final int mProfileClass = 0;
    private final int mServiceCapabilities = 0;
    private final int mSimSlotIndex = 0;
    private final long mStreamingAppMaxDownlinkKbps = 0L;
    private final long mStreamingAppMaxUplinkKbps = 0L;
    private final int mTransferStatus = 0;
    private final int mType = 0;
    private final int mUsageSetting = 0;
    private SubscriptionInfo(android.telephony.SubscriptionInfo.Builder p0) {}
    public static java.lang.String getPrintableId(java.lang.String p0) { return null; }
    @android.annotation.SystemApi
    public boolean areUiccApplicationsEnabled() { return false; }
    @java.lang.Deprecated
    public boolean canManageSubscription(android.content.Context p0) { return false; }
    @java.lang.Deprecated
    public boolean canManageSubscription(android.content.Context p0, java.lang.String p1) { return false; }
    public android.graphics.Bitmap createIconBitmap(android.content.Context p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    @android.annotation.SystemApi
    public java.util.List<android.telephony.UiccAccessRule> getAccessRules() { return null; }
    public int getCardId() { return 0; }
    public java.lang.String getCardString() { return null; }
    public int getCarrierId() { return 0; }
    public java.lang.CharSequence getCarrierName() { return null; }
    public java.lang.String getCountryIso() { return null; }
    public int getDataRoaming() { return 0; }
    public java.lang.CharSequence getDisplayName() { return null; }
    public int getDisplayNameSource() { return 0; }
    public java.util.List<java.lang.String> getEhplmns() { return null; }
    public java.lang.String getGroupOwner() { return null; }
    public android.os.ParcelUuid getGroupUuid() { return null; }
    public java.util.List<java.lang.String> getHplmns() { return null; }
    public java.lang.String getIccId() { return null; }
    public int getIconTint() { return 0; }
    @java.lang.Deprecated
    public int getMcc() { return 0; }
    public java.lang.String getMccString() { return null; }
    @java.lang.Deprecated
    public int getMnc() { return 0; }
    public java.lang.String getMncString() { return null; }
    public java.util.List<android.telephony.UiccAccessRule> getNativeAccessRules() { return null; }
    @java.lang.Deprecated
    public java.lang.String getNumber() { return null; }
    public int getPortIndex() { return 0; }
    @android.annotation.SystemApi
    public int getProfileClass() { return 0; }
    public java.util.Set<java.lang.Integer> getServiceCapabilities() { return null; }
    public int getSimSlotIndex() { return 0; }
    public long getStreamingAppMaxDownlinkKbps() { return 0L; }
    public long getStreamingAppMaxUplinkKbps() { return 0L; }
    public int getSubscriptionId() { return 0; }
    public int getSubscriptionType() { return 0; }
    @android.annotation.SystemApi
    public int getTransferStatus() { return 0; }
    public int getUsageSetting() { return 0; }
    public int hashCode() { return 0; }
    public boolean isActive() { return false; }
    public boolean isEmbedded() { return false; }
    @android.annotation.SystemApi
    public boolean isGroupDisabled() { return false; }
    public boolean isOnlyNonTerrestrialNetwork() { return false; }
    public boolean isOpportunistic() { return false; }
    @android.annotation.SystemApi
    public boolean isPrivateNetwork() { return false; }
    public boolean isSatelliteESOSSupported() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder {
        private boolean mAreUiccApplicationsEnabled;
        private int mCardId;
        private java.lang.String mCardString;
        private android.telephony.UiccAccessRule[] mCarrierConfigAccessRules;
        private int mCarrierId;
        private java.lang.CharSequence mCarrierName;
        private java.lang.String mCountryIso;
        private int mDataRoaming;
        private java.lang.CharSequence mDisplayName;
        private int mDisplayNameSource;
        private java.lang.String[] mEhplmns;
        private java.lang.String mGroupOwner;
        private android.os.ParcelUuid mGroupUuid;
        private java.lang.String[] mHplmns;
        private java.lang.String mIccId;
        private android.graphics.Bitmap mIconBitmap;
        private int mIconTint;
        private int mId;
        private boolean mIsEmbedded;
        private boolean mIsGroupDisabled;
        private boolean mIsOnlyNonTerrestrialNetwork;
        private boolean mIsOpportunistic;
        private boolean mIsPrivateNetwork;
        private boolean mIsSatelliteESOSSupported;
        private java.lang.String mMcc;
        private java.lang.String mMnc;
        private android.telephony.UiccAccessRule[] mNativeAccessRules;
        private java.lang.String mNumber;
        private int mPortIndex;
        private int mProfileClass;
        private int mServiceCapabilities;
        private int mSimSlotIndex;
        private long mStreamingAppMaxDownlinkKbps;
        private long mStreamingAppMaxUplinkKbps;
        private int mTransferStatus;
        private int mType;
        private int mUsageSetting;
        public Builder() {}
        public Builder(android.telephony.SubscriptionInfo p0) {}
        public android.telephony.SubscriptionInfo build() { return null; }
        public android.telephony.SubscriptionInfo.Builder setCardId(int p0) { return null; }
        public android.telephony.SubscriptionInfo.Builder setCardString(java.lang.String p0) { return null; }
        public android.telephony.SubscriptionInfo.Builder setCarrierConfigAccessRules(android.telephony.UiccAccessRule[] p0) { return null; }
        public android.telephony.SubscriptionInfo.Builder setCarrierId(int p0) { return null; }
        public android.telephony.SubscriptionInfo.Builder setCarrierName(java.lang.CharSequence p0) { return null; }
        public android.telephony.SubscriptionInfo.Builder setCountryIso(java.lang.String p0) { return null; }
        public android.telephony.SubscriptionInfo.Builder setDataRoaming(int p0) { return null; }
        public android.telephony.SubscriptionInfo.Builder setDisplayName(java.lang.CharSequence p0) { return null; }
        public android.telephony.SubscriptionInfo.Builder setDisplayNameSource(int p0) { return null; }
        public android.telephony.SubscriptionInfo.Builder setEhplmns(java.lang.String[] p0) { return null; }
        public android.telephony.SubscriptionInfo.Builder setEmbedded(boolean p0) { return null; }
        public android.telephony.SubscriptionInfo.Builder setGroupDisabled(boolean p0) { return null; }
        public android.telephony.SubscriptionInfo.Builder setGroupOwner(java.lang.String p0) { return null; }
        public android.telephony.SubscriptionInfo.Builder setGroupUuid(java.lang.String p0) { return null; }
        public android.telephony.SubscriptionInfo.Builder setHplmns(java.lang.String[] p0) { return null; }
        public android.telephony.SubscriptionInfo.Builder setIccId(java.lang.String p0) { return null; }
        public android.telephony.SubscriptionInfo.Builder setIcon(android.graphics.Bitmap p0) { return null; }
        public android.telephony.SubscriptionInfo.Builder setIconTint(int p0) { return null; }
        public android.telephony.SubscriptionInfo.Builder setId(int p0) { return null; }
        public android.telephony.SubscriptionInfo.Builder setIsPrivateNetwork(boolean p0) { return null; }
        public android.telephony.SubscriptionInfo.Builder setMcc(java.lang.String p0) { return null; }
        public android.telephony.SubscriptionInfo.Builder setMnc(java.lang.String p0) { return null; }
        public android.telephony.SubscriptionInfo.Builder setNativeAccessRules(android.telephony.UiccAccessRule[] p0) { return null; }
        public android.telephony.SubscriptionInfo.Builder setNumber(java.lang.String p0) { return null; }
        public android.telephony.SubscriptionInfo.Builder setOnlyNonTerrestrialNetwork(boolean p0) { return null; }
        public android.telephony.SubscriptionInfo.Builder setOpportunistic(boolean p0) { return null; }
        public android.telephony.SubscriptionInfo.Builder setPortIndex(int p0) { return null; }
        public android.telephony.SubscriptionInfo.Builder setProfileClass(int p0) { return null; }
        public android.telephony.SubscriptionInfo.Builder setSatelliteESOSSupported(boolean p0) { return null; }
        public android.telephony.SubscriptionInfo.Builder setServiceCapabilities(java.util.Set<java.lang.Integer> p0) { return null; }
        public android.telephony.SubscriptionInfo.Builder setSimSlotIndex(int p0) { return null; }
        public android.telephony.SubscriptionInfo.Builder setStreamingAppMaxDownlinkKbps(long p0) { return null; }
        public android.telephony.SubscriptionInfo.Builder setStreamingAppMaxUplinkKbps(long p0) { return null; }
        public android.telephony.SubscriptionInfo.Builder setTransferStatus(int p0) { return null; }
        public android.telephony.SubscriptionInfo.Builder setType(int p0) { return null; }
        public android.telephony.SubscriptionInfo.Builder setUiccApplicationsEnabled(boolean p0) { return null; }
        public android.telephony.SubscriptionInfo.Builder setUsageSetting(int p0) { return null; }
    }
}
