package android.telephony;

public final class BarringInfo implements android.os.Parcelable {
    private static final android.telephony.BarringInfo.BarringServiceInfo BARRING_SERVICE_INFO_UNBARRED = null;
    private static final android.telephony.BarringInfo.BarringServiceInfo BARRING_SERVICE_INFO_UNKNOWN = null;
    public static final int BARRING_SERVICE_TYPE_CS_FALLBACK = 5;
    public static final int BARRING_SERVICE_TYPE_CS_SERVICE = 0;
    public static final int BARRING_SERVICE_TYPE_CS_VOICE = 2;
    public static final int BARRING_SERVICE_TYPE_EMERGENCY = 8;
    public static final int BARRING_SERVICE_TYPE_MMTEL_VIDEO = 7;
    public static final int BARRING_SERVICE_TYPE_MMTEL_VOICE = 6;
    public static final int BARRING_SERVICE_TYPE_MO_DATA = 4;
    public static final int BARRING_SERVICE_TYPE_MO_SIGNALLING = 3;
    public static final int BARRING_SERVICE_TYPE_PS_SERVICE = 1;
    public static final int BARRING_SERVICE_TYPE_SMS = 9;
    public static final android.os.Parcelable.Creator<android.telephony.BarringInfo> CREATOR = null;
    private android.util.SparseArray<android.telephony.BarringInfo.BarringServiceInfo> mBarringServiceInfos;
    private android.telephony.CellIdentity mCellIdentity;
    @android.annotation.SystemApi
    public BarringInfo() {}
    public BarringInfo(android.os.Parcel p0) {}
    public BarringInfo(android.telephony.CellIdentity p0, android.util.SparseArray<android.telephony.BarringInfo.BarringServiceInfo> p1) {}
    @android.annotation.SystemApi
    public android.telephony.BarringInfo createLocationInfoSanitizedCopy() { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.telephony.BarringInfo.BarringServiceInfo getBarringServiceInfo(int p0) { return null; }
    @android.annotation.SystemApi
    public android.telephony.CellIdentity getCellIdentity() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class BarringServiceInfo implements android.os.Parcelable {
        public static final int BARRING_TYPE_CONDITIONAL = 1;
        public static final int BARRING_TYPE_NONE = 0;
        public static final int BARRING_TYPE_UNCONDITIONAL = 2;
        public static final int BARRING_TYPE_UNKNOWN = -1;
        public static final android.os.Parcelable.Creator<android.telephony.BarringInfo.BarringServiceInfo> CREATOR = null;
        private final int mBarringType = 0;
        private final int mConditionalBarringFactor = 0;
        private final int mConditionalBarringTimeSeconds = 0;
        private final boolean mIsConditionallyBarred = false;
        public BarringServiceInfo(int p0) {}
        public BarringServiceInfo(int p0, boolean p1, int p2, int p3) {}
        public BarringServiceInfo(android.os.Parcel p0) {}
        private static java.lang.String barringTypeToString(int p0) { return null; }
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int getBarringType() { return 0; }
        public int getConditionalBarringFactor() { return 0; }
        public int getConditionalBarringTimeSeconds() { return 0; }
        public int hashCode() { return 0; }
        public boolean isBarred() { return false; }
        public boolean isConditionallyBarred() { return false; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface BarringType {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BarringServiceType {
    }
}
