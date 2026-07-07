package android.telephony.satellite;

@android.annotation.SystemApi
public final class SystemSelectionSpecifier implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.satellite.SystemSelectionSpecifier> CREATOR = null;
    private int[] mBands;
    private int[] mEarfcns;
    private java.lang.String mIccId;
    private java.lang.String mMccMnc;
    private java.lang.String[] mMccMncs;
    private java.util.List<android.telephony.satellite.SatelliteInfo> mSatelliteInfos;
    private int[] mTagIds;
    private SystemSelectionSpecifier(android.os.Parcel p0) {}
    public SystemSelectionSpecifier(android.telephony.satellite.SystemSelectionSpecifier.Builder p0) {}
    public SystemSelectionSpecifier(java.lang.String p0, android.util.IntArray p1, android.util.IntArray p2, android.telephony.satellite.SatelliteInfo[] p3, android.util.IntArray p4) {}
    public SystemSelectionSpecifier(java.lang.String p0, android.util.IntArray p1, android.util.IntArray p2, android.telephony.satellite.SatelliteInfo[] p3, android.util.IntArray p4, java.lang.String p5, java.lang.String[] p6) {}
    private void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int[] getBands() { return null; }
    public int[] getEarfcns() { return null; }
    public java.lang.String getIccId() { return null; }
    public java.lang.String getMccMnc() { return null; }
    public java.lang.String[] getMccMncs() { return null; }
    public java.util.List<android.telephony.satellite.SatelliteInfo> getSatelliteInfos() { return null; }
    public int[] getTagIds() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private int[] mBands;
        private int[] mEarfcns;
        private java.lang.String mIccId;
        private java.lang.String mMccMnc;
        private java.lang.String[] mMccMncs;
        private java.util.List<android.telephony.satellite.SatelliteInfo> mSatelliteInfos;
        private int[] mTagIds;
        public Builder() {}
        public android.telephony.satellite.SystemSelectionSpecifier build() { return null; }
        public android.telephony.satellite.SystemSelectionSpecifier.Builder setBands(int[] p0) { return null; }
        public android.telephony.satellite.SystemSelectionSpecifier.Builder setEarfcns(int[] p0) { return null; }
        public android.telephony.satellite.SystemSelectionSpecifier.Builder setIccId(java.lang.String p0) { return null; }
        public android.telephony.satellite.SystemSelectionSpecifier.Builder setMccMnc(java.lang.String p0) { return null; }
        public android.telephony.satellite.SystemSelectionSpecifier.Builder setMccMncs(java.lang.String[] p0) { return null; }
        public android.telephony.satellite.SystemSelectionSpecifier.Builder setSatelliteInfos(java.util.List<android.telephony.satellite.SatelliteInfo> p0) { return null; }
        public android.telephony.satellite.SystemSelectionSpecifier.Builder setTagIds(int[] p0) { return null; }
    }
}
