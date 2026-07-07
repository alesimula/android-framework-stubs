package android.hardware.radio.network;

public final class AccessTechnologySpecificInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.AccessTechnologySpecificInfo> CREATOR = null;
    public static final int cdmaInfo = 1;
    public static final int eutranInfo = 2;
    public static final int geranDtmSupported = 4;
    public static final int ngranNrVopsInfo = 3;
    public static final int noinit = 0;
    public static final int nrInfo = 5;
    private int _tag;
    private java.lang.Object _value;
    public AccessTechnologySpecificInfo() {}
    private AccessTechnologySpecificInfo(int p0, java.lang.Object p1) {}
    private AccessTechnologySpecificInfo(android.os.Parcel p0) {}
    private void _assertTag(int p0) {}
    private void _set(int p0, java.lang.Object p1) {}
    private java.lang.String _tagString(int p0) { return null; }
    @java.lang.Deprecated
    public static android.hardware.radio.network.AccessTechnologySpecificInfo cdmaInfo(android.hardware.radio.network.Cdma2000RegistrationInfo p0) { return null; }
    private int describeContents(java.lang.Object p0) { return 0; }
    public static android.hardware.radio.network.AccessTechnologySpecificInfo eutranInfo(android.hardware.radio.network.EutranRegistrationInfo p0) { return null; }
    public static android.hardware.radio.network.AccessTechnologySpecificInfo geranDtmSupported(boolean p0) { return null; }
    @java.lang.Deprecated
    public static android.hardware.radio.network.AccessTechnologySpecificInfo ngranNrVopsInfo(android.hardware.radio.network.NrVopsInfo p0) { return null; }
    public static android.hardware.radio.network.AccessTechnologySpecificInfo noinit(boolean p0) { return null; }
    public static android.hardware.radio.network.AccessTechnologySpecificInfo nrInfo(android.hardware.radio.network.NrRegistrationInfo p0) { return null; }
    public int describeContents() { return 0; }
    public android.hardware.radio.network.Cdma2000RegistrationInfo getCdmaInfo() { return null; }
    public android.hardware.radio.network.EutranRegistrationInfo getEutranInfo() { return null; }
    public boolean getGeranDtmSupported() { return false; }
    public android.hardware.radio.network.NrVopsInfo getNgranNrVopsInfo() { return null; }
    public boolean getNoinit() { return false; }
    public android.hardware.radio.network.NrRegistrationInfo getNrInfo() { return null; }
    public final int getStability() { return 0; }
    public int getTag() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setCdmaInfo(android.hardware.radio.network.Cdma2000RegistrationInfo p0) {}
    public void setEutranInfo(android.hardware.radio.network.EutranRegistrationInfo p0) {}
    public void setGeranDtmSupported(boolean p0) {}
    public void setNgranNrVopsInfo(android.hardware.radio.network.NrVopsInfo p0) {}
    public void setNoinit(boolean p0) {}
    public void setNrInfo(android.hardware.radio.network.NrRegistrationInfo p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface Tag {
        @java.lang.Deprecated
        public static final int cdmaInfo = 1;
        public static final int eutranInfo = 2;
        public static final int geranDtmSupported = 4;
        @java.lang.Deprecated
        public static final int ngranNrVopsInfo = 3;
        public static final int noinit = 0;
        public static final int nrInfo = 5;
    }
}
