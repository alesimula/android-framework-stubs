package android.telephony;

@android.annotation.SystemApi
public final class EmergencyRegistrationResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.EmergencyRegistrationResult> CREATOR = null;
    private int mAccessNetworkType;
    private java.lang.String mCountryIso;
    private int mDomain;
    private boolean mIsEmcBearerSupported;
    private boolean mIsVopsSupported;
    private java.lang.String mMcc;
    private java.lang.String mMnc;
    private int mNwProvidedEmc;
    private int mNwProvidedEmf;
    private int mRegState;
    public EmergencyRegistrationResult(int p0, int p1, int p2, boolean p3, boolean p4, int p5, int p6, java.lang.String p7, java.lang.String p8, java.lang.String p9) {}
    private EmergencyRegistrationResult(android.os.Parcel p0) {}
    public EmergencyRegistrationResult(android.telephony.EmergencyRegistrationResult p0) {}
    private void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getAccessNetwork() { return 0; }
    public java.lang.String getCountryIso() { return null; }
    public int getDomain() { return 0; }
    public java.lang.String getMcc() { return null; }
    public java.lang.String getMnc() { return null; }
    public int getNwProvidedEmc() { return 0; }
    public int getNwProvidedEmf() { return 0; }
    public int getRegState() { return 0; }
    public int hashCode() { return 0; }
    public boolean isEmcBearerSupported() { return false; }
    public boolean isVopsSupported() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
