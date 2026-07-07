package android.telephony;

@android.annotation.SystemApi
public final class DataSpecificRegistrationInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.DataSpecificRegistrationInfo> CREATOR = null;
    public static final int LTE_ATTACH_EXTRA_INFO_CSFB_NOT_PREFERRED = 1;
    public static final int LTE_ATTACH_EXTRA_INFO_NONE = 0;
    public static final int LTE_ATTACH_EXTRA_INFO_SMS_ONLY = 2;
    public static final int LTE_ATTACH_TYPE_COMBINED = 2;
    public static final int LTE_ATTACH_TYPE_EPS_ONLY = 1;
    public static final int LTE_ATTACH_TYPE_UNKNOWN = 0;
    public final boolean isDcNrRestricted = false;
    public final boolean isEnDcAvailable = false;
    public final boolean isNrAvailable = false;
    private final int mLteAttachExtraInfo = 0;
    private final int mLteAttachResultType = 0;
    private final android.telephony.VopsSupportInfo mVopsSupportInfo = null;
    public final int maxDataCalls = 0;
    public DataSpecificRegistrationInfo(int p0, boolean p1, boolean p2, boolean p3, android.telephony.VopsSupportInfo p4) {}
    private DataSpecificRegistrationInfo(android.os.Parcel p0) {}
    private DataSpecificRegistrationInfo(android.telephony.DataSpecificRegistrationInfo.Builder p0) {}
    DataSpecificRegistrationInfo(android.telephony.DataSpecificRegistrationInfo p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getLteAttachExtraInfo() { return 0; }
    public int getLteAttachResultType() { return 0; }
    @java.lang.Deprecated
    public android.telephony.LteVopsSupportInfo getLteVopsSupportInfo() { return null; }
    public android.telephony.VopsSupportInfo getVopsSupportInfo() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private boolean mIsDcNrRestricted;
        private boolean mIsEnDcAvailable;
        private boolean mIsNrAvailable;
        private int mLteAttachExtraInfo;
        private int mLteAttachResultType;
        private final int mMaxDataCalls = 0;
        private android.telephony.VopsSupportInfo mVopsSupportInfo;
        public Builder(int p0) {}
        public android.telephony.DataSpecificRegistrationInfo build() { return null; }
        public android.telephony.DataSpecificRegistrationInfo.Builder setDcNrRestricted(boolean p0) { return null; }
        public android.telephony.DataSpecificRegistrationInfo.Builder setEnDcAvailable(boolean p0) { return null; }
        public android.telephony.DataSpecificRegistrationInfo.Builder setLteAttachExtraInfo(int p0) { return null; }
        public android.telephony.DataSpecificRegistrationInfo.Builder setLteAttachResultType(int p0) { return null; }
        public android.telephony.DataSpecificRegistrationInfo.Builder setNrAvailable(boolean p0) { return null; }
        public android.telephony.DataSpecificRegistrationInfo.Builder setVopsSupportInfo(android.telephony.VopsSupportInfo p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LteAttachExtraInfo {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LteAttachResultType {
    }
}
