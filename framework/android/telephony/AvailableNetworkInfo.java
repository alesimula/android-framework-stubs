package android.telephony;

public final class AvailableNetworkInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.AvailableNetworkInfo> CREATOR = null;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_LOW = 3;
    public static final int PRIORITY_MED = 2;
    @java.lang.Deprecated
    private java.util.ArrayList<java.lang.Integer> mBands;
    private java.util.ArrayList<java.lang.String> mMccMncs;
    private int mPriority;
    private java.util.ArrayList<android.telephony.RadioAccessSpecifier> mRadioAccessSpecifiers;
    private int mSubId;
    public AvailableNetworkInfo(int p0, int p1, java.util.List<java.lang.String> p2, java.util.List<java.lang.Integer> p3) {}
    private AvailableNetworkInfo(int p0, int p1, java.util.List<java.lang.String> p2, java.util.List<java.lang.Integer> p3, java.util.List<android.telephony.RadioAccessSpecifier> p4) {}
    private AvailableNetworkInfo(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.List<java.lang.Integer> getBands() { return null; }
    public java.util.List<java.lang.String> getMccMncs() { return null; }
    public int getPriority() { return 0; }
    public java.util.List<android.telephony.RadioAccessSpecifier> getRadioAccessSpecifiers() { return null; }
    public int getSubId() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AvailableNetworkInfoPriority {
    }

    public static final class Builder {
        private java.util.ArrayList<java.lang.String> mMccMncs;
        private int mPriority;
        private java.util.ArrayList<android.telephony.RadioAccessSpecifier> mRadioAccessSpecifiers;
        private int mSubId;
        public Builder(int p0) {}
        public android.telephony.AvailableNetworkInfo build() { return null; }
        public android.telephony.AvailableNetworkInfo.Builder setMccMncs(java.util.List<java.lang.String> p0) { return null; }
        public android.telephony.AvailableNetworkInfo.Builder setPriority(int p0) { return null; }
        public android.telephony.AvailableNetworkInfo.Builder setRadioAccessSpecifiers(java.util.List<android.telephony.RadioAccessSpecifier> p0) { return null; }
    }
}
